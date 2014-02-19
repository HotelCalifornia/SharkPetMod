package com.hotel_california.sharkpetmod.item;

import cpw.mods.fml.common.registry.GameRegistry;

//BIG NOTE: THIS CODE IS INCREDIBLY INEFFICIENT (i recognise this)
//this is kind of a work in progress that will get better as i learn more Java
//eventually a lot of this will be in an interface
//but for now, ,here's this clunky piece of shit

//correction: this is a train-wreck, and i need to take a break ~Hotel_California, 18.Feb.2014, 10:10 PM

import net.minecraft.item.Item;
//import net.minecraft.creativetab.CreativeTabs;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

class PreconditionException extends Exception {
    public PreconditionException(String s) {
        super(s);
    }
}
public class Items {
	public static class declareItems {
        public static ArrayList<Item> items = new ArrayList();
	}
    public static void addItem(Item item) {
        declareItems.items.add(item);
    }
	public static void initItems() {
        try{
            for(int i = 0; i <= declareItems.items.size(); i++) {
                declareItems.items.get(i).getClass().newInstance();
            }
        }
        catch (Exception InstantiationException) {
            System.out.println("Instantiation Exception");
        }
        /*
		declareItems.deadFish = new DeadFish()
		.setUnlocalizedName("deadFish")
		.setTextureName("sharkpetmod:deadFishItem")
        .setCreativeTab(CreativeTabs.tabMisc);
        */
	}
    public static String getName(Item item) {
        Method[] methods = item.getClass().getMethods();
        //if(Arrays.asList(methods).contains(getLocalisedName))
        try {
            if(item.getLocalisedName()==null) {
                throw new PreconditionException(item + " didn't meet the required precondition");
            }
            else {
                return item.getLocalisedName();
            }
        }
        catch(PreconditionException pe) {
            pe.printStackTrace();
        }
    }

	public static void registerRecipes() {
		
	}
	public static void registerShapelessRecipes() {
		
	}
	public static void registerOtherRecipes() {
		
	}
    public static void registerItems() {
        for(int i = 0; i <= declareItems.items.size(); i++) {
            GameRegistry.registerItem(declareItems.items.get(i), getName(declareItems.items.get(i)));
        }

    }
	public static void fullRegister() {
		initItems();
		registerItems();
	}

}
