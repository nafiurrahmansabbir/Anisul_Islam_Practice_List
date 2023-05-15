package Project.folder;

import javax.swing.*;
import java.awt.event.*;

public class LoginInterface extends JFrame implements ActionListener {
    JLabel label1, label2;
    JTextField tf;
    JPasswordField pf;
    JButton loginBtn, resetBtn;
    
    LoginInterface() {
        label1 = new JLabel("Username:");
        label1.setBounds(50, 50, 100, 30);
        add(label1);
        
        tf = new JTextField();
        tf.setBounds(160, 50, 200, 30);
        add(tf);
        
        label2 = new JLabel("Password:");
        label2.setBounds(50, 100, 100, 30);
        add(label2);
        
        pf = new JPasswordField();
        pf.setBounds(160, 100, 200, 30);
        add(pf);
        
        loginBtn = new JButton("Login");
        loginBtn.setBounds(50, 150, 100, 30);
        loginBtn.addActionListener(this);
        add(loginBtn);
        
        resetBtn = new JButton("Reset");
        resetBtn.setBounds(160, 150, 100, 30);
        resetBtn.addActionListener(this);
        add(resetBtn);
        
        setTitle("Login Interface");
        setSize(400, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBtn) {
            String username = tf.getText();
            String password = String.valueOf(pf.getPassword());
            
            if (username.equals("admin") && password.equals("admin")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password");
            }
        } else if (e.getSource() == resetBtn) {
            tf.setText("");
            pf.setText("");
        }
    }
    
    public static void main(String[] args) {
        new LoginInterface();
    }
}
