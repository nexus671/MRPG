package com.truth.neogames.Utilities;

import java.util.Scanner;

/**
 * Created by Adam on 2/29/2016.
 * Class Description: Provides static Scanner object for reading keyboard input.
 */
public final class KBReader {
    private static Scanner kbReader = new Scanner(System.in);

    private KBReader() {
    }

    /**
     * Gets scanner.
     *
     * @return the scanner
     */
    public static Scanner getScanner() {
        return kbReader;
    }

    /**
     * Reset.
     */
    public static void reset() {
        kbReader = new Scanner(System.in);
    }
}
