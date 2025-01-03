import javax.swing.*;

public class LoginForm {
    public static void main(String[] args) {
        // Create a JFrame for the Login Form
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.GridLayout(3, 2, 10, 10));

        // Create components
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JLabel statusLabel = new JLabel("", SwingConstants.CENTER);

        // Add action listener to the login button
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if ("admin".equals(username) && "password".equals(password)) {
                statusLabel.setText("Login Successful!");
            } else {
                statusLabel.setText("Invalid Credentials");
            }
        });

        // Add components to the frame
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(statusLabel);

        // Show the frame
        frame.setVisible(true);
    }
}
