package com.truth.neogames.AI;

import com.truth.neogames.Entities.SubTypes.Monster;
import com.truth.neogames.EnvironmentPackage.BattleGrid;

/**
 * Created by acurr on 3/21/2016.
 */
public abstract class Routine {
    protected RoutineState state;

    protected Routine() {
    }

    public void start() {
        this.state = RoutineState.Running;
    }

    public abstract void reset();

    public abstract void act(Monster mon, BattleGrid b);

    protected void succeed() {
        this.state = RoutineState.Success;
    }

    protected void fail() {
        this.state = RoutineState.Failure;
    }

    public boolean isSuccess() {
        return state.equals(RoutineState.Success);
    }

    public boolean isFailure() {
        return state.equals(RoutineState.Failure);
    }

    public boolean isRunning() {
        return state.equals(RoutineState.Running);
    }

    public RoutineState getState() {
        return state;
    }

    public enum RoutineState {
        Success,
        Failure,
        Running
    }
}
