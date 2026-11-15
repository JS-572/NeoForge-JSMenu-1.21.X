package net.js.jsmenu.worldgen;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.storage.loot.LootTable;

public final class VolcanicResearchComplexGenerator {
    private static final BlockState ROCK = Blocks.POLISHED_BASALT.defaultBlockState();
    private static final BlockState DARK_ROCK = Blocks.BLACKSTONE.defaultBlockState();
    private static final BlockState BRICK = Blocks.STONE_BRICKS.defaultBlockState();
    private static final BlockState CRACKED_BRICK = Blocks.CRACKED_STONE_BRICKS.defaultBlockState();
    private static final BlockState AIR = Blocks.CAVE_AIR.defaultBlockState();
    private static final BlockState LAVA = Blocks.LAVA.defaultBlockState();

    private static final ResourceKey<LootTable> GEOLOGICAL_CACHE = lootTable("chests/venus_volcano/geological_cache");
    private static final ResourceKey<LootTable> RESEARCH_ARCHIVE = lootTable("chests/venus_volcano/research_archive");
    private static final ResourceKey<LootTable> SEALED_VAULT = lootTable("chests/venus_volcano/sealed_vault");

    private VolcanicResearchComplexGenerator() {
    }

    public static void generate(WorldGenLevel level, BlockPos center, RandomSource random, BoundingBox chunkBounds) {
        Builder builder = new Builder(level, random, chunkBounds);
        builder.buildVolcano(center);
        builder.carveMainRoutes(center);
        builder.buildMagmaChamber(center);
        builder.buildResearchWing(center);
        builder.buildTunnelNetwork(center);
        builder.buildHiddenChambers(center);
        builder.decorateVolcano(center);
    }

    private static final class Builder {
        private final WorldGenLevel level;
        private final RandomSource random;
        private final BoundingBox clip;

        private Builder(WorldGenLevel level, RandomSource random, BoundingBox clip) {
            this.level = level;
            this.random = random;
            this.clip = clip;
        }

        private void buildVolcano(BlockPos center) {
            for (int y = -5; y <= 60; y++) {
                double radius = volcanoRadius(y);
                int extent = (int) Math.ceil(radius);
                int minX = Math.max(-extent, this.clip.minX() - center.getX());
                int maxX = Math.min(extent, this.clip.maxX() - center.getX());
                int minZ = Math.max(-extent, this.clip.minZ() - center.getZ());
                int maxZ = Math.min(extent, this.clip.maxZ() - center.getZ());
                for (int x = minX; x <= maxX; x++) {
                    for (int z = minZ; z <= maxZ; z++) {
                        if (x * x + z * z <= radius * radius) {
                            BlockState state = ((x * 3 + z * 5 + y) & 7) < 2 ? DARK_ROCK : ROCK;
                            this.place(center.offset(x, y, z), state);
                        }
                    }
                }
            }

            // A broad caldera, with a lava-filled vent at its bottom.
            this.carveEllipsoid(center.offset(0, 57, 0), 10, 7, 10);
            for (int x = -8; x <= 8; x++) {
                for (int z = -8; z <= 8; z++) {
                    if (x * x + z * z <= 55) {
                        this.place(center.offset(x, 51, z), LAVA);
                    }
                }
            }

            // Jagged shelves make the summit opening readable from a distance.
            for (int angle = 0; angle < 16; angle++) {
                double radians = Math.PI * 2.0 * angle / 16.0;
                int x = (int) Math.round(Math.cos(radians) * 11);
                int z = (int) Math.round(Math.sin(radians) * 11);
                this.place(center.offset(x, 56 + angle % 3, z), DARK_ROCK);
                this.place(center.offset(x, 55 + angle % 3, z), ROCK);
            }
        }

