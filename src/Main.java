import java.util.*;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int selection;
        double first, second;

        //Print menu and take selection input
        do {
            System.out.println("\nWelcome to my Basic Calculator\n" + "==============================\n" +
                    "1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit\n");
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
                case 1:
                    Calculator.add(first, second);
                    break;

                case 2:
                    Calculator.subtract(first, second);
                    break;

                case 3:
                    Calculator.multiply(first, second);
                    break;

                case 4:
                    Calculator.divide(first, second);
                    break;

                default:
                    System.out.println("Invalid menu option. Try again.");
                    break;
            }
        } while (selection != 5);
    }
}