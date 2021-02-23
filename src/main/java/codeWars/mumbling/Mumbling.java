package codeWars.mumbling;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }

    public static String accum(String s) {
        List<String> lettersFromText = Arrays.asList(s.split(""));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lettersFromText.size(); i++) {
            int counter = 1;
            sb.append(lettersFromText.get(i).toUpperCase());

            while (counter <= i) {
                sb.append(lettersFromText.get(i).toLowerCase());
                counter++;
            }
            if (i < lettersFromText.size() - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
}


/**
 * his time no story, no theory. The examples below show you how to write function accum:
 * <p>
 * Examples:
 * <p>
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */
