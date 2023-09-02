public class Calculator {
    private double first;
    private double second;

    public Calculator(double first, double second) {
        this.first = first;
        this.second = second;
    }

    static void add(double first, double second) {
        double result = first + second;
        System.out.println("Result = " + result);
    }

    static void subtract(double first, double second) {
        double result = first - second;
        System.out.println("Result = " + result);
    }

    static void multiply(double first, double second) {
        double result = first * second;
        System.out.println("Result = " + result);
    }

    static void divide(double first, double second) {
        double result = first / second;
        System.out.println("Result = " + result);
    }
}
