package com.zachary2897.mushroomfix;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "mushroomfix", name = "MushroomFix", version = "v1.0.1", acceptedMinecraftVersions = "[1.12.2]")
public class MushroomFix {
    @EventHandler
    public void init(FMLInitializationEvent event) {
        Blocks.BROWN_MUSHROOM.setTranslationKey("mushroomBrown");
        Blocks.BROWN_MUSHROOM_BLOCK.setTranslationKey("mushroomBrown");
        Blocks.RED_MUSHROOM.setTranslationKey("mushroomRed");
        Blocks.RED_MUSHROOM_BLOCK.setTranslationKey("mushroomRed");
    }
}