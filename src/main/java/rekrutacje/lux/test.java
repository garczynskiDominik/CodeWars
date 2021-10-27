package src.main.java.rekrutacje.lux;

public class test implements AnyInterface {

    public static void main(String[] args) {
        String message = "Welcome to this interview, !"
                + " What is the MOST frequent non-whitespace character in this String?";

        CharacterCounter characterCounter = new MostFrequentCharacterCounter(message);


        System.out.println(characterCounter.getMostFrequentCharacter());
    }

    @Override
    public void testA() {
        System.out.println("TestA");
    }
}
