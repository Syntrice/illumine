package com.syntrice.mc.illumine;

import com.syntrice.mc.illumine.registry.ModRegistry;
import net.fabricmc.api.ModInitializer;

public class Illumine implements ModInitializer {

    public static final String MOD_ID = "illumine";

    @Override
    public void onInitialize() {
        ModRegistry.registerItems();
        ModRegistry.registerBlocks();
    }
}
