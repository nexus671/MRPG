package com.truth.neogames.Adam.Items.Generators;

import com.truth.neogames.Ahmane.Entities.LivingEntity;
import com.truth.neogames.Enums.Affixes.ArmorSuffix;
import com.truth.neogames.Enums.Affixes.JewelryGem;
import com.truth.neogames.Enums.Affixes.JewelryMetal;
import com.truth.neogames.Enums.Affixes.Material;
import com.truth.neogames.Enums.Affixes.WeaponSuffix;
import com.truth.neogames.Enums.ArmorType;
import com.truth.neogames.Enums.ElementalType;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.RaceName;
import com.truth.neogames.Enums.WeaponType;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Utilities.RandomNumber;

/**
 * Created by Adam on 2/16/2016.
 * Class Description: Provides static methods for picking RandomNumber.random enumerator values.
 */
public final class EnumPicker {

    private EnumPicker() {
    }

    public static ArmorSuffix getRandomArmorSuffix() {
        boolean hasSuffix = RandomNumber.random.nextBoolean();
        int number = RandomNumber.random.nextInt(13);
        if (hasSuffix) {
            switch (number) {
                case 0:
                    return ArmorSuffix.HARDINESS;
                case 1:
                    return ArmorSuffix.ENLIGHTENING;
                case 2:
                    return ArmorSuffix.BRAWLING;
                case 3:
                    return ArmorSuffix.APTITUDE;
                case 4:
                    return ArmorSuffix.PROSPERITY;
                case 5:
                    return ArmorSuffix.INCANDESCENCE;
                case 6:
                    return ArmorSuffix.RADIANCE;
                case 7:
                    return ArmorSuffix.TWILIGHT;
                case 8:
                    return ArmorSuffix.SHADOW;
                case 9:
                    return ArmorSuffix.FLAME;
                case 10:
                    return ArmorSuffix.BURNING;
                case 11:
                    return ArmorSuffix.ICE;
                case 12:
                    return ArmorSuffix.FREEZING;
                default:
                    return ArmorSuffix.NONE;
            }
        } else {
            return ArmorSuffix.NONE;
        }
    }

