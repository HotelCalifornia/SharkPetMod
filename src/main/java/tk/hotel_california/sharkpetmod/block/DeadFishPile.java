package tk.hotel_california.sharkpetmod.block;

import java.util.Random;

import tk.hotel_california.sharkpetmod.block.material.ModMaterials;
import tk.hotel_california.sharkpetmod.block.item.Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DeadFishPile extends Block {
	public DeadFishPile(Material material) {
		super(ModMaterials.deadFishMaterial);
		this.setHarvestLevel("shovel", 0);
		this.setHardness(0.5F);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	@Override
	public Item getItemDropped(int  p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return Items.declareItems.deadFish;
	}
	

}
