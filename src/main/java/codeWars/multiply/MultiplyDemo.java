package codeWars.multiply;

public class MultiplyDemo {
    public static void main(String[] args) {
        System.out.println(multiply(5D, 6D));
    }

    public static Double multiply(Double a, Double b) {
        return (a == null || b == null) ? null : a * b;
    }
}
