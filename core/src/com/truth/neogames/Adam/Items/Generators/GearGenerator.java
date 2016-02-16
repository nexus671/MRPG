package com.truth.neogames.Adam.Items.Generators;

import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Adam.Items.GearPackage.Weapons.Weapon;
import com.truth.neogames.Adam.Items.GearPackage.Wearables.Armor;
import com.truth.neogames.Adam.Items.GearPackage.Wearables.Jewelry;
import com.truth.neogames.Enums.WornSlot;

import java.util.Random;

/**
 * Created by Adam on 11/25/2015.
 * Class Description: Generates weapons and armor for monster drops and chests.
 */
public class GearGenerator {
    private static Random random = new Random();

    public Gear getRandom() {
        int slotNum = random.nextInt(9);
        switch (slotNum) {
            case 0:
                return new Armor(WornSlot.HEAD, EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.HEAD));
            case 1:
                return new Jewelry(EnumPicker.getRandomJewelryMetal(), EnumPicker.getRandomJewelryGem(), EnumPicker.getRandomEntityStat(), false);
            case 2:
                return new Armor(WornSlot.CHEST, EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.CHEST));
            case 3:
                return new Weapon(EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomWeaponSuffix(), EnumPicker.getRandomWeaponType());
            case 4:
                return new Weapon(EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomWeaponSuffix(), EnumPicker.getRandomWeaponType());
            case 5:
                return new Armor(WornSlot.HANDS, EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.HANDS));
            case 6:
                return new Jewelry(EnumPicker.getRandomJewelryMetal(), EnumPicker.getRandomJewelryGem(), EnumPicker.getRandomEntityStat(), true);
            case 7:
                return new Armor(WornSlot.LEGS, EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.LEGS));
            case 8:
                return new Armor(WornSlot.FEET, EnumPicker.getRandomGearMaterial(), EnumPicker.getRandomArmorSuffix(), EnumPicker.getRandomArmorType(WornSlot.FEET));
        }
        return null;
    }
}
