public class Calculator extends Main {
    double first;
    double second;

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
        if (second == 0) {
            System.out.println("Cannot divide by zero. Try again.");
        } else {
            double result = first / second;
            System.out.println("Result = " + result);
        }
    }
}
