package com.truth.neogames.Ahmane.Abilitys;

import com.truth.neogames.Ahmane.Effects.Effect;
import com.truth.neogames.Ahmane.Targets.Target;
import com.truth.neogames.Enums.AbilityRange;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acurr on 2/17/2016.
 */
public abstract class Ability {
    private static AbilityRange r;
    protected int level = 1;
    protected int cost;
    protected boolean passive;
    protected List<Effect> effects = new ArrayList<Effect>();
    protected List<Target> targets = new ArrayList<Target>();
    private int duration;
    private int area;


}
