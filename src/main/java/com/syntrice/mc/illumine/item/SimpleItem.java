package com.syntrice.mc.illumine.item;

import net.minecraft.item.Item;

public class SimpleItem extends Item implements ModItem {

    private String unlocalizedName;

    public SimpleItem(Settings settings, String unlocalizedName) {
        super(settings);
        this.unlocalizedName = unlocalizedName;
        Items.list.add(this);
    }

    public String getPath() {
        return unlocalizedName;
    }
}
