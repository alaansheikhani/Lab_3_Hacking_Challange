import javax.swing.*;

public class MessagePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Ohhhhh  no u hacked us !!");


    MessagePage() {

        welcomeLabel.setBounds(0, 0, 200, 35);
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
