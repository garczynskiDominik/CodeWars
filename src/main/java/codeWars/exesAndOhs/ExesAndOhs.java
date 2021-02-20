package codeWars.exesAndOhs;

public class ExesAndOhs {
    public static void main(String[] args) {
        System.out.println(getXO("xxxx"));
    }

    public static boolean getXO(String str) {
        int x = 0;
        int o = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.toUpperCase().charAt(i) == 'O') o++;
            if (str.toUpperCase().charAt(i) == 'X') x++;
        }
        return x == o;
    }
}

