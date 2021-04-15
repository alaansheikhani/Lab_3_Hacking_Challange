import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel useIdLabel = new JLabel("User ID");
    JLabel userPasswordLabel = new JLabel("Password");
    JLabel messageLabel = new JLabel();

    HashMap<String, String> loginInfo = new HashMap<>();

    LoginPage(HashMap<String, String> loginInfoOriginal) {
        loginInfo = loginInfoOriginal;

        useIdLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(125, 250, 400, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 18));
        userIdField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.addActionListener(this);


        frame.add(loginButton);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(messageLabel);
        frame.add(useIdLabel);
        frame.add(userPasswordLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.pack();
        frame.add(loginButton);
        frame.add(resetButton);


    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {

            //Getting the Username and password from the fields and store them in strings
            String userID = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            int attemptCounter = 0;


            if (loginInfo.containsKey(userID)) {
                if (loginInfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login sucsessful");
                    MessagePage messagePage = new MessagePage();
                }
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Wrong Password or Username!!");


            }

        }
    }

}

