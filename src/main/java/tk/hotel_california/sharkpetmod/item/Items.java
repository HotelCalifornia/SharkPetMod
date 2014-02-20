package tk.hotel_california.sharkpetmod.item;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import tk.hotel_california.sharkpetmod.item.DeadFish;

import net.minecraft.item.Item;

public class Items {
    public static class declareItems {
        public static Item deadFishItem;
    }
    public static void initItems() {
        declareItems.deadFishItem = new DeadFish();
        declareItems.deadFishItem
        .setUnlocalizedName("deadFish")
        .setTextureName("sharkpetmod:deadFishItem")
        .setCreativeTab(CreativeTabs.tabMisc);
    }
    public static void registerRecipes() {
        //stub
    }
    public static void registerShapelessRecipes() {
        //stub
    }
    public static void registerOtherRecipes() {
        //stub
    }
    public static void registerItems() {
        GameRegistry.registerItem(declareItems.deadFishItem, "deadFish");
    }
    public static void fullRegister() {
        initItems();
        registerRecipes();
        registerShapelessRecipes();
        registerOtherRecipes();
        registerItems();
    }

}
