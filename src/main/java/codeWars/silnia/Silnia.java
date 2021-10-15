package src.main.java.codeWars.silnia;

public class Silnia {
    public static void main(String[] args) {
        final int NUMBER = 6;
        long start = System.nanoTime();


        System.out.println(silnia(NUMBER));
        long elapsed = System.nanoTime();
        System.out.println(elapsed - start);
        System.out.println(silniaRek(6));
    }

    public static int silnia(int number) {

        final int start = 1;
        int result = 1;
        for (int i = number; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    public static int silniaRek(int number) {
        if (number <= 1) {
            return 1;
        }else{
            return number* silniaRek(number-1);
        }
    }

}
