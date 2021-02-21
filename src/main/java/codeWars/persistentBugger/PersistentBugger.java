package codeWars.persistentBugger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(39));

    }

    public static int persistence(long n) {
        int counter = 0;
        while (n > 9) {
            List<Integer> vector = new ArrayList<>();
            counter++;

            while (n > 0) {
                vector.add((int) (n % 10));
                n /= 10;
            }
            int result = 1;
            for (Integer integer : vector) {
                result *= integer;
            }
            n = result;
        }
        return counter ;
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
