package uz.cybercraft.ores;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.concurrent.CompletableFuture;

public class ModRecipes extends RecipeProvider implements IConditionBuilder {
        public ModRecipes(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
                super(pOutput, pRegistries);
        }

        @Override
        protected void buildRecipes(RecipeOutput pRecipeOutput) {
                // Smelting recipes for ores
                oreSmeltingFromItem(pRecipeOutput, ModItems.RAW_ALUMINUM, RecipeCategory.MISC,
                                ModItems.ALUMINUM_INGOT.get(), 0.7f, 200, "aluminum");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.ALUMINUM_ORE, RecipeCategory.MISC,
                                ModItems.ALUMINUM_INGOT.get(), 0.7f, 200, "aluminum");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.DEEPSLATE_ALUMINUM_ORE, RecipeCategory.MISC,
                                ModItems.ALUMINUM_INGOT.get(), 0.7f, 200, "aluminum");

                oreSmeltingFromItem(pRecipeOutput, ModItems.RAW_TIN, RecipeCategory.MISC, ModItems.TIN_INGOT.get(),
                                0.7f, 200, "tin");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.TIN_ORE, RecipeCategory.MISC, ModItems.TIN_INGOT.get(),
                                0.7f, 200, "tin");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.DEEPSLATE_TIN_ORE, RecipeCategory.MISC,
                                ModItems.TIN_INGOT.get(), 0.7f, 200, "tin");

                oreSmeltingFromItem(pRecipeOutput, ModItems.RAW_LEAD, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(),
                                0.7f, 200, "lead");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.LEAD_ORE, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(),
                                0.7f, 200, "lead");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.DEEPSLATE_LEAD_ORE, RecipeCategory.MISC,
                                ModItems.LEAD_INGOT.get(), 0.7f, 200, "lead");

                oreSmeltingFromItem(pRecipeOutput, ModItems.RAW_SILVER, RecipeCategory.MISC,
                                ModItems.SILVER_INGOT.get(), 0.7f, 200, "silver");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.SILVER_ORE, RecipeCategory.MISC,
                                ModItems.SILVER_INGOT.get(), 0.7f, 200, "silver");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.DEEPSLATE_SILVER_ORE, RecipeCategory.MISC,
                                ModItems.SILVER_INGOT.get(), 0.7f, 200, "silver");

                oreSmeltingFromItem(pRecipeOutput, ModItems.RAW_NICKEL, RecipeCategory.MISC,
                                ModItems.NICKEL_INGOT.get(), 0.7f, 200, "nickel");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.NICKEL_ORE, RecipeCategory.MISC,
                                ModItems.NICKEL_INGOT.get(), 0.7f, 200, "nickel");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.DEEPSLATE_NICKEL_ORE, RecipeCategory.MISC,
                                ModItems.NICKEL_INGOT.get(), 0.7f, 200, "nickel");

                oreSmeltingFromItem(pRecipeOutput, ModItems.RAW_ZINC, RecipeCategory.MISC, ModItems.ZINC_INGOT.get(),
                                0.7f, 200, "zinc");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.ZINC_ORE, RecipeCategory.MISC, ModItems.ZINC_INGOT.get(),
                                0.7f, 200, "zinc");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.DEEPSLATE_ZINC_ORE, RecipeCategory.MISC,
                                ModItems.ZINC_INGOT.get(), 0.7f, 200, "zinc");

                oreSmeltingFromItem(pRecipeOutput, ModItems.RAW_PLATINUM, RecipeCategory.MISC,
                                ModItems.PLATINUM_INGOT.get(), 1.0f, 200, "platinum");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.PLATINUM_ORE, RecipeCategory.MISC,
                                ModItems.PLATINUM_INGOT.get(), 1.0f, 200, "platinum");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.DEEPSLATE_PLATINUM_ORE, RecipeCategory.MISC,
                                ModItems.PLATINUM_INGOT.get(), 1.0f, 200, "platinum");

                oreSmeltingFromItem(pRecipeOutput, ModItems.RAW_IRIDIUM, RecipeCategory.MISC,
                                ModItems.IRIDIUM_INGOT.get(), 1.0f, 200, "iridium");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.IRIDIUM_ORE, RecipeCategory.MISC,
                                ModItems.IRIDIUM_INGOT.get(), 1.0f, 200, "iridium");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.DEEPSLATE_IRIDIUM_ORE, RecipeCategory.MISC,
                                ModItems.IRIDIUM_INGOT.get(), 1.0f, 200, "iridium");

                oreSmeltingFromItem(pRecipeOutput, ModItems.RAW_URANIUM, RecipeCategory.MISC,
                                ModItems.URANIUM_INGOT.get(), 1.0f, 200, "uranium");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.URANIUM_ORE, RecipeCategory.MISC,
                                ModItems.URANIUM_INGOT.get(), 1.0f, 200, "uranium");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.DEEPSLATE_URANIUM_ORE, RecipeCategory.MISC,
                                ModItems.URANIUM_INGOT.get(), 1.0f, 200, "uranium");

                // Nether ores
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.NETHER_ALUMINUM_ORE, RecipeCategory.MISC,
                                ModItems.ALUMINUM_INGOT.get(), 0.7f, 200, "nether_aluminum");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.NETHER_LEAD_ORE, RecipeCategory.MISC,
                                ModItems.LEAD_INGOT.get(), 0.7f, 200, "nether_lead");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.NETHER_SILVER_ORE, RecipeCategory.MISC,
                                ModItems.SILVER_INGOT.get(), 0.7f, 200, "nether_silver");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.NETHER_NICKEL_ORE, RecipeCategory.MISC,
                                ModItems.NICKEL_INGOT.get(), 0.7f, 200, "nether_nickel");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.NETHER_ZINC_ORE, RecipeCategory.MISC,
                                ModItems.ZINC_INGOT.get(), 0.7f, 200, "nether_zinc");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.NETHER_PLATINUM_ORE, RecipeCategory.MISC,
                                ModItems.PLATINUM_INGOT.get(), 1.0f, 200, "nether_platinum");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.NETHER_URANIUM_ORE, RecipeCategory.MISC,
                                ModItems.URANIUM_INGOT.get(), 1.0f, 200, "nether_uranium");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.NETHER_OSMIUM_ORE, RecipeCategory.MISC,
                                ModItems.OSMIUM_INGOT.get(), 0.7f, 200, "nether_osmium");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.NETHER_FLUORITE_ORE, RecipeCategory.MISC,
                                ModItems.FLUORITE.get(), 0.7f, 200, "nether_fluorite");

                // End ores
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.END_ALUMINUM_ORE, RecipeCategory.MISC,
                                ModItems.ALUMINUM_INGOT.get(), 0.7f, 200, "end_aluminum");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.END_LEAD_ORE, RecipeCategory.MISC,
                                ModItems.LEAD_INGOT.get(), 0.7f, 200, "end_lead");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.END_SILVER_ORE, RecipeCategory.MISC,
                                ModItems.SILVER_INGOT.get(), 0.7f, 200, "end_silver");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.END_NICKEL_ORE, RecipeCategory.MISC,
                                ModItems.NICKEL_INGOT.get(), 0.7f, 200, "end_nickel");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.END_PLATINUM_ORE, RecipeCategory.MISC,
                                ModItems.PLATINUM_INGOT.get(), 1.0f, 200, "end_platinum");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.END_IRIDIUM_ORE, RecipeCategory.MISC,
                                ModItems.IRIDIUM_INGOT.get(), 1.0f, 200, "end_iridium");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.END_OSMIUM_ORE, RecipeCategory.MISC,
                                ModItems.OSMIUM_INGOT.get(), 0.7f, 200, "end_osmium");
                oreSmeltingFromBlock(pRecipeOutput, ModBlocks.END_FLUORITE_ORE, RecipeCategory.MISC,
                                ModItems.FLUORITE.get(), 0.7f, 200, "end_fluorite");

                // Dust smelting
                SimpleCookingRecipeBuilder
                                .smelting(Ingredient.of(ModItems.ALUMINUM_DUST.get()), RecipeCategory.MISC,
                                                ModItems.ALUMINUM_INGOT.get(), 0.5f, 200)
                                .unlockedBy("has_aluminum_dust", has(ModItems.ALUMINUM_DUST.get()))
                                .save(pRecipeOutput, "aluminum_ingot_from_dust");
                SimpleCookingRecipeBuilder
                                .smelting(Ingredient.of(ModItems.TIN_DUST.get()), RecipeCategory.MISC,
                                                ModItems.TIN_INGOT.get(), 0.5f, 200)
                                .unlockedBy("has_tin_dust", has(ModItems.TIN_DUST.get()))
                                .save(pRecipeOutput, "tin_ingot_from_dust");
                SimpleCookingRecipeBuilder
                                .smelting(Ingredient.of(ModItems.LEAD_DUST.get()), RecipeCategory.MISC,
                                                ModItems.LEAD_INGOT.get(), 0.5f, 200)
                                .unlockedBy("has_lead_dust", has(ModItems.LEAD_DUST.get()))
                                .save(pRecipeOutput, "lead_ingot_from_dust");
                SimpleCookingRecipeBuilder
                                .smelting(Ingredient.of(ModItems.SILVER_DUST.get()), RecipeCategory.MISC,
                                                ModItems.SILVER_INGOT.get(), 0.5f, 200)
                                .unlockedBy("has_silver_dust", has(ModItems.SILVER_DUST.get()))
                                .save(pRecipeOutput, "silver_ingot_from_dust");
                SimpleCookingRecipeBuilder
                                .smelting(Ingredient.of(ModItems.NICKEL_DUST.get()), RecipeCategory.MISC,
                                                ModItems.NICKEL_INGOT.get(), 0.5f, 200)
                                .unlockedBy("has_nickel_dust", has(ModItems.NICKEL_DUST.get()))
                                .save(pRecipeOutput, "nickel_ingot_from_dust");
                SimpleCookingRecipeBuilder
                                .smelting(Ingredient.of(ModItems.ZINC_DUST.get()), RecipeCategory.MISC,
                                                ModItems.ZINC_INGOT.get(), 0.5f, 200)
                                .unlockedBy("has_zinc_dust", has(ModItems.ZINC_DUST.get()))
                                .save(pRecipeOutput, "zinc_ingot_from_dust");
                SimpleCookingRecipeBuilder
                                .smelting(Ingredient.of(ModItems.PLATINUM_DUST.get()), RecipeCategory.MISC,
                                                ModItems.PLATINUM_INGOT.get(), 0.7f, 200)
                                .unlockedBy("has_platinum_dust", has(ModItems.PLATINUM_DUST.get()))
                                .save(pRecipeOutput, "platinum_ingot_from_dust");
                SimpleCookingRecipeBuilder
                                .smelting(Ingredient.of(ModItems.IRIDIUM_DUST.get()), RecipeCategory.MISC,
                                                ModItems.IRIDIUM_INGOT.get(), 0.7f, 200)
                                .unlockedBy("has_iridium_dust", has(ModItems.IRIDIUM_DUST.get()))
                                .save(pRecipeOutput, "iridium_ingot_from_dust");
                SimpleCookingRecipeBuilder
                                .smelting(Ingredient.of(ModItems.URANIUM_DUST.get()), RecipeCategory.MISC,
                                                ModItems.URANIUM_INGOT.get(), 0.7f, 200)
                                .unlockedBy("has_uranium_dust", has(ModItems.URANIUM_DUST.get()))
                                .save(pRecipeOutput, "uranium_ingot_from_dust");

                // Storage block recipes
                // Ingots to blocks
                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALUMINUM_BLOCK.get())
                                .pattern("III")
                                .pattern("III")
                                .pattern("III")
                                .define('I', ModItems.ALUMINUM_INGOT.get())
                                .unlockedBy("has_aluminum_ingot", has(ModItems.ALUMINUM_INGOT.get()))
                                .save(pRecipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TIN_BLOCK.get())
                                .pattern("III")
                                .pattern("III")
                                .pattern("III")
                                .define('I', ModItems.TIN_INGOT.get())
                                .unlockedBy("has_tin_ingot", has(ModItems.TIN_INGOT.get()))
                                .save(pRecipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_BLOCK.get())
                                .pattern("III")
                                .pattern("III")
                                .pattern("III")
                                .define('I', ModItems.LEAD_INGOT.get())
                                .unlockedBy("has_lead_ingot", has(ModItems.LEAD_INGOT.get()))
                                .save(pRecipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_BLOCK.get())
                                .pattern("III")
                                .pattern("III")
                                .pattern("III")
                                .define('I', ModItems.SILVER_INGOT.get())
                                .unlockedBy("has_silver_ingot", has(ModItems.SILVER_INGOT.get()))
                                .save(pRecipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NICKEL_BLOCK.get())
                                .pattern("III")
                                .pattern("III")
                                .pattern("III")
                                .define('I', ModItems.NICKEL_INGOT.get())
                                .unlockedBy("has_nickel_ingot", has(ModItems.NICKEL_INGOT.get()))
                                .save(pRecipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZINC_BLOCK.get())
                                .pattern("III")
                                .pattern("III")
                                .pattern("III")
                                .define('I', ModItems.ZINC_INGOT.get())
                                .unlockedBy("has_zinc_ingot", has(ModItems.ZINC_INGOT.get()))
                                .save(pRecipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PLATINUM_BLOCK.get())
                                .pattern("III")
                                .pattern("III")
                                .pattern("III")
                                .define('I', ModItems.PLATINUM_INGOT.get())
                                .unlockedBy("has_platinum_ingot", has(ModItems.PLATINUM_INGOT.get()))
                                .save(pRecipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRIDIUM_BLOCK.get())
                                .pattern("III")
                                .pattern("III")
                                .pattern("III")
                                .define('I', ModItems.IRIDIUM_INGOT.get())
                                .unlockedBy("has_iridium_ingot", has(ModItems.IRIDIUM_INGOT.get()))
                                .save(pRecipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.URANIUM_BLOCK.get())
                                .pattern("III")
                                .pattern("III")
                                .pattern("III")
                                .define('I', ModItems.URANIUM_INGOT.get())
                                .unlockedBy("has_uranium_ingot", has(ModItems.URANIUM_INGOT.get()))
                                .save(pRecipeOutput);

                // Blocks to ingots
                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINUM_INGOT.get(), 9)
                                .requires(ModBlocks.ALUMINUM_BLOCK.get())
                                .unlockedBy("has_aluminum_block", has(ModBlocks.ALUMINUM_BLOCK.get()))
                                .save(pRecipeOutput, "aluminum_ingot_from_block");

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9)
                                .requires(ModBlocks.TIN_BLOCK.get())
                                .unlockedBy("has_tin_block", has(ModBlocks.TIN_BLOCK.get()))
                                .save(pRecipeOutput, "tin_ingot_from_block");

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 9)
                                .requires(ModBlocks.LEAD_BLOCK.get())
                                .unlockedBy("has_lead_block", has(ModBlocks.LEAD_BLOCK.get()))
                                .save(pRecipeOutput, "lead_ingot_from_block");

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 9)
                                .requires(ModBlocks.SILVER_BLOCK.get())
                                .unlockedBy("has_silver_block", has(ModBlocks.SILVER_BLOCK.get()))
                                .save(pRecipeOutput, "silver_ingot_from_block");

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(), 9)
                                .requires(ModBlocks.NICKEL_BLOCK.get())
                                .unlockedBy("has_nickel_block", has(ModBlocks.NICKEL_BLOCK.get()))
                                .save(pRecipeOutput, "nickel_ingot_from_block");

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 9)
                                .requires(ModBlocks.ZINC_BLOCK.get())
                                .unlockedBy("has_zinc_block", has(ModBlocks.ZINC_BLOCK.get()))
                                .save(pRecipeOutput, "zinc_ingot_from_block");

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 9)
                                .requires(ModBlocks.PLATINUM_BLOCK.get())
                                .unlockedBy("has_platinum_block", has(ModBlocks.PLATINUM_BLOCK.get()))
                                .save(pRecipeOutput, "platinum_ingot_from_block");

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.IRIDIUM_INGOT.get(), 9)
                                .requires(ModBlocks.IRIDIUM_BLOCK.get())
                                .unlockedBy("has_iridium_block", has(ModBlocks.IRIDIUM_BLOCK.get()))
                                .save(pRecipeOutput, "iridium_ingot_from_block");

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(), 9)
                                .requires(ModBlocks.URANIUM_BLOCK.get())
                                .unlockedBy("has_uranium_block", has(ModBlocks.URANIUM_BLOCK.get()))
                                .save(pRecipeOutput, "uranium_ingot_from_block");

                // Nugget recipes
                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINUM_NUGGET.get(), 9)
                                .requires(ModItems.ALUMINUM_INGOT.get())
                                .unlockedBy("has_aluminum_ingot", has(ModItems.ALUMINUM_INGOT.get()))
                                .save(pRecipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINUM_INGOT.get())
                                .pattern("NNN")
                                .pattern("NNN")
                                .pattern("NNN")
                                .define('N', ModItems.ALUMINUM_NUGGET.get())
                                .unlockedBy("has_aluminum_nugget", has(ModItems.ALUMINUM_NUGGET.get()))
                                .save(pRecipeOutput, "aluminum_ingot_from_nuggets");

                // Similar for other metals - I'll add a few more as examples
                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_NUGGET.get(), 9)
                                .requires(ModItems.TIN_INGOT.get())
                                .unlockedBy("has_tin_ingot", has(ModItems.TIN_INGOT.get()))
                                .save(pRecipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_INGOT.get())
                                .pattern("NNN")
                                .pattern("NNN")
                                .pattern("NNN")
                                .define('N', ModItems.TIN_NUGGET.get())
                                .unlockedBy("has_tin_nugget", has(ModItems.TIN_NUGGET.get()))
                                .save(pRecipeOutput, "tin_ingot_from_nuggets");

                // Ore Hammer recipe
                ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ORE_HAMMER.get())
                                .pattern("III")
                                .pattern("ISI")
                                .pattern(" S ")
                                .define('I', net.minecraft.world.item.Items.IRON_INGOT)
                                .define('S', net.minecraft.world.item.Items.STICK)
                                .unlockedBy("has_iron_ingot", has(net.minecraft.world.item.Items.IRON_INGOT))
                                .save(pRecipeOutput);
        }

        protected static void oreSmelting(RecipeOutput recipeOutput, ItemLike pIngredient, RecipeCategory pCategory,
                        ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
                SimpleCookingRecipeBuilder
                                .smelting(Ingredient.of(pIngredient), pCategory, pResult, pExperience, pCookingTime)
                                .group(pGroup).unlockedBy(getHasName(pIngredient), has(pIngredient)).save(recipeOutput,
                                                getSmeltingRecipeName(pResult) + "_from_" + getItemName(pIngredient));
        }

        protected static void oreBlasting(RecipeOutput recipeOutput, ItemLike pIngredient, RecipeCategory pCategory,
                        ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
                SimpleCookingRecipeBuilder
                                .blasting(Ingredient.of(pIngredient), pCategory, pResult, pExperience, pCookingTime)
                                .group(pGroup).unlockedBy(getHasName(pIngredient), has(pIngredient)).save(recipeOutput,
                                                getBlastingRecipeName(pResult) + "_from_" + getItemName(pIngredient));
        }

        protected static void oreSmeltingFromItem(RecipeOutput recipeOutput, DeferredItem<?> pIngredient,
                        RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime,
                        String pGroup) {
                oreSmelting(recipeOutput, pIngredient.get(), pCategory, pResult, pExperience, pCookingTime, pGroup);
                oreBlasting(recipeOutput, pIngredient.get(), pCategory, pResult, pExperience, pCookingTime / 2, pGroup);
        }

        protected static void oreSmeltingFromBlock(RecipeOutput recipeOutput, DeferredBlock<?> pIngredient,
                        RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime,
                        String pGroup) {
                oreSmelting(recipeOutput, pIngredient.get(), pCategory, pResult, pExperience, pCookingTime, pGroup);
                oreBlasting(recipeOutput, pIngredient.get(), pCategory, pResult, pExperience, pCookingTime / 2, pGroup);
        }
}
