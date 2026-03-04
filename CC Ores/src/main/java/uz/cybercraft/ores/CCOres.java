package uz.cybercraft.ores;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CCOres.MODID)
public class CCOres {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "ccores";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // Create a Deferred Register to hold CreativeModeTabs which will all be
    // registered under the "cybercraft" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, MODID);

    // Creates a creative tab with the id "cybercraft:ores_tab" for ores and
    // materials
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ORES_TAB = CREATIVE_MODE_TABS
            .register("ores_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cybercraft.ores"))
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
                    .icon(() -> ModItems.ALUMINUM_INGOT.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        // Ores
                        output.accept(ModBlocks.ALUMINUM_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_ALUMINUM_ORE_ITEM.get());
                        output.accept(ModBlocks.TIN_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_TIN_ORE_ITEM.get());
                        output.accept(ModBlocks.LEAD_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_LEAD_ORE_ITEM.get());
                        output.accept(ModBlocks.SILVER_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_SILVER_ORE_ITEM.get());
                        output.accept(ModBlocks.NICKEL_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_NICKEL_ORE_ITEM.get());
                        output.accept(ModBlocks.ZINC_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_ZINC_ORE_ITEM.get());
                        output.accept(ModBlocks.PLATINUM_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE_ITEM.get());
                        output.accept(ModBlocks.IRIDIUM_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_IRIDIUM_ORE_ITEM.get());
                        output.accept(ModBlocks.URANIUM_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_URANIUM_ORE_ITEM.get());
                        output.accept(ModBlocks.RUBY_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE_ITEM.get());
                        output.accept(ModBlocks.SAPPHIRE_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE_ITEM.get());
                        output.accept(ModBlocks.PERIDOT_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_PERIDOT_ORE_ITEM.get());
                        output.accept(ModBlocks.CINNABAR_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_CINNABAR_ORE_ITEM.get());
                        output.accept(ModBlocks.SALT_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_SALT_ORE_ITEM.get());
                        output.accept(ModBlocks.SULFUR_ORE_ITEM.get());
                        output.accept(ModBlocks.DEEPSLATE_SULFUR_ORE_ITEM.get());

                        // Nether Ores
                        output.accept(ModBlocks.NETHER_ALUMINUM_ORE_ITEM.get());
                        output.accept(ModBlocks.NETHER_LEAD_ORE_ITEM.get());
                        output.accept(ModBlocks.NETHER_SILVER_ORE_ITEM.get());
                        output.accept(ModBlocks.NETHER_NICKEL_ORE_ITEM.get());
                        output.accept(ModBlocks.NETHER_ZINC_ORE_ITEM.get());
                        output.accept(ModBlocks.NETHER_PLATINUM_ORE_ITEM.get());
                        output.accept(ModBlocks.NETHER_URANIUM_ORE_ITEM.get());
                        output.accept(ModBlocks.NETHER_RUBY_ORE_ITEM.get());
                        output.accept(ModBlocks.NETHER_SAPPHIRE_ORE_ITEM.get());
                        output.accept(ModBlocks.NETHER_CINNABAR_ORE_ITEM.get());
                        output.accept(ModBlocks.NETHER_SALT_ORE_ITEM.get());
                        output.accept(ModBlocks.NETHER_SULFUR_ORE_ITEM.get());
                        output.accept(ModBlocks.NETHER_OSMIUM_ORE_ITEM.get());
                        output.accept(ModBlocks.NETHER_FLUORITE_ORE_ITEM.get());

                        // End Ores
                        output.accept(ModBlocks.END_ALUMINUM_ORE_ITEM.get());
                        output.accept(ModBlocks.END_LEAD_ORE_ITEM.get());
                        output.accept(ModBlocks.END_SILVER_ORE_ITEM.get());
                        output.accept(ModBlocks.END_NICKEL_ORE_ITEM.get());
                        output.accept(ModBlocks.END_PLATINUM_ORE_ITEM.get());
                        output.accept(ModBlocks.END_IRIDIUM_ORE_ITEM.get());
                        output.accept(ModBlocks.END_RUBY_ORE_ITEM.get());
                        output.accept(ModBlocks.END_SAPPHIRE_ORE_ITEM.get());
                        output.accept(ModBlocks.END_PERIDOT_ORE_ITEM.get());
                        output.accept(ModBlocks.END_CINNABAR_ORE_ITEM.get());
                        output.accept(ModBlocks.END_SALT_ORE_ITEM.get());
                        output.accept(ModBlocks.END_SULFUR_ORE_ITEM.get());
                        output.accept(ModBlocks.END_OSMIUM_ORE_ITEM.get());
                        output.accept(ModBlocks.END_FLUORITE_ORE_ITEM.get());
                    }).build());

    // Creates a creative tab with the id "cybercraft:materials_tab" for ingots,
    // nuggets, etc.
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MATERIALS_TAB = CREATIVE_MODE_TABS
            .register("materials_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cybercraft.materials"))
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
                    .icon(() -> ModItems.ALUMINUM_INGOT.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        // Raw Materials
                        output.accept(ModItems.RAW_ALUMINUM.get());
                        output.accept(ModItems.RAW_TIN.get());
                        output.accept(ModItems.RAW_LEAD.get());
                        output.accept(ModItems.RAW_SILVER.get());
                        output.accept(ModItems.RAW_NICKEL.get());
                        output.accept(ModItems.RAW_ZINC.get());
                        output.accept(ModItems.RAW_PLATINUM.get());
                        output.accept(ModItems.RAW_IRIDIUM.get());
                        output.accept(ModItems.RAW_URANIUM.get());

                        // Ingots
                        output.accept(ModItems.ALUMINUM_INGOT.get());
                        output.accept(ModItems.TIN_INGOT.get());
                        output.accept(ModItems.LEAD_INGOT.get());
                        output.accept(ModItems.SILVER_INGOT.get());
                        output.accept(ModItems.NICKEL_INGOT.get());
                        output.accept(ModItems.ZINC_INGOT.get());
                        output.accept(ModItems.PLATINUM_INGOT.get());
                        output.accept(ModItems.IRIDIUM_INGOT.get());
                        output.accept(ModItems.URANIUM_INGOT.get());

                        // Nuggets
                        output.accept(ModItems.ALUMINUM_NUGGET.get());
                        output.accept(ModItems.TIN_NUGGET.get());
                        output.accept(ModItems.LEAD_NUGGET.get());
                        output.accept(ModItems.SILVER_NUGGET.get());
                        output.accept(ModItems.NICKEL_NUGGET.get());
                        output.accept(ModItems.ZINC_NUGGET.get());
                        output.accept(ModItems.PLATINUM_NUGGET.get());
                        output.accept(ModItems.IRIDIUM_NUGGET.get());
                        output.accept(ModItems.URANIUM_NUGGET.get());

                        // Gems
                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.PERIDOT.get());
                        output.accept(ModItems.CINNABAR.get());

                        // Special Items
                        output.accept(ModItems.SALT.get());
                        output.accept(ModItems.SULFUR.get());

                        // Alloys
                        output.accept(ModItems.BRASS_INGOT.get());
                        output.accept(ModItems.BRONZE_INGOT.get());
                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.INVAR_INGOT.get());
                        output.accept(ModItems.ELECTRUM_INGOT.get());
                        output.accept(ModItems.CONSTANTAN_INGOT.get());
                        output.accept(ModItems.ENDERIUM_INGOT.get());
                        output.accept(ModItems.LUMIUM_INGOT.get());
                        output.accept(ModItems.SIGNALUM_INGOT.get());
                    }).build());

    // Creates a creative tab with the id "cybercraft:processing_tab" for dusts,
    // plates, etc.
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PROCESSING_TAB = CREATIVE_MODE_TABS
            .register("processing_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cybercraft.processing"))
                    .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
                    .icon(() -> ModItems.ALUMINUM_DUST.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        // Dusts
                        output.accept(ModItems.ALUMINUM_DUST.get());
                        output.accept(ModItems.TIN_DUST.get());
                        output.accept(ModItems.LEAD_DUST.get());
                        output.accept(ModItems.SILVER_DUST.get());
                        output.accept(ModItems.NICKEL_DUST.get());
                        output.accept(ModItems.ZINC_DUST.get());
                        output.accept(ModItems.PLATINUM_DUST.get());
                        output.accept(ModItems.IRIDIUM_DUST.get());
                        output.accept(ModItems.URANIUM_DUST.get());

                        // Dirty Dusts (Mekanism)
                        output.accept(ModItems.DIRTY_ALUMINUM_DUST.get());
                        output.accept(ModItems.DIRTY_TIN_DUST.get());
                        output.accept(ModItems.DIRTY_LEAD_DUST.get());
                        output.accept(ModItems.DIRTY_SILVER_DUST.get());
                        output.accept(ModItems.DIRTY_NICKEL_DUST.get());
                        output.accept(ModItems.DIRTY_ZINC_DUST.get());
                        output.accept(ModItems.DIRTY_PLATINUM_DUST.get());
                        output.accept(ModItems.DIRTY_IRIDIUM_DUST.get());
                        output.accept(ModItems.DIRTY_URANIUM_DUST.get());

                        // Plates
                        output.accept(ModItems.ALUMINUM_PLATE.get());
                        output.accept(ModItems.TIN_PLATE.get());
                        output.accept(ModItems.LEAD_PLATE.get());
                        output.accept(ModItems.SILVER_PLATE.get());
                        output.accept(ModItems.NICKEL_PLATE.get());
                        output.accept(ModItems.ZINC_PLATE.get());
                        output.accept(ModItems.PLATINUM_PLATE.get());
                        output.accept(ModItems.IRIDIUM_PLATE.get());
                        output.accept(ModItems.URANIUM_PLATE.get());

                        // Rods
                        output.accept(ModItems.ALUMINUM_ROD.get());
                        output.accept(ModItems.TIN_ROD.get());
                        output.accept(ModItems.LEAD_ROD.get());
                        output.accept(ModItems.SILVER_ROD.get());
                        output.accept(ModItems.NICKEL_ROD.get());
                        output.accept(ModItems.ZINC_ROD.get());
                        output.accept(ModItems.PLATINUM_ROD.get());
                        output.accept(ModItems.IRIDIUM_ROD.get());
                        output.accept(ModItems.URANIUM_ROD.get());

                        // Gears
                        output.accept(ModItems.ALUMINUM_GEAR.get());
                        output.accept(ModItems.TIN_GEAR.get());
                        output.accept(ModItems.LEAD_GEAR.get());
                        output.accept(ModItems.SILVER_GEAR.get());
                        output.accept(ModItems.NICKEL_GEAR.get());
                        output.accept(ModItems.ZINC_GEAR.get());
                        output.accept(ModItems.PLATINUM_GEAR.get());
                        output.accept(ModItems.IRIDIUM_GEAR.get());
                        output.accept(ModItems.URANIUM_GEAR.get());

                        // Mekanism Clumps
                        output.accept(ModItems.ALUMINUM_CLUMP.get());
                        output.accept(ModItems.TIN_CLUMP.get());
                        output.accept(ModItems.LEAD_CLUMP.get());
                        output.accept(ModItems.SILVER_CLUMP.get());
                        output.accept(ModItems.NICKEL_CLUMP.get());
                        output.accept(ModItems.ZINC_CLUMP.get());
                        output.accept(ModItems.PLATINUM_CLUMP.get());
                        output.accept(ModItems.IRIDIUM_CLUMP.get());
                        output.accept(ModItems.URANIUM_CLUMP.get());

                        // Mekanism Shards
                        output.accept(ModItems.ALUMINUM_SHARD.get());
                        output.accept(ModItems.TIN_SHARD.get());
                        output.accept(ModItems.LEAD_SHARD.get());
                        output.accept(ModItems.SILVER_SHARD.get());
                        output.accept(ModItems.NICKEL_SHARD.get());
                        output.accept(ModItems.ZINC_SHARD.get());
                        output.accept(ModItems.PLATINUM_SHARD.get());
                        output.accept(ModItems.IRIDIUM_SHARD.get());
                        output.accept(ModItems.URANIUM_SHARD.get());

                        // Mekanism Crystals
                        output.accept(ModItems.ALUMINUM_CRYSTAL.get());
                        output.accept(ModItems.TIN_CRYSTAL.get());
                        output.accept(ModItems.LEAD_CRYSTAL.get());
                        output.accept(ModItems.SILVER_CRYSTAL.get());
                        output.accept(ModItems.NICKEL_CRYSTAL.get());
                        output.accept(ModItems.ZINC_CRYSTAL.get());
                        output.accept(ModItems.PLATINUM_CRYSTAL.get());
                        output.accept(ModItems.IRIDIUM_CRYSTAL.get());
                        output.accept(ModItems.URANIUM_CRYSTAL.get());

                        // Tools
                        output.accept(ModItems.ORE_HAMMER.get());
                    }).build());

    // The constructor for the mod class is the first code that is run when your mod
    // is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and
    // pass them in automatically.
    public CCOres(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Registers to the mod event bus
        ModBlocks.BLOCKS.register(modEventBus);
        ModBlocks.ITEMS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (CCOres)
        // to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in
        // this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config
        // file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("CCOres mod initialized successfully!");
    }

    // Add items to existing creative tabs
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            // Add storage blocks to building blocks
            event.accept(ModBlocks.ALUMINUM_BLOCK_ITEM.get());
            event.accept(ModBlocks.TIN_BLOCK_ITEM.get());
            event.accept(ModBlocks.LEAD_BLOCK_ITEM.get());
            event.accept(ModBlocks.SILVER_BLOCK_ITEM.get());
            event.accept(ModBlocks.NICKEL_BLOCK_ITEM.get());
            event.accept(ModBlocks.ZINC_BLOCK_ITEM.get());
            event.accept(ModBlocks.PLATINUM_BLOCK_ITEM.get());
            event.accept(ModBlocks.IRIDIUM_BLOCK_ITEM.get());
            event.accept(ModBlocks.URANIUM_BLOCK_ITEM.get());
            event.accept(ModBlocks.RUBY_BLOCK_ITEM.get());
            event.accept(ModBlocks.SAPPHIRE_BLOCK_ITEM.get());
            event.accept(ModBlocks.PERIDOT_BLOCK_ITEM.get());
            event.accept(ModBlocks.CINNABAR_BLOCK_ITEM.get());
            event.accept(ModBlocks.BRASS_BLOCK_ITEM.get());
            event.accept(ModBlocks.BRONZE_BLOCK_ITEM.get());
            event.accept(ModBlocks.STEEL_BLOCK_ITEM.get());
            event.accept(ModBlocks.INVAR_BLOCK_ITEM.get());
            event.accept(ModBlocks.ELECTRUM_BLOCK_ITEM.get());
            event.accept(ModBlocks.CONSTANTAN_BLOCK_ITEM.get());
            event.accept(ModBlocks.ENDERIUM_BLOCK_ITEM.get());
            event.accept(ModBlocks.LUMIUM_BLOCK_ITEM.get());
            event.accept(ModBlocks.SIGNALUM_BLOCK_ITEM.get());
            event.accept(ModBlocks.OSMIUM_BLOCK_ITEM.get());
            event.accept(ModBlocks.FLUORITE_BLOCK_ITEM.get());
        }

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            // Add ingots and nuggets to ingredients
            event.accept(ModItems.ALUMINUM_INGOT.get());
            event.accept(ModItems.TIN_INGOT.get());
            event.accept(ModItems.LEAD_INGOT.get());
            event.accept(ModItems.SILVER_INGOT.get());
            event.accept(ModItems.NICKEL_INGOT.get());
            event.accept(ModItems.ZINC_INGOT.get());
            event.accept(ModItems.PLATINUM_INGOT.get());
            event.accept(ModItems.IRIDIUM_INGOT.get());
            event.accept(ModItems.URANIUM_INGOT.get());
            event.accept(ModItems.RUBY.get());
            event.accept(ModItems.SAPPHIRE.get());
            event.accept(ModItems.PERIDOT.get());
            event.accept(ModItems.CINNABAR.get());
            event.accept(ModItems.SALT.get());
            event.accept(ModItems.SULFUR.get());
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("CCOres server starting...");
    }
}
