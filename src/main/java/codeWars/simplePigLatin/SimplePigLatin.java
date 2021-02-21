package codeWars.simplePigLatin;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class SimplePigLatin {
    public static void main(String[] args) {
        String str = "Pig latin is cool ?";
        System.out.println(pigIt(str));
    }

    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}

/**
 * Move the first letter of each word to the end of it,
 * then add "ay" to the end of the word. Leave punctuation marks untouched.
 * <p>
 * Examples
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 */
