package src.main.java.rekrutacje.lux;


public class CharacterCounter {
    private String message;

    public CharacterCounter(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMostFrequentCharacter() {

        String messagewithoutWhite = message.replaceAll(" ", "");

        String input = messagewithoutWhite.toLowerCase();
        int[] alphabetArray = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int value = (int) ch;
            if (value >= 97 && value <= 122) {
                alphabetArray[ch - 'a']++;
            }
        }
        int max = 0;
        char mostFreq = 0;

        for (int i = 0; i < alphabetArray.length; i++) {

            if (alphabetArray[i] > 0) {
                char ch = (char) (i + 97);
                if (alphabetArray[i] > max) {
                    max = alphabetArray[i];
                    mostFreq = ch;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(mostFreq)
                .append(",")
                .append(max);

        return stringBuilder.toString();
    }
}
