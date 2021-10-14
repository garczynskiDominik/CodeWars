package codeWars.sumsOfParts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumsOfParts {
    public static void main(String[] args) {
        int[] ls = {0, 1, 3, 6, 10};
        Arrays.stream(sumParts(ls))
                .forEach(System.out::println);
    }

    public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length+1];
        for(int i = ls.length-1; i >= 0; --i) {
            result[i] = result[i+1] + ls[i];
        }
        return result;
    }
}

/**
 * Let us consider this example (array written in general format):
 * <p>
 * ls = [0, 1, 3, 6, 10]
 * <p>
 * Its following parts:
 * <p>
 * ls = [0, 1, 3, 6, 10]
 * ls = [1, 3, 6, 10]
 * ls = [3, 6, 10]
 * ls = [6, 10]
 * ls = [10]
 * ls = []
 * The corresponding sums are (put together in a list):
 * [20, 20, 19, 16, 10, 0]
 * <p>
 * The function parts_sums (or its variants in other languages)
 * will take as parameter
 * a list ls and return a list of the sums of its parts as defined above.
 * <p>
 * Other Examples:
 * ls = [1, 2, 3, 4, 5, 6]
 * parts_sums(ls) -> [21, 20, 18, 15, 11, 6, 0]
 * <p>
 * ls = [744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358]
 * parts_sums(ls) -> [10037855, 9293730, 9292795, 9292388, 9291934,
 * 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0]
 */