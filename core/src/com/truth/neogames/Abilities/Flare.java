package com.truth.neogames.Abilities;

/**
 * Created by Ahmane on 10/23/2015.
 */
public class Flare extends Spell {
    private final String name = "Flare";
    private final String desc = "Creates a burst of light. If you cause the light to burst in front of a single creature, that creature is dazzled for 1 turn unless it makes a successful Fortitude save. " +
            "Sightless creatures, as well as creatures already dazzled, are not affected by flare.";
    private final String school = "Evocation";
    private final int castTime = 1;
    private final String range = "Close";
    private final int duration = 0;
    private final String savingThrow = "Fortitude";
    private final boolean resistible = true;
    /**
     * Need to create Status Effects: Dazzled
     *
     * Desc: The creature is unable to see well because of over-stimulation of the eyes.
     *
     * Effect:A dazzled creature takes a –1 penalty on attack rolls and sight-based Perception checks.
     **/

}
