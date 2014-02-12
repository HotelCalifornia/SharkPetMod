package com.hotel_california.sharkpetmod;
//MC imports
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.hotel_california.sharkpetmod.block.Blocks;
//egocentric imports
import com.hotel_california.sharkpetmod.block.DeadFishPile;
import com.hotel_california.sharkpetmod.block.material.ModMaterials;
import com.hotel_california.sharkpetmod.item.DeadFish;
import com.hotel_california.sharkpetmod.item.Items;
//FML imports
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "sharkpetmod", name = "Shark Pet Mod", version = "0.0.1")

public class SharkPetMod {
	@Instance(value = "sharkpetmod")
	public static SharkPetMod instance;
	
	@SidedProxy(clientSide = "com.hotel_california.sharkpetmod.client.ClientProxy", serverSide = "com.hotel_california.sharkpetmod.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Items.fullRegister();
		Blocks.fullRegister();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		proxy.registerRenderers();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//stub
	}
	
}
