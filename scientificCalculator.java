// importing the calculator package
package calculator;
// importing the scanner class
import java.util.Scanner;

public class scientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num, result;
        int choice;
       // asking the user for a number
        System.out.print("Enter a number: ");
        num = scanner.nextDouble();
       // once the user entered the number then the user will be asked about the operation that needs to be done on the number
        System.out.println("\nSelect an operation:");
        System.out.println("1. Sine");
        System.out.println("2. Cosine");
        System.out.println("3. Tangent");
        System.out.println("4. Square Root");
        System.out.println("5. Logarithm");
        System.out.println("6. Exponential");

        System.out.print("\nEnter your choice (1-6): ");
        choice = scanner.nextInt();
       // the switch statement is doing six cases and which statement will be executed depends on the user need
        switch (choice) {
            case 1:
                result = Math.sin(num);
                System.out.println("Sine: " + result);
                break;
            case 2:
                result = Math.cos(num);
                System.out.println("Cosine: " + result);
                break;
            case 3:
                result = Math.tan(num);
                System.out.println("Tangent: " + result);
                break;
            case 4:
                if (num >= 0) {
                    result = Math.sqrt(num);
                    System.out.println("Square Root: " + result);
                } else {
                    System.out.println("Error: Invalid input for square root.");
                }
                break;
            case 5:
                if (num > 0) {
                    result = Math.log10(num);
                    System.out.println("Logarithm (base 10): " + result);
                } else {
                    System.out.println("Error: Invalid input for logarithm.");
                }
                break;
            case 6:
                result = Math.exp(num);
                System.out.println("Exponential: " + result);
                break;
            default:
                System.out.println("Error: Invalid choice.");
                break;
        }

        scanner.close();
    }
}
