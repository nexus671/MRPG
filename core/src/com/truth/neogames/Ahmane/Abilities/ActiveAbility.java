package com.truth.neogames.Ahmane.Abilities;

import com.truth.neogames.Ahmane.Entities.SubTypes.Monster;
import com.truth.neogames.Ahmane.Targets.Target;
import com.truth.neogames.Enums.AbilityRange;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acurr on 2/17/2016.
 */
public abstract class ActiveAbility extends Ability {
    protected AbilityRange range;
    protected ArrayList<Target> targets = new ArrayList<Target>();

    public abstract void use(List<Monster> monsters);

    public AbilityRange getRange() {
        return range;
    }

    public ArrayList<Target> getTargets() {
        return targets;
    }

    public void setTargets(ArrayList<Target> targets) {
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
