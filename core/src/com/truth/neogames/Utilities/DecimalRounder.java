package com.truth.neogames.Utilities;

import java.text.DecimalFormat;

/**
 * Created by Adam on 2/17/2016.
 * Class Description: Provides a static method for rounding a floating point number
 * to two decimal places.
 */
public final class DecimalRounder {
    private static final DecimalFormat ROUNDER = new DecimalFormat("0.00");

    private DecimalRounder() {
    }

    /**
     * Round string.
     *
     * @param a the a
     * @return the string
     */
    public static String round(double a) {
        return ROUNDER.format(a);
    }
}
