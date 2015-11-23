package com.truth.neogames.Enums.Affixes;

/**
 * Created by Adam on 11/9/2015.
 * Class Description: The material that a gear object is made of. Each material has a different
 * level requirement.
 */
public enum GearMaterial {
    NONE(1, ""), BRONZE(1, "Bronze"), IRON(10, "Iron"), STEEL(20, "Steel"),  MITHRIL(30, "Mithril"),
    GOLDEN(40, "Golden"), LAMINAR(50, "Laminar"), PLATED(60, "Plated"), OBSIDIAN(70, "Obsidian"),
    CRYSTAL(80, "Crystal"), DRACONIC(90, "Draconic");

    private int level;
    private String lowercase;

    GearMaterial(int level, String lowercase) {
        this.level = level;
        this.lowercase = lowercase;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLowercase() {
        return lowercase;
    }

    public void setLowercase(String lowercase) {
        this.lowercase = lowercase;
    }


}