    public static JewelryGem getRandomJewelryGem() {
        int number = RandomNumber.random.nextInt(14);
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

    /**
     * Gets a jewelry gem, with a higher chance for a high quality gem at higher levels.
     *
     * @param level The level of the player, to determine chances of getting a higher quality gem.
     * @return The jewelry gem.
     */
    public static JewelryGem getJewelryGem(int level) {
        double levelRatio = (double) level / (double) LivingEntity.getMaxLevel();
        double number = RandomNumber.random.nextDouble();
        if ((levelRatio - 0.5) > number) {
            return JewelryGem.DIAMOND;
        } else if ((levelRatio - 0.4) > number) {
            return JewelryGem.RUBY;
        } else if ((levelRatio - 0.3) > number) {
            return JewelryGem.EMERALD;
        } else if ((levelRatio - 0.2) > number) {
            return JewelryGem.ALEXANDRITE;
        } else if ((levelRatio - 0.1) > number) {
            return JewelryGem.MORGANITE;
        } else if (levelRatio > number) {
            return JewelryGem.SAPPHIRE;
        } else if ((levelRatio + 0.1) > number) {
            return JewelryGem.IOLITE;
        } else if ((levelRatio + 0.2) > number) {
            return JewelryGem.TANZANITE;
        } else if ((levelRatio + 0.3) > number) {
            return JewelryGem.JADE;
        } else if ((levelRatio + 0.4) > number) {
            return JewelryGem.TOPAZ;
        } else if ((levelRatio + 0.5) > number) {
            return JewelryGem.GARNET;
        } else if ((levelRatio + 0.6) > number) {
            return JewelryGem.OPAL;
        } else {
            return ((levelRatio + .7) > number) ? JewelryGem.AMETHYST : JewelryGem.NONE;
        }
    }

    public static JewelryMetal getRandomJewelryMetal() {
        int number = RandomNumber.random.nextInt(3);
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

    public static JewelryMetal getJewelryMetal(int level) {
        double number = RandomNumber.random.nextDouble();
        double levelRatio = (double) level / (double) LivingEntity.getMaxLevel();
        if (levelRatio > number) {
            return JewelryMetal.GOLD;
        } else {
            return ((levelRatio + (1.0 / 3)) > number) ? JewelryMetal.SILVER : JewelryMetal.COPPER;
        }
    }

    public static Material getRandomGearMaterial() {
        int number = RandomNumber.random.nextInt(10);
        switch (number) {
            case 0:
                return Material.BRONZE;
            case 1:
                return Material.IRON;
            case 2:
                return Material.STEEL;
            case 3:
                return Material.MITHRIL;
            case 4:
                return Material.GOLDEN;
            case 5:
                return Material.LAMINAR;
            case 6:
                return Material.PLATED;
            case 7:
                return Material.OBSIDIAN;
            case 8:
                return Material.CRYSTAL;
            case 9:
                return Material.DRACONIC;
            default:
                return Material.BRONZE;
        }
    }

    /**
     * Gets the appropriate gear material based on the level.
     *
     * @param level The level of the player.
     * @return The highest level gear material without exceeding the player's level.
     */
    public static Material getGearMaterial(int level) {
        if (level < 1) {
            return null;
        } else if (level == 1) {
            return Material.BRONZE;
        } else if (level == 2) {
            return Material.IRON;
        } else if (level == 3) {
            return Material.STEEL;
        } else if (level == 4) {
            return Material.MITHRIL;
        } else if (level <= 7) {
            return Material.GOLDEN;
        } else if (level <= 9) {
            return Material.LAMINAR;
        } else if (level <= 11) {
            return Material.PLATED;
        } else if (level <= 15) {
            return Material.OBSIDIAN;
        } else {
            return (level <= 20) ? Material.CRYSTAL : Material.DRACONIC;
        }
    }

    public static WeaponSuffix getRandomWeaponSuffix() {
        boolean hasSuffix = RandomNumber.random.nextBoolean();
        int number = RandomNumber.random.nextInt(14);
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

    public static ArmorType getRandomArmorType() {
        int number = RandomNumber.random.nextInt(17);
        switch (number) {
            case 0:
                return ArmorType.BOOTS;
            case 1:
                return ArmorType.CHAINMAIL;
            case 2:
                return ArmorType.CHAUSSES;
            case 3:
                return ArmorType.CHESTPLATE;
            case 4:
                return ArmorType.CHAINMAIL;
            case 5:
                return ArmorType.CUIRASS;
            case 6:
                return ArmorType.GAUNTLETS;
            case 7:
                return ArmorType.GLOVES;
            case 8:
                return ArmorType.HELMET;
            case 9:
                return ArmorType.HOOD;
            case 10:
                return ArmorType.ROBEBOTTOM;
            case 11:
                return ArmorType.ROBETOP;
            case 12:
                return ArmorType.SABATONS;
            case 13:
                return ArmorType.SALLET;
            case 14:
                return ArmorType.VAMBRACES;
            case 15:
                return ArmorType.GREAVES;
            case 16:
                return ArmorType.SHIELD;
            default:
                return null;
        }
    }

    public static ArmorType getRandomArmorType(WornSlot slot) {
        int number2 = RandomNumber.random.nextInt(2);
        int number3 = RandomNumber.random.nextInt(3);
        int number4 = RandomNumber.random.nextInt(4);
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
            case GLOVES:
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
            case OFFHAND:
                return ArmorType.SHIELD;
        }
        return null;
    }

    public static ElementalType getRandomElementalType() {
        int number = RandomNumber.random.nextInt(5);
        switch (number) {
            case 0:
                return ElementalType.DARK;
            case 1:
                return ElementalType.LIGHT;
            case 2:
                return ElementalType.FIRE;
            case 3:
                return ElementalType.FROST;
            case 4:
                return ElementalType.NONE;
            default:
                return ElementalType.NONE;
        }
    }

    public static EntityStatName getRandomEntityStat() {
        int number = RandomNumber.random.nextInt(7);
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

    public static WeaponType getRandomWeaponType() {
        int number = RandomNumber.random.nextInt(14);
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

    public static RaceName getRandomRace() {
        int number = RandomNumber.random.nextInt(6);
        switch (number) {
            case 0:
                return RaceName.CATFOLK;
            case 1:
                return RaceName.DWARF;
            case 2:
                return RaceName.ELF;
            case 3:
                return RaceName.GNOME;
            case 4:
                return RaceName.HUMAN;
            case 5:
                return RaceName.ORC;
            default:
                return RaceName.HUMAN;
        }
    }

    public static WornSlot getRandomSlot() {
        int number = RandomNumber.random.nextInt(10);
        switch (number) {
            case 0:
                return WornSlot.HEAD;
            case 1:
                return WornSlot.NECK;
            case 2:
                return WornSlot.CHEST;
            case 3:
                return WornSlot.MAINHAND;
            case 4:
                return WornSlot.OFFHAND;
            case 5:
                return WornSlot.GLOVES;
            case 6:
                return WornSlot.RING;
            case 7:
                return WornSlot.LEGS;
            case 8:
                return WornSlot.FEET;
            case 9:
                return WornSlot.AMMO;
            default:
                return WornSlot.CHEST;
        }
    }
}
