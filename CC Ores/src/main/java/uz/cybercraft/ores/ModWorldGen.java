package uz.cybercraft.ores;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;

public class ModWorldGen {
    // Rule tests for ore replacement
    public static final RuleTest STONE_ORE_REPLACEABLES = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
    public static final RuleTest DEEPSLATE_ORE_REPLACEABLES = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
    public static final RuleTest NETHER_ORE_REPLACEABLES = new TagMatchTest(BlockTags.NETHER_CARVER_REPLACEABLES);
    public static final RuleTest END_ORE_REPLACEABLES = new TagMatchTest(net.minecraft.tags.BlockTags.create(net.minecraft.resources.ResourceLocation.fromNamespaceAndPath("minecraft", "end_stones")));

    // Configured Features
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALUMINUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "aluminum_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_ALUMINUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_aluminum_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "tin_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_TIN_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_tin_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "lead_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_LEAD_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_lead_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "silver_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_SILVER_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_silver_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NICKEL_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nickel_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_NICKEL_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_nickel_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZINC_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "zinc_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_ZINC_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_zinc_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> PLATINUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "platinum_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_PLATINUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_platinum_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRIDIUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "iridium_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_IRIDIUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_iridium_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> URANIUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "uranium_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_URANIUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_uranium_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "ruby_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_RUBY_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_ruby_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "sapphire_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_SAPPHIRE_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_sapphire_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> PERIDOT_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "peridot_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_PERIDOT_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_peridot_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> CINNABAR_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "cinnabar_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_CINNABAR_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_cinnabar_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SALT_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "salt_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_SALT_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_salt_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SULFUR_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "sulfur_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_SULFUR_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_sulfur_ore"));

    // Nether Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ALUMINUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_aluminum_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LEAD_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_lead_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_silver_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_NICKEL_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_nickel_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ZINC_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_zinc_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PLATINUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_platinum_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_URANIUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_uranium_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_ruby_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_sapphire_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_CINNABAR_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_cinnabar_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SALT_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_salt_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SULFUR_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_sulfur_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_OSMIUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_osmium_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_FLUORITE_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_fluorite_ore"));

    // End Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ALUMINUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_aluminum_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_LEAD_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_lead_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SILVER_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_silver_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_NICKEL_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_nickel_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_PLATINUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_platinum_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_IRIDIUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_iridium_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RUBY_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_ruby_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SAPPHIRE_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_sapphire_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_PERIDOT_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_peridot_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_CINNABAR_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_cinnabar_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SALT_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_salt_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SULFUR_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_sulfur_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_OSMIUM_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_osmium_ore"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_FLUORITE_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_fluorite_ore"));

