import javax.swing.*;

public class Gui1 {
    public static void main(String []args) {
        
        JFrame frame = new JFrame();
        JButton button = new JButton("Hello sougata");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(50, 50);
        frame.setVisible(true);
    }
}
