package codeWars.breakCamelCase;

public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase(" "));
    }

    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
