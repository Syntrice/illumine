package com.syntrice.mc.illumine.block;

import net.minecraft.item.BlockItem;

/**
 * All mod block classes should implement this interface
 */
public interface ModBlock {
    public String getPath();
    public BlockItem getBlockItem();
}
