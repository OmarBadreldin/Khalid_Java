import java.util.Scanner;

public class programm02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string (a): ");
        String a = scanner.nextLine();

        System.out.print("Enter the second string (b): ");
        String b = scanner.nextLine();

        // Comparing the two strings
        if (a.equals(b)) {
            System.out.println("The Strings are identical!");
        } else {
            System.out.println("The Strings are NOT identical");
        }

        // Close the scanner
        scanner.close();
    }
    
}
