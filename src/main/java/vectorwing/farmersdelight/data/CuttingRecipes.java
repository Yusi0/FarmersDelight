package vectorwing.farmersdelight.data;

import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;
import vectorwing.farmersdelight.registry.ModItems;
import vectorwing.farmersdelight.utils.tags.ForgeTags;

import java.util.function.Consumer;

public class CuttingRecipes {

	public static void register(Consumer<IFinishedRecipe> consumer) {
		// Knife
		chopMeats(consumer);
		chopPlants(consumer);

		// Pickaxe
		salvageBricks(consumer);

		// Axe
		stripWood(consumer);
		salvageWoodenFurniture(consumer);

		// Shears
		salvageUsingShears(consumer);
	}

	private static void chopMeats(Consumer<IFinishedRecipe> consumer) {
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BEEF), Ingredient.fromTag(ForgeTags.KNIVES), ModItems.MINCED_BEEF.get(), 2)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CHICKEN), Ingredient.fromTag(ForgeTags.KNIVES), ModItems.CHICKEN_CUTS.get(), 2)
				.addResult(Items.BONE_MEAL)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.COD), Ingredient.fromTag(ForgeTags.KNIVES), ModItems.COD_SLICE.get(), 2)
				.addResult(Items.BONE_MEAL)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SALMON), Ingredient.fromTag(ForgeTags.KNIVES), ModItems.SALMON_SLICE.get(), 2)
				.addResult(Items.BONE_MEAL)
				.build(consumer);
	}

	private static void chopPlants(Consumer<IFinishedRecipe> consumer) {
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(ModItems.CABBAGE.get()), Ingredient.fromTag(ForgeTags.KNIVES), ModItems.CABBAGE_LEAF.get(), 2)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(ModItems.RICE_PANICLE.get()), Ingredient.fromTag(ForgeTags.KNIVES), ModItems.RICE.get(), 1)
				.addResult(ModItems.STRAW.get())
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.MELON), Ingredient.fromTag(ForgeTags.KNIVES), Items.MELON_SLICE, 9)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.PUMPKIN), Ingredient.fromTag(ForgeTags.KNIVES), ModItems.PUMPKIN_SLICE.get(), 4)
				.build(consumer);
	}

	private static void salvageBricks(Consumer<IFinishedRecipe> consumer) {
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BRICKS), Ingredient.fromTag(ForgeTags.PICKAXES), Items.BRICK, 4)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.NETHER_BRICKS), Ingredient.fromTag(ForgeTags.PICKAXES), Items.NETHER_BRICK, 4)
				.build(consumer);
	}

	private static void stripWood(Consumer<IFinishedRecipe> consumer) {
		// Oak
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.OAK_LOG), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_OAK_LOG)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.OAK_WOOD), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_OAK_WOOD)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Birch
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BIRCH_LOG), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_BIRCH_LOG)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BIRCH_WOOD), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_BIRCH_WOOD)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Spruce
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SPRUCE_LOG), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_SPRUCE_LOG)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SPRUCE_WOOD), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_SPRUCE_WOOD)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Jungle
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.JUNGLE_LOG), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_JUNGLE_LOG)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.JUNGLE_WOOD), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_JUNGLE_WOOD)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Acacia
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.ACACIA_LOG), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_ACACIA_LOG)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.ACACIA_WOOD), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_ACACIA_WOOD)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Dark Oak
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.DARK_OAK_LOG), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_DARK_OAK_LOG)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.DARK_OAK_WOOD), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_DARK_OAK_WOOD)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Dark Oak
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CRIMSON_STEM), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_CRIMSON_STEM)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CRIMSON_HYPHAE), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_CRIMSON_HYPHAE)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);

		// Dark Oak
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.WARPED_STEM), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_WARPED_STEM)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.WARPED_HYPHAE), Ingredient.fromTag(ForgeTags.AXES), Items.STRIPPED_WARPED_HYPHAE)
				.addResult(ModItems.TREE_BARK.get())
				.addSound(SoundEvents.ITEM_AXE_STRIP.getRegistryName().toString()).build(consumer);
	}

	private static void salvageWoodenFurniture(Consumer<IFinishedRecipe> consumer) {
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.OAK_DOOR), Ingredient.fromTag(ForgeTags.AXES), Items.OAK_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.OAK_TRAPDOOR), Ingredient.fromTag(ForgeTags.AXES), Items.OAK_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.OAK_SIGN), Ingredient.fromTag(ForgeTags.AXES), Items.OAK_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BIRCH_DOOR), Ingredient.fromTag(ForgeTags.AXES), Items.BIRCH_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BIRCH_TRAPDOOR), Ingredient.fromTag(ForgeTags.AXES), Items.BIRCH_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.BIRCH_SIGN), Ingredient.fromTag(ForgeTags.AXES), Items.BIRCH_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SPRUCE_DOOR), Ingredient.fromTag(ForgeTags.AXES), Items.SPRUCE_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SPRUCE_TRAPDOOR), Ingredient.fromTag(ForgeTags.AXES), Items.SPRUCE_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SPRUCE_SIGN), Ingredient.fromTag(ForgeTags.AXES), Items.SPRUCE_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.JUNGLE_DOOR), Ingredient.fromTag(ForgeTags.AXES), Items.JUNGLE_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.JUNGLE_TRAPDOOR), Ingredient.fromTag(ForgeTags.AXES), Items.JUNGLE_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.JUNGLE_SIGN), Ingredient.fromTag(ForgeTags.AXES), Items.JUNGLE_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.ACACIA_DOOR), Ingredient.fromTag(ForgeTags.AXES), Items.ACACIA_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.ACACIA_TRAPDOOR), Ingredient.fromTag(ForgeTags.AXES), Items.ACACIA_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.ACACIA_SIGN), Ingredient.fromTag(ForgeTags.AXES), Items.ACACIA_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.DARK_OAK_DOOR), Ingredient.fromTag(ForgeTags.AXES), Items.DARK_OAK_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.DARK_OAK_TRAPDOOR), Ingredient.fromTag(ForgeTags.AXES), Items.DARK_OAK_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.DARK_OAK_SIGN), Ingredient.fromTag(ForgeTags.AXES), Items.DARK_OAK_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CRIMSON_DOOR), Ingredient.fromTag(ForgeTags.AXES), Items.CRIMSON_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CRIMSON_TRAPDOOR), Ingredient.fromTag(ForgeTags.AXES), Items.CRIMSON_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.CRIMSON_SIGN), Ingredient.fromTag(ForgeTags.AXES), Items.CRIMSON_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.WARPED_DOOR), Ingredient.fromTag(ForgeTags.AXES), Items.WARPED_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.WARPED_TRAPDOOR), Ingredient.fromTag(ForgeTags.AXES), Items.WARPED_PLANKS).build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.WARPED_SIGN), Ingredient.fromTag(ForgeTags.AXES), Items.WARPED_PLANKS).build(consumer);
	}

	private static void salvageUsingShears(Consumer<IFinishedRecipe> consumer) {
		// Saddle
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.SADDLE), Ingredient.fromTag(ForgeTags.SHEARS), Items.LEATHER, 2)
				.addResult(Items.IRON_NUGGET, 2)
				.build(consumer);
		// Book
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.LEATHER_HELMET), Ingredient.fromTag(ForgeTags.SHEARS), Items.LEATHER, 1)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.LEATHER_CHESTPLATE), Ingredient.fromTag(ForgeTags.SHEARS), Items.LEATHER, 2)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.LEATHER_LEGGINGS), Ingredient.fromTag(ForgeTags.SHEARS), Items.LEATHER, 2)
				.build(consumer);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.fromItems(Items.LEATHER_BOOTS), Ingredient.fromTag(ForgeTags.SHEARS), Items.LEATHER, 1)
				.build(consumer);
	}
}