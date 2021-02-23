package com.syntrice.mc.illumine.registry;

import com.syntrice.mc.illumine.Illumine;
import com.syntrice.mc.illumine.block.Blocks;
import com.syntrice.mc.illumine.block.ModBlock;
import com.syntrice.mc.illumine.item.Items;
import com.syntrice.mc.illumine.item.ModItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Responsible for registering additions added by the mod
 */
public class ModRegistry {

    private static Identifier id(String path) {
        return new Identifier(Illumine.MOD_ID,path);
    }


    /**
     * Register all items
     */
    public static void registerItems() {
        for (ModItem item : Items.list) {
            registerItem(item);
        }
    }

    /**
     * Register all blocks
     */
    public static void registerBlocks() {
        for (ModBlock block : Blocks.list) {
            registerBlock(block);
        }
    }

    private static void registerItem(ModItem item) {
        Registry.register(Registry.ITEM,id(item.getPath()),(Item) item);
    }

    private static void registerBlock(ModBlock block) {
        Registry.register(Registry.BLOCK,id(block.getPath()),(Block) block);
        if (block.getBlockItem() != null) { Registry.register(Registry.ITEM,id(block.getPath()),block.getBlockItem()); }
    }
}
