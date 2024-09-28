import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        // Constants
        final double CM_PER_INCH = 2.54;
        final double INCHES_PER_FOOT = 12;

        // Create scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the measurement in centimeters
        System.out.print("Enter the length in centimeters: ");
        double cm = scanner.nextDouble();

        // Convert centimeters to total inches
        double totalInches = cm / CM_PER_INCH;

        // Convert total inches to feet and inches
        int feet = (int) (totalInches / INCHES_PER_FOOT);  // Calculate whole feet
        double remainingInches = totalInches % INCHES_PER_FOOT;  // Calculate remaining inches

        // Output the result
        System.out.println(cm + " cm is equal to " + feet + " feet and " + String.format("%.2f", remainingInches) + " inches.");

        scanner.close();
    }
}

