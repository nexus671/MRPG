package com.truth.neogames.Effects.StatusAilments;


import com.truth.neogames.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class Stun extends Ailment {
    private int duration;
    private LivingEntity e;



    /**
     * Instantiates a new Stun.
     *
     * @param duration the duration
     * @param e        the e
     */
    public Stun(int duration, LivingEntity e) {
        super(e);
        this.duration = duration;
        this.e = e;
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        Destroy();
                    }
                },
                duration * 1000
        );
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Stun{" +
                "duration=" + duration +
                ", e=" + e +
                '}';
    }
}
