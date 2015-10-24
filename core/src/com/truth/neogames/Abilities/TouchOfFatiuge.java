package com.truth.neogames.Abilities;

import java.util.Random;

/**
 * Created by Ahmane on 10/23/2015.
 */
public class TouchOfFatiuge extends Spell {
    private final String name = "Touch of Fatigue";
    private final String desc = "You channel negative energy through your touch, fatiguing the target. You must succeed on a touch attack to strike a target. The subject is immediately fatigued for the spell's duration.";
    private final String school = "Necromancy";
    private final int castTime = 1;
    private final String range = "Touch";
    private final String savingThrow = "Fortitude";
    private final boolean resistible = true;
    private final String target = "Single";
    private Random random;

    public TouchOfFatiuge(int level) {
        this.setDuration(level);

    }
    public int damage() {
        return this.random.nextInt(3) + 1;
    }

    private void setDuration(int level) {
        duration = level;
    }

}
