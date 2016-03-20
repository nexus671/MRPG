package com.truth.neogames.Professions;

import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.Enums.ProfessionName;
import com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStats;

import java.util.Arrays;

/**
 * Created by Ahmane on 10/24/2015.
 * <p/>
 * * Barbarian
 * Barbarians excel in combat, possessing the martial prowess and fortitude to take on foes seemingly far superior to themselves.
 * With rage granting them boldness and daring beyond that of most other warriors, barbarians charge furiously into battle
 * and ruin all who would stand in their way.
 */
public class Barbarian extends Profession {
    private static final int MAXLEVEL = 18;
    private final int[] levelrequirements = {1, 1};
    private EntityStats stats;
    private double exp;
    private int level = 1;
    private int sp = 1;

    public Barbarian(LivingEntity e) {
        name = ProfessionName.BARBARIAN;
        stats = e.getStats();

        com.truth.neogames.Abilities.BasicAttack ablitiy1 = new com.truth.neogames.Abilities.BasicAttack(level, e);
        abilities.add(ablitiy1);
        unlockedAbilities.add(ablitiy1);
        com.truth.neogames.Abilities.BarbarianPassive ablitiy2 = new com.truth.neogames.Abilities.BarbarianPassive(level, e);
        abilities.add(ablitiy2);
        unlockedAbilities.add(ablitiy2);
        com.truth.neogames.Abilities.HeavyStrike ablitiy3 = new com.truth.neogames.Abilities.HeavyStrike(level, e);
        abilities.add(ablitiy3);
        unlockedAbilities.add(ablitiy3);

    }

    //Passives


    //Actives

    public static int getMAXLEVEL() {
        return MAXLEVEL;
    }

    public EntityStats getStats() {
        return stats;
    }

    public void setStats(EntityStats stats) {
        this.stats = stats;
    }

    @Override
    public double getExp() {
        return exp;
    }

    @Override
    public void setExp(double exp) {
        this.exp = exp;
    }


    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Barbarian{" +
                "MAXLEVEL=" + MAXLEVEL +
                ", stats=" + stats +
                ", exp=" + exp +
                ", level=" + level +
                ", sp=" + sp +
                ", levelrequirements=" + Arrays.toString(levelrequirements) +
                '}';
    }
}
