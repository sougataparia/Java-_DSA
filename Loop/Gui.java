import javax.swing.*;

public class Gui {
    public static void main(String []args) {
        // According to the Head first java
        // creating the jfram object

        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");
        
        // now we have to close the frame as soon as we close it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);// to make it visible
    }
}
