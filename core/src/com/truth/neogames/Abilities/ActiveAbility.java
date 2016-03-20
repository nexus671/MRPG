package com.truth.neogames.Abilities;

import com.truth.neogames.Enums.AbilityRange;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acurr on 2/17/2016.
 */
public abstract class ActiveAbility extends Ability {
    protected AbilityRange range;
    protected ArrayList<com.truth.neogames.Targets.Target> targets = new ArrayList<com.truth.neogames.Targets.Target>();

    public abstract void use(List<com.truth.neogames.Entities.SubTypes.Monster> monsters);

    public AbilityRange getRange() {
        return range;
    }

    public ArrayList<com.truth.neogames.Targets.Target> getTargets() {
        return targets;
    }

    public void setTargets(ArrayList<com.truth.neogames.Targets.Target> targets) {
        this.targets = targets;
    }

    @Override
    public String toString() {
        return "ActiveAbility{" +
                "range=" + range +
                ", targets=" + targets +
                '}';
    }
}
