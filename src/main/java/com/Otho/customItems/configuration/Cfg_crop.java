package com.Otho.customItems.configuration;

import com.Otho.customItems.lib.constants;

public class Cfg_crop {
    public String name;
    public String textureName;
    public String creativeTab = constants.MOD_ID;
    public String fruitName;
    public int renderType = 1;
    public int dropFromGrassChance = 10;
    public boolean dropSeedWhenMature = true;
    public boolean acceptBoneMeal = true;
    public int minFruitDrop = 1;
    public int maxFruitDrop = 1;
    public int minSeedDrop = 1;
    public int maxSeedDrop = 2;
    public int eachExtraSeedDropChance = 50;
    public int eachExtraFruitDropChance = 15;
}