package com.truth.neogames.Utilities;

/**
 * Created by Adam on 3/2/2016.
 * Class Description: Provides methods for manipulating strings.
 */
public class StringManip {
    public static String toLowercase(String str) {
        char firstLetter = str.charAt(0);
        str = str.substring(1);
        str = str.toLowerCase();
        return firstLetter + str;
    }
}
