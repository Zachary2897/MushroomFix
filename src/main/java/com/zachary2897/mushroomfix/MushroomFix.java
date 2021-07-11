package com.zachary2897.mushroomfix;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "mushroomfix", name = "MushroomFix", version = "v1.0.2", acceptedMinecraftVersions = "[1.12.2]", clientSideOnly = true)
public class MushroomFix {
    @EventHandler
    public void init(FMLInitializationEvent event) {
        Blocks.BROWN_MUSHROOM.setTranslationKey("brown_mushroom");
        Blocks.BROWN_MUSHROOM_BLOCK.setTranslationKey("brown_mushroom");
        Blocks.RED_MUSHROOM.setTranslationKey("red_mushroom");
        Blocks.RED_MUSHROOM_BLOCK.setTranslationKey("red_mushroom");
    }
}