        private void carveMainRoutes(BlockPos center) {
            // Wide summit shaft spirals down to the upper tunnels.
            this.carveEllipsoid(center.offset(0, 54, 0), 4, 5, 4);
            for (int y = 16; y <= 51; y++) {
                double progress = (y - 16) / 35.0;
                double angle = progress * Math.PI * 3.0;
                int x = (int) Math.round(Math.cos(angle) * 4.0);
                int z = (int) Math.round(Math.sin(angle) * 4.0);
                this.carveEllipsoid(center.offset(x, y, z), 2, 2, 2);
            }
            this.carveTunnel(center.offset(0, 16, 0), center.offset(0, 4, 0), 2);
            this.carveEllipsoid(center.offset(0, 4, 0), 13, 7, 13);

            // Broad main entrance on the lower east slope.
            for (int y = -3; y <= 4; y++) {
                for (int z = -5; z <= 5; z++) {
                    this.place(center.offset(39, y, z), y <= 1 ? AIR : ROCK);
                }
            }
            this.carveTunnel(center.offset(39, 0, 0), center.offset(28, -5, 0), 3);
            this.carveTunnel(center.offset(28, -5, 0), center.offset(17, -10, -5), 3);
            this.carveTunnel(center.offset(17, -10, -5), center.offset(8, -11, 0), 3);

            // Jagged entrance arch.
            for (int y = -3; y <= 5; y++) {
                for (int z : new int[]{-6, 6}) {
                    this.place(center.offset(39, y, z), DARK_ROCK);
                }
            }
            for (int z = -6; z <= 6; z++) {
                this.place(center.offset(39, 5, z), DARK_ROCK);
                if (Math.abs(z) > 3) {
                    this.place(center.offset(39, 4, z), ROCK);
                }
            }
            this.carveEllipsoid(center.offset(39, 0, 0), 3, 3, 4);
        }

        private void buildMagmaChamber(BlockPos center) {
            BlockPos chamber = center.offset(0, -13, 0);
            this.carveEllipsoid(chamber, 19, 10, 19);
            for (int x = -17; x <= 17; x++) {
                for (int z = -17; z <= 17; z++) {
                    if (x * x + z * z <= 250) {
                        this.place(chamber.offset(x, -8, z), LAVA);
                    }
                }
            }

            int[][] pillars = {
                    {-14, -10}, {-14, 10}, {14, -10}, {14, 10},
                    {-7, -15}, {-7, 15}, {7, -15}, {7, 15},
                    {-15, 0}, {15, 0}, {0, -16}, {0, 16}
            };
            for (int[] pillar : pillars) {
                for (int y = -7; y <= 8; y++) {
                    if (y != -3 && y != -2) {
                        this.place(chamber.offset(pillar[0], y, pillar[1]), y % 3 == 0 ? DARK_ROCK : ROCK);
                    }
                }
            }

            // Four narrow crossings meet at a raised, marked central platform.
            for (int i = -16; i <= 16; i++) {
                this.place(chamber.offset(i, -4, 0), DARK_ROCK);
                this.place(chamber.offset(0, -4, i), DARK_ROCK);
                if (Math.abs(i) % 4 == 0) {
                    this.place(chamber.offset(i, -3, 0), ROCK);
                    this.place(chamber.offset(0, -3, i), ROCK);
                }
            }
            for (int x = -5; x <= 5; x++) {
                for (int z = -5; z <= 5; z++) {
                    this.place(chamber.offset(x, -2, z), (Math.abs(x) == 5 || Math.abs(z) == 5) ? DARK_ROCK : BRICK);
                }
            }
            for (int x = -3; x <= 3; x++) {
                for (int z = -3; z <= 3; z++) {
                    this.place(chamber.offset(x, -1, z), ROCK);
                }
            }

            // Visible archways mark the four passageways from the chamber.
            this.carveTunnel(chamber.offset(-17, 0, 0), chamber.offset(-19, 0, 0), 3);
            this.carveTunnel(chamber.offset(17, 0, 0), chamber.offset(19, 0, 0), 3);
            this.carveTunnel(chamber.offset(0, 0, -17), chamber.offset(0, 0, -19), 3);
            this.carveTunnel(chamber.offset(0, 0, 17), chamber.offset(0, 0, 19), 3);
            this.carveTunnel(chamber.offset(19, 0, 0), center.offset(30, -18, 0), 2);
            this.carveTunnel(chamber.offset(0, 0, 19), center.offset(0, -18, 30), 2);
            this.carveTunnel(chamber.offset(0, 0, -19), center.offset(0, -18, -30), 2);
        }

