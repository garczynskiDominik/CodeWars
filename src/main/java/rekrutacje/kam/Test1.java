package src.main.java.rekrutacje.kam;

public class Test1 implements IntValidator{
    @Override
    public boolean validateInt(int number) {
        return  (number % 2 == 0);
    }
}
