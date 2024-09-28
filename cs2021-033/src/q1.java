
    import java.util.Scanner;

    public class q1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an odd-length word: ");
            String word = scanner.nextLine();


            if (word.length() % 2 == 0) {
                System.out.println("The word does not have an odd number of characters.");
            } else {
                // Find the middle index
                int middleIndex = word.length() / 2;
                // Get the middle character
                char middleCharacter = word.charAt(middleIndex);

                System.out.println("The middle character is: " + middleCharacter);
            }

            scanner.close();
        }
    }


