import java.util.*;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int selection;
        double first, second;

        //Print menu and take selection input
        do {
            System.out.println("""

                    Welcome to my Basic Calculator
                    ==============================
                    1. Add
                    2. Subtract
                    3. Multiply
                    4. Divide
                    5. Exit
                    """);
            System.out.print("Enter selection: ");
            selection = scanner.nextInt();

            if (selection != 5) {
                System.out.print("Enter first number: ");
                first = scanner.nextDouble();
                System.out.print("Enter second number: ");
                second = scanner.nextDouble();
            } else {
                System.out.println("Goodbye.");
                break;
            }

            switch (selection) {
                case 1 -> Calculator.add(first, second);
                case 2 -> Calculator.subtract(first, second);
                case 3 -> Calculator.multiply(first, second);
                case 4 -> Calculator.divide(first, second);
                default -> System.out.println("Invalid menu option. Try again.");
            }
        } while (selection != 5);
    }
}