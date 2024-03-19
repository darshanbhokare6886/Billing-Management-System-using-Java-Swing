package CP1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B extends JFrame {

    public B() {
        JFrame f = new JFrame("MenuPage", null);

        ImageIcon backgroundImage = new ImageIcon("C:/Users/Darshan/Downloads/mn2.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        backgroundLabel.setLayout(null);
        f.setContentPane(backgroundLabel);

        JButton buttonCustomerInfo = new JButton();
        JButton buttonProductInfo = new JButton();
        JButton buttonBillingWindow = new JButton();
        JButton buttonBack = new JButton();

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);

        buttonCustomerInfo.setBackground(new java.awt.Color(255,255,255));
        buttonCustomerInfo.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        buttonCustomerInfo.setForeground(new java.awt.Color(0, 0, 0));
        buttonCustomerInfo.setText("Customer Information");
        f.add(buttonCustomerInfo);
        buttonCustomerInfo.setBounds(494, 149, 540, 71);

        buttonProductInfo.setBackground(new java.awt.Color(255,255,255));
        buttonProductInfo.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        buttonProductInfo.setForeground(new java.awt.Color(0, 0, 0));
        buttonProductInfo.setText("Product Information");
        f.add(buttonProductInfo);
        buttonProductInfo.setBounds(494, 400, 531, 71);

        buttonBillingWindow.setBackground(new java.awt.Color(255,255,255));
        buttonBillingWindow.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        buttonBillingWindow.setForeground(new java.awt.Color(0, 0, 0));
        buttonBillingWindow.setText("Billing Window");
        f.add(buttonBillingWindow);
        buttonBillingWindow.setBounds(494, 662, 531, 71);
        
        buttonBack.setBackground(new java.awt.Color(255, 255, 255));
        buttonBack.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        buttonBack.setForeground(new java.awt.Color(0, 0, 0));
        buttonBack.setText("Back");
        f.add(buttonBack);
        buttonBack.setBounds(10, 10, 100, 39);
        
        buttonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new A();

            }

        });

        buttonCustomerInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new C();
            }

        });

        buttonProductInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new D();
            }

        });

        buttonBillingWindow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new M();

            }

        });
        
       
        
        f.setSize(1550, 990);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new B();
    }
}
