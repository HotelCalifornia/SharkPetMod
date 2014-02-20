package tk.hotel_california.sharkpetmod;
//MC imports

//egocentric imports
import tk.hotel_california.sharkpetmod.block.Blocks;
import tk.hotel_california.sharkpetmod.item.Items;
//FML imports
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "sharkpetmod", name = "Shark Pet Mod", version = "0.0.1")

public class SharkPetMod {
	@Instance(value = "sharkpetmod")
	public static SharkPetMod instance;
	
	@SidedProxy(clientSide =
    "tk.hotel_california.sharkpetmod.client.ClientProxy",
    serverSide = "tk.hotel_california.sharkpetmod.CommonProxy")
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
