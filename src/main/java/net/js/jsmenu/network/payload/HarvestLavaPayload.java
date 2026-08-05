
package net.js.jsmenu.network.payload;

import com.mojang.datafixers.types.Type;
import net.js.jsmenu.JSMenu;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record HarvestLavaPayload(String starId, int amount) implements CustomPacketPayload {
    public static final Type<HarvestLavaPayload> TYPE =
            new Type<>(ResourceLocation.fromNamespaceAndPath(JSMenu.MOD_ID, "harvest_lava"));

    public static final StreamCodec<RegistryFriendlyByteBuf, HarvestLavaPayload> STREAM_CODEC =
            CustomPacketPayload.codec(
                    HarvestLavaPayload::write,
                    HarvestLavaPayload::new
            );

    public HarvestLavaPayload(RegistryFriendlyByteBuf buffer) {
        this(buffer.readUtf(), buffer.readInt());
    }

    private void write(RegistryFriendlyByteBuf buffer) {
        buffer.writeUtf(starId);
        buffer.writeInt(amount);
    }

    @Override
    public Type<HarvestLavaPayload> type() {
        return TYPE;
    }
}
