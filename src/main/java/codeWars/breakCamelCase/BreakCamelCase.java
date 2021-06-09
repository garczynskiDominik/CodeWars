package codeWars.breakCamelCase;

public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase(" "));
    }

    public static String camelCase(String input) {
        int character;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            character = input.charAt(i);
            if (character >=65 && character<=90) {
                stringBuilder.append(" ");
            }
                stringBuilder.append( input.charAt(i));
        }
        return stringBuilder.toString();
    }
}
