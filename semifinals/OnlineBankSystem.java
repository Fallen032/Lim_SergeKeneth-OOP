import javax.swing.*;
import java.awt.*;

public class OnlineBankSystem {
    public static void main(String[] args) {
        // Layout
        JFrame frame = new JFrame();
        frame.setSize(705, 829); // size of the atm display info
        frame.setTitle("University Bank");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);// do not change or remove

        // Image Layout
        ImageIcon titlebox = new ImageIcon("Holder.png");
        ImageIcon image = new ImageIcon("bank.jpg");// to replace the java logo
        frame.setIconImage(image.getImage());

        // Color layout
        frame.getContentPane().setBackground(new Color(173, 216, 230));

        // Display text layout
        JLabel label = new JLabel();
        label.setText("UNIVERSITY BANK DISPLAY");
        
        // Set layout manager
        frame.setLayout(new BorderLayout());

        // Add label to the center
        frame.add(label, BorderLayout.CENTER);
    }
}
