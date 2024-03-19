package CP1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C extends JFrame {
    public C() {
        JFrame f = new JFrame("CustomerInfo", null);

        ImageIcon backgroundImage = new ImageIcon("C:/Users/Darshan/Downloads/mn3.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        backgroundLabel.setLayout(null);
        f.setContentPane(backgroundLabel);

        JLabel labelCusomerInfo = new JLabel();
        JButton buttonDeleteBuyer = new JButton();
        JButton buttonUpdateBuyer = new JButton();
        JButton buttonAddBuyer = new JButton();
        JButton buttonBuyerDetails = new JButton();

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);

        labelCusomerInfo.setFont(new java.awt.Font("Segoe UI", 1, 80)); 
        labelCusomerInfo.setForeground(new java.awt.Color(255,255,255));
        labelCusomerInfo.setText("Customer Information");
        f.add(labelCusomerInfo);
        labelCusomerInfo.setBounds(340, 90, 958, 108);

        buttonAddBuyer.setBackground(new java.awt.Color(255,255,255));
        buttonAddBuyer.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        buttonAddBuyer.setForeground(new java.awt.Color(0, 0, 0));
        buttonAddBuyer.setText("Add Buyer");
        f.add(buttonAddBuyer);
        buttonAddBuyer.setBounds(220, 310, 317, 71);

        buttonUpdateBuyer.setBackground(new java.awt.Color(255,255,255));
        buttonUpdateBuyer.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        buttonUpdateBuyer.setForeground(new java.awt.Color(0, 0, 0));
        buttonUpdateBuyer.setText("Update Buyer");
        f.add(buttonUpdateBuyer);
        buttonUpdateBuyer.setBounds(960, 310, 340, 71);

        buttonDeleteBuyer.setBackground(new java.awt.Color(255,255,255));
        buttonDeleteBuyer.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        buttonDeleteBuyer.setForeground(new java.awt.Color(0, 0, 0));
        buttonDeleteBuyer.setText("Delete Buyer");
        f.add(buttonDeleteBuyer);
        buttonDeleteBuyer.setBounds(220, 580, 330, 71);

        buttonBuyerDetails.setBackground(new java.awt.Color(255,255,255));
        buttonBuyerDetails.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        buttonBuyerDetails.setForeground(new java.awt.Color(0, 0, 0));
        buttonBuyerDetails.setText("Buyer Details");
        f.add(buttonBuyerDetails);
        buttonBuyerDetails.setBounds(960, 580, 336, 71);
        
        JButton buttonBack = new JButton();

        buttonBack.setBackground(new java.awt.Color(255, 255, 255));
        buttonBack.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        buttonBack.setForeground(new java.awt.Color(0, 0, 0));
        buttonBack.setText("Back");
        f.add(buttonBack);
        buttonBack.setBounds(10, 10, 100, 39);
        
        buttonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new B();

            }

        });

        buttonAddBuyer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new E();
            }

        });

        buttonUpdateBuyer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new F();
            }

        });

        buttonDeleteBuyer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new G();

            }

        });

        buttonBuyerDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new K();

            }

        });
        f.setSize(1550, 990);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new C();

    }
}
