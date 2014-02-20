package tk.hotel_california.sharkpetmod.block;
import tk.hotel_california.sharkpetmod.block.material.ModMaterials;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;

public class Blocks {
	public static class declareBlocks {
		public static Block deadFishBlock;
	}
	public static void initBlocks() {
		declareBlocks.deadFishBlock = new DeadFishPile(ModMaterials.deadFishMaterial)
		.setStepSound(Block.soundTypeSand)
		.setBlockName("deadFishPile")
		.setBlockTextureName("sharkpetmod:deadFishPile");
	}
	public static void registerBlocks() {
		GameRegistry.registerBlock(declareBlocks.deadFishBlock, "Pile of Dead Fish");
	}
	public static void registerRecipes() {
		
	}
	public static void registerShapelessRecipes() {
		
	}
	public static void registerOtherRecipes() {
		
	}
	public static void fullRegister() {
		initBlocks();
        registerRecipes();
        registerShapelessRecipes();
        registerOtherRecipes();
		registerBlocks();
	}

}
