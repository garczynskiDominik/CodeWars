package src.main.java.rekrutacje.kam;

public class Test2 implements IntValidator {
    @Override
    public boolean validateInt(int number) {
        return (number % 10 == 0);
    }
}
