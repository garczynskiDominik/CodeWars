package src.main.java.rekrutacje.kam;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


        Test1 test1 = new Test1();
        Test2 test2 = new Test2();


//        dateValidatorTest1(test1);
//        System.out.println("--------------");
//        dateValidatorTest2(test2);
//        System.out.println("--------------");
        dateValidatorTest2(test1);
    }

    public static void dateValidatorTest1(IntValidator intValidator) {
        for (int i = 0; i < 20; i++) {
            printProces(i, intValidator);
        }
    }

    public static void dateValidatorTest2(IntValidator intValidator) {

        IntStream.range(0, 20)
                .forEach(x -> printProces(x, intValidator));
    }

    public static void printProces(int x, IntValidator intValidator) {
        System.out.println(x + ", " + intValidator.validateInt(x));

    }
}
