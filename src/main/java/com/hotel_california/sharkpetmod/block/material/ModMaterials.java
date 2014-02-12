package com.hotel_california.sharkpetmod.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class ModMaterials extends Material {
	public static final Material deadFishMaterial = (new ModMaterials(MapColor.brownColor))
			.setRequiresTool();
	public ModMaterials(MapColor color) {
		super(color);
	}

}
