package com.truth.neogames.Effects.StatusAilments;

import com.truth.neogames.Effects.Effect;
import com.truth.neogames.Entities.LivingEntity;

/**
 * Created by acurr on 3/19/2016.
 */
public abstract class Ailment extends Effect {
    LivingEntity e;

    public Ailment(LivingEntity e) {
        this.e = e;
    }

    public void Destroy() {
        e.removeAilment(this);
    }
}
