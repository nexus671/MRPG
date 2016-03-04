package com.truth.neogames.Ahmane.Professions;

import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStats;
import com.truth.neogames.Ahmane.Abilities.Ability;
import com.truth.neogames.Ahmane.Abilities.ActiveAbility;
import com.truth.neogames.Enums.AbilityType;
import com.truth.neogames.Enums.ProfessionName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class Profession extends EntityStats {
    /**
     * Barbarian
     * Barbarians excel in combat, possessing the martial prowess and fortitude to take on foes seemingly far superior to themselves.
     * With rage granting them boldness and daring beyond that of most other warriors, barbarians charge furiously into battle
     * and ruin all who would stand in their way.
     * Bard
     * Bards capably confuse and confound their foes while inspiring their allies to ever-greater daring. While accomplished with both weapons
     * and magic, the true strength of bards lies outside melee, where they can support their companions and undermine their
     * foes without fear of interruptions to their performances.
     * Fighter
     * Fighters excel at combat—defeating their enemies, controlling the flow of battle, and surviving such sorties themselves. While their
     * specific weapons and methods grant them a wide variety of tactics, few can match fighters for sheer battle prowess.
     * Cleric
     * More than capable of upholding the honor of their deities in battle, clerics often prove stalwart and capable combatants. Their true strength
     * lies in their capability to draw upon the power of their deities, whether to increase their own and their allies' prowess in battle, to vex
     * their foes with divine magic, or to lend healing to companions in need.
     * Paladin
     * Paladins serve as beacons for their allies within the chaos of battle. While deadly opponents of evil, they can also empower goodly souls to
     * aid in their crusades. Their magic and martial skills also make them well suited to defending others and blessing the fallen
     * with the strength to continue fighting.
     * Ranger
     * Ranger are deft skirmishers, either in melee or at range, capable of skillfully dancing in and out of battle. Their abilities allow them to
     * deal significant harm to specific types of foes, but their skills are valuable against all manner of enemies.
     * Rogue
     * Rogues excel at moving about unseen and catching foes unaware, and tend to avoid head-to-head combat. Their varied skills and abilities
     * allow them to be highly versatile, with great variations in expertise existing between different rogues. Most, however, excel in overcoming hindrances
     * of all types, from unlocking doors and disarming traps to outwitting magical hazards and conning dull-witted opponents.
     * Sorcerer
     * Sorcerers excel at casting a selection of favored spells frequently, making them powerful battle mages. As they become familiar with a specific and ever-widening
     * set of spells, sorcerers often discover new and versatile ways of making use of magics other spellcasters might overlook.
     * Their bloodlines also grant them additional abilities, assuring that no two sorcerers are ever quite alike.
     * Druid
     * While some druids might keep to the fringe of battle, allowing companions and summoned creatures to fight while they confound foes with the powers of nature,
     * others transform into deadly beasts and savagely wade into combat. Druids worship personifications of elemental forces, natural powers, or nature itself.
     * Typically this means devotion to a nature deity, though druids are just as likely to revere vague spirits, animalistic demigods, or even specific
     * awe-inspiring natural wonders.
     */
    protected ProfessionName name;

    protected ArrayList<Ability> unlockedAbilities = new ArrayList<Ability>();

    protected ArrayList<Ability> abilities = new ArrayList<Ability>();

    public ProfessionName getProfessionName() {
        return name;
    }

    public void setName(ProfessionName name) {
        this.name = name;
    }

    public ArrayList<Ability> getUnlockedAbilities() {
        return unlockedAbilities;
    }

    public void setUnlockedAbilities(ArrayList<Ability> unlockedAbilities) {
        this.unlockedAbilities = unlockedAbilities;
    }

    public List<ActiveAbility> getUnlockedActiveAbilities() {
        List<ActiveAbility> abilities = new ArrayList<ActiveAbility>();
        for (Ability a : unlockedAbilities) {
            if ((a.getType() == AbilityType.AOE) || (a.getType() == AbilityType.TARGETED)) {
                abilities.add((ActiveAbility) a);
            }
        }
        return abilities;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "name=" + name +
                ", unlockedAbilities=" + unlockedAbilities +
                ", abilities=" + abilities +
                '}';
    }
}
