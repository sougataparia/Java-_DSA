import javax.swing.*;
// here we are importing the javax.swing package which contains classes for creating GUI components

public class Gui1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("Welcome to Java GUI Programming!");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}