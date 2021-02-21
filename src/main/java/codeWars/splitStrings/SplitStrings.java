package codeWars.splitStrings;

import java.util.Arrays;
import java.util.List;

public class SplitStrings {
    public static void main(String[] args) {
        String text = "abc";
        Arrays.stream(solution(text)).
                forEach(System.out::println);

    }

    public static String[] solution(String s) {
        s = (s.length() % 2 == 0)?s:s+"_";
        return s.split("(?<=\\G.{2})");
    }
}

/**
 * Complete the solution so that it splits the string into
 * pairs of two characters. If the string contains
 * an odd number of characters then it should replace
 * the missing second character of the final pair with an underscore ('_').
 * <p>
 * Examples:
 * <p>
 * StringSplit.solution("abc") // should return {"ab", "c_"}
 * StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
 */
