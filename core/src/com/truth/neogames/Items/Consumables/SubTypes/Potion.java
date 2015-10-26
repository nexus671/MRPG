package com.truth.neogames.Items.Consumables.SubTypes;

import com.truth.neogames.Items.Consumables.Consumable;
import com.truth.neogames.StatsPackage.Stat;

import java.util.HashSet;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class Potion extends Consumable {
    private double flatAmount; //the flat amount of increase
    private double percentAmount; //the percentage increase in the stat
    private HashSet<Stat> stats; //the stats that are affected
}
