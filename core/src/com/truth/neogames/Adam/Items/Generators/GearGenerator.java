package com.truth.neogames.Adam.Items.Generators;

import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Adam.Items.GearPackage.Weapons.Weapon;
import com.truth.neogames.Adam.Items.GearPackage.Wearables.Armor;
import com.truth.neogames.Enums.Affixes.ArmorSuffix;
import com.truth.neogames.Enums.Affixes.Material;
import com.truth.neogames.Enums.Affixes.WeaponSuffix;
import com.truth.neogames.Enums.ArmorType;
import com.truth.neogames.Enums.WeaponType;
import com.truth.neogames.Enums.WornSlot;

import java.util.Random;

/**
 * Created by Adam on 11/25/2015.
 * Class Description: Generates weapons and armor for monster drops and chests.
 * This class is a work in progress.
 */
public class GearGenerator {
    private Random random = new Random();

    public GearGenerator() {

    }

    //WIP
    //HEAD(0), NECK(1), CHEST(2), MAINHAND(3), OFFHAND(4), HANDS(5), RING(6), LEGS(7), FEET(8), AMMO(9);
    public Gear getRandom() {
        int slotNum = random.nextInt(9);
        Gear g;
        switch(slotNum) {
            case 0: return new Armor(WornSlot.HEAD, getRandomGearMaterial(), getRandomArmorSuffix(), getRandomArmorType());
            case 1: return new Armor(WornSlot.NECK, getRandomGearMaterial(), getRandomArmorSuffix(), getRandomArmorType());
            case 2: return new Armor(WornSlot.CHEST, getRandomGearMaterial(), getRandomArmorSuffix(), getRandomArmorType());
            case 3: return new Weapon(getRandomGearMaterial(), getRandomWeaponSuffix(), getRandomWeaponType());
            case 4: return new Weapon(getRandomGearMaterial(), getRandomWeaponSuffix(), getRandomWeaponType());
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
        }
        return null;
    }

    public Material getRandomGearMaterial() {
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

    public WeaponType getRandomWeaponType() {
        int number = random.nextInt(14);
        switch(number) {
            case 0: return WeaponType.SWORD;
            case 1: return WeaponType.MACE;
            case 2: return WeaponType.DAGGER;
            case 3: return WeaponType.SCIMITAR;
            case 4: return WeaponType.BATTLEAXE;
            case 5: return WeaponType.WARHAMMER;
            case 6: return WeaponType.BROADSWORD;
            case 7: return WeaponType.PIKE;
            case 8: return WeaponType.HALBERD;
            case 9: return WeaponType.FLAIL;
            case 10: return WeaponType.BOW;
            case 11: return WeaponType.CROSSBOW;
            case 12: return WeaponType.STAFF;
            case 13: return WeaponType.WAND;
            default: return null;
        }
    }

    public WeaponSuffix getRandomWeaponSuffix() {
        boolean hasSuffix = random.nextBoolean();
        int number = random.nextInt(14);
        if(hasSuffix) {
            switch(number) {
                case 0: return WeaponSuffix.TRIUMPH;
                case 1: return WeaponSuffix.FEROCITY;
                case 2: return WeaponSuffix.VICTORY;
                case 3: return WeaponSuffix.CHAOS;
                case 4: return WeaponSuffix.EONS;
                case 5: return WeaponSuffix.OBLIVION;
                case 6: return WeaponSuffix.INCANDESCENCE;
                case 7: return WeaponSuffix.RADIANCE;
                case 8: return WeaponSuffix.TWILIGHT;
                case 9: return WeaponSuffix.SHADOW;
                case 10: return WeaponSuffix.FLAME;
                case 11: return WeaponSuffix.BURNING;
                case 12: return WeaponSuffix.ICE;
                case 13: return WeaponSuffix.FREEZING;
                default: return null;
            }
        }
        else {
            return WeaponSuffix.NONE;
        }
    }

    public ArmorSuffix getRandomArmorSuffix() {
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

    public ArmorType getRandomArmorType() {
        int number = random.nextInt(15);
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
            default: return null;
        }
    }
}
