package net.js.jsmenu.datagen;

import net.js.jsmenu.block.ModBlocks;
import net.js.jsmenu.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> HYDROGEN = List.of(ModBlocks.HYDROGEN_ORE);
        List<ItemLike> HELIUM = List.of();
        List<ItemLike> LITHIUM = List.of(ModBlocks.LITHIUM_ORE);
        List<ItemLike> BERYLLIUM = List.of(ModBlocks.BERYLLIUM_ORE);
        List<ItemLike> BORON = List.of(ModBlocks.BORON_ORE);
        List<ItemLike> CARBON = List.of(ModBlocks.CARBON_ORE);
        List<ItemLike> NITROGEN = List.of(ModBlocks.NITROGEN_ORE);
        List<ItemLike> OXYGEN = List.of(ModBlocks.OXYGEN_ORE);
        List<ItemLike> FLUORINE = List.of(ModBlocks.FLUORINE_ORE);
        List<ItemLike> NEON = List.of(ModBlocks.NEON_ORE);
        List<ItemLike> SODIUM = List.of(ModBlocks.SODIUM_ORE);
        List<ItemLike> MAGNESIUM = List.of(ModBlocks.MAGNESIUM_ORE);
        List<ItemLike> ALUMINUM = List.of(ModBlocks.ALUMINUM_ORE);
        List<ItemLike> SILICON = List.of(ModBlocks.SILICON_ORE);
        List<ItemLike> PHOSPHORUS = List.of(ModBlocks.PHOSPHORUS_ORE);
        List<ItemLike> SULFUR = List.of(ModBlocks.SULFUR_ORE);
        List<ItemLike> CHLORINE = List.of(ModBlocks.CHLORINE_ORE);
        List<ItemLike> ARGON = List.of(ModBlocks.ARGON_ORE);
        List<ItemLike> POTASSIUM = List.of(ModBlocks.POTASSIUM_ORE);
        List<ItemLike> CALCIUM = List.of(ModBlocks.CALCIUM_ORE);
        List<ItemLike> SCANDIUM = List.of(ModBlocks.SCANDIUM_ORE, ModItems.RAW_SCANDIUM);
        List<ItemLike> TITANIUM = List.of(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM);
        List<ItemLike> VANADIUM = List.of(ModBlocks.VANADIUM_ORE, ModItems.RAW_VANADIUM);
        List<ItemLike> CHROMIUM = List.of(ModBlocks.CHROMIUM_ORE, ModItems.RAW_CHROMIUM);
        List<ItemLike> MANGANESE = List.of(ModBlocks.MANGANESE_ORE, ModItems.RAW_MANGANESE);
        List<ItemLike> COBALT = List.of(ModBlocks.COBALT_ORE, ModItems.RAW_COBALT);
        List<ItemLike> NICKEL = List.of(ModBlocks.NICKEL_ORE, ModItems.RAW_NICKEL);
        List<ItemLike> ZINC = List.of(ModBlocks.ZINC_ORE, ModItems.RAW_ZINC);
        List<ItemLike> GALLIUM = List.of(ModBlocks.GALLIUM_ORE);
        List<ItemLike> GERMANIUM = List.of(ModBlocks.GERMANIUM_ORE);
        List<ItemLike> ARSENIC = List.of(ModBlocks.ARSENIC_ORE);
        List<ItemLike> SELENIUM = List.of(ModBlocks.SELENIUM_ORE);
        List<ItemLike> KRYPTON = List.of(ModBlocks.KRYPTON_ORE);
        List<ItemLike> RUBIDIUM = List.of(ModBlocks.RUBIDIUM_ORE);
        List<ItemLike> STRONTIUM = List.of(ModBlocks.STRONTIUM_ORE);
        List<ItemLike> YTTRIUM = List.of(ModBlocks.YTTRIUM_ORE, ModItems.RAW_YTTRIUM);
        List<ItemLike> ZIRCONIUM = List.of(ModBlocks.ZIRCONIUM_ORE, ModItems.RAW_ZIRCONIUM);
        List<ItemLike> NIOBIUM = List.of(ModBlocks.NIOBIUM_ORE, ModItems.RAW_NIOBIUM);
        List<ItemLike> MOLYBDENUM = List.of(ModBlocks.MOLYBDENUM_ORE, ModItems.RAW_MOLYBDENUM);
        List<ItemLike> TECHNETIUM = List.of(ModBlocks.TECHNETIUM_ORE);
        List<ItemLike> RUTHENIUM = List.of(ModBlocks.RUTHENIUM_ORE, ModItems.RAW_RUTHENIUM);
        List<ItemLike> RHODIUM = List.of(ModBlocks.RHODIUM_ORE, ModItems.RAW_RHODIUM);
        List<ItemLike> PALLADIUM = List.of(ModBlocks.PALLADIUM_ORE, ModItems.RAW_PALLADIUM);
        List<ItemLike> SILVER = List.of(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER);
        List<ItemLike> CADMIUM = List.of(ModBlocks.CADMIUM_ORE, ModItems.RAW_CADMIUM);
        List<ItemLike> INDIUM = List.of(ModBlocks.INDIUM_ORE);
        List<ItemLike> TIN = List.of(ModBlocks.TIN_ORE);
        List<ItemLike> ANTIMONY = List.of(ModBlocks.ANTIMONY_ORE);
        List<ItemLike> TELLURIUM = List.of(ModBlocks.TELLURIUM_ORE);
        List<ItemLike> IODINE = List.of(ModBlocks.IODINE_ORE);
        List<ItemLike> XENON = List.of(ModBlocks.XENON_ORE);
        List<ItemLike> CAESIUM = List.of(ModBlocks.CAESIUM_ORE);
        List<ItemLike> BARIUM = List.of(ModBlocks.BARIUM_ORE);
        List<ItemLike> LANTHANUM = List.of(ModBlocks.LANTHANUM_ORE);
        List<ItemLike> CERIUM = List.of(ModBlocks.CERIUM_ORE);
        List<ItemLike> PRASEODYMIUM = List.of(ModBlocks.PRASEODYMIUM_ORE);
        List<ItemLike> NEODYMIUM = List.of(ModBlocks.NEODYMIUM_ORE);
        List<ItemLike> PROMETHIUM = List.of(ModBlocks.PROMETHIUM_ORE);
        List<ItemLike> SAMARIUM = List.of(ModBlocks.SAMARIUM_ORE);
        List<ItemLike> EUROPIUM = List.of(ModBlocks.EUROPIUM_ORE);
        List<ItemLike> GADOLINIUM = List.of(ModBlocks.GADOLINIUM_ORE);
        List<ItemLike> TERBIUM = List.of(ModBlocks.TERBIUM_ORE);
        List<ItemLike> DYSPROSIUM = List.of(ModBlocks.DYSPROSIUM_ORE);
        List<ItemLike> HOLMIUM = List.of(ModBlocks.HOLMIUM_ORE);
        List<ItemLike> ERBIUM = List.of(ModBlocks.ERBIUM_ORE);
        List<ItemLike> THULIUM = List.of(ModBlocks.THULIUM_ORE);
        List<ItemLike> YTTERBIUM = List.of(ModBlocks.YTTERBIUM_ORE);
        List<ItemLike> LUTETIUM = List.of(ModBlocks.LUTETIUM_ORE);
        List<ItemLike> HAFNIUM = List.of(ModBlocks.HAFNIUM_ORE, ModItems.RAW_HAFNIUM);
        List<ItemLike> TANTALUM = List.of(ModBlocks.TANTALUM_ORE, ModItems.RAW_TANTALUM);
        List<ItemLike> TUNGSTEN = List.of(ModBlocks.TUNGSTEN_ORE, ModItems.RAW_TUNGSTEN);
        List<ItemLike> RHENIUM = List.of(ModBlocks.RHENIUM_ORE, ModItems.RAW_RHENIUM);
        List<ItemLike> OSMIUM = List.of(ModBlocks.OSMIUM_ORE, ModItems.RAW_OSMIUM);
        List<ItemLike> IRIDIUM = List.of(ModBlocks.IRIDIUM_ORE, ModItems.RAW_IRIDIUM);
        List<ItemLike> PLATINUM = List.of(ModBlocks.PLATINUM_ORE);
        List<ItemLike> THALLIUM = List.of(ModBlocks.THALLIUM_ORE);
        List<ItemLike> LEAD = List.of(ModBlocks.LEAD_ORE);
        List<ItemLike> BISMUTH = List.of(ModBlocks.BISMUTH_ORE);
        List<ItemLike> POLONIUM = List.of(ModBlocks.POLONIUM_ORE);
        List<ItemLike> ASTATINE = List.of(ModBlocks.ASTATINE_ORE);
        List<ItemLike> RADON = List.of(ModBlocks.RADON_ORE);
        List<ItemLike> FRANCIUM = List.of(ModBlocks.FRANCIUM_ORE);
        List<ItemLike> RADIUM = List.of(ModBlocks.RADIUM_ORE);
        List<ItemLike> ACTINIUM = List.of(ModBlocks.ACTINIUM_ORE);
        List<ItemLike> THORIUM = List.of(ModBlocks.THORIUM_ORE);
        List<ItemLike> PROTACTINIUM = List.of(ModBlocks.PROTACTINIUM_ORE);
        List<ItemLike> URANIUM = List.of(ModBlocks.URANIUM_ORE);
        List<ItemLike> NEPTUNIUM = List.of(ModBlocks.NEPTUNIUM_ORE);
        List<ItemLike> PLUTONIUM = List.of(ModBlocks.PLUTONIUM_ORE);
        List<ItemLike> AMERICIUM = List.of(ModBlocks.AMERICIUM_ORE);
        List<ItemLike> CURIUM = List.of(ModBlocks.CURIUM_ORE);
        List<ItemLike> BERKELIUM = List.of(ModBlocks.BERKELIUM_ORE);
        List<ItemLike> CALIFORNIUM = List.of(ModBlocks.CALIFORNIUM_ORE);
        List<ItemLike> EINSTEINIUM = List.of(ModBlocks.EINSTEINIUM_ORE);
        List<ItemLike> FERMIUM = List.of(ModBlocks.FERMIUM_ORE);
        List<ItemLike> MENDELEVIUM = List.of(ModBlocks.MENDELEVIUM_ORE);
        List<ItemLike> NOBELIUM = List.of(ModBlocks.NOBELIUM_ORE);
        List<ItemLike> LAWRENCIUM = List.of(ModBlocks.LAWRENCIUM_ORE);
        List<ItemLike> RUTHERFORDIUM = List.of(ModBlocks.RUTHERFORDIUM_ORE);
        List<ItemLike> DUBNIUM = List.of(ModBlocks.DUBNIUM_ORE);
        List<ItemLike> SEABORGIUM = List.of(ModBlocks.SEABORGIUM_ORE);
        List<ItemLike> BOHRIUM = List.of(ModBlocks.BOHRIUM_ORE);
        List<ItemLike> HASSIUM = List.of(ModBlocks.HASSIUM_ORE);
        List<ItemLike> MEITNERIUM = List.of(ModBlocks.MEITNERIUM_ORE);
        List<ItemLike> DARMSTADTIUM = List.of(ModBlocks.DARMSTADTIUM_ORE);
        List<ItemLike> ROENTGENIUM = List.of(ModBlocks.ROENTGENIUM_ORE);
        List<ItemLike> COPERNICIUM = List.of(ModBlocks.COPERNICIUM_ORE);
        List<ItemLike> NIHONIUM = List.of(ModBlocks.NIHONIUM_ORE);
        List<ItemLike> FLEROVIUM = List.of(ModBlocks.FLEROVIUM_ORE);
        List<ItemLike> MOSCOVIUM = List.of(ModBlocks.MOSCOVIUM_ORE);
        List<ItemLike> LIVERMORIUM = List.of(ModBlocks.LIVERMORIUM_ORE);
        List<ItemLike> TENNESSINE = List.of(ModBlocks.TENNESSINE_ORE);
        List<ItemLike> OGANESSON = List.of(ModBlocks.OGANESSON_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HYDROGEN_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.HYDROGEN.get())
                .unlockedBy("has_hydrogen", has(ModItems.HYDROGEN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HELIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.HELIUM.get())
                .unlockedBy("has_helium", has(ModItems.LITHIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LITHIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.LITHIUM.get())
                .unlockedBy("has_lithium", has(ModItems.LITHIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BERYLLIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BERYLLIUM.get())
                .unlockedBy("has_beryllium", has(ModItems.BERYLLIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BORON_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BORON.get())
                .unlockedBy("has_boron", has(ModItems.BORON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CARBON_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CARBON.get())
                .unlockedBy("has_carbon", has(ModItems.CARBON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NITROGEN_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.NITROGEN.get())
                .unlockedBy("has_nitrogen", has(ModItems.NITROGEN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OXYGEN_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.OXYGEN.get())
                .unlockedBy("has_oxygen", has(ModItems.OXYGEN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FLUORINE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.FLUORINE.get())
                .unlockedBy("has_fluorine", has(ModItems.FLUORINE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEON_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.NEON.get())
                .unlockedBy("has_neon", has(ModItems.NEON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SODIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SODIUM.get())
                .unlockedBy("has_sodium", has(ModItems.SODIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGNESIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MAGNESIUM.get())
                .unlockedBy("has_magnesium", has(ModItems.MAGNESIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALUMINUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ALUMINUM.get())
                .unlockedBy("has_aluminum", has(ModItems.ALUMINUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILICON_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SILICON.get())
                .unlockedBy("has_silicon", has(ModItems.SILICON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PHOSPHORUS_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PHOSPHORUS.get())
                .unlockedBy("has_phosphorus", has(ModItems.PHOSPHORUS)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SULFUR_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SULFUR.get())
                .unlockedBy("has_sulfur", has(ModItems.SULFUR)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHLORINE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CHLORINE.get())
                .unlockedBy("has_chlorine", has(ModItems.CHLORINE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ARGON_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ARGON.get())
                .unlockedBy("has_argon", has(ModItems.ARGON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POTASSIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.POTASSIUM.get())
                .unlockedBy("has_potassium", has(ModItems.POTASSIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CALCIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CALCIUM.get())
                .unlockedBy("has_calcium", has(ModItems.CALCIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SCANDIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_SCANDIUM.get())
                .unlockedBy("has_raw_scandium", has(ModItems.RAW_SCANDIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SCANDIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SCANDIUM_INGOT.get())
                .unlockedBy("has_scandium", has(ModItems.SCANDIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_TITANIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_TITANIUM.get())
                .unlockedBy("has_raw_titanium", has(ModItems.RAW_TITANIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TITANIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TITANIUM_INGOT.get())
                .unlockedBy("has_titanium", has(ModItems.TITANIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_VANADIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_VANADIUM.get())
                .unlockedBy("has_raw_vanadium", has(ModItems.RAW_VANADIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VANADIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.VANADIUM_INGOT.get())
                .unlockedBy("has_vanadium", has(ModItems.VANADIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_CHROMIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_CHROMIUM.get())
                .unlockedBy("has_raw_chromium", has(ModItems.RAW_CHROMIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHROMIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CHROMIUM_INGOT.get())
                .unlockedBy("has_chromium", has(ModItems.CHROMIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_MANGANESE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_MANGANESE.get())
                .unlockedBy("has_raw_manganese", has(ModItems.RAW_MANGANESE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MANGANESE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MANGANESE_INGOT.get())
                .unlockedBy("has_manganese", has(ModItems.MANGANESE_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_COBALT_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_COBALT.get())
                .unlockedBy("has_raw_cobalt", has(ModItems.RAW_COBALT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COBALT_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.COBALT_INGOT.get())
                .unlockedBy("has_cobalt", has(ModItems.COBALT_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_NICKEL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_NICKEL.get())
                .unlockedBy("has_raw_nickel", has(ModItems.RAW_NICKEL)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NICKEL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.NICKEL_INGOT.get())
                .unlockedBy("has_nickel", has(ModItems.NICKEL_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ZINC_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_ZINC.get())
                .unlockedBy("has_raw_zinc", has(ModItems.RAW_ZINC)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZINC_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ZINC_INGOT.get())
                .unlockedBy("has_zinc", has(ModItems.ZINC_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GALLIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.GALLIUM.get())
                .unlockedBy("has_gallium", has(ModItems.GALLIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GERMANIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.GERMANIUM.get())
                .unlockedBy("has_germanium", has(ModItems.GERMANIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ARSENIC_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ARSENIC.get())
                .unlockedBy("has_arsenic", has(ModItems.ARSENIC)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SELENIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SELENIUM.get())
                .unlockedBy("has_selenium", has(ModItems.SELENIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.KRYPTON_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.KRYPTON.get())
                .unlockedBy("has_krypton", has(ModItems.KRYPTON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBIDIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RUBIDIUM.get())
                .unlockedBy("has_rubidium", has(ModItems.RUBIDIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRONTIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.STRONTIUM.get())
                .unlockedBy("has_strontium", has(ModItems.STRONTIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_YTTRIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_YTTRIUM.get())
                .unlockedBy("has_raw_yttrium", has(ModItems.RAW_YTTRIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YTTRIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.YTTRIUM_INGOT.get())
                .unlockedBy("has_yttrium", has(ModItems.YTTRIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ZIRCONIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_ZIRCONIUM.get())
                .unlockedBy("has_raw_zirconium", has(ModItems.RAW_ZIRCONIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCONIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ZIRCONIUM_INGOT.get())
                .unlockedBy("has_zirconium", has(ModItems.ZIRCONIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_NIOBIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_NIOBIUM.get())
                .unlockedBy("has_raw_niobium", has(ModItems.RAW_NIOBIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NIOBIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.NIOBIUM_INGOT.get())
                .unlockedBy("has_niobium", has(ModItems.NIOBIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_MOLYBDENUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_MOLYBDENUM.get())
                .unlockedBy("has_raw_molybdenum", has(ModItems.RAW_MOLYBDENUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MOLYBDENUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MOLYBDENUM_INGOT.get())
                .unlockedBy("has_molybdenum", has(ModItems.MOLYBDENUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TECHNETIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TECHNETIUM.get())
                .unlockedBy("has_technetium", has(ModItems.TECHNETIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RUTHENIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_RUTHENIUM.get())
                .unlockedBy("has_raw_ruthenium", has(ModItems.RAW_RUTHENIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUTHENIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RUTHENIUM_INGOT.get())
                .unlockedBy("has_ruthenium", has(ModItems.RUTHENIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RHODIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_RHODIUM.get())
                .unlockedBy("has_raw_rhodium", has(ModItems.RAW_RHODIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RHODIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RHODIUM_INGOT.get())
                .unlockedBy("has_rhodium", has(ModItems.RHODIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_PALLADIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_PALLADIUM.get())
                .unlockedBy("has_raw_palladium", has(ModItems.RAW_PALLADIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PALLADIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PALLADIUM_INGOT.get())
                .unlockedBy("has_palladium", has(ModItems.PALLADIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SILVER_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_SILVER.get())
                .unlockedBy("has_raw_silver", has(ModItems.RAW_SILVER)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SILVER_INGOT.get())
                .unlockedBy("has_silver", has(ModItems.SILVER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_CADMIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_CADMIUM.get())
                .unlockedBy("has_raw_cadmium", has(ModItems.RAW_CADMIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CADMIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CADMIUM_INGOT.get())
                .unlockedBy("has_cadmium", has(ModItems.CADMIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.INDIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.INDIUM.get())
                .unlockedBy("has_indium", has(ModItems.INDIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TIN.get())
                .unlockedBy("has_tin", has(ModItems.TIN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ANTIMONY_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ANTIMONY.get())
                .unlockedBy("has_antimony", has(ModItems.ANTIMONY)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TELLURIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TELLURIUM.get())
                .unlockedBy("has_tellurium", has(ModItems.TELLURIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.IODINE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.IODINE.get())
                .unlockedBy("has_iodine", has(ModItems.IODINE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.XENON_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.XENON.get())
                .unlockedBy("has_xenon", has(ModItems.XENON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CAESIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CAESIUM.get())
                .unlockedBy("has_caesium", has(ModItems.CAESIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BARIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BARIUM.get())
                .unlockedBy("has_barium", has(ModItems.BARIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LANTHANUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.LANTHANUM.get())
                .unlockedBy("has_lanthanum", has(ModItems.LANTHANUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CERIUM.get())
                .unlockedBy("has_cerium", has(ModItems.CERIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PRASEODYMIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PRASEODYMIUM.get())
                .unlockedBy("has_praseodymium", has(ModItems.PRASEODYMIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEODYMIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.NEODYMIUM.get())
                .unlockedBy("has_neodymium", has(ModItems.NEODYMIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PROMETHIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PROMETHIUM.get())
                .unlockedBy("has_promethium", has(ModItems.PROMETHIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAMARIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SAMARIUM.get())
                .unlockedBy("has_samarium", has(ModItems.SAMARIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EUROPIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.EUROPIUM.get())
                .unlockedBy("has_europium", has(ModItems.EUROPIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GADOLINIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.GADOLINIUM.get())
                .unlockedBy("has_gadolinium", has(ModItems.GADOLINIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TERBIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TERBIUM.get())
                .unlockedBy("has_terbium", has(ModItems.TERBIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DYSPROSIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.DYSPROSIUM.get())
                .unlockedBy("has_dysprosium", has(ModItems.DYSPROSIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HOLMIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.HOLMIUM.get())
                .unlockedBy("has_holmium", has(ModItems.HOLMIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERBIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ERBIUM.get())
                .unlockedBy("has_erbium", has(ModItems.ERBIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THULIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.THULIUM.get())
                .unlockedBy("has_thulium", has(ModItems.THULIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YTTERBIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.YTTERBIUM.get())
                .unlockedBy("has_ytterbium", has(ModItems.YTTERBIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LUTETIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.LUTETIUM.get())
                .unlockedBy("has_lutetium", has(ModItems.LUTETIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_HAFNIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_HAFNIUM.get())
                .unlockedBy("has_raw_hafnium", has(ModItems.RAW_HAFNIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAFNIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.HAFNIUM_INGOT.get())
                .unlockedBy("has_hafnium", has(ModItems.HAFNIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_TANTALUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_TANTALUM.get())
                .unlockedBy("has_raw_tantalum", has(ModItems.RAW_TANTALUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TANTALUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TANTALUM_INGOT.get())
                .unlockedBy("has_tantalum", has(ModItems.TANTALUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_TUNGSTEN_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_TUNGSTEN.get())
                .unlockedBy("has_raw_tungsten", has(ModItems.RAW_TUNGSTEN)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TUNGSTEN_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RHENIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_RHENIUM.get())
                .unlockedBy("has_raw_rhenium", has(ModItems.RAW_RHENIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RHENIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RHENIUM_INGOT.get())
                .unlockedBy("has_rhenium", has(ModItems.RHENIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_OSMIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_OSMIUM.get())
                .unlockedBy("has_raw_osmium", has(ModItems.RAW_OSMIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OSMIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.OSMIUM_INGOT.get())
                .unlockedBy("has_osmium", has(ModItems.OSMIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_IRIDIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_IRIDIUM.get())
                .unlockedBy("has_raw_iridium", has(ModItems.RAW_IRIDIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.IRIDIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.IRIDIUM_INGOT.get())
                .unlockedBy("has_iridium", has(ModItems.IRIDIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLATINUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PLATINUM.get())
                .unlockedBy("has_platinum", has(ModItems.PLATINUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THALLIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.THALLIUM.get())
                .unlockedBy("has_thallium", has(ModItems.THALLIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LEAD_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.LEAD.get())
                .unlockedBy("has_lead", has(ModItems.LEAD)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BISMUTH_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BISMUTH.get())
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLONIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.POLONIUM.get())
                .unlockedBy("has_polonium", has(ModItems.POLONIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ASTATINE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ASTATINE.get())
                .unlockedBy("has_astatine", has(ModItems.ASTATINE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RADON_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RADON.get())
                .unlockedBy("has_radon", has(ModItems.RADON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FRANCIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.FRANCIUM.get())
                .unlockedBy("has_francium", has(ModItems.FRANCIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RADIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RADIUM.get())
                .unlockedBy("has_radium", has(ModItems.RADIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ACTINIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ACTINIUM.get())
                .unlockedBy("has_actinium", has(ModItems.ACTINIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THORIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.THORIUM.get())
                .unlockedBy("has_thorium", has(ModItems.THORIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PROTACTINIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PROTACTINIUM.get())
                .unlockedBy("has_protactinium", has(ModItems.PROTACTINIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.URANIUM.get())
                .unlockedBy("has_uranium", has(ModItems.URANIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.NEPTUNIUM.get())
                .unlockedBy("has_neptunium", has(ModItems.NEPTUNIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTONIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.PLUTONIUM.get())
                .unlockedBy("has_plutonium", has(ModItems.PLUTONIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AMERICIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.AMERICIUM.get())
                .unlockedBy("has_americium", has(ModItems.AMERICIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CURIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CURIUM.get())
                .unlockedBy("has_curium", has(ModItems.CURIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BERKELIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BERKELIUM.get())
                .unlockedBy("has_berkelium", has(ModItems.BERKELIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CALIFORNIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CALIFORNIUM.get())
                .unlockedBy("has_californium", has(ModItems.CALIFORNIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EINSTEINIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.EINSTEINIUM.get())
                .unlockedBy("has_einsteinium", has(ModItems.EINSTEINIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FERMIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.FERMIUM.get())
                .unlockedBy("has_fermium", has(ModItems.FERMIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MENDELEVIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MENDELEVIUM.get())
                .unlockedBy("has_mendelevium", has(ModItems.MENDELEVIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NOBELIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.NOBELIUM.get())
                .unlockedBy("has_nobelium", has(ModItems.NOBELIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LAWRENCIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.LAWRENCIUM.get())
                .unlockedBy("has_lawrencium", has(ModItems.LAWRENCIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUTHERFORDIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RUTHERFORDIUM.get())
                .unlockedBy("has_rutherfordium", has(ModItems.RUTHERFORDIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DUBNIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.DUBNIUM.get())
                .unlockedBy("has_dubnium", has(ModItems.DUBNIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEABORGIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SEABORGIUM.get())
                .unlockedBy("has_seaborgium", has(ModItems.SEABORGIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BOHRIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BOHRIUM.get())
                .unlockedBy("has_bohrium", has(ModItems.BOHRIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HASSIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.HASSIUM.get())
                .unlockedBy("has_hassium", has(ModItems.HASSIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MEITNERIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MEITNERIUM.get())
                .unlockedBy("has_meitnerium", has(ModItems.MEITNERIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARMSTADTIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.DARMSTADTIUM.get())
                .unlockedBy("has_darmstadtium", has(ModItems.DARMSTADTIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROENTGENIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ROENTGENIUM.get())
                .unlockedBy("has_roentgenium", has(ModItems.ROENTGENIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COPERNICIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.COPERNICIUM.get())
                .unlockedBy("has_copernicium", has(ModItems.COPERNICIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NIHONIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.NIHONIUM.get())
                .unlockedBy("has_nihonium", has(ModItems.NIHONIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FLEROVIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.FLEROVIUM.get())
                .unlockedBy("has_flerovium", has(ModItems.FLEROVIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MOSCOVIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MOSCOVIUM.get())
                .unlockedBy("has_moscovium", has(ModItems.MOSCOVIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIVERMORIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.LIVERMORIUM.get())
                .unlockedBy("has_livermorium", has(ModItems.LIVERMORIUM)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TENNESSINE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TENNESSINE.get())
                .unlockedBy("has_tennessine", has(ModItems.TENNESSINE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OGANESSON_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.OGANESSON.get())
                .unlockedBy("has_oganesson", has(ModItems.OGANESSON)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CARBON_COMPRESSOR.get())
                .pattern("###")
                .pattern("#C#")
                .pattern("#D#")
                .define('C', ModItems.CARBON.get())
                .define('D', Items.DIAMOND)
                .define('#', Items.COBBLESTONE)
                .unlockedBy("has_carbon_cobblestone_and_diamond_for_diamond_duplicator", has(ModBlocks.CARBON_COMPRESSOR)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HYDROGEN.get(), 9)
            .requires(ModBlocks.HYDROGEN_BLOCK)
            .unlockedBy("has_hydrogen_block", has(ModBlocks.HYDROGEN_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HELIUM.get(), 9)
            .requires(ModBlocks.HELIUM_BLOCK)
                .unlockedBy("has_helium_block", has(ModBlocks.HELIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LITHIUM.get(), 9)
            .requires(ModBlocks.LITHIUM_BLOCK)
                .unlockedBy("has_lithium_block", has(ModBlocks.LITHIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BERYLLIUM.get(), 9)
            .requires(ModBlocks.BERYLLIUM_BLOCK)
                .unlockedBy("has_beryllium_block", has(ModBlocks.BERYLLIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BORON.get(), 9)
            .requires(ModBlocks.BORON_BLOCK)
                .unlockedBy("has_boron_block", has(ModBlocks.BORON_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CARBON.get(), 9)
            .requires(ModBlocks.CARBON_BLOCK)
                .unlockedBy("has_carbon_block", has(ModBlocks.CARBON_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NITROGEN.get(), 9)
            .requires(ModBlocks.NITROGEN_BLOCK)
                .unlockedBy("has_nitrogen_block", has(ModBlocks.NITROGEN_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OXYGEN.get(), 9)
            .requires(ModBlocks.OXYGEN_BLOCK)
                .unlockedBy("has_oxygen_block", has(ModBlocks.OXYGEN_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FLUORINE.get(), 9)
            .requires(ModBlocks.FLUORINE_BLOCK)
                .unlockedBy("has_fluorine_block", has(ModBlocks.FLUORINE_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NEON.get(), 9)
            .requires(ModBlocks.NEON_BLOCK)
                .unlockedBy("has_neon_block", has(ModBlocks.NEON_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SODIUM.get(), 9)
            .requires(ModBlocks.SODIUM_BLOCK)
                .unlockedBy("has_sodium_block", has(ModBlocks.SODIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MAGNESIUM.get(), 9)
            .requires(ModBlocks.MAGNESIUM_BLOCK)
                .unlockedBy("has_magnesium_block", has(ModBlocks.MAGNESIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINUM.get(), 9)
            .requires(ModBlocks.ALUMINUM_BLOCK)
                .unlockedBy("has_aluminum_block", has(ModBlocks.ALUMINUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILICON.get(), 9)
            .requires(ModBlocks.SILICON_BLOCK)
                .unlockedBy("has_silicon_block", has(ModBlocks.SILICON_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PHOSPHORUS.get(), 9)
            .requires(ModBlocks.PHOSPHORUS_BLOCK)
                .unlockedBy("has_phosphorus_block", has(ModBlocks.PHOSPHORUS_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SULFUR.get(), 9)
            .requires(ModBlocks.SULFUR_BLOCK)
                .unlockedBy("has_sulfur_block", has(ModBlocks.SULFUR_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHLORINE.get(), 9)
            .requires(ModBlocks.CHLORINE_BLOCK)
                .unlockedBy("has_chlorine_block", has(ModBlocks.CHLORINE_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARGON.get(), 9)
            .requires(ModBlocks.ARGON_BLOCK)
                .unlockedBy("has_argon_block", has(ModBlocks.ARGON_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.POTASSIUM.get(), 9)
            .requires(ModBlocks.POTASSIUM_BLOCK)
                .unlockedBy("has_potassium_block", has(ModBlocks.POTASSIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CALCIUM.get(), 9)
            .requires(ModBlocks.CALCIUM_BLOCK)
                .unlockedBy("has_calcium_block", has(ModBlocks.CALCIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SCANDIUM.get(), 9)
            .requires(ModBlocks.RAW_SCANDIUM_BLOCK)
                .unlockedBy("has_raw_scandium_block", has(ModBlocks.RAW_SCANDIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SCANDIUM_INGOT.get(), 9)
            .requires(ModBlocks.SCANDIUM_BLOCK)
                .unlockedBy("has_scandium_block", has(ModBlocks.SCANDIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_TITANIUM.get(), 9)
            .requires(ModBlocks.RAW_TITANIUM_BLOCK)
                .unlockedBy("has_raw_titanium_block", has(ModBlocks.RAW_TITANIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 9)
            .requires(ModBlocks.TITANIUM_BLOCK)
                .unlockedBy("has_titanium_block", has(ModBlocks.TITANIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_VANADIUM.get(), 9)
            .requires(ModBlocks.RAW_VANADIUM_BLOCK)
                .unlockedBy("has_raw_vanadium_block", has(ModBlocks.RAW_VANADIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANADIUM_INGOT.get(), 9)
            .requires(ModBlocks.VANADIUM_BLOCK)
                .unlockedBy("has_vanadium_block", has(ModBlocks.VANADIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_CHROMIUM.get(), 9)
            .requires(ModBlocks.RAW_CHROMIUM_BLOCK)
                .unlockedBy("has_raw_chromium_block", has(ModBlocks.RAW_CHROMIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHROMIUM_INGOT.get(), 9)
            .requires(ModBlocks.CHROMIUM_BLOCK)
                .unlockedBy("has_chromium_block", has(ModBlocks.CHROMIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_MANGANESE.get(), 9)
            .requires(ModBlocks.RAW_MANGANESE_BLOCK)
                .unlockedBy("has_raw_manganese_block", has(ModBlocks.RAW_MANGANESE_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MANGANESE_INGOT.get(), 9)
            .requires(ModBlocks.MANGANESE_BLOCK)
                .unlockedBy("has_manganese_block", has(ModBlocks.MANGANESE_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_COBALT.get(), 9)
            .requires(ModBlocks.RAW_COBALT_BLOCK)
                .unlockedBy("has_raw_cobalt_block", has(ModBlocks.RAW_COBALT_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COBALT_INGOT.get(), 9)
            .requires(ModBlocks.COBALT_BLOCK)
                .unlockedBy("has_cobalt_block", has(ModBlocks.COBALT_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_NICKEL.get(), 9)
            .requires(ModBlocks.RAW_NICKEL_BLOCK)
                .unlockedBy("has_raw_nickel_block", has(ModBlocks.RAW_NICKEL_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(), 9)
            .requires(ModBlocks.NICKEL_BLOCK)
                .unlockedBy("has_nickel_block", has(ModBlocks.NICKEL_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_ZINC.get(), 9)
            .requires(ModBlocks.RAW_ZINC_BLOCK)
                .unlockedBy("has_raw_zinc_block", has(ModBlocks.RAW_ZINC_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 9)
            .requires(ModBlocks.ZINC_BLOCK)
                .unlockedBy("has_zinc_block", has(ModBlocks.ZINC_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GALLIUM.get(), 9)
            .requires(ModBlocks.GALLIUM_BLOCK)
                .unlockedBy("has_gallium_block", has(ModBlocks.GALLIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GERMANIUM.get(), 9)
            .requires(ModBlocks.GERMANIUM_BLOCK)
                .unlockedBy("has_germanium_block", has(ModBlocks.GERMANIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARSENIC.get(), 9)
            .requires(ModBlocks.ARSENIC_BLOCK)
                .unlockedBy("has_arsenic_block", has(ModBlocks.ARSENIC_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SELENIUM.get(), 9)
            .requires(ModBlocks.SELENIUM_BLOCK)
                .unlockedBy("has_selenium_block", has(ModBlocks.SELENIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.KRYPTON.get(), 9)
            .requires(ModBlocks.KRYPTON_BLOCK)
                .unlockedBy("has_krypton_block", has(ModBlocks.KRYPTON_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBIDIUM.get(), 9)
            .requires(ModBlocks.RUBIDIUM_BLOCK)
                .unlockedBy("has_rubidium_block", has(ModBlocks.RUBIDIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STRONTIUM.get(), 9)
            .requires(ModBlocks.STRONTIUM_BLOCK)
                .unlockedBy("has_strontium_block", has(ModBlocks.STRONTIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_YTTRIUM.get(), 9)
            .requires(ModBlocks.RAW_YTTRIUM_BLOCK)
                .unlockedBy("has_raw_yttrium_block", has(ModBlocks.RAW_YTTRIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.YTTRIUM_INGOT.get(), 9)
            .requires(ModBlocks.YTTRIUM_BLOCK)
                .unlockedBy("has_yttrium_block", has(ModBlocks.YTTRIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_ZIRCONIUM.get(), 9)
            .requires(ModBlocks.RAW_ZIRCONIUM_BLOCK)
                .unlockedBy("has_raw_zirconium_block", has(ModBlocks.RAW_ZIRCONIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZIRCONIUM_INGOT.get(), 9)
            .requires(ModBlocks.ZIRCONIUM_BLOCK)
                .unlockedBy("has_zirconium_block", has(ModBlocks.ZIRCONIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_NIOBIUM.get(), 9)
            .requires(ModBlocks.RAW_NIOBIUM_BLOCK)
                .unlockedBy("has_raw_niobium_block", has(ModBlocks.RAW_NIOBIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NIOBIUM_INGOT.get(), 9)
            .requires(ModBlocks.NIOBIUM_BLOCK)
                .unlockedBy("has_niobium_block", has(ModBlocks.NIOBIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_MOLYBDENUM.get(), 9)
            .requires(ModBlocks.RAW_MOLYBDENUM_BLOCK)
                .unlockedBy("has_raw_molybdenum_block", has(ModBlocks.RAW_MOLYBDENUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MOLYBDENUM_INGOT.get(), 9)
            .requires(ModBlocks.MOLYBDENUM_BLOCK)
                .unlockedBy("has_molybdenum_block", has(ModBlocks.MOLYBDENUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TECHNETIUM.get(), 9)
            .requires(ModBlocks.TECHNETIUM_BLOCK)
                .unlockedBy("has_technetium_block", has(ModBlocks.TECHNETIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_RUTHENIUM.get(), 9)
            .requires(ModBlocks.RAW_RUTHENIUM_BLOCK)
                .unlockedBy("has_raw_ruthenium_block", has(ModBlocks.RAW_RUTHENIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUTHENIUM_INGOT.get(), 9)
            .requires(ModBlocks.RUTHENIUM_BLOCK)
                .unlockedBy("has_ruthenium_block", has(ModBlocks.RUTHENIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_RHODIUM.get(), 9)
            .requires(ModBlocks.RAW_RHODIUM_BLOCK)
                .unlockedBy("has_raw_rhodium_block", has(ModBlocks.RAW_RHODIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RHODIUM_INGOT.get(), 9)
            .requires(ModBlocks.RHODIUM_BLOCK)
                .unlockedBy("has_rhodium_block", has(ModBlocks.RHODIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_PALLADIUM.get(), 9)
            .requires(ModBlocks.RAW_PALLADIUM_BLOCK)
                .unlockedBy("has_raw_palladium_block", has(ModBlocks.RAW_PALLADIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 9)
            .requires(ModBlocks.PALLADIUM_BLOCK)
                .unlockedBy("has_palladium_block", has(ModBlocks.PALLADIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SILVER.get(), 9)
            .requires(ModBlocks.RAW_SILVER_BLOCK)
                .unlockedBy("has_raw_silver_block", has(ModBlocks.RAW_SILVER_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 9)
            .requires(ModBlocks.SILVER_BLOCK)
            .unlockedBy("has_silver_block", has(ModBlocks.SILVER_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_CADMIUM.get(), 9)
            .requires(ModBlocks.RAW_CADMIUM_BLOCK)
                .unlockedBy("has_raw_cadmium_block", has(ModBlocks.RAW_CADMIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CADMIUM_INGOT.get(), 9)
            .requires(ModBlocks.CADMIUM_BLOCK)
                .unlockedBy("has_cadmium_block", has(ModBlocks.CADMIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INDIUM.get(), 9)
            .requires(ModBlocks.INDIUM_BLOCK)
                .unlockedBy("has_indium_block", has(ModBlocks.INDIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN.get(), 9)
            .requires(ModBlocks.TIN_BLOCK)
                .unlockedBy("has_tin_block", has(ModBlocks.TIN_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ANTIMONY.get(), 9)
            .requires(ModBlocks.ANTIMONY_BLOCK)
                .unlockedBy("has_antimony_block", has(ModBlocks.ANTIMONY_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TELLURIUM.get(), 9)
            .requires(ModBlocks.TELLURIUM_BLOCK)
                .unlockedBy("has_tellurium_block", has(ModBlocks.TELLURIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.IODINE.get(), 9)
            .requires(ModBlocks.IODINE_BLOCK)
                .unlockedBy("has_iodine_block", has(ModBlocks.IODINE_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.XENON.get(), 9)
            .requires(ModBlocks.XENON_BLOCK)
                .unlockedBy("has_xenon_block", has(ModBlocks.XENON_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CAESIUM.get(), 9)
            .requires(ModBlocks.CAESIUM_BLOCK)
                .unlockedBy("has_caesium_block", has(ModBlocks.CAESIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BARIUM.get(), 9)
            .requires(ModBlocks.BARIUM_BLOCK)
                .unlockedBy("has_barium_block", has(ModBlocks.BARIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LANTHANUM.get(), 9)
            .requires(ModBlocks.LANTHANUM_BLOCK)
                .unlockedBy("has_lanthanum_block", has(ModBlocks.LANTHANUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CERIUM.get(), 9)
            .requires(ModBlocks.CERIUM_BLOCK)
                .unlockedBy("has_cerium_block", has(ModBlocks.CERIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PRASEODYMIUM.get(), 9)
            .requires(ModBlocks.PRASEODYMIUM_BLOCK)
                .unlockedBy("has_praseodymium_block", has(ModBlocks.PRASEODYMIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NEODYMIUM.get(), 9)
            .requires(ModBlocks.NEODYMIUM_BLOCK)
                .unlockedBy("has_neodymium_block", has(ModBlocks.NEODYMIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PROMETHIUM.get(), 9)
            .requires(ModBlocks.PROMETHIUM_BLOCK)
                .unlockedBy("has_promethium_block", has(ModBlocks.PROMETHIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAMARIUM.get(), 9)
            .requires(ModBlocks.SAMARIUM_BLOCK)
                .unlockedBy("has_samarium_block", has(ModBlocks.SAMARIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.EUROPIUM.get(), 9)
            .requires(ModBlocks.EUROPIUM_BLOCK)
                .unlockedBy("has_europium_block", has(ModBlocks.EUROPIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GADOLINIUM.get(), 9)
            .requires(ModBlocks.GADOLINIUM_BLOCK)
                .unlockedBy("has_gadolinium_block", has(ModBlocks.GADOLINIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TERBIUM.get(), 9)
            .requires(ModBlocks.TERBIUM_BLOCK)
                .unlockedBy("has_terbium_block", has(ModBlocks.TERBIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DYSPROSIUM.get(), 9)
            .requires(ModBlocks.DYSPROSIUM_BLOCK)
                .unlockedBy("has_dysprosium_block", has(ModBlocks.DYSPROSIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HOLMIUM.get(), 9)
            .requires(ModBlocks.HOLMIUM_BLOCK)
                .unlockedBy("has_holmium_block", has(ModBlocks.HOLMIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ERBIUM.get(), 9)
            .requires(ModBlocks.ERBIUM_BLOCK)
                .unlockedBy("has_erbium_block", has(ModBlocks.ERBIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.THULIUM.get(), 9)
            .requires(ModBlocks.THULIUM_BLOCK)
                .unlockedBy("has_thulium_block", has(ModBlocks.THULIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.YTTERBIUM.get(), 9)
            .requires(ModBlocks.YTTERBIUM_BLOCK)
                .unlockedBy("has_ytterbium_block", has(ModBlocks.YTTERBIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LUTETIUM.get(), 9)
            .requires(ModBlocks.LUTETIUM_BLOCK)
                .unlockedBy("has_lutetium_block", has(ModBlocks.LUTETIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_HAFNIUM.get(), 9)
            .requires(ModBlocks.RAW_HAFNIUM_BLOCK)
                .unlockedBy("has_raw_hafnium_block", has(ModBlocks.RAW_HAFNIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HAFNIUM_INGOT.get(), 9)
            .requires(ModBlocks.HAFNIUM_BLOCK)
                .unlockedBy("has_hafnium_block", has(ModBlocks.HAFNIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_TANTALUM.get(), 9)
            .requires(ModBlocks.RAW_TANTALUM_BLOCK)
                .unlockedBy("has_raw_tantalum_block", has(ModBlocks.RAW_TANTALUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TANTALUM_INGOT.get(), 9)
            .requires(ModBlocks.TANTALUM_BLOCK)
                .unlockedBy("has_tantalum_block", has(ModBlocks.TANTALUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_TUNGSTEN.get(), 9)
            .requires(ModBlocks.RAW_TUNGSTEN_BLOCK)
                .unlockedBy("has_raw_tungsten_block", has(ModBlocks.RAW_TUNGSTEN_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get(), 9)
            .requires(ModBlocks.TUNGSTEN_BLOCK)
                .unlockedBy("has_tungsten_block", has(ModBlocks.TUNGSTEN_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_RHENIUM.get(), 9)
            .requires(ModBlocks.RAW_RHENIUM_BLOCK)
                .unlockedBy("has_raw_rhenium_block", has(ModBlocks.RAW_RHENIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RHENIUM_INGOT.get(), 9)
            .requires(ModBlocks.RHENIUM_BLOCK)
                .unlockedBy("has_rhenium_block", has(ModBlocks.RHENIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_OSMIUM.get(), 9)
            .requires(ModBlocks.RAW_OSMIUM_BLOCK)
                .unlockedBy("has_raw_osmium_block", has(ModBlocks.RAW_OSMIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get(), 9)
            .requires(ModBlocks.OSMIUM_BLOCK)
                .unlockedBy("has_osmium_block", has(ModBlocks.OSMIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_IRIDIUM.get(), 9)
            .requires(ModBlocks.RAW_IRIDIUM_BLOCK)
                .unlockedBy("has_raw_iridium_block", has(ModBlocks.RAW_IRIDIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.IRIDIUM_INGOT.get(), 9)
            .requires(ModBlocks.IRIDIUM_BLOCK)
                .unlockedBy("has_iridium_block", has(ModBlocks.IRIDIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLATINUM.get(), 9)
            .requires(ModBlocks.PLATINUM_BLOCK)
                .unlockedBy("has_platinum_block", has(ModBlocks.PLATINUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.THALLIUM.get(), 9)
            .requires(ModBlocks.THALLIUM_BLOCK)
                .unlockedBy("has_thallium_block", has(ModBlocks.THALLIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEAD.get(), 9)
            .requires(ModBlocks.LEAD_BLOCK)
                .unlockedBy("has_lead_block", has(ModBlocks.LEAD_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BISMUTH.get(), 9)
            .requires(ModBlocks.BISMUTH_BLOCK)
                .unlockedBy("has_bismuth_block", has(ModBlocks.BISMUTH_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.POLONIUM.get(), 9)
            .requires(ModBlocks.POLONIUM_BLOCK)
                .unlockedBy("has_polonium_block", has(ModBlocks.POLONIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ASTATINE.get(), 9)
            .requires(ModBlocks.ASTATINE_BLOCK)
                .unlockedBy("has_astatine_block", has(ModBlocks.ASTATINE_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RADON.get(), 9)
            .requires(ModBlocks.RADON_BLOCK)
                .unlockedBy("has_radon_block", has(ModBlocks.RADON_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FRANCIUM.get(), 9)
            .requires(ModBlocks.FRANCIUM_BLOCK)
                .unlockedBy("has_francium_block", has(ModBlocks.FRANCIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RADIUM.get(), 9)
            .requires(ModBlocks.RADIUM_BLOCK)
                .unlockedBy("has_radium_block", has(ModBlocks.RADIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ACTINIUM.get(), 9)
            .requires(ModBlocks.ACTINIUM_BLOCK)
                .unlockedBy("has_actinium_block", has(ModBlocks.ACTINIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.THORIUM.get(), 9)
            .requires(ModBlocks.THORIUM_BLOCK)
                .unlockedBy("has_thorium_block", has(ModBlocks.THORIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PROTACTINIUM.get(), 9)
            .requires(ModBlocks.PROTACTINIUM_BLOCK)
                .unlockedBy("has_protactinium_block", has(ModBlocks.PROTACTINIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.URANIUM.get(), 9)
            .requires(ModBlocks.URANIUM_BLOCK)
                .unlockedBy("has_uranium_block", has(ModBlocks.URANIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NEPTUNIUM.get(), 9)
            .requires(ModBlocks.NEPTUNIUM_BLOCK)
                .unlockedBy("has_neptunium_block", has(ModBlocks.NEPTUNIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLUTONIUM.get(), 9)
            .requires(ModBlocks.PLUTONIUM_BLOCK)
                .unlockedBy("has_plutonium_block", has(ModBlocks.PLUTONIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AMERICIUM.get(), 9)
            .requires(ModBlocks.AMERICIUM_BLOCK)
                .unlockedBy("has_americium_block", has(ModBlocks.AMERICIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CURIUM.get(), 9)
            .requires(ModBlocks.CURIUM_BLOCK)
                .unlockedBy("has_curium_block", has(ModBlocks.CURIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BERKELIUM.get(), 9)
            .requires(ModBlocks.BERKELIUM_BLOCK)
                .unlockedBy("has_berkelium_block", has(ModBlocks.BERKELIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CALIFORNIUM.get(), 9)
            .requires(ModBlocks.CALIFORNIUM_BLOCK)
                .unlockedBy("has_californium_block", has(ModBlocks.CALIFORNIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.EINSTEINIUM.get(), 9)
            .requires(ModBlocks.EINSTEINIUM_BLOCK)
                .unlockedBy("has_einsteinium_block", has(ModBlocks.EINSTEINIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FERMIUM.get(), 9)
            .requires(ModBlocks.FERMIUM_BLOCK)
                .unlockedBy("has_fermium_block", has(ModBlocks.FERMIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MENDELEVIUM.get(), 9)
            .requires(ModBlocks.MENDELEVIUM_BLOCK)
                .unlockedBy("has_mendelevium_block", has(ModBlocks.MENDELEVIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NOBELIUM.get(), 9)
            .requires(ModBlocks.NOBELIUM_BLOCK)
                .unlockedBy("has_nobelium_block", has(ModBlocks.NOBELIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LAWRENCIUM.get(), 9)
            .requires(ModBlocks.LAWRENCIUM_BLOCK)
                .unlockedBy("has_lawrencium_block", has(ModBlocks.LAWRENCIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUTHERFORDIUM.get(), 9)
            .requires(ModBlocks.RUTHERFORDIUM_BLOCK)
                .unlockedBy("has_rutherfordium_block", has(ModBlocks.RUTHERFORDIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DUBNIUM.get(), 9)
            .requires(ModBlocks.DUBNIUM_BLOCK)
                .unlockedBy("has_dubnium_block", has(ModBlocks.DUBNIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SEABORGIUM.get(), 9)
            .requires(ModBlocks.SEABORGIUM_BLOCK)
                .unlockedBy("has_seaborgium_block", has(ModBlocks.SEABORGIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BOHRIUM.get(), 9)
            .requires(ModBlocks.BOHRIUM_BLOCK)
                .unlockedBy("has_bohrium_block", has(ModBlocks.BOHRIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HASSIUM.get(), 9)
            .requires(ModBlocks.HASSIUM_BLOCK)
                .unlockedBy("has_hassium_block", has(ModBlocks.HASSIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MEITNERIUM.get(), 9)
            .requires(ModBlocks.MEITNERIUM_BLOCK)
                .unlockedBy("has_meitnerium_block", has(ModBlocks.MEITNERIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DARMSTADTIUM.get(), 9)
            .requires(ModBlocks.DARMSTADTIUM_BLOCK)
                .unlockedBy("has_darmstadtium_block", has(ModBlocks.DARMSTADTIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROENTGENIUM.get(), 9)
            .requires(ModBlocks.ROENTGENIUM_BLOCK)
                .unlockedBy("has_roentgenium_block", has(ModBlocks.ROENTGENIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COPERNICIUM.get(), 9)
            .requires(ModBlocks.COPERNICIUM_BLOCK)
                .unlockedBy("has_copernicium_block", has(ModBlocks.COPERNICIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NIHONIUM.get(), 9)
            .requires(ModBlocks.NIHONIUM_BLOCK)
                .unlockedBy("has_nihonium_block", has(ModBlocks.NIHONIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FLEROVIUM.get(), 9)
            .requires(ModBlocks.FLEROVIUM_BLOCK)
                .unlockedBy("has_flerovium_block", has(ModBlocks.FLEROVIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MOSCOVIUM.get(), 9)
            .requires(ModBlocks.MOSCOVIUM_BLOCK)
                .unlockedBy("has_moscovium_block", has(ModBlocks.MOSCOVIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LIVERMORIUM.get(), 9)
            .requires(ModBlocks.LIVERMORIUM_BLOCK)
                .unlockedBy("has_livermorium_block", has(ModBlocks.LIVERMORIUM_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TENNESSINE.get(), 9)
            .requires(ModBlocks.TENNESSINE_BLOCK)
                .unlockedBy("has_tennessine_block", has(ModBlocks.TENNESSINE_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OGANESSON.get(), 9)
            .requires(ModBlocks.OGANESSON_BLOCK)
                .unlockedBy("has_oganesson_block", has(ModBlocks.OGANESSON_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, HYDROGEN, RecipeCategory.MISC, ModItems.HYDROGEN.get(), 0.25f, 200, "hydrogen");
        oreSmelting(recipeOutput, HELIUM, RecipeCategory.MISC, ModItems.HELIUM.get(), 0.25f, 200, "helium");
        oreSmelting(recipeOutput, LITHIUM, RecipeCategory.MISC, ModItems.LITHIUM.get(), 0.25f, 200, "lithium");
        oreSmelting(recipeOutput, BERYLLIUM, RecipeCategory.MISC, ModItems.BERYLLIUM.get(), 0.25f, 200, "beryllium");
        oreSmelting(recipeOutput, BORON, RecipeCategory.MISC, ModItems.BORON.get(), 0.25f, 200, "boron");
        oreSmelting(recipeOutput, CARBON, RecipeCategory.MISC, ModItems.CARBON.get(), 0.25f, 200, "carbon");
        oreSmelting(recipeOutput, NITROGEN, RecipeCategory.MISC, ModItems.NITROGEN.get(), 0.25f, 200, "nitrogen");
        oreSmelting(recipeOutput, OXYGEN, RecipeCategory.MISC, ModItems.OXYGEN.get(), 0.25f, 200, "oxygen");
        oreSmelting(recipeOutput, FLUORINE, RecipeCategory.MISC, ModItems.FLUORINE.get(), 0.25f, 200, "fluorine");
        oreSmelting(recipeOutput, NEON, RecipeCategory.MISC, ModItems.NEON.get(), 0.25f, 200, "neon");
        oreSmelting(recipeOutput, SODIUM, RecipeCategory.MISC, ModItems.SODIUM.get(), 0.25f, 200, "sodium");
        oreSmelting(recipeOutput, MAGNESIUM, RecipeCategory.MISC, ModItems.MAGNESIUM.get(), 0.25f, 200, "magnesium");
        oreSmelting(recipeOutput, ALUMINUM, RecipeCategory.MISC, ModItems.ALUMINUM.get(), 0.25f, 200, "aluminum");
        oreSmelting(recipeOutput, SILICON, RecipeCategory.MISC, ModItems.SILICON.get(), 0.25f, 200, "silicon");
        oreSmelting(recipeOutput, PHOSPHORUS, RecipeCategory.MISC, ModItems.PHOSPHORUS.get(), 0.25f, 200, "phosphorus");
        oreSmelting(recipeOutput, SULFUR, RecipeCategory.MISC, ModItems.SULFUR.get(), 0.25f, 200, "sulfur");
        oreSmelting(recipeOutput, CHLORINE, RecipeCategory.MISC, ModItems.CHLORINE.get(), 0.25f, 200, "chlorine");
        oreSmelting(recipeOutput, ARGON, RecipeCategory.MISC, ModItems.ARGON.get(), 0.25f, 200, "argon");
        oreSmelting(recipeOutput, POTASSIUM, RecipeCategory.MISC, ModItems.POTASSIUM.get(), 0.25f, 200, "potassium");
        oreSmelting(recipeOutput, CALCIUM, RecipeCategory.MISC, ModItems.CALCIUM.get(), 0.25f, 200, "calcium");
        oreSmelting(recipeOutput, SCANDIUM, RecipeCategory.MISC, ModItems.SCANDIUM_INGOT.get(), 0.25f, 200, "scandium");
        oreSmelting(recipeOutput, TITANIUM, RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 0.25f, 200, "titanium");
        oreSmelting(recipeOutput, VANADIUM, RecipeCategory.MISC, ModItems.VANADIUM_INGOT.get(), 0.25f, 200, "vanadium");
        oreSmelting(recipeOutput, CHROMIUM, RecipeCategory.MISC, ModItems.CHROMIUM_INGOT.get(), 0.25f, 200, "chromium");
        oreSmelting(recipeOutput, MANGANESE, RecipeCategory.MISC, ModItems.MANGANESE_INGOT.get(), 0.25f, 200, "manganese");
        oreSmelting(recipeOutput, COBALT, RecipeCategory.MISC, ModItems.COBALT_INGOT.get(), 0.25f, 200, "cobalt");
        oreSmelting(recipeOutput, NICKEL, RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(), 0.25f, 200, "nickel");
        oreSmelting(recipeOutput, ZINC, RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 0.25f, 200, "zinc");
        oreSmelting(recipeOutput, GALLIUM, RecipeCategory.MISC, ModItems.GALLIUM.get(), 0.25f, 200, "gallium");
        oreSmelting(recipeOutput, GERMANIUM, RecipeCategory.MISC, ModItems.GERMANIUM.get(), 0.25f, 200, "germanium");
        oreSmelting(recipeOutput, ARSENIC, RecipeCategory.MISC, ModItems.ARSENIC.get(), 0.25f, 200, "arsenic");
        oreSmelting(recipeOutput, SELENIUM, RecipeCategory.MISC, ModItems.SELENIUM.get(), 0.25f, 200, "selenium");
        oreSmelting(recipeOutput, KRYPTON, RecipeCategory.MISC, ModItems.KRYPTON.get(), 0.25f, 200, "krypton");
        oreSmelting(recipeOutput, RUBIDIUM, RecipeCategory.MISC, ModItems.RUBIDIUM.get(), 0.25f, 200, "rubidium");
        oreSmelting(recipeOutput, STRONTIUM, RecipeCategory.MISC, ModItems.STRONTIUM.get(), 0.25f, 200, "strontium");
        oreSmelting(recipeOutput, YTTRIUM, RecipeCategory.MISC, ModItems.YTTRIUM_INGOT.get(), 0.25f, 200, "yttrium");
        oreSmelting(recipeOutput, ZIRCONIUM, RecipeCategory.MISC, ModItems.ZIRCONIUM_INGOT.get(), 0.25f, 200, "zirconium");
        oreSmelting(recipeOutput, NIOBIUM, RecipeCategory.MISC, ModItems.NIOBIUM_INGOT.get(), 0.25f, 200, "niobium");
        oreSmelting(recipeOutput, MOLYBDENUM, RecipeCategory.MISC, ModItems.MOLYBDENUM_INGOT.get(), 0.25f, 200, "molybdenum");
        oreSmelting(recipeOutput, TECHNETIUM, RecipeCategory.MISC, ModItems.TECHNETIUM.get(), 0.25f, 200, "technetium");
        oreSmelting(recipeOutput, RUTHENIUM, RecipeCategory.MISC, ModItems.RUTHENIUM_INGOT.get(), 0.25f, 200, "ruthenium");
        oreSmelting(recipeOutput, RHODIUM, RecipeCategory.MISC, ModItems.RHODIUM_INGOT.get(), 0.25f, 200, "rhodium");
        oreSmelting(recipeOutput, PALLADIUM, RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 0.25f, 200, "palladium");
        oreSmelting(recipeOutput, SILVER, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 200, "silver");
        oreSmelting(recipeOutput, CADMIUM, RecipeCategory.MISC, ModItems.CADMIUM_INGOT.get(), 0.25f, 200, "cadmium");
        oreSmelting(recipeOutput, INDIUM, RecipeCategory.MISC, ModItems.INDIUM.get(), 0.25f, 200, "indium");
        oreSmelting(recipeOutput, TIN, RecipeCategory.MISC, ModItems.TIN.get(), 0.25f, 200, "tin");
        oreSmelting(recipeOutput, ANTIMONY, RecipeCategory.MISC, ModItems.ANTIMONY.get(), 0.25f, 200, "antimony");
        oreSmelting(recipeOutput, TELLURIUM, RecipeCategory.MISC, ModItems.TELLURIUM.get(), 0.25f, 200, "tellurium");
        oreSmelting(recipeOutput, IODINE, RecipeCategory.MISC, ModItems.IODINE.get(), 0.25f, 200, "iodine");
        oreSmelting(recipeOutput, XENON, RecipeCategory.MISC, ModItems.XENON.get(), 0.25f, 200, "xenon");
        oreSmelting(recipeOutput, CAESIUM, RecipeCategory.MISC, ModItems.CAESIUM.get(), 0.25f, 200, "caesium");
        oreSmelting(recipeOutput, BARIUM, RecipeCategory.MISC, ModItems.BARIUM.get(), 0.25f, 200, "barium");
        oreSmelting(recipeOutput, LANTHANUM, RecipeCategory.MISC, ModItems.LANTHANUM.get(), 0.25f, 200, "lanthanum");
        oreSmelting(recipeOutput, CERIUM, RecipeCategory.MISC, ModItems.CERIUM.get(), 0.25f, 200, "cerium");
        oreSmelting(recipeOutput, PRASEODYMIUM, RecipeCategory.MISC, ModItems.PRASEODYMIUM.get(), 0.25f, 200, "praseodymium");
        oreSmelting(recipeOutput, NEODYMIUM, RecipeCategory.MISC, ModItems.NEODYMIUM.get(), 0.25f, 200, "neodymium");
        oreSmelting(recipeOutput, PROMETHIUM, RecipeCategory.MISC, ModItems.PROMETHIUM.get(), 0.25f, 200, "promethium");
        oreSmelting(recipeOutput, SAMARIUM, RecipeCategory.MISC, ModItems.SAMARIUM.get(), 0.25f, 200, "samarium");
        oreSmelting(recipeOutput, EUROPIUM, RecipeCategory.MISC, ModItems.EUROPIUM.get(), 0.25f, 200, "europium");
        oreSmelting(recipeOutput, GADOLINIUM, RecipeCategory.MISC, ModItems.GADOLINIUM.get(), 0.25f, 200, "gadolinium");
        oreSmelting(recipeOutput, TERBIUM, RecipeCategory.MISC, ModItems.TERBIUM.get(), 0.25f, 200, "terbium");
        oreSmelting(recipeOutput, DYSPROSIUM, RecipeCategory.MISC, ModItems.DYSPROSIUM.get(), 0.25f, 200, "dysprosium");
        oreSmelting(recipeOutput, HOLMIUM, RecipeCategory.MISC, ModItems.HOLMIUM.get(), 0.25f, 200, "holmium");
        oreSmelting(recipeOutput, ERBIUM, RecipeCategory.MISC, ModItems.ERBIUM.get(), 0.25f, 200, "erbium");
        oreSmelting(recipeOutput, THULIUM, RecipeCategory.MISC, ModItems.THULIUM.get(), 0.25f, 200, "thulium");
        oreSmelting(recipeOutput, YTTERBIUM, RecipeCategory.MISC, ModItems.YTTERBIUM.get(), 0.25f, 200, "ytterbium");
        oreSmelting(recipeOutput, LUTETIUM, RecipeCategory.MISC, ModItems.LUTETIUM.get(), 0.25f, 200, "lutetium");
        oreSmelting(recipeOutput, HAFNIUM, RecipeCategory.MISC, ModItems.HAFNIUM_INGOT.get(), 0.25f, 200, "hafnium");
        oreSmelting(recipeOutput, TANTALUM, RecipeCategory.MISC, ModItems.TANTALUM_INGOT.get(), 0.25f, 200, "tantalum");
        oreSmelting(recipeOutput, TUNGSTEN, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get(), 0.25f, 200, "tungsten");
        oreSmelting(recipeOutput, RHENIUM, RecipeCategory.MISC, ModItems.RHENIUM_INGOT.get(), 0.25f, 200, "rhenium");
        oreSmelting(recipeOutput, OSMIUM, RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get(), 0.25f, 200, "osmium");
        oreSmelting(recipeOutput, IRIDIUM, RecipeCategory.MISC, ModItems.IRIDIUM_INGOT.get(), 0.25f, 200, "iridium");
        oreSmelting(recipeOutput, PLATINUM, RecipeCategory.MISC, ModItems.PLATINUM.get(), 0.25f, 200, "platinum");
        oreSmelting(recipeOutput, THALLIUM, RecipeCategory.MISC, ModItems.THALLIUM.get(), 0.25f, 200, "thallium");
        oreSmelting(recipeOutput, LEAD, RecipeCategory.MISC, ModItems.LEAD.get(), 0.25f, 200, "lead");
        oreSmelting(recipeOutput, BISMUTH, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f, 200, "bismuth");
        oreSmelting(recipeOutput, POLONIUM, RecipeCategory.MISC, ModItems.POLONIUM.get(), 0.25f, 200, "polonium");
        oreSmelting(recipeOutput, ASTATINE, RecipeCategory.MISC, ModItems.ASTATINE.get(), 0.25f, 200, "astatine");
        oreSmelting(recipeOutput, RADON, RecipeCategory.MISC, ModItems.RADON.get(), 0.25f, 200, "radon");
        oreSmelting(recipeOutput, FRANCIUM, RecipeCategory.MISC, ModItems.FRANCIUM.get(), 0.25f, 200, "francium");
        oreSmelting(recipeOutput, RADIUM, RecipeCategory.MISC, ModItems.RADIUM.get(), 0.25f, 200, "radium");
        oreSmelting(recipeOutput, ACTINIUM, RecipeCategory.MISC, ModItems.ACTINIUM.get(), 0.25f, 200, "actinium");
        oreSmelting(recipeOutput, THORIUM, RecipeCategory.MISC, ModItems.THORIUM.get(), 0.25f, 200, "thorium");
        oreSmelting(recipeOutput, PROTACTINIUM, RecipeCategory.MISC, ModItems.PROTACTINIUM.get(), 0.25f, 200, "protactinium");
        oreSmelting(recipeOutput, URANIUM, RecipeCategory.MISC, ModItems.URANIUM.get(), 0.25f, 200, "uranium");
        oreSmelting(recipeOutput, NEPTUNIUM, RecipeCategory.MISC, ModItems.NEPTUNIUM.get(), 0.25f, 200, "neptunium");
        oreSmelting(recipeOutput, PLUTONIUM, RecipeCategory.MISC, ModItems.PLUTONIUM.get(), 0.25f, 200, "plutonium");
        oreSmelting(recipeOutput, AMERICIUM, RecipeCategory.MISC, ModItems.AMERICIUM.get(), 0.25f, 200, "americium");
        oreSmelting(recipeOutput, CURIUM, RecipeCategory.MISC, ModItems.CURIUM.get(), 0.25f, 200, "curium");
        oreSmelting(recipeOutput, BERKELIUM, RecipeCategory.MISC, ModItems.BERKELIUM.get(), 0.25f, 200, "berkelium");
        oreSmelting(recipeOutput, CALIFORNIUM, RecipeCategory.MISC, ModItems.CALIFORNIUM.get(), 0.25f, 200, "californium");
        oreSmelting(recipeOutput, EINSTEINIUM, RecipeCategory.MISC, ModItems.EINSTEINIUM.get(), 0.25f, 200, "einsteinium");
        oreSmelting(recipeOutput, FERMIUM, RecipeCategory.MISC, ModItems.FERMIUM.get(), 0.25f, 200, "fermium");
        oreSmelting(recipeOutput, MENDELEVIUM, RecipeCategory.MISC, ModItems.MENDELEVIUM.get(), 0.25f, 200, "mendelevium");
        oreSmelting(recipeOutput, NOBELIUM, RecipeCategory.MISC, ModItems.NOBELIUM.get(), 0.25f, 200, "nobelium");
        oreSmelting(recipeOutput, LAWRENCIUM, RecipeCategory.MISC, ModItems.LAWRENCIUM.get(), 0.25f, 200, "lawrencium");
        oreSmelting(recipeOutput, RUTHERFORDIUM, RecipeCategory.MISC, ModItems.RUTHERFORDIUM.get(), 0.25f, 200, "rutherfordium");
        oreSmelting(recipeOutput, DUBNIUM, RecipeCategory.MISC, ModItems.DUBNIUM.get(), 0.25f, 200, "dubnium");
        oreSmelting(recipeOutput, SEABORGIUM, RecipeCategory.MISC, ModItems.SEABORGIUM.get(), 0.25f, 200, "seaborgium");
        oreSmelting(recipeOutput, BOHRIUM, RecipeCategory.MISC, ModItems.BOHRIUM.get(), 0.25f, 200, "bohrium");
        oreSmelting(recipeOutput, HASSIUM, RecipeCategory.MISC, ModItems.HASSIUM.get(), 0.25f, 200, "hassium");
        oreSmelting(recipeOutput, MEITNERIUM, RecipeCategory.MISC, ModItems.MEITNERIUM.get(), 0.25f, 200, "meitnerium");
        oreSmelting(recipeOutput, DARMSTADTIUM, RecipeCategory.MISC, ModItems.DARMSTADTIUM.get(), 0.25f, 200, "darmstadtium");
        oreSmelting(recipeOutput, ROENTGENIUM, RecipeCategory.MISC, ModItems.ROENTGENIUM.get(), 0.25f, 200, "roentgenium");
        oreSmelting(recipeOutput, COPERNICIUM, RecipeCategory.MISC, ModItems.COPERNICIUM.get(), 0.25f, 200, "copernicium");
        oreSmelting(recipeOutput, NIHONIUM, RecipeCategory.MISC, ModItems.NIHONIUM.get(), 0.25f, 200, "nihonium");
        oreSmelting(recipeOutput, FLEROVIUM, RecipeCategory.MISC, ModItems.FLEROVIUM.get(), 0.25f, 200, "flerovium");
        oreSmelting(recipeOutput, MOSCOVIUM, RecipeCategory.MISC, ModItems.MOSCOVIUM.get(), 0.25f, 200, "moscovium");
        oreSmelting(recipeOutput, LIVERMORIUM, RecipeCategory.MISC, ModItems.LIVERMORIUM.get(), 0.25f, 200, "livermorium");
        oreSmelting(recipeOutput, TENNESSINE, RecipeCategory.MISC, ModItems.TENNESSINE.get(), 0.25f, 200, "tennessine");
        oreSmelting(recipeOutput, OGANESSON, RecipeCategory.MISC, ModItems.OGANESSON.get(), 0.25f, 200, "oganesson");

        oreBlasting(recipeOutput, HYDROGEN, RecipeCategory.MISC, ModItems.HYDROGEN.get(), 0.25f, 100, "hydrogen");
        oreBlasting(recipeOutput, HELIUM, RecipeCategory.MISC, ModItems.HELIUM.get(), 0.25f, 100, "helium");
        oreBlasting(recipeOutput, LITHIUM, RecipeCategory.MISC, ModItems.LITHIUM.get(), 0.25f, 100, "lithium");
        oreBlasting(recipeOutput, BERYLLIUM, RecipeCategory.MISC, ModItems.BERYLLIUM.get(), 0.25f, 100, "beryllium");
        oreBlasting(recipeOutput, BORON, RecipeCategory.MISC, ModItems.BORON.get(), 0.25f, 100, "boron");
        oreBlasting(recipeOutput, CARBON, RecipeCategory.MISC, ModItems.CARBON.get(), 0.25f, 100, "carbon");
        oreBlasting(recipeOutput, NITROGEN, RecipeCategory.MISC, ModItems.NITROGEN.get(), 0.25f, 100, "nitrogen");
        oreBlasting(recipeOutput, OXYGEN, RecipeCategory.MISC, ModItems.OXYGEN.get(), 0.25f, 100, "oxygen");
        oreBlasting(recipeOutput, FLUORINE, RecipeCategory.MISC, ModItems.FLUORINE.get(), 0.25f, 100, "fluorine");
        oreBlasting(recipeOutput, NEON, RecipeCategory.MISC, ModItems.NEON.get(), 0.25f, 100, "neon");
        oreBlasting(recipeOutput, SODIUM, RecipeCategory.MISC, ModItems.SODIUM.get(), 0.25f, 100, "sodium");
        oreBlasting(recipeOutput, MAGNESIUM, RecipeCategory.MISC, ModItems.MAGNESIUM.get(), 0.25f, 100, "magnesium");
        oreBlasting(recipeOutput, ALUMINUM, RecipeCategory.MISC, ModItems.ALUMINUM.get(), 0.25f, 100, "aluminum");
        oreBlasting(recipeOutput, SILICON, RecipeCategory.MISC, ModItems.SILICON.get(), 0.25f, 100, "silicon");
        oreBlasting(recipeOutput, PHOSPHORUS, RecipeCategory.MISC, ModItems.PHOSPHORUS.get(), 0.25f, 100, "phosphorus");
        oreBlasting(recipeOutput, SULFUR, RecipeCategory.MISC, ModItems.SULFUR.get(), 0.25f, 100, "sulfur");
        oreBlasting(recipeOutput, CHLORINE, RecipeCategory.MISC, ModItems.CHLORINE.get(), 0.25f, 100, "chlorine");
        oreBlasting(recipeOutput, ARGON, RecipeCategory.MISC, ModItems.ARGON.get(), 0.25f, 100, "argon");
        oreBlasting(recipeOutput, POTASSIUM, RecipeCategory.MISC, ModItems.POTASSIUM.get(), 0.25f, 100, "potassium");
        oreBlasting(recipeOutput, CALCIUM, RecipeCategory.MISC, ModItems.CALCIUM.get(), 0.25f, 100, "calcium");
        oreBlasting(recipeOutput, SCANDIUM, RecipeCategory.MISC, ModItems.SCANDIUM_INGOT.get(), 0.25f, 100, "scandium");
        oreBlasting(recipeOutput, TITANIUM, RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 0.25f, 100, "titanium");
        oreBlasting(recipeOutput, VANADIUM, RecipeCategory.MISC, ModItems.VANADIUM_INGOT.get(), 0.25f, 100, "vanadium");
        oreBlasting(recipeOutput, CHROMIUM, RecipeCategory.MISC, ModItems.CHROMIUM_INGOT.get(), 0.25f, 100, "chromium");
        oreBlasting(recipeOutput, MANGANESE, RecipeCategory.MISC, ModItems.MANGANESE_INGOT.get(), 0.25f, 100, "manganese");
        oreBlasting(recipeOutput, COBALT, RecipeCategory.MISC, ModItems.COBALT_INGOT.get(), 0.25f, 100, "cobalt");
        oreBlasting(recipeOutput, NICKEL, RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(), 0.25f, 100, "nickel");
        oreBlasting(recipeOutput, ZINC, RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 0.25f, 100, "zinc");
        oreBlasting(recipeOutput, GALLIUM, RecipeCategory.MISC, ModItems.GALLIUM.get(), 0.25f, 100, "gallium");
        oreBlasting(recipeOutput, GERMANIUM, RecipeCategory.MISC, ModItems.GERMANIUM.get(), 0.25f, 100, "germanium");
        oreBlasting(recipeOutput, ARSENIC, RecipeCategory.MISC, ModItems.ARSENIC.get(), 0.25f, 100, "arsenic");
        oreBlasting(recipeOutput, SELENIUM, RecipeCategory.MISC, ModItems.SELENIUM.get(), 0.25f, 100, "selenium");
        oreBlasting(recipeOutput, KRYPTON, RecipeCategory.MISC, ModItems.KRYPTON.get(), 0.25f, 100, "krypton");
        oreBlasting(recipeOutput, RUBIDIUM, RecipeCategory.MISC, ModItems.RUBIDIUM.get(), 0.25f, 100, "rubidium");
        oreBlasting(recipeOutput, STRONTIUM, RecipeCategory.MISC, ModItems.STRONTIUM.get(), 0.25f, 100, "strontium");
        oreBlasting(recipeOutput, YTTRIUM, RecipeCategory.MISC, ModItems.YTTRIUM_INGOT.get(), 0.25f, 100, "yttrium");
        oreBlasting(recipeOutput, ZIRCONIUM, RecipeCategory.MISC, ModItems.ZIRCONIUM_INGOT.get(), 0.25f, 100, "zirconium");
        oreBlasting(recipeOutput, NIOBIUM, RecipeCategory.MISC, ModItems.NIOBIUM_INGOT.get(), 0.25f, 100, "niobium");
        oreBlasting(recipeOutput, MOLYBDENUM, RecipeCategory.MISC, ModItems.MOLYBDENUM_INGOT.get(), 0.25f, 100, "molybdenum");
        oreBlasting(recipeOutput, TECHNETIUM, RecipeCategory.MISC, ModItems.TECHNETIUM.get(), 0.25f, 100, "technetium");
        oreBlasting(recipeOutput, RUTHENIUM, RecipeCategory.MISC, ModItems.RUTHENIUM_INGOT.get(), 0.25f, 100, "ruthenium");
        oreBlasting(recipeOutput, RHODIUM, RecipeCategory.MISC, ModItems.RHODIUM_INGOT.get(), 0.25f, 100, "rhodium");
        oreBlasting(recipeOutput, PALLADIUM, RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 0.25f, 100, "palladium");
        oreBlasting(recipeOutput, SILVER, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 100, "silver");
        oreBlasting(recipeOutput, CADMIUM, RecipeCategory.MISC, ModItems.CADMIUM_INGOT.get(), 0.25f, 100, "cadmium");
        oreBlasting(recipeOutput, INDIUM, RecipeCategory.MISC, ModItems.INDIUM.get(), 0.25f, 100, "indium");
        oreBlasting(recipeOutput, TIN, RecipeCategory.MISC, ModItems.TIN.get(), 0.25f, 100, "tin");
        oreBlasting(recipeOutput, ANTIMONY, RecipeCategory.MISC, ModItems.ANTIMONY.get(), 0.25f, 100, "antimony");
        oreBlasting(recipeOutput, TELLURIUM, RecipeCategory.MISC, ModItems.TELLURIUM.get(), 0.25f, 100, "tellurium");
        oreBlasting(recipeOutput, IODINE, RecipeCategory.MISC, ModItems.IODINE.get(), 0.25f, 100, "iodine");
        oreBlasting(recipeOutput, XENON, RecipeCategory.MISC, ModItems.XENON.get(), 0.25f, 100, "xenon");
        oreBlasting(recipeOutput, CAESIUM, RecipeCategory.MISC, ModItems.CAESIUM.get(), 0.25f, 100, "caesium");
        oreBlasting(recipeOutput, BARIUM, RecipeCategory.MISC, ModItems.BARIUM.get(), 0.25f, 100, "barium");
        oreBlasting(recipeOutput, LANTHANUM, RecipeCategory.MISC, ModItems.LANTHANUM.get(), 0.25f, 100, "lanthanum");
        oreBlasting(recipeOutput, CERIUM, RecipeCategory.MISC, ModItems.CERIUM.get(), 0.25f, 100, "cerium");
        oreBlasting(recipeOutput, PRASEODYMIUM, RecipeCategory.MISC, ModItems.PRASEODYMIUM.get(), 0.25f, 100, "praseodymium");
        oreBlasting(recipeOutput, NEODYMIUM, RecipeCategory.MISC, ModItems.NEODYMIUM.get(), 0.25f, 100, "neodymium");
        oreBlasting(recipeOutput, PROMETHIUM, RecipeCategory.MISC, ModItems.PROMETHIUM.get(), 0.25f, 100, "promethium");
        oreBlasting(recipeOutput, SAMARIUM, RecipeCategory.MISC, ModItems.SAMARIUM.get(), 0.25f, 100, "samarium");
        oreBlasting(recipeOutput, EUROPIUM, RecipeCategory.MISC, ModItems.EUROPIUM.get(), 0.25f, 100, "europium");
        oreBlasting(recipeOutput, GADOLINIUM, RecipeCategory.MISC, ModItems.GADOLINIUM.get(), 0.25f, 100, "gadolinium");
        oreBlasting(recipeOutput, TERBIUM, RecipeCategory.MISC, ModItems.TERBIUM.get(), 0.25f, 100, "terbium");
        oreBlasting(recipeOutput, DYSPROSIUM, RecipeCategory.MISC, ModItems.DYSPROSIUM.get(), 0.25f, 100, "dysprosium");
        oreBlasting(recipeOutput, HOLMIUM, RecipeCategory.MISC, ModItems.HOLMIUM.get(), 0.25f, 100, "holmium");
        oreBlasting(recipeOutput, ERBIUM, RecipeCategory.MISC, ModItems.ERBIUM.get(), 0.25f, 100, "erbium");
        oreBlasting(recipeOutput, THULIUM, RecipeCategory.MISC, ModItems.THULIUM.get(), 0.25f, 100, "thulium");
        oreBlasting(recipeOutput, YTTERBIUM, RecipeCategory.MISC, ModItems.YTTERBIUM.get(), 0.25f, 100, "ytterbium");
        oreBlasting(recipeOutput, LUTETIUM, RecipeCategory.MISC, ModItems.LUTETIUM.get(), 0.25f, 100, "lutetium");
        oreBlasting(recipeOutput, HAFNIUM, RecipeCategory.MISC, ModItems.HAFNIUM_INGOT.get(), 0.25f, 100, "hafnium");
        oreBlasting(recipeOutput, TANTALUM, RecipeCategory.MISC, ModItems.TANTALUM_INGOT.get(), 0.25f, 100, "tantalum");
        oreBlasting(recipeOutput, TUNGSTEN, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get(), 0.25f, 100, "tungsten");
        oreBlasting(recipeOutput, RHENIUM, RecipeCategory.MISC, ModItems.RHENIUM_INGOT.get(), 0.25f, 100, "rhenium");
        oreBlasting(recipeOutput, OSMIUM, RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get(), 0.25f, 100, "osmium");
        oreBlasting(recipeOutput, IRIDIUM, RecipeCategory.MISC, ModItems.IRIDIUM_INGOT.get(), 0.25f, 100, "iridium");
        oreBlasting(recipeOutput, PLATINUM, RecipeCategory.MISC, ModItems.PLATINUM.get(), 0.25f, 100, "platinum");
        oreBlasting(recipeOutput, THALLIUM, RecipeCategory.MISC, ModItems.THALLIUM.get(), 0.25f, 100, "thallium");
        oreBlasting(recipeOutput, LEAD, RecipeCategory.MISC, ModItems.LEAD.get(), 0.25f, 100, "lead");
        oreBlasting(recipeOutput, BISMUTH, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f, 100, "bismuth");
        oreBlasting(recipeOutput, POLONIUM, RecipeCategory.MISC, ModItems.POLONIUM.get(), 0.25f, 100, "polonium");
        oreBlasting(recipeOutput, ASTATINE, RecipeCategory.MISC, ModItems.ASTATINE.get(), 0.25f, 100, "astatine");
        oreBlasting(recipeOutput, RADON, RecipeCategory.MISC, ModItems.RADON.get(), 0.25f, 100, "radon");
        oreBlasting(recipeOutput, FRANCIUM, RecipeCategory.MISC, ModItems.FRANCIUM.get(), 0.25f, 100, "francium");
        oreBlasting(recipeOutput, RADIUM, RecipeCategory.MISC, ModItems.RADIUM.get(), 0.25f, 100, "radium");
        oreBlasting(recipeOutput, ACTINIUM, RecipeCategory.MISC, ModItems.ACTINIUM.get(), 0.25f, 100, "actinium");
        oreBlasting(recipeOutput, THORIUM, RecipeCategory.MISC, ModItems.THORIUM.get(), 0.25f, 100, "thorium");
        oreBlasting(recipeOutput, PROTACTINIUM, RecipeCategory.MISC, ModItems.PROTACTINIUM.get(), 0.25f, 100, "protactinium");
        oreBlasting(recipeOutput, URANIUM, RecipeCategory.MISC, ModItems.URANIUM.get(), 0.25f, 100, "uranium");
        oreBlasting(recipeOutput, NEPTUNIUM, RecipeCategory.MISC, ModItems.NEPTUNIUM.get(), 0.25f, 100, "neptunium");
        oreBlasting(recipeOutput, PLUTONIUM, RecipeCategory.MISC, ModItems.PLUTONIUM.get(), 0.25f, 100, "plutonium");
        oreBlasting(recipeOutput, AMERICIUM, RecipeCategory.MISC, ModItems.AMERICIUM.get(), 0.25f, 100, "americium");
        oreBlasting(recipeOutput, CURIUM, RecipeCategory.MISC, ModItems.CURIUM.get(), 0.25f, 100, "curium");
        oreBlasting(recipeOutput, BERKELIUM, RecipeCategory.MISC, ModItems.BERKELIUM.get(), 0.25f, 100, "berkelium");
        oreBlasting(recipeOutput, CALIFORNIUM, RecipeCategory.MISC, ModItems.CALIFORNIUM.get(), 0.25f, 100, "californium");
        oreBlasting(recipeOutput, EINSTEINIUM, RecipeCategory.MISC, ModItems.EINSTEINIUM.get(), 0.25f, 100, "einsteinium");
        oreBlasting(recipeOutput, FERMIUM, RecipeCategory.MISC, ModItems.FERMIUM.get(), 0.25f, 100, "fermium");
        oreBlasting(recipeOutput, MENDELEVIUM, RecipeCategory.MISC, ModItems.MENDELEVIUM.get(), 0.25f, 100, "mendelevium");
        oreBlasting(recipeOutput, NOBELIUM, RecipeCategory.MISC, ModItems.NOBELIUM.get(), 0.25f, 100, "nobelium");
        oreBlasting(recipeOutput, LAWRENCIUM, RecipeCategory.MISC, ModItems.LAWRENCIUM.get(), 0.25f, 100, "lawrencium");
        oreBlasting(recipeOutput, RUTHERFORDIUM, RecipeCategory.MISC, ModItems.RUTHERFORDIUM.get(), 0.25f, 100, "rutherfordium");
        oreBlasting(recipeOutput, DUBNIUM, RecipeCategory.MISC, ModItems.DUBNIUM.get(), 0.25f, 100, "dubnium");
        oreBlasting(recipeOutput, SEABORGIUM, RecipeCategory.MISC, ModItems.SEABORGIUM.get(), 0.25f, 100, "seaborgium");
        oreBlasting(recipeOutput, BOHRIUM, RecipeCategory.MISC, ModItems.BOHRIUM.get(), 0.25f, 100, "bohrium");
        oreBlasting(recipeOutput, HASSIUM, RecipeCategory.MISC, ModItems.HASSIUM.get(), 0.25f, 100, "hassium");
        oreBlasting(recipeOutput, MEITNERIUM, RecipeCategory.MISC, ModItems.MEITNERIUM.get(), 0.25f, 100, "meitnerium");
        oreBlasting(recipeOutput, DARMSTADTIUM, RecipeCategory.MISC, ModItems.DARMSTADTIUM.get(), 0.25f, 100, "darmstadtium");
        oreBlasting(recipeOutput, ROENTGENIUM, RecipeCategory.MISC, ModItems.ROENTGENIUM.get(), 0.25f, 100, "roentgenium");
        oreBlasting(recipeOutput, COPERNICIUM, RecipeCategory.MISC, ModItems.COPERNICIUM.get(), 0.25f, 100, "copernicium");
        oreBlasting(recipeOutput, NIHONIUM, RecipeCategory.MISC, ModItems.NIHONIUM.get(), 0.25f, 100, "nihonium");
        oreBlasting(recipeOutput, FLEROVIUM, RecipeCategory.MISC, ModItems.FLEROVIUM.get(), 0.25f, 100, "flerovium");
        oreBlasting(recipeOutput, MOSCOVIUM, RecipeCategory.MISC, ModItems.MOSCOVIUM.get(), 0.25f, 100, "moscovium");
        oreBlasting(recipeOutput, LIVERMORIUM, RecipeCategory.MISC, ModItems.LIVERMORIUM.get(), 0.25f, 100, "livermorium");
        oreBlasting(recipeOutput, TENNESSINE, RecipeCategory.MISC, ModItems.TENNESSINE.get(), 0.25f, 100, "tennessine");
        oreBlasting(recipeOutput, OGANESSON, RecipeCategory.MISC, ModItems.OGANESSON.get(), 0.25f, 100, "oganesson");
    }
}