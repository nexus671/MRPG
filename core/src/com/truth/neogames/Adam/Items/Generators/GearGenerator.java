package com.truth.neogames.Adam.Items.Generators;

import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Adam.Items.GearPackage.Weapons.Weapon;
import com.truth.neogames.Adam.Items.GearPackage.Wearables.Armor;
import com.truth.neogames.Adam.Items.GearPackage.Wearables.Jewelry;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Utilities.RandomNumber;

import java.util.ArrayList;

/**
 * Created by Adam on 11/25/2015.
 * Class Description: Generates weapons and armor for monster drops and chests.
 */
public class GearGenerator {
    ArrayList<EntityStatName> statsAffected;

    /**
     * Generates a random weapon object.
     *
     * @return A random weapon.
     */
    public static Weapon getRandomWeapon() {
        return new Weapon(EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomWeaponSuffix(), EnumPicker.getRandomWeaponType());
    }

    /**
     * Gets a random weapon based on level.
     *
     * @param level The level of the player.
     * @return A random weapon.
     */
    public static Weapon getWeapon(int level) {
        return new Weapon(EnumPicker.getGearMaterial(level), EnumPicker.getRandomWeaponSuffix(), EnumPicker.getRandomWeaponType());
    }

    public static Armor getRandomArmor(WornSlot slot) {
        switch (slot) {
            case RING:
            case NECK:
            case MAINHAND:
            case OFFHAND:
                return null;
            default:
                return new Armor(slot, EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(slot));
        }
    }

    public static Armor getArmor(int level, WornSlot slot) {
        switch (slot) {
            case RING:
            case NECK:
            case MAINHAND:
            case OFFHAND:
                return null;
            default:
                return new Armor(slot, EnumPicker.getGearMaterial(level), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(slot));
        }
    }

    /**
     * Gets a random gear object in any slot (except ammo).
     *
     * @return The random gear object.
     */
    public Gear getRandom() {
        int slotNum = RandomNumber.random.nextInt(9);
        switch (slotNum) {
            case 0:
                return new Armor(WornSlot.HEAD, EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.HEAD));
            case 1:
                int numStats = 1 + RandomNumber.random.nextInt(Jewelry.getMaxStats());
                addRandomStats(numStats);
                return new Jewelry(EnumPicker.getRandomJewelryMetal(), EnumPicker.getRandomJewelryGem(), statsAffected, false);
            case 2:
                return new Armor(WornSlot.CHEST, EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.CHEST));
            case 3:
            case 4:
                return new Weapon(EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomWeaponSuffix(), EnumPicker.getRandomWeaponType());
            case 5:
                return new Armor(WornSlot.GLOVES, EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.GLOVES));
            case 6:
                int i = 1 + RandomNumber.random.nextInt(Jewelry.getMaxStats());
                addRandomStats(i);
                return new Jewelry(EnumPicker.getRandomJewelryMetal(), EnumPicker.getRandomJewelryGem(), statsAffected, true);
            case 7:
                return new Armor(WornSlot.LEGS, EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.LEGS));
            case 8:
                return new Armor(WornSlot.FEET, EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.FEET));
        }
        return null;
    }

    public Jewelry getRandomJewelry() {
        boolean ring = RandomNumber.random.nextBoolean();
        int numStats = RandomNumber.random.nextInt(Jewelry.getMaxStats());
        addRandomStats(numStats);
        return new Jewelry(EnumPicker.getRandomJewelryMetal(), EnumPicker.getRandomJewelryGem(), statsAffected, ring);
    }

    public Jewelry getJewelry(int level) {
        boolean ring = RandomNumber.random.nextBoolean();
        int numStats = RandomNumber.random.nextInt(Jewelry.getMaxStats());
        addRandomStats(numStats);
        return new Jewelry(EnumPicker.getJewelryMetal(level), EnumPicker.getJewelryGem(level), statsAffected, ring);
    }

    public Jewelry getJewelry(int level, boolean isRing) {
        int numStats = RandomNumber.random.nextInt(Jewelry.getMaxStats());
        addRandomStats(numStats);
        return new Jewelry(EnumPicker.getJewelryMetal(level), EnumPicker.getJewelryGem(level), statsAffected, isRing);
    }

    /**
     * Returns a random gear object that scales based on the level.
     *
     * @param level The level of the player.
     * @return A random gear object.
     */
    public Gear getRandom(int level) {
        int slotNum = RandomNumber.random.nextInt(9);
        switch (slotNum) {
            case 0:
                return new Armor(WornSlot.HEAD, EnumPicker.getGearMaterial(level), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.HEAD));
            case 1:
                int numStats = 1 + RandomNumber.random.nextInt(Jewelry.getMaxStats());
                addRandomStats(numStats);
                return new Jewelry(EnumPicker.getJewelryMetal(level), EnumPicker.getJewelryGem(level), statsAffected, false);
            case 2:
                return new Armor(WornSlot.CHEST, EnumPicker.getGearMaterial(level), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.CHEST));
            case 3:
            case 4:
                return new Weapon(EnumPicker.getGearMaterial(level), EnumPicker.getRandomWeaponSuffix(), EnumPicker.getRandomWeaponType());
            case 5:
                return new Armor(WornSlot.GLOVES, EnumPicker.getGearMaterial(level), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.GLOVES));
            case 6:
                int i = 1 + RandomNumber.random.nextInt(Jewelry.getMaxStats());
                addRandomStats(i);
                return new Jewelry(EnumPicker.getJewelryMetal(level), EnumPicker.getJewelryGem(level), statsAffected, true);
            case 7:
                return new Armor(WornSlot.LEGS, EnumPicker.getGearMaterial(level), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.LEGS));
            case 8:
                return new Armor(WornSlot.FEET, EnumPicker.getGearMaterial(level), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.FEET));
        }
        return null;
    }

    //HEAD(0), NECK(1), CHEST(2), MAINHAND(3), OFFHAND(4), GLOVES(5), RING(6), LEGS(7), FEET(8), AMMO(9)
    public Gear getRandom(int level, WornSlot slot) {
        switch (slot) {
            case HEAD:
            case CHEST:
            case GLOVES:
            case LEGS:
            case FEET:
                return getArmor(level, slot);
            case MAINHAND:
            case OFFHAND:
                return getWeapon(level);
            case NECK:
                return getJewelry(level, false);
            case RING:
                return getJewelry(level, true);
        }
        return null;
    }

    /**
     * Adds the specified number of RandomNumber.random entity stat names to the ArrayList statsAffected.
     * Note: This method clears the contents of statsAffected upon method call.
     *
     * @param number The  number of stats to be placed into the statsAffected ArrayList.
     */
    private void addRandomStats(int number) {
        statsAffected = new ArrayList<EntityStatName>();
        statsAffected.add(EnumPicker.getRandomEntityStat());
        for (int i = 0; (i < number) && (i < Jewelry.getMaxStats()); i++) {
            EntityStatName statName = EnumPicker.getRandomEntityStat();
            if (statsAffected.contains(statName)) {
                i -= 1;
            } else {
                statsAffected.add(statName);
            }
        }
    }

    @Override
    public String toString() {
        return "GearGenerator{" +
                "statsAffected=" + statsAffected +
                '}';
    }
}
