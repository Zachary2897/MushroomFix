package com.zachary2897.mushroomfix;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MushroomFix.MODID, name = MushroomFix.NAME, version = MushroomFix.VERSION, acceptedMinecraftVersions = MushroomFix.MCVERSIONS)
public class MushroomFix {
    public static final String MODID = "mushroomfix";
    public static final String NAME = "MushroomFix";
    public static final String VERSION = "v1.0";
    public static final String MCVERSIONS = "[1.12.2]";
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {}
    @EventHandler
    public void init(FMLInitializationEvent event) {
        Blocks.BROWN_MUSHROOM.setUnlocalizedName("mushroomBrown");
        Blocks.BROWN_MUSHROOM_BLOCK.setUnlocalizedName("mushroomBrown");
        Blocks.RED_MUSHROOM.setUnlocalizedName("mushroomRed");
        Blocks.RED_MUSHROOM_BLOCK.setUnlocalizedName("mushroomRed");
    }
}