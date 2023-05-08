import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel statusLabel;
    JTextField userTextField;
    JPasswordField passwordField;
    JButton loginButton, clearButton;
    private JLabel LoginBackground;

    public Login() {
    	setAlwaysOnTop(true);
        statusLabel = new JLabel("");
        statusLabel.setForeground(Color.GRAY);
        statusLabel.setFont(new Font("Segoe UI", Font.ITALIC, 15));
        statusLabel.setBounds(469, 432, 202, 30);
        userTextField = new JTextField();
        userTextField.setBorder(null);
        userTextField.setBounds(390, 313, 356, 20);
        passwordField = new JPasswordField();
        passwordField.setBorder(null);
        passwordField.setBounds(390, 361, 356, 20);
        loginButton = new JButton("");
        loginButton.setIcon(new ImageIcon(Login.class.getResource("/image/loginButton.png")));
        loginButton.setBounds(380, 397, 184, 23);
        clearButton = new JButton("");
        clearButton.setIcon(new ImageIcon(Login.class.getResource("/image/clearButton.png")));
        clearButton.setBounds(574, 397, 184, 23);
        getContentPane().setLayout(null);
        getContentPane().add(statusLabel);
        getContentPane().add(userTextField);
        getContentPane().add(passwordField);
        getContentPane().add(loginButton);
        getContentPane().add(clearButton);
        
        LoginBackground = new JLabel("");
        LoginBackground.setIcon(new ImageIcon(Login.class.getResource("/image/LoginBackground.png")));
        LoginBackground.setBounds(0, 0, 895, 597);
        getContentPane().add(LoginBackground);

        loginButton.addActionListener(this);
        clearButton.addActionListener(this);

        setTitle("Login Form");
        setSize(911, 636);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    	
        if (e.getSource() == loginButton) {
            String username = userTextField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("angelesjohanes@gmail.com") && password.equals("Johan1006")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                dispose();
                // Open the home page here
                Homepage homepage = new Homepage();
				Homepage.main(null);
            } else {
                statusLabel.setText("Invalid Username or Password");
            }
        } else if (e.getSource() == clearButton) {
            userTextField.setText("");
            passwordField.setText("");
            statusLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new Login();
       
        
    }
}
