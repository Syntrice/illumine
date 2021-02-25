package com.syntrice.mc.illumine.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;

import java.util.ArrayList;

/**
 * Contains blocks added by the mod
 */
public class Blocks {

    /** A list of all blocks added by the mod */
    public static ArrayList<ModBlock> list = new ArrayList<>();

    public static final SimpleBlock LIMESTONE = new SimpleBlock(FabricBlockSettings.of(Material.STONE),"limestone");
    public static final SimpleBlock POLISHED_LIMESTONE = new SimpleBlock(FabricBlockSettings.of(Material.STONE),"polished_limestone");
    public static final SimpleBlock POLISHED_LIMESTONE_BRICKS = new SimpleBlock(FabricBlockSettings.of(Material.STONE),"polished_limestone_bricks");
    public static final SimpleBlock CHISELED_POLISHED_LIMESTONE = new SimpleBlock(FabricBlockSettings.of(Material.STONE),"chiseled_polished_limestone");
    public static final SimpleBlock CRACKED_POLISHED_LIMESTONE_BRICKS = new SimpleBlock(FabricBlockSettings.of(Material.STONE),"cracked_polished_limestone_bricks");
    public static final SimpleBlock MARBLE = new SimpleBlock(FabricBlockSettings.of(Material.STONE),"marble");
    public static final SimpleBlock POLISHED_MARBLE = new SimpleBlock(FabricBlockSettings.of(Material.STONE),"polished_marble");
    public static final SimpleBlock POLISHED_MARBLE_BRICKS = new SimpleBlock(FabricBlockSettings.of(Material.STONE),"polished_marble_bricks");


}