        private void buildResearchWing(BlockPos center) {
            BlockPos mainLab = center.offset(-25, -25, 0);
            this.buildRoom(mainLab, 11, 5, 10, BRICK);
            this.carveTunnel(center.offset(-17, -13, 0), mainLab.offset(11, 0, 0), 3);

            BlockPos archive = center.offset(-43, -25, 0);
            this.buildRoom(archive, 6, 4, 7, CRACKED_BRICK);
            this.carveTunnel(mainLab.offset(-11, 0, 0), archive.offset(6, 0, 0), 2);
            this.place(archive.offset(0, 0, 0), Blocks.LANTERN.defaultBlockState());
            this.placeChest(archive.offset(-2, -2, 0), RESEARCH_ARCHIVE);

            BlockPos machineRoom = center.offset(-25, -25, 21);
            this.buildRoom(machineRoom, 8, 4, 7, BRICK);
            this.carveTunnel(mainLab.offset(0, 0, 10), machineRoom.offset(0, 0, -7), 2);

            BlockPos bunkRoom = center.offset(-25, -25, -21);
            this.buildRoom(bunkRoom, 8, 4, 7, CRACKED_BRICK);
            this.carveTunnel(mainLab.offset(0, 0, -10), bunkRoom.offset(0, 0, 7), 2);

            // Long work benches and abandoned lab equipment.
            for (int x = -7; x <= 7; x += 2) {
                this.place(mainLab.offset(x, -4, -5), Blocks.CRAFTING_TABLE.defaultBlockState());
                this.place(mainLab.offset(x, -4, 5), Blocks.FURNACE.defaultBlockState());
            }
            this.place(mainLab.offset(-8, -4, 0), Blocks.BREWING_STAND.defaultBlockState());
            this.place(mainLab.offset(8, -4, 0), Blocks.LECTERN.defaultBlockState());
            this.place(mainLab.offset(0, 3, 0), Blocks.LANTERN.defaultBlockState());

            for (BlockPos chest : new BlockPos[]{
                    mainLab.offset(-8, -4, -7), mainLab.offset(8, -4, -7),
                    machineRoom.offset(-5, -3, 0), machineRoom.offset(5, -3, 0),
                    bunkRoom.offset(-5, -3, 0)
            }) {
                this.placeChest(chest, RESEARCH_ARCHIVE);
            }
        }

        private void buildTunnelNetwork(BlockPos center) {
            // A branching ring corridor gives the lower complex multiple routes.
            int[][] ring = {
                    {-27, -18, 0}, {-27, -18, 18}, {-10, -18, 30},
                    {12, -18, 30}, {30, -18, 18}, {30, -18, 0},
                    {30, -18, -18}, {12, -18, -30}, {-10, -18, -30},
                    {-27, -18, -18}, {-27, -18, 0}
            };
            for (int i = 0; i < ring.length - 1; i++) {
                this.carveTunnel(center.offset(ring[i][0], ring[i][1], ring[i][2]),
                        center.offset(ring[i + 1][0], ring[i + 1][1], ring[i + 1][2]), 2);
            }

            // Branches, side pockets and dead ends off the ring.
            this.carveTunnel(center.offset(-10, -18, 30), center.offset(-10, -27, 38), 2);
            this.carveTunnel(center.offset(12, -18, 30), center.offset(20, -27, 38), 2);
            this.carveTunnel(center.offset(30, -18, 18), center.offset(38, -25, 18), 2);
            this.carveTunnel(center.offset(30, -18, -18), center.offset(38, -25, -18), 2);
            this.carveTunnel(center.offset(12, -18, -30), center.offset(12, -27, -38), 2);
            this.carveTunnel(center.offset(-10, -18, -30), center.offset(-20, -27, -38), 2);
            this.carveTunnel(center.offset(-27, -18, -18), center.offset(-38, -25, -18), 2);
            this.carveTunnel(center.offset(-27, -18, 0), center.offset(-25, -25, 0), 2);

            this.carveEllipsoid(center.offset(0, -19, 30), 4, 3, 4);
            this.carveEllipsoid(center.offset(38, -25, 18), 3, 3, 3);
            this.carveEllipsoid(center.offset(38, -25, -18), 3, 3, 3);
            this.carveEllipsoid(center.offset(-12, -27, -38), 3, 3, 3);
            this.carveEllipsoid(center.offset(12, -27, 38), 3, 3, 3);

            // Lava channels and pools are placed below walking level.
            for (int i = -10; i <= 10; i++) {
                this.place(center.offset(i, -22, 30), LAVA);
                this.place(center.offset(30, -22, i), LAVA);
                this.place(center.offset(-30, -22, i), LAVA);
            }
            for (BlockPos pool : new BlockPos[]{
                    center.offset(-10, -22, 30), center.offset(30, -22, 18),
                    center.offset(-30, -22, -18), center.offset(12, -30, -38)
            }) {
                this.carveEllipsoid(pool, 3, 1, 3);
                for (int x = -2; x <= 2; x++) {
                    for (int z = -2; z <= 2; z++) {
                        this.place(pool.offset(x, 0, z), LAVA);
                    }
                }
            }
        }

