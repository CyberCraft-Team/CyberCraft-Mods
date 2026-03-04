package uz.cybercraft.ores;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {
    // Overworld Biome Modifiers
    public static final ResourceKey<BiomeModifier> ADD_ALUMINUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_aluminum_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_ALUMINUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_aluminum_ore"));
    public static final ResourceKey<BiomeModifier> ADD_TIN_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_tin_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_TIN_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_tin_ore"));
    public static final ResourceKey<BiomeModifier> ADD_LEAD_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_lead_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_LEAD_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_lead_ore"));
    public static final ResourceKey<BiomeModifier> ADD_SILVER_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_silver_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_SILVER_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_silver_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NICKEL_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nickel_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_NICKEL_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_nickel_ore"));
    public static final ResourceKey<BiomeModifier> ADD_ZINC_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_zinc_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_ZINC_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_zinc_ore"));
    public static final ResourceKey<BiomeModifier> ADD_PLATINUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_platinum_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_PLATINUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_platinum_ore"));
    public static final ResourceKey<BiomeModifier> ADD_IRIDIUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_iridium_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_IRIDIUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_iridium_ore"));
    public static final ResourceKey<BiomeModifier> ADD_URANIUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_uranium_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_URANIUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_uranium_ore"));
    public static final ResourceKey<BiomeModifier> ADD_RUBY_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_ruby_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_RUBY_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_ruby_ore"));
    public static final ResourceKey<BiomeModifier> ADD_SAPPHIRE_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_sapphire_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_SAPPHIRE_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_sapphire_ore"));
    public static final ResourceKey<BiomeModifier> ADD_PERIDOT_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_peridot_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_PERIDOT_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_peridot_ore"));
    public static final ResourceKey<BiomeModifier> ADD_CINNABAR_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_cinnabar_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_CINNABAR_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_cinnabar_ore"));
    public static final ResourceKey<BiomeModifier> ADD_SALT_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_salt_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_SALT_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_salt_ore"));
    public static final ResourceKey<BiomeModifier> ADD_SULFUR_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_sulfur_ore"));
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_SULFUR_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_deepslate_sulfur_ore"));

    // Nether Biome Modifiers
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ALUMINUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_aluminum_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NETHER_LEAD_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_lead_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SILVER_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_silver_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NETHER_NICKEL_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_nickel_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ZINC_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_zinc_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NETHER_PLATINUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_platinum_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NETHER_URANIUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_uranium_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NETHER_RUBY_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_ruby_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SAPPHIRE_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_sapphire_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NETHER_CINNABAR_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_cinnabar_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SALT_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_salt_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SULFUR_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_sulfur_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NETHER_OSMIUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_osmium_ore"));
    public static final ResourceKey<BiomeModifier> ADD_NETHER_FLUORITE_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_nether_fluorite_ore"));

    // End Biome Modifiers
    public static final ResourceKey<BiomeModifier> ADD_END_ALUMINUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_aluminum_ore"));
    public static final ResourceKey<BiomeModifier> ADD_END_LEAD_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_lead_ore"));
    public static final ResourceKey<BiomeModifier> ADD_END_SILVER_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_silver_ore"));
    public static final ResourceKey<BiomeModifier> ADD_END_NICKEL_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_nickel_ore"));
    public static final ResourceKey<BiomeModifier> ADD_END_PLATINUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_platinum_ore"));
    public static final ResourceKey<BiomeModifier> ADD_END_IRIDIUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_iridium_ore"));
    public static final ResourceKey<BiomeModifier> ADD_END_RUBY_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_ruby_ore"));
    public static final ResourceKey<BiomeModifier> ADD_END_SAPPHIRE_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_sapphire_ore"));
    public static final ResourceKey<BiomeModifier> ADD_END_PERIDOT_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_peridot_ore"));
    public static final ResourceKey<BiomeModifier> ADD_END_CINNABAR_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_cinnabar_ore"));
    public static final ResourceKey<BiomeModifier> ADD_END_SALT_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_salt_ore"));
    public static final ResourceKey<BiomeModifier> ADD_END_SULFUR_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_sulfur_ore"));
    public static final ResourceKey<BiomeModifier> ADD_END_OSMIUM_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_osmium_ore"));
    public static final ResourceKey<BiomeModifier> ADD_END_FLUORITE_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "add_end_fluorite_ore"));

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        // Overworld Biome Modifiers
        context.register(ADD_ALUMINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.ALUMINUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_ALUMINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_ALUMINUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_TIN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.TIN_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_TIN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_TIN_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_LEAD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.LEAD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_LEAD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_LEAD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILVER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.SILVER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_SILVER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_SILVER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NICKEL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NICKEL_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_NICKEL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_NICKEL_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ZINC_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.ZINC_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_ZINC_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_ZINC_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_PLATINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.PLATINUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_PLATINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_PLATINUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_IRIDIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.IRIDIUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_IRIDIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_IRIDIUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_URANIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.URANIUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_URANIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_URANIUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.RUBY_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_RUBY_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.SAPPHIRE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_SAPPHIRE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_PERIDOT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.PERIDOT_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_PERIDOT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_PERIDOT_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CINNABAR_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.CINNABAR_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_CINNABAR_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_CINNABAR_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SALT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.SALT_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_SALT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_SALT_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SULFUR_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.SULFUR_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEPSLATE_SULFUR_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.DEEPSLATE_SULFUR_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        // Nether Biome Modifiers
        context.register(ADD_NETHER_ALUMINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_ALUMINUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NETHER_LEAD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_LEAD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NETHER_SILVER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_SILVER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NETHER_NICKEL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_NICKEL_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NETHER_ZINC_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_ZINC_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NETHER_PLATINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_PLATINUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NETHER_URANIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_URANIUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NETHER_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_RUBY_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NETHER_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_SAPPHIRE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NETHER_CINNABAR_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_CINNABAR_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NETHER_SALT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_SALT_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NETHER_SULFUR_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_SULFUR_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NETHER_OSMIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_OSMIUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NETHER_FLUORITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.NETHER_FLUORITE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        // End Biome Modifiers
        context.register(ADD_END_ALUMINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_ALUMINUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_LEAD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_LEAD_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_SILVER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_SILVER_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_NICKEL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_NICKEL_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_PLATINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_PLATINUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_IRIDIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_IRIDIUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_RUBY_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_SAPPHIRE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_PERIDOT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_PERIDOT_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_CINNABAR_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_CINNABAR_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_SALT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_SALT_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_SULFUR_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_SULFUR_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_OSMIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_OSMIUM_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_FLUORITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModWorldGen.END_FLUORITE_ORE_PLACED)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));
    }
}
