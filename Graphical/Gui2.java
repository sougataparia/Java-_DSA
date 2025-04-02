// importing the necessary packages for GUI components
import javax.swing.*;
import java.awt.*;


public class Gui2 {
    public static void main(String[] args) {
        // Creating a JFrame object

        JFrame frame = new JFrame("My First GUI Application");
        // JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // JButton button = new JButton("Hello Sougata");
        // button.setBackground(java.awt.Color.CYAN);
        JCheckBox checkBox = new JCheckBox("Check me!");
        frame.getContentPane().add(checkBox, BorderLayout.CENTER);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
