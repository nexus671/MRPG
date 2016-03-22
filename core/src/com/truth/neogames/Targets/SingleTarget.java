package com.truth.neogames.Targets;

import com.truth.neogames.Entities.LivingEntity;

/**
 * Created by acurr on 2/17/2016.
 */
public class SingleTarget extends Target {
    /**
     * The Entity.
     */
    LivingEntity entity;
    /**
     * The Friendly fire.
     */
    boolean friendlyFire;

    /**
     * Instantiates a new Single target.
     *
     * @param entity       the entity
     * @param friendlyFire the friendly fire
     */
    public SingleTarget(LivingEntity entity, boolean friendlyFire) {
        this.entity = entity;
        this.friendlyFire = friendlyFire;
    }

    /**
     * Gets entity.
     *
     * @return the entity
     */
    public LivingEntity getEntity() {
        return entity;
    }

    /**
     * Sets entity.
     *
     * @param entity the entity
     */
    public void setEntity(LivingEntity entity) {
        this.entity = entity;
    }

    /**
     * Is friendly fire boolean.
     *
     * @return the boolean
     */
    public boolean isFriendlyFire() {
        return friendlyFire;
    }

    /**
     * Sets friendly fire.
     *
     * @param friendlyFire the friendly fire
     */
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
