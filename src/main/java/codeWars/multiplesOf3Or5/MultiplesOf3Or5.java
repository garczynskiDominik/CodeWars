package codeWars.multiplesOf3Or5;

import java.util.stream.IntStream;

public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }
}

/**
 * If we list all the natural numbers below 10 that are
 * multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of
 * these multiples is 23.
 * <p>
 * Finish the solution so that it returns the sum of
 * all the multiples of 3 or 5 below the number passed in.
 * <p>
 * Note: If the number is a multiple of both 3 and 5,
 * only count it once. Also, if a number is negative,
 */
