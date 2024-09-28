 import java.util.Scanner;

    public class q2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user for full name input
            System.out.print("Enter your full name (first middle last): ");
            String fullName = scanner.nextLine();

            // Split the name into parts (first, middle, last)
            String[] nameParts = fullName.split(" ");

            // Ensure that there are exactly 3 parts (first, middle, last)
            if (nameParts.length != 3) {
                System.out.println("Please enter a name in the format: first middle last.");
            } else {
                String firstName = nameParts[0];
                String middleName = nameParts[1];
                String lastName = nameParts[2];

                // Get the middle initial
                char middleInitial = middleName.charAt(0);

                // Format and display the output
                System.out.println(lastName + ", " + firstName + " " + middleInitial + ".");
            }

            scanner.close();
        }
    }


