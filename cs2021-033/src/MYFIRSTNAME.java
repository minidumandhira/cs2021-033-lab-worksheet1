import javax.swing.JFrame;

public class MYFIRSTNAME {
    public static void main(String[] args) {
        // Create a new JFrame with the title "My First Frame"
        JFrame frame = new JFrame("My First Frame");

        // Set the size of the frame: 300 pixels wide and 200 pixels high
        frame.setSize(300, 200);

        // Set the location of the frame: 100 pixels from the left, 50 pixels from the top
        frame.setLocation(100, 50);

        // Ensure the program exits when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}

