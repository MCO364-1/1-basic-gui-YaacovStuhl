import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("Number Adder");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLayout(new FlowLayout());
        JButton button = new JButton("Enter numbers to be added to label");
        window.add(button, BorderLayout.SOUTH);
        JTextField textField1 = new JTextField(20);
        window.add(textField1);
        JTextField textField2 = new JTextField(20);
        window.add(textField2);
        JLabel label = new JLabel("     ");
        window.add(label, BorderLayout.WEST);
        button.addActionListener(e -> {
            label.setText(textField1.getText() + textField2.getText());
        });


        window.addWindowListener(new WindowAdapter() {
            public void windowIconified(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}







