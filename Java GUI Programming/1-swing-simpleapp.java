import javax.swing.*;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // Create a JFrame (Main Window)
        JFrame frame = new JFrame("Simple Swing Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel
        JLabel label = new JLabel("Welcome to Swing!", SwingConstants.CENTER);

        // Create a JButton
        JButton button = new JButton("Click Me");
        button.addActionListener(e -> label.setText("Button Clicked!"));

        // Add components to the frame
        frame.setLayout(new java.awt.BorderLayout());
        frame.add(label, java.awt.BorderLayout.CENTER);
        frame.add(button, java.awt.BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}
