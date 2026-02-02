class Calculator {
    static int total = 0;

    static void add(int a, int b) {
        total = a + b;
        System.out.println("Sum: " + total);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Calculator.add(5, 7);
        Calculator.add(10, 20);
    }
}
