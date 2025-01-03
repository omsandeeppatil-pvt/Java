import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SwingCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text field for input/output
        JTextField textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 20));

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        // Calculator buttons
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        // Add buttons to the panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(new CalculatorActionListener(text, textField));
            buttonPanel.add(button);
        }

        // Add components to the frame
        frame.setLayout(new BorderLayout());
        frame.add(textField, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

class CalculatorActionListener implements java.awt.event.ActionListener {
    private String value;
    private JTextField textField;
    private StringBuilder input = new StringBuilder();

    public CalculatorActionListener(String value, JTextField textField) {
        this.value = value;
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (value.equals("=")) {
            try {
                double result = eval(input.toString());
                textField.setText(String.valueOf(result));
                input.setLength(0);
            } catch (Exception ex) {
                textField.setText("Error");
                input.setLength(0);
            }
        } else {
            input.append(value);
            textField.setText(input.toString());
        }
    }

    private double eval(String expression) {
        return new javax.script.ScriptEngineManager()
            .getEngineByName("JavaScript")
            .eval(expression)
            .hashCode();  // Evaluate mathematical expressions
    }
}
