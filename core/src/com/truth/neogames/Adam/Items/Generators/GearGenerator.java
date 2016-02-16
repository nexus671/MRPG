package com.truth.neogames.Adam.Items.Generators;

import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Adam.Items.GearPackage.Weapons.Weapon;
import com.truth.neogames.Adam.Items.GearPackage.Wearables.Armor;
import com.truth.neogames.Adam.Items.GearPackage.Wearables.Jewelry;
import com.truth.neogames.Enums.Affixes.*;
import com.truth.neogames.Enums.ArmorType;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.WeaponType;
import com.truth.neogames.Enums.WornSlot;

import java.util.Random;

/**
 * Created by Adam on 11/25/2015.
 * Class Description: Generates weapons and armor for monster drops and chests.
 * This class is a work in progress.
 */
public class GearGenerator {
    private static Random random = new Random();

    public GearGenerator() {
    }

    public static JewelryMetal getRandomJewelryMetal() {
        int number = random.nextInt(3);
        switch (number) {
            case 0:
                return JewelryMetal.COPPER;
            case 1:
                return JewelryMetal.SILVER;
            case 2:
                return JewelryMetal.GOLD;
            default:
                return null;
        }
    }

    public static EntityStatName getRandomEntityStat() {
        int number = random.nextInt(7);
        switch (number) {
            case 0:
                return EntityStatName.HEALTH;
            case 1:
                return EntityStatName.HEALTHREGEN;
            case 2:
                return EntityStatName.MANA;
            case 3:
                return EntityStatName.MANAREGEN;
            case 4:
                return EntityStatName.STRENGTH;
            case 5:
                return EntityStatName.CONSTITUTION;
            case 6:
                return EntityStatName.WISDOM;
            default:
                return null;
        }
    }

    public static JewelryGem getRandomJewelryGem() {
        int number = random.nextInt(14);
        switch (number) {
            case 0:
                return JewelryGem.ALEXANDRITE;
            case 1:
                return JewelryGem.AMETHYST;
            case 2:
                return JewelryGem.DIAMOND;
            case 3:
                return JewelryGem.EMERALD;
            case 4:
                return JewelryGem.GARNET;
            case 5:
                return JewelryGem.IOLITE;
            case 6:
                return JewelryGem.JADE;
            case 7:
                return JewelryGem.MORGANITE;
            case 8:
                return JewelryGem.NONE;
            case 9:
                return JewelryGem.OPAL;
            case 10:
                return JewelryGem.RUBY;
            case 11:
                return JewelryGem.SAPPHIRE;
            case 12:
                return JewelryGem.TANZANITE;
            case 13:
                return JewelryGem.TOPAZ;
            default:
                return JewelryGem.NONE;
        }
    }

    public static Material getRandomGearMaterial() {
        int number = random.nextInt(10);
        switch(number) {
            case 0: return Material.BRONZE;
            case 1: return Material.IRON;
            case 2: return Material.STEEL;
            case 3: return Material.MITHRIL;
            case 4: return Material.GOLDEN;
            case 5: return Material.LAMINAR;
            case 6: return Material.PLATED;
            case 7: return Material.OBSIDIAN;
            case 8: return Material.CRYSTAL;
            case 9: return Material.DRACONIC;
            default: return null;
        }
    }

    public static WeaponType getRandomWeaponType() {
        int number = random.nextInt(14);
        switch (number) {
            case 0:
                return WeaponType.SWORD;
            case 1:
                return WeaponType.MACE;
            case 2:
                return WeaponType.DAGGER;
            case 3:
                return WeaponType.SCIMITAR;
            case 4:
                return WeaponType.BATTLEAXE;
            case 5:
                return WeaponType.WARHAMMER;
            case 6:
                return WeaponType.BROADSWORD;
            case 7:
                return WeaponType.PIKE;
            case 8:
                return WeaponType.HALBERD;
            case 9:
                return WeaponType.FLAIL;
            case 10:
                return WeaponType.BOW;
            case 11:
                return WeaponType.CROSSBOW;
            case 12:
                return WeaponType.STAFF;
            case 13:
                return WeaponType.WAND;
            default:
                return null;
        }
    }

    public static WeaponSuffix getRandomWeaponSuffix() {
        boolean hasSuffix = random.nextBoolean();
        int number = random.nextInt(14);
        if (hasSuffix) {
            switch (number) {
                case 0:
                    return WeaponSuffix.TRIUMPH;
                case 1:
                    return WeaponSuffix.FEROCITY;
                case 2:
                    return WeaponSuffix.VICTORY;
                case 3:
                    return WeaponSuffix.CHAOS;
                case 4:
                    return WeaponSuffix.EONS;
                case 5:
                    return WeaponSuffix.OBLIVION;
                case 6:
                    return WeaponSuffix.INCANDESCENCE;
                case 7:
                    return WeaponSuffix.RADIANCE;
                case 8:
                    return WeaponSuffix.TWILIGHT;
                case 9:
                    return WeaponSuffix.SHADOW;
                case 10:
                    return WeaponSuffix.FLAME;
                case 11:
                    return WeaponSuffix.BURNING;
                case 12:
                    return WeaponSuffix.ICE;
                case 13:
                    return WeaponSuffix.FREEZING;
                default:
                    return null;
            }
        } else {
            return WeaponSuffix.NONE;
        }
    }

