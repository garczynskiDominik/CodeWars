package src.main.java.rekrutacje.lux;

@FunctionalInterface
public interface AnyInterface {

    void testA();

    default void testB(){
        System.out.println("TestB");
    }
}