        private void buildHiddenChambers(BlockPos center) {
            BlockPos[] hiddenRooms = {
                    center.offset(-42, -31, -8), center.offset(-43, -31, 12),
                    center.offset(-10, -32, 39), center.offset(20, -31, 39),
                    center.offset(40, -30, 18), center.offset(40, -30, -18),
                    center.offset(12, -32, -40), center.offset(-20, -32, -40),
                    center.offset(-40, -30, -18), center.offset(0, 12, 0)
            };
            for (int i = 0; i < hiddenRooms.length; i++) {
                BlockPos room = hiddenRooms[i];
                this.carveEllipsoid(room, 4, 3, 4);
                this.buildRoomShell(room, 4, 3, 4, i % 2 == 0 ? DARK_ROCK : CRACKED_BRICK);
                this.placeChest(room.offset(0, -2, 0), i % 3 == 0 ? SEALED_VAULT : GEOLOGICAL_CACHE);
                this.place(room.offset(0, 2, 0), Blocks.LANTERN.defaultBlockState());
            }

            // Several of the hidden rooms have narrow concealed access routes.
            this.carveTunnel(center.offset(-38, -25, -18), hiddenRooms[0], 1);
            this.carveTunnel(center.offset(-27, -18, 0), center.offset(-38, -25, 0), 2);
            this.carveTunnel(center.offset(-38, -25, 0), hiddenRooms[1], 1);
            this.carveTunnel(center.offset(-10, -27, 38), hiddenRooms[2], 1);
            this.carveTunnel(center.offset(20, -27, 38), hiddenRooms[3], 1);
            this.carveTunnel(center.offset(38, -25, 18), hiddenRooms[4], 1);
            this.carveTunnel(center.offset(38, -25, -18), hiddenRooms[5], 1);
            this.carveTunnel(center.offset(12, -27, -38), hiddenRooms[6], 1);
            this.carveTunnel(center.offset(-20, -27, -38), hiddenRooms[7], 1);
            this.carveTunnel(center.offset(-25, -25, -18), hiddenRooms[8], 1);
            this.carveTunnel(center.offset(0, 16, 0), hiddenRooms[9], 1);
        }

        private void decorateVolcano(BlockPos center) {
            // Six interrupted lava falls make the outside silhouette easy to spot.
            for (int stream = 0; stream < 6; stream++) {
                double angle = Math.PI * 2.0 * stream / 6.0;
                for (int y = 2; y <= 47; y++) {
                    double radius = volcanoRadius(y);
                    int x = (int) Math.round(Math.cos(angle) * radius);
                    int z = (int) Math.round(Math.sin(angle) * radius);
                    if (y % 7 != stream % 7) {
                        this.place(center.offset(x, y, z), LAVA);
                    }
                }
            }

            // Four visible vents dot the flanks, each with a small lava glow.
            for (int[] vent : new int[][]{{19, 180}, {28, 90}, {34, 320}, {42, 225}}) {
                double angle = Math.toRadians(vent[1]);
                int radius = (int) Math.round(volcanoRadius(vent[0]) - 1);
                int x = (int) Math.round(Math.cos(angle) * radius);
                int z = (int) Math.round(Math.sin(angle) * radius);
                this.carveEllipsoid(center.offset(x, vent[0], z), 3, 3, 3);
                this.place(center.offset(x, vent[0] - 3, z), LAVA);
            }

            for (int y : new int[]{-3, -8, -14, -20}) {
                this.place(center.offset(27, y, 2), LAVA);
                this.place(center.offset(27, y, -2), LAVA);
            }
        }

