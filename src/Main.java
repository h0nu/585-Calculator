import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;

            //Print menu and take selection input
       do {
           System.out.println("\nWelcome to my Basic Calculator\n" + "==============================\n" +
                   "1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit\n");
           System.out.print("Enter selection: ");
           selection = scanner.nextInt();
           if (selection == 5) {
               System.out.println("Goodbye.");
               System.exit(1);
           }

           System.out.print("Enter first number: ");
           double first = scanner.nextDouble();
           System.out.print("Enter second number: ");
           double second = scanner.nextDouble();

           switch (selection) {
               case 1:
                   add(first, second);
                   break;

               case 2:
                   subtract(first, second);
                   break;

               case 3:
                   multiply(first, second);
                   break;

               case 4:
                   divide(first, second);
                   break;

               case 5:
                   System.out.println("Exiting...");
                   break;

               default:
                   System.out.println("Invalid option. Try again.");
                   break;
           }
       } while (selection >= 5);
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