package com.truth.neogames.AI;

import com.truth.neogames.Entities.SubTypes.Monster;
import com.truth.neogames.EnvironmentPackage.BattleGrid;

/**
 * Created by acurr on 3/21/2016.
 */
public abstract class Routine {
    /**
     * The State.
     */
    protected RoutineState state;

    /**
     * Instantiates a new Routine.
     */
    protected Routine() {
    }

    /**
     * Start.
     */
    public void start() {
        this.state = RoutineState.Running;
    }

    /**
     * Reset.
     */
    public abstract void reset();

    /**
     * Act.
     *
     * @param mon the mon
     * @param b   the b
     */
    public abstract void act(Monster mon, BattleGrid b);

    /**
     * Succeed.
     */
    protected void succeed() {
        this.state = RoutineState.Success;
    }

    /**
     * Fail.
     */
    protected void fail() {
        this.state = RoutineState.Failure;
    }

    /**
     * Is success boolean.
     *
     * @return the boolean
     */
    public boolean isSuccess() {
        return state.equals(RoutineState.Success);
    }

    /**
     * Is failure boolean.
     *
     * @return the boolean
     */
    public boolean isFailure() {
        return state.equals(RoutineState.Failure);
    }

    /**
     * Is running boolean.
     *
     * @return the boolean
     */
    public boolean isRunning() {
        return state.equals(RoutineState.Running);
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public RoutineState getState() {
        return state;
    }

    /**
     * The enum Routine state.
     */
    public enum RoutineState {
        /**
         * Success routine state.
         */
        Success,
        /**
         * Failure routine state.
         */
        Failure,
        /**
         * Running routine state.
         */
        Running
    }
}
