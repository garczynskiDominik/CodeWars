package codeWars.detectPangram;

import java.util.*;

public class DetectPangram {
    public static void main(String[] args) {

        System.out.println(check("The quick brown fox jumps over the lazy dog."));
    }

    public static boolean check(String sentence) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                sb.append(sentence.charAt(i));
            }
        }
        List<String> list = Arrays.asList(sb.toString().toLowerCase().split(""));
        Set<String> setofLetters = new HashSet<>(list);

        if (setofLetters.size() == 26) {
            return true;
        }
        return false;
    }
}

/**
 * A pangram is a sentence that contains every single letter of the alphabet at least once.
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
 * because it uses the letters A-Z at least once (case is irrelevant).
 * <p>
 * Given a string, detect whether or not it is a pangram. Return True if it is,
 * False if not. Ignore numbers and punctuation.
 */