package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Adam.StatsPackage.Affix;
import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 11/9/2015.
 * Class Description:
 */
public enum WeaponPrefixName {
    NONE, DRACONIC, EXILED, WICKED, VICIOUS, HONED, GLEAMING(ElementalType.LIGHT), SHROUDED(ElementalType.DARK),
    BLAZING(ElementalType.FIRE), FRIGID(ElementalType.FROST);

    private ElementalType elementalType;
    private String lowercase;

    WeaponPrefixName() {
        elementalType = ElementalType.NONE;
    }

    WeaponPrefixName(ElementalType elementalType) {
        this.elementalType = elementalType;
    }

    public ElementalType getElementalType() {
        return elementalType;
    }

    public boolean isElemental() {
        return elementalType == ElementalType.NONE;
    }

    public String getLowercase() {
        return lowercase;
    }

    public void setLowercase(String lowercase) {
        this.lowercase = lowercase;
    }

    private void findString(Affix name) {
        String str = name.toString();
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(i > 0) {
                chars[i] = Character.toLowerCase(c);
            }
        }
        lowercase = str;
    }
}
