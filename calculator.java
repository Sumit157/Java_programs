import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();

            System.out.println("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int add = num1 + num2;
                    System.out.println("The addition of two numbers is: " + add);
                    break;
                case 2:
                    int subtr = num1 - num2;
                    System.out.println("The subtraction of two numbers is: " + subtr);
                    break;
                case 3:
                    int multp = num1 * num2;
                    System.out.println("The multiplication of two numbers is: " + multp);
                    break;
                case 4:
                    if (num2 != 0) {
                        int divs = num1 / num2;
                        System.out.println("The division of two numbers is: " + divs);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    keepRunning = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid selection. Please choose a number between 1 and 5.");
                    break;
            }
            System.out.println(); // Print a new line for better readability
        }

        sc.close();
    }
}