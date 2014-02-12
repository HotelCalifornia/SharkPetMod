package com.hotel_california.sharkpetmod.item;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class Items {
	public static class declareItems {
		public static Item deadFish;
	}
	public static void initItems() {
		declareItems.deadFish = new DeadFish()
		.setUnlocalizedName("deadFish")
		.setTextureName("sharkpetmod:deadFishItem");
	}
	public static void registerItems() {
		GameRegistry.registerItem(declareItems.deadFish, "Dead Fish");
	}
	public static void registerRecipes() {
		
	}
	public static void registerShapelessRecipes() {
		
	}
	public static void registerOtherRecipes() {
		
	}
	public static void fullRegister() {
		initItems();
		registerItems();
	}

}
