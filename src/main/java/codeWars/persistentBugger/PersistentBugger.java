package codeWars.persistentBugger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(39));

    }

    public static int persistence(long n) {

        long m = 1;
        long r = n;
        if (r / 10 == 0)
            return 0;
        for (r = n; r != 0; r /= 10)
            m *= r % 10;
        return persistence(m) + 1;
    }
}


/**
 * Write a function, persistence, that takes in a positive parameter
 * num and returns its multiplicative persistence, which is the
 * number of times you must multiply the digits in num until you
 * reach a single digit.
 * <p>
 * For example:
 * persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
 * // and 4 has only one digit
 */
