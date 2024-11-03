import java.util.Scanner;
public class programm01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt(); //enter first number
        
        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt(); //enter second number


        // Comparing the two numbers
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }
        // Performing arithmetic operations
        System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
        
        // Check if division can be performed
        if (b != 0) {
            System.out.println("Division: " + a + " / " + b + " = " + ((double) a / b));
        } else {
            System.out.println("Division by zero is not possible");
        }
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));


        // Close the scanner
        scanner.close();
    }
}