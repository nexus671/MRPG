package com.truth.neogames.Abilities;

import java.util.Random;

/**
 * Created by Ahmane on 10/23/2015.
 */
public class AcidSplash extends Spell {
    private final String name = "Acid Splash";
    private final String desc = "You fire a small orb of acid at the target. You must succeed on a ranged touch attack to hit your target. The orb deals 1-3 points of acid damage.";
    private final String school = "Conjuration";
    private final int castTime = 1;
    private final String range = "Close";
    private final int duration = 0;
    private final String savingThrow = "None";
    private final boolean resistible = false;
    private final String target = "Single";
    private Random random;

    public int damage() {
        return this.random.nextInt(3) + 1;
    }

}
