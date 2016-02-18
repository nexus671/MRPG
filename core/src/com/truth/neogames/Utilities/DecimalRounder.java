package com.truth.neogames.Utilities;

import java.text.DecimalFormat;

/**
 * Created by Adam on 2/17/2016.
 * Class Description: Provides a static method for rounding a floating point number
 * to two decimal places.
 */
public class DecimalRounder {
    private static DecimalFormat rounder = new DecimalFormat("0.00");

    public static String round(double a) {
        return rounder.format(a);
    }
}
