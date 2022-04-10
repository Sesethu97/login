package log.in.gui;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLogin implements ActionListener {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton buttonLog;
    private static JButton buttonExit;
    private static JLabel success;
    static JCheckBox showPassword=new JCheckBox("Show Password");

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

        buttonLog = new JButton("Login");
        buttonLog.setBounds(10,80,80,25);
        buttonLog.addActionListener(new GuiLogin());
        panel.add(buttonLog);


        buttonExit = new JButton("Exit");
        buttonExit.setBounds(10,180,80,25);
        buttonExit.addActionListener(new GuiLogin());
        panel.add(buttonExit);


        success = new JLabel("");
        success.setBounds(10,110,300,25);

        showPassword.setBounds(120,80,175,30);
        panel.add(showPassword);
        panel.add(success);
//        frame.setResizable(false);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String user = userText.getText();
        String password = passwordText.getText();




        if(user.equals("Abcd") && password.equals("1245l")) {
            success.setText("Login successful!");
        }


        if((!user.equals("Abcd")) || (!password.equals("1245l"))) {
            success.setText("Login unsuccessful!");
        }

    }
}