    public static ArmorSuffix getRandomArmorSuffix() {
        boolean hasSuffix = random.nextBoolean();
        int number = random.nextInt(13);
        if(hasSuffix) {
            switch(number) {
                case 0: return ArmorSuffix.HARDINESS;
                case 1: return ArmorSuffix.ENLIGHTENING;
                case 2: return ArmorSuffix.BRAWLING;
                case 3: return ArmorSuffix.APTITUDE;
                case 4: return ArmorSuffix.PROSPERITY;
                case 5: return ArmorSuffix.INCANDESCENCE;
                case 6: return ArmorSuffix.RADIANCE;
                case 7: return ArmorSuffix.TWILIGHT;
                case 8: return ArmorSuffix.SHADOW;
                case 9: return ArmorSuffix.FLAME;
                case 10: return ArmorSuffix.BURNING;
                case 11: return ArmorSuffix.ICE;
                case 12: return ArmorSuffix.FREEZING;
                default: return null;
            }
        }
        else {
            return ArmorSuffix.NONE;
        }
    }

    public static ArmorType getRandomArmorType() {
        int number = random.nextInt(16);
        switch(number) {
            case 0: return ArmorType.BOOTS;
            case 1: return ArmorType.CHAINMAIL;
            case 2: return ArmorType.CHAUSSES;
            case 3: return ArmorType.CHESTPLATE;
            case 4: return ArmorType.CHAINMAIL;
            case 5: return ArmorType.CUIRASS;
            case 6: return ArmorType.GAUNTLETS;
            case 7: return ArmorType.GLOVES;
            case 8: return ArmorType.HELMET;
            case 9: return ArmorType.HOOD;
            case 10: return ArmorType.ROBEBOTTOM;
            case 11: return ArmorType.ROBETOP;
            case 12: return ArmorType.SABATONS;
            case 13: return ArmorType.SALLET;
            case 14: return ArmorType.VAMBRACES;
            case 15:
                return ArmorType.GREAVES;
            default: return null;
        }
    }

    public static ArmorType getRandomArmorType(WornSlot slot) {
        int number2 = random.nextInt(2);
        int number3 = random.nextInt(3);
        int number4 = random.nextInt(4);
        switch (slot) {
            case HEAD:
                switch (number2) {
                    case 0:
                        return ArmorType.HELMET;
                    case 1:
                        return ArmorType.HOOD;
                }
                break;
            case CHEST:
                switch (number4) {
                    case 0:
                        return ArmorType.CHESTPLATE;
                    case 1:
                        return ArmorType.CHAINMAIL;
                    case 2:
                        return ArmorType.CUIRASS;
                    case 3:
                        return ArmorType.ROBETOP;
                }
                break;
            case HANDS:
                switch (number3) {
                    case 0:
                        return ArmorType.GAUNTLETS;
                    case 1:
                        return ArmorType.GLOVES;
                    case 2:
                        return ArmorType.VAMBRACES;
                }
                break;
            case LEGS:
                switch (number3) {
                    case 0:
                        return ArmorType.GREAVES;
                    case 1:
                        return ArmorType.CHAUSSES;
                    case 2:
                        return ArmorType.ROBEBOTTOM;
                }
                break;
            case FEET:
                switch (number2) {
                    case 0:
                        return ArmorType.BOOTS;
                    case 1:
                        return ArmorType.SABATONS;
                }
                break;
        }
        return null;
    }

    //WIP TODO: Finish this method
    //HEAD(0), NECK(1), CHEST(2), MAINHAND(3), OFFHAND(4), HANDS(5), RING(6), LEGS(7), FEET(8), AMMO(9);
    public Gear getRandom() {
        int slotNum = random.nextInt(9);
        Gear g;
        switch (slotNum) {
            case 0:
                return new Armor(WornSlot.HEAD, getRandomGearMaterial(), getRandomArmorSuffix(), getRandomArmorType(WornSlot.HEAD));
            case 1:
                return new Jewelry(getRandomJewelryMetal(), getRandomJewelryGem(), getRandomEntityStat());
            case 2:
                return new Armor(WornSlot.CHEST, getRandomGearMaterial(), getRandomArmorSuffix(), getRandomArmorType(WornSlot.CHEST));
            case 3:
                return new Weapon(getRandomGearMaterial(), getRandomWeaponSuffix(), getRandomWeaponType());
            case 4:
                return new Weapon(getRandomGearMaterial(), getRandomWeaponSuffix(), getRandomWeaponType());
            case 5:
                return new Armor(WornSlot.HANDS, getRandomGearMaterial(), getRandomArmorSuffix(), getRandomArmorType(WornSlot.HANDS));
            case 6:
            case 7:
            case 8:
            case 9:
        }
        return null;
    }
}
