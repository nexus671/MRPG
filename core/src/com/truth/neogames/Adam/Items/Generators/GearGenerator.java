package com.truth.neogames.Adam.Items.Generators;

import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Adam.Items.GearPackage.Weapons.Weapon;
import com.truth.neogames.Adam.Items.GearPackage.Wearables.Wearable;
import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.GearStats;
import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WeaponStatsPackage.WeaponStat;
import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WeaponStatsPackage.WeaponStats;
import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WearableStatsPackage.WearableStats;
import com.truth.neogames.Enums.Affixes.GearMaterial;
import com.truth.neogames.Enums.Affixes.WeaponSuffix;
import com.truth.neogames.Enums.Affixes.WearableSuffix;
import com.truth.neogames.Enums.WeaponStatName;
import com.truth.neogames.Enums.WeaponType;

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
    public Gear getRandom() {
        int slotNum = random.nextInt(9);
        Gear gear;
        GearMaterial material = getRandomGearMaterial();
        switch(slotNum) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: gear = new Weapon(new WeaponStats(material, getRandomWeaponSuffix(), getRandomWeaponType())); break;
        }
        return null;
    }

    public GearMaterial getRandomGearMaterial() {
        int number = random.nextInt(10);
        switch(number) {
            case 0: return GearMaterial.BRONZE;
            case 1: return GearMaterial.IRON;
            case 2: return GearMaterial.STEEL;
            case 3: return GearMaterial.MITHRIL;
            case 4: return GearMaterial.GOLDEN;
            case 5: return GearMaterial.LAMINAR;
            case 6: return GearMaterial.PLATED;
            case 7: return GearMaterial.OBSIDIAN;
            case 8: return GearMaterial.CRYSTAL;
            case 9: return GearMaterial.DRACONIC;
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

    public WearableSuffix getRandomWearableSuffix() {
        boolean hasSuffix = random.nextBoolean();
        int number = random.nextInt(13);
        if(hasSuffix) {
            switch(number) {
                case 0: return WearableSuffix.HARDINESS;
                case 1: return WearableSuffix.ENLIGHTENING;
                case 2: return WearableSuffix.BRAWLING;
                case 3: return WearableSuffix.APTITUDE;
                case 4: return WearableSuffix.PROSPERITY;
                case 5: return WearableSuffix.INCANDESCENCE;
                case 6: return WearableSuffix.RADIANCE;
                case 7: return WearableSuffix.TWILIGHT;
                case 8: return WearableSuffix.SHADOW;
                case 9: return WearableSuffix.FLAME;
                case 10: return WearableSuffix.BURNING;
                case 11: return WearableSuffix.ICE;
                case 12: return WearableSuffix.FREEZING;
                default: return null;
            }
        }
        else {
            return WearableSuffix.NONE;
        }
    }
}
