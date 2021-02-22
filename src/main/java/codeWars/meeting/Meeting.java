package codeWars.meeting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Meeting {
    public static void main(String[] args) {

        String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;" +
                "Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";

        System.out.println(meeting(s));
    }

    public static String meeting(String s) {
        int counter = 0;
        List<String> firstNamesAndLastNames = Arrays.asList(s.split(";"));

        while (counter < firstNamesAndLastNames.size()) {
            List<String> helper = Arrays.asList(firstNamesAndLastNames.get(counter).split(":"));
            firstNamesAndLastNames.set(counter, "(" + helper.get(1).toUpperCase() + ", " + helper.get(0).toUpperCase() + ")");
            counter++;
        }
        Collections.sort(firstNamesAndLastNames);

        StringBuilder sb = new StringBuilder();
        for (String lastNameAndFirstNAme : firstNamesAndLastNames) {
            sb.append(lastNameAndFirstNAme);

        }

        return sb.toString();
    }
}


/**
 * ohn has invited some friends. His list is:
 * <p>
 * s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
 * Could you make a program that
 * <p>
 * makes this string uppercase
 * gives it sorted in alphabetical order by last name.
 * When the last names are the same, sort them by first name.
 * Last name and first name of a guest come in the result between parentheses separated by a comma.
 * <p>
 * So the result of function meeting(s) will be:
 * <p>
 * "(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
 * It can happen that in two distinct families with the same family name two people have the same first name too.
 */