        private void buildRoom(BlockPos center, int radiusX, int radiusY, int radiusZ, BlockState wall) {
            this.carveEllipsoid(center, radiusX - 1, radiusY - 1, radiusZ - 1);
            this.buildRoomShell(center, radiusX, radiusY, radiusZ, wall);
            this.place(center.offset(0, radiusY - 1, 0), Blocks.LANTERN.defaultBlockState());
        }

        private void buildRoomShell(BlockPos center, int radiusX, int radiusY, int radiusZ, BlockState wall) {
            for (int x = -radiusX; x <= radiusX; x++) {
                for (int y = -radiusY; y <= radiusY; y++) {
                    for (int z = -radiusZ; z <= radiusZ; z++) {
                        if (Math.abs(x) == radiusX || Math.abs(y) == radiusY || Math.abs(z) == radiusZ) {
                            this.place(center.offset(x, y, z), wall);
                        }
                    }
                }
            }
        }

        private void carveTunnel(BlockPos start, BlockPos end, int radius) {
            int steps = Math.max(Math.max(Math.abs(end.getX() - start.getX()), Math.abs(end.getY() - start.getY())),
                    Math.abs(end.getZ() - start.getZ()));
            for (int step = 0; step <= steps; step++) {
                double progress = steps == 0 ? 0.0 : (double) step / steps;
                int x = (int) Math.round(start.getX() + (end.getX() - start.getX()) * progress);
                int y = (int) Math.round(start.getY() + (end.getY() - start.getY()) * progress);
                int z = (int) Math.round(start.getZ() + (end.getZ() - start.getZ()) * progress);
                BlockPos point = new BlockPos(x, y, z);
                this.carveEllipsoid(point, radius, radius, radius);
                if (step % 4 == 0) {
                    this.place(point.offset(0, -radius - 1, 0), DARK_ROCK);
                    this.place(point.offset(0, -radius - 1, 1), DARK_ROCK);
                    this.place(point.offset(0, -radius - 1, -1), DARK_ROCK);
                }
                if (radius >= 2 && step % 12 == 0) {
                    this.place(point.offset(0, radius, 0), Blocks.LANTERN.defaultBlockState());
                }
            }
        }

        private void carveEllipsoid(BlockPos center, int radiusX, int radiusY, int radiusZ) {
            for (int x = -radiusX; x <= radiusX; x++) {
                for (int y = -radiusY; y <= radiusY; y++) {
                    for (int z = -radiusZ; z <= radiusZ; z++) {
                        double distance = square((double) x / radiusX)
                                + square((double) y / radiusY)
                                + square((double) z / radiusZ);
                        if (distance <= 1.0) {
                            this.place(center.offset(x, y, z), AIR);
                        }
                    }
                }
            }
        }

        private void placeChest(BlockPos pos, ResourceKey<LootTable> lootTable) {
            this.place(pos, Blocks.CHEST.defaultBlockState().setValue(ChestBlock.FACING, Direction.NORTH));
            if (this.clip.isInside(pos)
                    && this.level.getBlockEntity(pos) instanceof RandomizableContainerBlockEntity chest) {
                chest.setLootTable(lootTable);
                chest.setLootTableSeed(this.random.nextLong());
                chest.setChanged();
            }
        }

        private void place(BlockPos pos, BlockState state) {
            if (this.clip.isInside(pos)
                    && pos.getY() >= this.level.getMinBuildHeight()
                    && pos.getY() < this.level.getMaxBuildHeight()) {
                this.level.setBlock(pos, state, 2);
                if (state == LAVA) {
                    this.level.scheduleTick(pos, Fluids.LAVA, 30);
                }
            }
        }
    }

    private static double volcanoRadius(int y) {
        if (y < 0) {
            return 42.0;
        }
        if (y < 5) {
            return 42.0;
        }
        return Math.max(12.0, 42.0 - (y - 5) * 0.56);
    }

    private static double square(double value) {
        return value * value;
    }

    private static ResourceKey<LootTable> lootTable(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath("jsmenu", path));
    }
}
