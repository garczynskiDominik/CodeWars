package codeWars.reversedWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("The greatest victory is that which requires no battle"));

    }
    public static String reverseWords(String str){
        List Words = Arrays.asList(str.split(" "));
        Collections.reverse(Words);
        return String.join(" ", Words);
    }

}

/**
 * Complete the solution so that it reverses all of the words within the string passed in.
 *
 * Example:
 *
 * ReverseWords.reverseWords("The greatest victory is that which requires no battle");
 * // should return "battle no requires which that is victory greatest The"
 */