    // Placed Features
    public static final ResourceKey<PlacedFeature> ALUMINUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "aluminum_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_ALUMINUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_aluminum_ore_placed"));
    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "tin_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_TIN_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_tin_ore_placed"));
    public static final ResourceKey<PlacedFeature> LEAD_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "lead_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_LEAD_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_lead_ore_placed"));
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "silver_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_SILVER_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_silver_ore_placed"));
    public static final ResourceKey<PlacedFeature> NICKEL_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nickel_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_NICKEL_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_nickel_ore_placed"));
    public static final ResourceKey<PlacedFeature> ZINC_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "zinc_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_ZINC_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_zinc_ore_placed"));
    public static final ResourceKey<PlacedFeature> PLATINUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "platinum_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_PLATINUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_platinum_ore_placed"));
    public static final ResourceKey<PlacedFeature> IRIDIUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "iridium_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_IRIDIUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_iridium_ore_placed"));
    public static final ResourceKey<PlacedFeature> URANIUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "uranium_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_URANIUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_uranium_ore_placed"));
    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "ruby_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_RUBY_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_ruby_ore_placed"));
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "sapphire_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_SAPPHIRE_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_sapphire_ore_placed"));
    public static final ResourceKey<PlacedFeature> PERIDOT_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "peridot_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_PERIDOT_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_peridot_ore_placed"));
    public static final ResourceKey<PlacedFeature> CINNABAR_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "cinnabar_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_CINNABAR_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_cinnabar_ore_placed"));
    public static final ResourceKey<PlacedFeature> SALT_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "salt_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_SALT_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_salt_ore_placed"));
    public static final ResourceKey<PlacedFeature> SULFUR_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "sulfur_ore_placed"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_SULFUR_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "deepslate_sulfur_ore_placed"));

    // Nether Placed Features
    public static final ResourceKey<PlacedFeature> NETHER_ALUMINUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_aluminum_ore_placed"));
    public static final ResourceKey<PlacedFeature> NETHER_LEAD_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_lead_ore_placed"));
    public static final ResourceKey<PlacedFeature> NETHER_SILVER_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_silver_ore_placed"));
    public static final ResourceKey<PlacedFeature> NETHER_NICKEL_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_nickel_ore_placed"));
    public static final ResourceKey<PlacedFeature> NETHER_ZINC_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_zinc_ore_placed"));
    public static final ResourceKey<PlacedFeature> NETHER_PLATINUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_platinum_ore_placed"));
    public static final ResourceKey<PlacedFeature> NETHER_URANIUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_uranium_ore_placed"));
    public static final ResourceKey<PlacedFeature> NETHER_RUBY_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_ruby_ore_placed"));
    public static final ResourceKey<PlacedFeature> NETHER_SAPPHIRE_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_sapphire_ore_placed"));
    public static final ResourceKey<PlacedFeature> NETHER_CINNABAR_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_cinnabar_ore_placed"));
    public static final ResourceKey<PlacedFeature> NETHER_SALT_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_salt_ore_placed"));
    public static final ResourceKey<PlacedFeature> NETHER_SULFUR_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_sulfur_ore_placed"));
    public static final ResourceKey<PlacedFeature> NETHER_OSMIUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_osmium_ore_placed"));
    public static final ResourceKey<PlacedFeature> NETHER_FLUORITE_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "nether_fluorite_ore_placed"));

    // End Placed Features
    public static final ResourceKey<PlacedFeature> END_ALUMINUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_aluminum_ore_placed"));
    public static final ResourceKey<PlacedFeature> END_LEAD_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_lead_ore_placed"));
    public static final ResourceKey<PlacedFeature> END_SILVER_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_silver_ore_placed"));
    public static final ResourceKey<PlacedFeature> END_NICKEL_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_nickel_ore_placed"));
    public static final ResourceKey<PlacedFeature> END_PLATINUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_platinum_ore_placed"));
    public static final ResourceKey<PlacedFeature> END_IRIDIUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_iridium_ore_placed"));
    public static final ResourceKey<PlacedFeature> END_RUBY_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_ruby_ore_placed"));
    public static final ResourceKey<PlacedFeature> END_SAPPHIRE_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_sapphire_ore_placed"));
    public static final ResourceKey<PlacedFeature> END_PERIDOT_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_peridot_ore_placed"));
    public static final ResourceKey<PlacedFeature> END_CINNABAR_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_cinnabar_ore_placed"));
    public static final ResourceKey<PlacedFeature> END_SALT_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_salt_ore_placed"));
    public static final ResourceKey<PlacedFeature> END_SULFUR_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_sulfur_ore_placed"));
    public static final ResourceKey<PlacedFeature> END_OSMIUM_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_osmium_ore_placed"));
    public static final ResourceKey<PlacedFeature> END_FLUORITE_ORE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CCOres.MODID, "end_fluorite_ore_placed"));

    public static void bootstrapConfiguredFeatures(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        // Overworld Ores
        context.register(ALUMINUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.ALUMINUM_ORE.get().defaultBlockState(), 9)));
        context.register(DEEPSLATE_ALUMINUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_ALUMINUM_ORE.get().defaultBlockState(), 9)));
        context.register(TIN_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.TIN_ORE.get().defaultBlockState(), 10)));
        context.register(DEEPSLATE_TIN_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState(), 10)));
        context.register(LEAD_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.LEAD_ORE.get().defaultBlockState(), 8)));
        context.register(DEEPSLATE_LEAD_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState(), 8)));
        context.register(SILVER_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.SILVER_ORE.get().defaultBlockState(), 7)));
        context.register(DEEPSLATE_SILVER_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState(), 7)));
        context.register(NICKEL_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.NICKEL_ORE.get().defaultBlockState(), 7)));
        context.register(DEEPSLATE_NICKEL_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_NICKEL_ORE.get().defaultBlockState(), 7)));
        context.register(ZINC_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.ZINC_ORE.get().defaultBlockState(), 8)));
        context.register(DEEPSLATE_ZINC_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_ZINC_ORE.get().defaultBlockState(), 8)));
        context.register(PLATINUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.PLATINUM_ORE.get().defaultBlockState(), 5)));
        context.register(DEEPSLATE_PLATINUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState(), 5)));
        context.register(IRIDIUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.IRIDIUM_ORE.get().defaultBlockState(), 4)));
        context.register(DEEPSLATE_IRIDIUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_IRIDIUM_ORE.get().defaultBlockState(), 4)));
        context.register(URANIUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.URANIUM_ORE.get().defaultBlockState(), 5)));
        context.register(DEEPSLATE_URANIUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState(), 5)));
        context.register(RUBY_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.RUBY_ORE.get().defaultBlockState(), 5)));
        context.register(DEEPSLATE_RUBY_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState(), 5)));
        context.register(SAPPHIRE_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.SAPPHIRE_ORE.get().defaultBlockState(), 5)));
        context.register(DEEPSLATE_SAPPHIRE_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState(), 5)));
        context.register(PERIDOT_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.PERIDOT_ORE.get().defaultBlockState(), 6)));
        context.register(DEEPSLATE_PERIDOT_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_PERIDOT_ORE.get().defaultBlockState(), 6)));
        context.register(CINNABAR_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.CINNABAR_ORE.get().defaultBlockState(), 6)));
        context.register(DEEPSLATE_CINNABAR_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_CINNABAR_ORE.get().defaultBlockState(), 6)));
        context.register(SALT_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.SALT_ORE.get().defaultBlockState(), 12)));
        context.register(DEEPSLATE_SALT_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_SALT_ORE.get().defaultBlockState(), 12)));
        context.register(SULFUR_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_ORE_REPLACEABLES,
                ModBlocks.SULFUR_ORE.get().defaultBlockState(), 8)));
        context.register(DEEPSLATE_SULFUR_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_ORE_REPLACEABLES,
                ModBlocks.DEEPSLATE_SULFUR_ORE.get().defaultBlockState(), 8)));

        // Nether Ores
        context.register(NETHER_ALUMINUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_ALUMINUM_ORE.get().defaultBlockState(), 8)));
        context.register(NETHER_LEAD_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_LEAD_ORE.get().defaultBlockState(), 7)));
        context.register(NETHER_SILVER_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_SILVER_ORE.get().defaultBlockState(), 6)));
        context.register(NETHER_NICKEL_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_NICKEL_ORE.get().defaultBlockState(), 7)));
        context.register(NETHER_ZINC_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_ZINC_ORE.get().defaultBlockState(), 8)));
        context.register(NETHER_PLATINUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_PLATINUM_ORE.get().defaultBlockState(), 4)));
        context.register(NETHER_URANIUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_URANIUM_ORE.get().defaultBlockState(), 3)));
        context.register(NETHER_RUBY_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_RUBY_ORE.get().defaultBlockState(), 5)));
        context.register(NETHER_SAPPHIRE_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_SAPPHIRE_ORE.get().defaultBlockState(), 5)));
        context.register(NETHER_CINNABAR_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_CINNABAR_ORE.get().defaultBlockState(), 6)));
        context.register(NETHER_SALT_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_SALT_ORE.get().defaultBlockState(), 10)));
        context.register(NETHER_SULFUR_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_SULFUR_ORE.get().defaultBlockState(), 12)));
        context.register(NETHER_OSMIUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_OSMIUM_ORE.get().defaultBlockState(), 9)));
        context.register(NETHER_FLUORITE_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_ORE_REPLACEABLES,
                ModBlocks.NETHER_FLUORITE_ORE.get().defaultBlockState(), 10)));

        // End Ores
        context.register(END_ALUMINUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_ALUMINUM_ORE.get().defaultBlockState(), 8)));
        context.register(END_LEAD_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_LEAD_ORE.get().defaultBlockState(), 7)));
        context.register(END_SILVER_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_SILVER_ORE.get().defaultBlockState(), 6)));
        context.register(END_NICKEL_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_NICKEL_ORE.get().defaultBlockState(), 7)));
        context.register(END_PLATINUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_PLATINUM_ORE.get().defaultBlockState(), 5)));
        context.register(END_IRIDIUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_IRIDIUM_ORE.get().defaultBlockState(), 4)));
        context.register(END_RUBY_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_RUBY_ORE.get().defaultBlockState(), 5)));
        context.register(END_SAPPHIRE_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_SAPPHIRE_ORE.get().defaultBlockState(), 5)));
        context.register(END_PERIDOT_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_PERIDOT_ORE.get().defaultBlockState(), 6)));
        context.register(END_CINNABAR_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_CINNABAR_ORE.get().defaultBlockState(), 6)));
        context.register(END_SALT_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_SALT_ORE.get().defaultBlockState(), 10)));
        context.register(END_SULFUR_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_SULFUR_ORE.get().defaultBlockState(), 8)));
        context.register(END_OSMIUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_OSMIUM_ORE.get().defaultBlockState(), 8)));
        context.register(END_FLUORITE_ORE, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_ORE_REPLACEABLES,
                ModBlocks.END_FLUORITE_ORE.get().defaultBlockState(), 9)));
    }

    public static void bootstrapPlacedFeatures(BootstrapContext<PlacedFeature> context) {
        // Overworld Ores
        context.register(ALUMINUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ALUMINUM_ORE),
                List.of(CountPlacement.of(10), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-16)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_ALUMINUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_ALUMINUM_ORE),
                List.of(CountPlacement.of(8), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-16)),
                        BiomeFilter.biome())));
        context.register(TIN_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(TIN_ORE),
                List.of(CountPlacement.of(12), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(48)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_TIN_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_TIN_ORE),
                List.of(CountPlacement.of(10), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(48)),
                        BiomeFilter.biome())));
        context.register(LEAD_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(LEAD_ORE),
                List.of(CountPlacement.of(8), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-24)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_LEAD_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_LEAD_ORE),
                List.of(CountPlacement.of(6), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-24)),
                        BiomeFilter.biome())));
        context.register(SILVER_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(SILVER_ORE),
                List.of(CountPlacement.of(9), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-32)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_SILVER_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_SILVER_ORE),
                List.of(CountPlacement.of(7), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-32)),
                        BiomeFilter.biome())));
        context.register(NICKEL_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NICKEL_ORE),
                List.of(CountPlacement.of(8), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_NICKEL_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_NICKEL_ORE),
                List.of(CountPlacement.of(6), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)),
                        BiomeFilter.biome())));
        context.register(ZINC_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ZINC_ORE),
                List.of(CountPlacement.of(10), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-8), VerticalAnchor.absolute(56)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_ZINC_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_ZINC_ORE),
                List.of(CountPlacement.of(8), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-8), VerticalAnchor.absolute(56)),
                        BiomeFilter.biome())));
        context.register(PLATINUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(PLATINUM_ORE),
                List.of(CountPlacement.of(5), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-48)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_PLATINUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_PLATINUM_ORE),
                List.of(CountPlacement.of(3), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-48)),
                        BiomeFilter.biome())));
        context.register(IRIDIUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(IRIDIUM_ORE),
                List.of(CountPlacement.of(2), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-56)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_IRIDIUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_IRIDIUM_ORE),
                List.of(CountPlacement.of(1), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-56)),
                        BiomeFilter.biome())));
        context.register(URANIUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(URANIUM_ORE),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-40)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_URANIUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_URANIUM_ORE),
                List.of(CountPlacement.of(2), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-40)),
                        BiomeFilter.biome())));
        context.register(RUBY_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(RUBY_ORE),
                List.of(CountPlacement.of(6), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(48), VerticalAnchor.absolute(96)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_RUBY_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_RUBY_ORE),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(48), VerticalAnchor.absolute(96)),
                        BiomeFilter.biome())));
        context.register(SAPPHIRE_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(SAPPHIRE_ORE),
                List.of(CountPlacement.of(6), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(48), VerticalAnchor.absolute(96)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_SAPPHIRE_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_SAPPHIRE_ORE),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(48), VerticalAnchor.absolute(96)),
                        BiomeFilter.biome())));
        context.register(PERIDOT_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(PERIDOT_ORE),
                List.of(CountPlacement.of(7), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(80)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_PERIDOT_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_PERIDOT_ORE),
                List.of(CountPlacement.of(5), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(80)),
                        BiomeFilter.biome())));
        context.register(CINNABAR_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(CINNABAR_ORE),
                List.of(CountPlacement.of(7), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_CINNABAR_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_CINNABAR_ORE),
                List.of(CountPlacement.of(5), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)),
                        BiomeFilter.biome())));
        context.register(SALT_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(SALT_ORE),
                List.of(CountPlacement.of(8), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(128)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_SALT_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_SALT_ORE),
                List.of(CountPlacement.of(6), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(128)),
                        BiomeFilter.biome())));
        context.register(SULFUR_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(SULFUR_ORE),
                List.of(CountPlacement.of(7), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)),
                        BiomeFilter.biome())));
        context.register(DEEPSLATE_SULFUR_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(DEEPSLATE_SULFUR_ORE),
                List.of(CountPlacement.of(5), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)),
                        BiomeFilter.biome())));

        // Nether Ores
        context.register(NETHER_ALUMINUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_ALUMINUM_ORE),
                List.of(CountPlacement.of(8), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(8), VerticalAnchor.absolute(64)),
                        BiomeFilter.biome())));
        context.register(NETHER_LEAD_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_LEAD_ORE),
                List.of(CountPlacement.of(7), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(8), VerticalAnchor.absolute(48)),
                        BiomeFilter.biome())));
        context.register(NETHER_SILVER_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_SILVER_ORE),
                List.of(CountPlacement.of(6), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(8), VerticalAnchor.absolute(48)),
                        BiomeFilter.biome())));
        context.register(NETHER_NICKEL_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_NICKEL_ORE),
                List.of(CountPlacement.of(7), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(16), VerticalAnchor.absolute(80)),
                        BiomeFilter.biome())));
        context.register(NETHER_ZINC_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_ZINC_ORE),
                List.of(CountPlacement.of(8), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(16), VerticalAnchor.absolute(80)),
                        BiomeFilter.biome())));
        context.register(NETHER_PLATINUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_PLATINUM_ORE),
                List.of(CountPlacement.of(4), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(96)),
                        BiomeFilter.biome())));
        context.register(NETHER_URANIUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_URANIUM_ORE),
                List.of(CountPlacement.of(3), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(8), VerticalAnchor.absolute(64)),
                        BiomeFilter.biome())));
        context.register(NETHER_RUBY_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_RUBY_ORE),
                List.of(CountPlacement.of(5), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(120)),
                        BiomeFilter.biome())));
        context.register(NETHER_SAPPHIRE_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_SAPPHIRE_ORE),
                List.of(CountPlacement.of(5), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(80), VerticalAnchor.absolute(120)),
                        BiomeFilter.biome())));
        context.register(NETHER_CINNABAR_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_CINNABAR_ORE),
                List.of(CountPlacement.of(6), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(16), VerticalAnchor.absolute(80)),
                        BiomeFilter.biome())));
        context.register(NETHER_SALT_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_SALT_ORE),
                List.of(CountPlacement.of(10), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(16), VerticalAnchor.absolute(96)),
                        BiomeFilter.biome())));
        context.register(NETHER_SULFUR_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_SULFUR_ORE),
                List.of(CountPlacement.of(12), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(16), VerticalAnchor.absolute(96)),
                        BiomeFilter.biome())));
        context.register(NETHER_OSMIUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_OSMIUM_ORE),
                List.of(CountPlacement.of(9), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(8), VerticalAnchor.absolute(80)),
                        BiomeFilter.biome())));
        context.register(NETHER_FLUORITE_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(NETHER_FLUORITE_ORE),
                List.of(CountPlacement.of(10), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(16), VerticalAnchor.absolute(96)),
                        BiomeFilter.biome())));

        // End Ores
        context.register(END_ALUMINUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_ALUMINUM_ORE),
                List.of(CountPlacement.of(8), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(128)),
                        BiomeFilter.biome())));
        context.register(END_LEAD_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_LEAD_ORE),
                List.of(CountPlacement.of(7), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)),
                        BiomeFilter.biome())));
        context.register(END_SILVER_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_SILVER_ORE),
                List.of(CountPlacement.of(6), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(16), VerticalAnchor.absolute(96)),
                        BiomeFilter.biome())));
        context.register(END_NICKEL_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_NICKEL_ORE),
                List.of(CountPlacement.of(7), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(128)),
                        BiomeFilter.biome())));
        context.register(END_PLATINUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_PLATINUM_ORE),
                List.of(CountPlacement.of(7), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(16), VerticalAnchor.absolute(96)),
                        BiomeFilter.biome())));
        context.register(END_IRIDIUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_IRIDIUM_ORE),
                List.of(CountPlacement.of(6), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)),
                        BiomeFilter.biome())));
        context.register(END_RUBY_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_RUBY_ORE),
                List.of(CountPlacement.of(5), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(255)),
                        BiomeFilter.biome())));
        context.register(END_SAPPHIRE_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_SAPPHIRE_ORE),
                List.of(CountPlacement.of(5), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(255)),
                        BiomeFilter.biome())));
        context.register(END_PERIDOT_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_PERIDOT_ORE),
                List.of(CountPlacement.of(6), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(80), VerticalAnchor.absolute(255)),
                        BiomeFilter.biome())));
        context.register(END_CINNABAR_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_CINNABAR_ORE),
                List.of(CountPlacement.of(6), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(180)),
                        BiomeFilter.biome())));
        context.register(END_SALT_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_SALT_ORE),
                List.of(CountPlacement.of(8), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(180)),
                        BiomeFilter.biome())));
        context.register(END_SULFUR_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_SULFUR_ORE),
                List.of(CountPlacement.of(7), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(180)),
                        BiomeFilter.biome())));
        context.register(END_OSMIUM_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_OSMIUM_ORE),
                List.of(CountPlacement.of(8), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(16), VerticalAnchor.absolute(128)),
                        BiomeFilter.biome())));
        context.register(END_FLUORITE_ORE_PLACED, new PlacedFeature(context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(END_FLUORITE_ORE),
                List.of(CountPlacement.of(9), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(180)),
                        BiomeFilter.biome())));
    }
}
