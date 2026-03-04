package uz.cybercraft.ores;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CCOres.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CCOres.MODID);

    // Overworld Ores (Stone variants)
    public static final DeferredBlock<Block> ALUMINUM_ORE = BLOCKS.register("aluminum_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final DeferredItem<BlockItem> ALUMINUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("aluminum_ore", ALUMINUM_ORE);

    public static final DeferredBlock<Block> TIN_ORE = BLOCKS.register("tin_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final DeferredItem<BlockItem> TIN_ORE_ITEM = ITEMS.registerSimpleBlockItem("tin_ore", TIN_ORE);

    public static final DeferredBlock<Block> LEAD_ORE = BLOCKS.register("lead_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final DeferredItem<BlockItem> LEAD_ORE_ITEM = ITEMS.registerSimpleBlockItem("lead_ore", LEAD_ORE);

    public static final DeferredBlock<Block> SILVER_ORE = BLOCKS.register("silver_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final DeferredItem<BlockItem> SILVER_ORE_ITEM = ITEMS.registerSimpleBlockItem("silver_ore", SILVER_ORE);

    public static final DeferredBlock<Block> NICKEL_ORE = BLOCKS.register("nickel_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final DeferredItem<BlockItem> NICKEL_ORE_ITEM = ITEMS.registerSimpleBlockItem("nickel_ore", NICKEL_ORE);

    public static final DeferredBlock<Block> ZINC_ORE = BLOCKS.register("zinc_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final DeferredItem<BlockItem> ZINC_ORE_ITEM = ITEMS.registerSimpleBlockItem("zinc_ore", ZINC_ORE);

    public static final DeferredBlock<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE)));
    public static final DeferredItem<BlockItem> PLATINUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("platinum_ore", PLATINUM_ORE);

    public static final DeferredBlock<Block> IRIDIUM_ORE = BLOCKS.register("iridium_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE)));
    public static final DeferredItem<BlockItem> IRIDIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("iridium_ore", IRIDIUM_ORE);

    public static final DeferredBlock<Block> URANIUM_ORE = BLOCKS.register("uranium_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE)));
    public static final DeferredItem<BlockItem> URANIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("uranium_ore", URANIUM_ORE);

    public static final DeferredBlock<Block> RUBY_ORE = BLOCKS.register("ruby_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE)));
    public static final DeferredItem<BlockItem> RUBY_ORE_ITEM = ITEMS.registerSimpleBlockItem("ruby_ore", RUBY_ORE);

    public static final DeferredBlock<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE)));
    public static final DeferredItem<BlockItem> SAPPHIRE_ORE_ITEM = ITEMS.registerSimpleBlockItem("sapphire_ore", SAPPHIRE_ORE);

    public static final DeferredBlock<Block> PERIDOT_ORE = BLOCKS.register("peridot_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE)));
    public static final DeferredItem<BlockItem> PERIDOT_ORE_ITEM = ITEMS.registerSimpleBlockItem("peridot_ore", PERIDOT_ORE);

    public static final DeferredBlock<Block> CINNABAR_ORE = BLOCKS.register("cinnabar_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final DeferredItem<BlockItem> CINNABAR_ORE_ITEM = ITEMS.registerSimpleBlockItem("cinnabar_ore", CINNABAR_ORE);

    public static final DeferredBlock<Block> SALT_ORE = BLOCKS.register("salt_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE)));
    public static final DeferredItem<BlockItem> SALT_ORE_ITEM = ITEMS.registerSimpleBlockItem("salt_ore", SALT_ORE);

    public static final DeferredBlock<Block> SULFUR_ORE = BLOCKS.register("sulfur_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE)));
    public static final DeferredItem<BlockItem> SULFUR_ORE_ITEM = ITEMS.registerSimpleBlockItem("sulfur_ore", SULFUR_ORE);

    // Deepslate Ores
    public static final DeferredBlock<Block> DEEPSLATE_ALUMINUM_ORE = BLOCKS.register("deepslate_aluminum_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_ALUMINUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_aluminum_ore", DEEPSLATE_ALUMINUM_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_TIN_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_tin_ore", DEEPSLATE_TIN_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE = BLOCKS.register("deepslate_lead_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_LEAD_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_lead_ore", DEEPSLATE_LEAD_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE = BLOCKS.register("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_SILVER_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_silver_ore", DEEPSLATE_SILVER_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_NICKEL_ORE = BLOCKS.register("deepslate_nickel_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_NICKEL_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_nickel_ore", DEEPSLATE_NICKEL_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_ZINC_ORE = BLOCKS.register("deepslate_zinc_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_ZINC_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_zinc_ore", DEEPSLATE_ZINC_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_PLATINUM_ORE = BLOCKS.register("deepslate_platinum_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_PLATINUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_platinum_ore", DEEPSLATE_PLATINUM_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_IRIDIUM_ORE = BLOCKS.register("deepslate_iridium_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_IRIDIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_iridium_ore", DEEPSLATE_IRIDIUM_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_URANIUM_ORE = BLOCKS.register("deepslate_uranium_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_URANIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_uranium_ore", DEEPSLATE_URANIUM_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = BLOCKS.register("deepslate_ruby_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_RUBY_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_ruby_ore", DEEPSLATE_RUBY_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_SAPPHIRE_ORE = BLOCKS.register("deepslate_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_SAPPHIRE_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_sapphire_ore", DEEPSLATE_SAPPHIRE_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_PERIDOT_ORE = BLOCKS.register("deepslate_peridot_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_PERIDOT_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_peridot_ore", DEEPSLATE_PERIDOT_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_CINNABAR_ORE = BLOCKS.register("deepslate_cinnabar_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_CINNABAR_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_cinnabar_ore", DEEPSLATE_CINNABAR_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_SALT_ORE = BLOCKS.register("deepslate_salt_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_SALT_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_salt_ore", DEEPSLATE_SALT_ORE);

    public static final DeferredBlock<Block> DEEPSLATE_SULFUR_ORE = BLOCKS.register("deepslate_sulfur_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COAL_ORE)));
    public static final DeferredItem<BlockItem> DEEPSLATE_SULFUR_ORE_ITEM = ITEMS.registerSimpleBlockItem("deepslate_sulfur_ore", DEEPSLATE_SULFUR_ORE);

    // Nether Ores
    public static final DeferredBlock<Block> NETHER_ALUMINUM_ORE = BLOCKS.register("nether_aluminum_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));
    public static final DeferredItem<BlockItem> NETHER_ALUMINUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_aluminum_ore", NETHER_ALUMINUM_ORE);

    public static final DeferredBlock<Block> NETHER_LEAD_ORE = BLOCKS.register("nether_lead_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));
    public static final DeferredItem<BlockItem> NETHER_LEAD_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_lead_ore", NETHER_LEAD_ORE);

    public static final DeferredBlock<Block> NETHER_SILVER_ORE = BLOCKS.register("nether_silver_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));
    public static final DeferredItem<BlockItem> NETHER_SILVER_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_silver_ore", NETHER_SILVER_ORE);

    public static final DeferredBlock<Block> NETHER_NICKEL_ORE = BLOCKS.register("nether_nickel_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));
    public static final DeferredItem<BlockItem> NETHER_NICKEL_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_nickel_ore", NETHER_NICKEL_ORE);

    public static final DeferredBlock<Block> NETHER_ZINC_ORE = BLOCKS.register("nether_zinc_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));
    public static final DeferredItem<BlockItem> NETHER_ZINC_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_zinc_ore", NETHER_ZINC_ORE);

    public static final DeferredBlock<Block> NETHER_PLATINUM_ORE = BLOCKS.register("nether_platinum_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS)));
    public static final DeferredItem<BlockItem> NETHER_PLATINUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_platinum_ore", NETHER_PLATINUM_ORE);

    public static final DeferredBlock<Block> NETHER_URANIUM_ORE = BLOCKS.register("nether_uranium_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS)));
    public static final DeferredItem<BlockItem> NETHER_URANIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_uranium_ore", NETHER_URANIUM_ORE);

    public static final DeferredBlock<Block> NETHER_RUBY_ORE = BLOCKS.register("nether_ruby_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS)));
    public static final DeferredItem<BlockItem> NETHER_RUBY_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_ruby_ore", NETHER_RUBY_ORE);

    public static final DeferredBlock<Block> NETHER_SAPPHIRE_ORE = BLOCKS.register("nether_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS)));
    public static final DeferredItem<BlockItem> NETHER_SAPPHIRE_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_sapphire_ore", NETHER_SAPPHIRE_ORE);

    public static final DeferredBlock<Block> NETHER_CINNABAR_ORE = BLOCKS.register("nether_cinnabar_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));
    public static final DeferredItem<BlockItem> NETHER_CINNABAR_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_cinnabar_ore", NETHER_CINNABAR_ORE);

    public static final DeferredBlock<Block> NETHER_SALT_ORE = BLOCKS.register("nether_salt_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));
    public static final DeferredItem<BlockItem> NETHER_SALT_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_salt_ore", NETHER_SALT_ORE);

    public static final DeferredBlock<Block> NETHER_SULFUR_ORE = BLOCKS.register("nether_sulfur_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));
    public static final DeferredItem<BlockItem> NETHER_SULFUR_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_sulfur_ore", NETHER_SULFUR_ORE);

    // Mekanism Nether Ores
    public static final DeferredBlock<Block> NETHER_OSMIUM_ORE = BLOCKS.register("nether_osmium_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));
    public static final DeferredItem<BlockItem> NETHER_OSMIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_osmium_ore", NETHER_OSMIUM_ORE);

    public static final DeferredBlock<Block> NETHER_FLUORITE_ORE = BLOCKS.register("nether_fluorite_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE)));
    public static final DeferredItem<BlockItem> NETHER_FLUORITE_ORE_ITEM = ITEMS.registerSimpleBlockItem("nether_fluorite_ore", NETHER_FLUORITE_ORE);

    // End Ores
    public static final DeferredBlock<Block> END_ALUMINUM_ORE = BLOCKS.register("end_aluminum_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_ALUMINUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_aluminum_ore", END_ALUMINUM_ORE);

    public static final DeferredBlock<Block> END_LEAD_ORE = BLOCKS.register("end_lead_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_LEAD_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_lead_ore", END_LEAD_ORE);

    public static final DeferredBlock<Block> END_SILVER_ORE = BLOCKS.register("end_silver_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_SILVER_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_silver_ore", END_SILVER_ORE);

    public static final DeferredBlock<Block> END_NICKEL_ORE = BLOCKS.register("end_nickel_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_NICKEL_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_nickel_ore", END_NICKEL_ORE);

    public static final DeferredBlock<Block> END_PLATINUM_ORE = BLOCKS.register("end_platinum_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_PLATINUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_platinum_ore", END_PLATINUM_ORE);

    public static final DeferredBlock<Block> END_IRIDIUM_ORE = BLOCKS.register("end_iridium_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_IRIDIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_iridium_ore", END_IRIDIUM_ORE);

    public static final DeferredBlock<Block> END_RUBY_ORE = BLOCKS.register("end_ruby_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_RUBY_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_ruby_ore", END_RUBY_ORE);

    public static final DeferredBlock<Block> END_SAPPHIRE_ORE = BLOCKS.register("end_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_SAPPHIRE_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_sapphire_ore", END_SAPPHIRE_ORE);

    public static final DeferredBlock<Block> END_PERIDOT_ORE = BLOCKS.register("end_peridot_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_PERIDOT_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_peridot_ore", END_PERIDOT_ORE);

    public static final DeferredBlock<Block> END_CINNABAR_ORE = BLOCKS.register("end_cinnabar_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_CINNABAR_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_cinnabar_ore", END_CINNABAR_ORE);

    public static final DeferredBlock<Block> END_SALT_ORE = BLOCKS.register("end_salt_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_SALT_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_salt_ore", END_SALT_ORE);

    public static final DeferredBlock<Block> END_SULFUR_ORE = BLOCKS.register("end_sulfur_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_SULFUR_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_sulfur_ore", END_SULFUR_ORE);

    // Mekanism End Ores
    public static final DeferredBlock<Block> END_OSMIUM_ORE = BLOCKS.register("end_osmium_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_OSMIUM_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_osmium_ore", END_OSMIUM_ORE);

    public static final DeferredBlock<Block> END_FLUORITE_ORE = BLOCKS.register("end_fluorite_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredItem<BlockItem> END_FLUORITE_ORE_ITEM = ITEMS.registerSimpleBlockItem("end_fluorite_ore", END_FLUORITE_ORE);

    // Storage Blocks
    public static final DeferredBlock<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> ALUMINUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("aluminum_block", ALUMINUM_BLOCK);

    public static final DeferredBlock<Block> TIN_BLOCK = BLOCKS.register("tin_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> TIN_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("tin_block", TIN_BLOCK);

    public static final DeferredBlock<Block> LEAD_BLOCK = BLOCKS.register("lead_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> LEAD_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("lead_block", LEAD_BLOCK);

    public static final DeferredBlock<Block> SILVER_BLOCK = BLOCKS.register("silver_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> SILVER_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("silver_block", SILVER_BLOCK);

    public static final DeferredBlock<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> NICKEL_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("nickel_block", NICKEL_BLOCK);

    public static final DeferredBlock<Block> ZINC_BLOCK = BLOCKS.register("zinc_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> ZINC_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("zinc_block", ZINC_BLOCK);

    public static final DeferredBlock<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)));
    public static final DeferredItem<BlockItem> PLATINUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("platinum_block", PLATINUM_BLOCK);

    public static final DeferredBlock<Block> IRIDIUM_BLOCK = BLOCKS.register("iridium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)));
    public static final DeferredItem<BlockItem> IRIDIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("iridium_block", IRIDIUM_BLOCK);

    public static final DeferredBlock<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)));
    public static final DeferredItem<BlockItem> URANIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("uranium_block", URANIUM_BLOCK);

    // Raw Material Blocks
    public static final DeferredBlock<Block> RAW_ALUMINUM_BLOCK = BLOCKS.register("raw_aluminum_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));
    public static final DeferredItem<BlockItem> RAW_ALUMINUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("raw_aluminum_block", RAW_ALUMINUM_BLOCK);

    public static final DeferredBlock<Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));
    public static final DeferredItem<BlockItem> RAW_TIN_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("raw_tin_block", RAW_TIN_BLOCK);

    public static final DeferredBlock<Block> RAW_LEAD_BLOCK = BLOCKS.register("raw_lead_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));
    public static final DeferredItem<BlockItem> RAW_LEAD_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("raw_lead_block", RAW_LEAD_BLOCK);

    public static final DeferredBlock<Block> RAW_SILVER_BLOCK = BLOCKS.register("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));
    public static final DeferredItem<BlockItem> RAW_SILVER_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("raw_silver_block", RAW_SILVER_BLOCK);

    public static final DeferredBlock<Block> RAW_NICKEL_BLOCK = BLOCKS.register("raw_nickel_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));
    public static final DeferredItem<BlockItem> RAW_NICKEL_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("raw_nickel_block", RAW_NICKEL_BLOCK);

    public static final DeferredBlock<Block> RAW_ZINC_BLOCK = BLOCKS.register("raw_zinc_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));
    public static final DeferredItem<BlockItem> RAW_ZINC_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("raw_zinc_block", RAW_ZINC_BLOCK);

    public static final DeferredBlock<Block> RAW_PLATINUM_BLOCK = BLOCKS.register("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));
    public static final DeferredItem<BlockItem> RAW_PLATINUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("raw_platinum_block", RAW_PLATINUM_BLOCK);

    public static final DeferredBlock<Block> RAW_IRIDIUM_BLOCK = BLOCKS.register("raw_iridium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));
    public static final DeferredItem<BlockItem> RAW_IRIDIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("raw_iridium_block", RAW_IRIDIUM_BLOCK);

    public static final DeferredBlock<Block> RAW_URANIUM_BLOCK = BLOCKS.register("raw_uranium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));
    public static final DeferredItem<BlockItem> RAW_URANIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("raw_uranium_block", RAW_URANIUM_BLOCK);

    // Gem Blocks
    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS.register("ruby_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)));
    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("ruby_block", RUBY_BLOCK);

    public static final DeferredBlock<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)));
    public static final DeferredItem<BlockItem> SAPPHIRE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("sapphire_block", SAPPHIRE_BLOCK);

    public static final DeferredBlock<Block> PERIDOT_BLOCK = BLOCKS.register("peridot_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)));
    public static final DeferredItem<BlockItem> PERIDOT_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("peridot_block", PERIDOT_BLOCK);

    public static final DeferredBlock<Block> CINNABAR_BLOCK = BLOCKS.register("cinnabar_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)));
    public static final DeferredItem<BlockItem> CINNABAR_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("cinnabar_block", CINNABAR_BLOCK);

    // Alloy Blocks
    public static final DeferredBlock<Block> BRASS_BLOCK = BLOCKS.register("brass_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> BRASS_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("brass_block", BRASS_BLOCK);

    public static final DeferredBlock<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> BRONZE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("bronze_block", BRONZE_BLOCK);

    public static final DeferredBlock<Block> STEEL_BLOCK = BLOCKS.register("steel_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> STEEL_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("steel_block", STEEL_BLOCK);

    public static final DeferredBlock<Block> INVAR_BLOCK = BLOCKS.register("invar_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> INVAR_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("invar_block", INVAR_BLOCK);

    public static final DeferredBlock<Block> ELECTRUM_BLOCK = BLOCKS.register("electrum_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK)));
    public static final DeferredItem<BlockItem> ELECTRUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("electrum_block", ELECTRUM_BLOCK);

    public static final DeferredBlock<Block> CONSTANTAN_BLOCK = BLOCKS.register("constantan_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> CONSTANTAN_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("constantan_block", CONSTANTAN_BLOCK);

    public static final DeferredBlock<Block> ENDERIUM_BLOCK = BLOCKS.register("enderium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> ENDERIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("enderium_block", ENDERIUM_BLOCK);

    public static final DeferredBlock<Block> LUMIUM_BLOCK = BLOCKS.register("lumium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> LUMIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("lumium_block", LUMIUM_BLOCK);

    public static final DeferredBlock<Block> SIGNALUM_BLOCK = BLOCKS.register("signalum_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> SIGNALUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("signalum_block", SIGNALUM_BLOCK);

    // Mekanism Blocks
    public static final DeferredBlock<Block> OSMIUM_BLOCK = BLOCKS.register("osmium_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> OSMIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("osmium_block", OSMIUM_BLOCK);

    public static final DeferredBlock<Block> FLUORITE_BLOCK = BLOCKS.register("fluorite_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredItem<BlockItem> FLUORITE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("fluorite_block", FLUORITE_BLOCK);
}
