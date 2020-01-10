package mymod;

import mymod.CodakidFiles.Codakid;
import mymod.CodakidFiles.RenderMonsterPig;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.awt.Color;

@Mod.EventBusSubscriber
public class CommonProxy {
    
    public void preInit(FMLPreInitializationEvent e) {
    	
    	//************* REGISTER BLOCKS AND ITEMS ***************
	    Codakid.registerItem(Main.mySword, "my_sword");
    	
    	
    	//************* REGISTER MOBS ***************
    	Codakid.registerMobEntity(CustomMonster.class, "my_monster", RenderMonsterPig.FACTORY, Color.BLACK.getRGB(), Color.MAGENTA.getRGB());
    	
    	
    	// ************* MAKE RENDERERS ***************
    	
    	
        
        //************* REGISTER ENTITIES ***************
    	
    	
        
        //************* REGISTER BIOMES ***************
    	
    	
    }

    public void init(FMLInitializationEvent e) {
        
        //************* REGISTER WORLD GEN ***************


        
    	//************* SMELTING RECIPES ***************
    	
    	
    	
    	//************* BIOME SETUP ***************


    	
    }
    

    public void postInit(FMLPostInitializationEvent e) {
    	
    }
    
    
    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
    	Codakid.doBiomeRegistry(event);
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	Codakid.doBlockRegistry(event);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	Codakid.doItemRegistry(event);
    }

}
