package com.truth.neogames.Ahmane.Targets;

import com.truth.neogames.Ahmane.Entities.LivingEntity;

/**
 * Created by acurr on 2/17/2016.
 */
public class SingleTarget extends Target {
    LivingEntity entity;
    boolean friendlyFire;

    public SingleTarget(LivingEntity entity, boolean friendlyFire) {
        this.entity = entity;
        this.friendlyFire = friendlyFire;
    }

    public LivingEntity getEntity() {
        return entity;
    }

    public void setEntity(LivingEntity entity) {
        this.entity = entity;
    }

    public boolean isFriendlyFire() {
        return friendlyFire;
    }

    public void setFriendlyFire(boolean friendlyFire) {
        this.friendlyFire = friendlyFire;
    }

    @Override
    public String toString() {
        return "SingleTarget{" +
                "entity=" + entity +
                ", friendlyFire=" + friendlyFire +
                '}';
    }
}
