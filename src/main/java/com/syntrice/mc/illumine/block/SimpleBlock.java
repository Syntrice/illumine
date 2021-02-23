package com.syntrice.mc.illumine.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class SimpleBlock extends Block implements ModBlock {

    private String path;
    private ItemGroup group;

    public SimpleBlock(Settings settings, String path, ItemGroup group) {
        super(settings);
        this.path = path;
        this.group = group;
        Blocks.list.add(this);
    }

    public SimpleBlock(Settings settings, String path) {
        this(settings, path,ItemGroup.MISC);
    }

    public String getPath() {
        return path;
    }

    public BlockItem getBlockItem() {
        return new BlockItem(this, new FabricItemSettings().group(group));
    }
}
