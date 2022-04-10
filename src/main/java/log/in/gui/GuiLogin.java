package log.in.gui;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLogin implements ActionListener {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User: ");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);


        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new GuiLogin());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);

        panel.add(success);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String user = userText.getText();
        String password = passwordText.getText();



        if(user.equals("Abcd") && password.equals("1245l")) {
            success.setText("Login successful!");
        }
    }
}
