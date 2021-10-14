package codeWars.triangleTester;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TriangleTester {
    public static void main(String[] args) {

        System.out.println(isTriangle(7, 2, 2));
    }

    public static boolean isTriangle(int a, int b, int c) {

        List<Integer> sideLegths = Arrays.asList(a, b, c);
        Collections.sort(sideLegths);

        if (sideLegths.get(2) < sideLegths.get(1) + sideLegths.get(1)) {
            return true;
        }
        return false;
    }
}

/**
 * Implement a method that accepts 3 integer values a, b, c.
 * The method should return true if a triangle can be built
 * with the sides of given length and false in any other case.
 * <p>
 * (In this case, all triangles must have surface greater than 0 to be accepted).
 */
