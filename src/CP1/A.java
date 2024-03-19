package CP1;

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A extends Frame{
    public A(){
        JFrame f = new JFrame("AdminPage", null);

        ImageIcon backgroundImage = new ImageIcon("C:/Users/Darshan/Downloads/mn1.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        backgroundLabel.setLayout(null);
        f.setContentPane(backgroundLabel);

        JLabel labelAdminLogin = new JLabel();
        JLabel labelUsername = new JLabel();
        JLabel labelPassword = new JLabel();
        JTextField jTextField1 = new JTextField();
        JPasswordField jPasswordField1 = new JPasswordField();
        JCheckBox jCheckBox1 = new JCheckBox();
        JButton buttonLogin = new JButton();

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);

        labelAdminLogin.setFont(new java.awt.Font("Segoe UI", 1, 80)); 
        labelAdminLogin.setForeground(new java.awt.Color(255,255,255));
        labelAdminLogin.setText("ADMIN LOGIN");
        f.add(labelAdminLogin);
        labelAdminLogin.setBounds(505, 173, 570, 108);

        labelUsername.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        labelUsername.setForeground(new java.awt.Color(255,255,255));
        labelUsername.setText("Username");
        f.add(labelUsername);
        labelUsername.setBounds(423, 357, 251, 48);

        labelPassword.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        labelPassword.setForeground(new java.awt.Color(255,255,255));
        labelPassword.setText("Password");
        f.add(labelPassword);
        labelPassword.setBounds(423, 483, 170, 48);

        jTextField1.setBackground(new java.awt.Color(230, 230, 230));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        f.add(jTextField1);
        jTextField1.setBounds(810, 354, 327, 54);

        jPasswordField1.setBackground(new java.awt.Color(230, 230, 230));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        f.add(jPasswordField1);
        jPasswordField1.setBounds(810, 480, 327, 54);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Show Password");
        f.add(jCheckBox1);
        jCheckBox1.setBounds(810, 566, 200, 36);

        buttonLogin.setBackground(new java.awt.Color(255,255,255));
        buttonLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        buttonLogin.setForeground(new java.awt.Color(0,0,0));
        buttonLogin.setText("LOGIN");
        f.add(buttonLogin);
        buttonLogin.setBounds(608, 671, 260, 55);
 
        buttonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(jTextField1.getText().equals("admin") && jPasswordField1.getText().equals("admin")){
                    f.setVisible(false);
                    new B();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                }

            }

        });

        jCheckBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(jCheckBox1.isSelected()){
                    jPasswordField1.setEchoChar((char)0);
                }
                else{
                    jPasswordField1.setEchoChar('*');
                }
            }

        });

 
        f.setSize(1550, 990);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new A();
    }
}
