package CP1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import MyConnection.MyCon;

public class E extends JFrame {
    public E() {
        JFrame f = new JFrame("New Buyer", null);

        ImageIcon backgroundImage = new ImageIcon("C:/Users/Darshan/Downloads/mn5.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        backgroundLabel.setLayout(null);
        f.setContentPane(backgroundLabel);

        JLabel labelAddBuyer = new JLabel();
        JLabel labelName = new JLabel();
        JLabel labelContactNo = new JLabel();
        JLabel labelEmail = new JLabel();
        JLabel labelAddress = new JLabel();
        JTextField tfName = new JTextField();
        JTextField tfContactNo = new JTextField();
        JTextField tfEmail = new JTextField();
        JTextField tfAddress = new JTextField();
        JLabel labelGender = new JLabel();
        JComboBox<String> cbGender = new JComboBox<>();
        JButton buttonSave = new JButton();
        JButton buttonReset = new JButton();
        JButton buttonClose = new JButton();

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);

        labelAddBuyer.setFont(new java.awt.Font("Segoe UI", 1, 80)); 
        labelAddBuyer.setForeground(new java.awt.Color(255,255,255));
        labelAddBuyer.setText("Add Buyer");
        f.add(labelAddBuyer);
        labelAddBuyer.setBounds(550, 25, 470, 108);

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        labelName.setForeground(new java.awt.Color(255,255,255));
        labelName.setText("Name");
        f.add(labelName);
        labelName.setBounds(359, 175, 149, 41);

        labelContactNo.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        labelContactNo.setForeground(new java.awt.Color(255,255,255));
        labelContactNo.setText("Contact No.");
        f.add(labelContactNo);
        labelContactNo.setBounds(359, 283, 217, 41);

        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        labelEmail.setForeground(new java.awt.Color(255,255,255));
        labelEmail.setText("Email");
        f.add(labelEmail);
        labelEmail.setBounds(359, 395, 127, 41);

        labelAddress.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        labelAddress.setForeground(new java.awt.Color(255,255,255));
        labelAddress.setText("Address");
        f.add(labelAddress);
        labelAddress.setBounds(359, 504, 159, 41);

        tfName.setBackground(new java.awt.Color(230, 230, 230));
        tfName.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        tfName.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfName);
        tfName.setBounds(790, 172, 395, 47);

        tfContactNo.setBackground(new java.awt.Color(230, 230, 230));
        tfContactNo.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        tfContactNo.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfContactNo);
        tfContactNo.setBounds(790, 280, 395, 47);

        tfEmail.setBackground(new java.awt.Color(230, 230, 230));
        tfEmail.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfEmail);
        tfEmail.setBounds(790, 392, 395, 47);

        tfAddress.setBackground(new java.awt.Color(230, 230, 230));
        tfAddress.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        tfAddress.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfAddress);
        tfAddress.setBounds(790, 501, 395, 47);

        labelGender.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        labelGender.setForeground(new java.awt.Color(255,255,255));
        labelGender.setText("Gender");
        f.add(labelGender);
        labelGender.setBounds(359, 614, 176, 41);

        cbGender.setBackground(new java.awt.Color(230, 230, 230));
        cbGender.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        cbGender.setForeground(new java.awt.Color(0, 0, 0));
        cbGender.setModel(new DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        f.add(cbGender);
        cbGender.setBounds(790, 608, 395, 47);

        buttonSave.setBackground(new java.awt.Color(255,255,255));
        buttonSave.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        buttonSave.setForeground(new java.awt.Color(0, 0, 0));
        buttonSave.setText("Save");
        f.add(buttonSave);
        buttonSave.setBounds(280, 710, 232, 55);

        buttonReset.setBackground(new java.awt.Color(255,255,255));
        buttonReset.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        buttonReset.setForeground(new java.awt.Color(0, 0, 0));
        buttonReset.setText("Reset");
        f.add(buttonReset);
        buttonReset.setBounds(650, 710, 232, 55);

        buttonClose.setBackground(new java.awt.Color(255,255,255));
        buttonClose.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        buttonClose.setForeground(new java.awt.Color(0, 0, 0));
        buttonClose.setText("Close");
        f.add(buttonClose);
        buttonClose.setBounds(1020, 710, 230, 55);
        
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
                new C();

            }

        });


        buttonSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                String contactNo = tfContactNo.getText();
                String email = tfEmail.getText();
                String address = tfAddress.getText();
                String gender = (String) cbGender.getSelectedItem();
                String insert = "INSERT INTO buyer_info (name, contactno, email, address, gender) VALUES ('"
                        + name + "', '" + contactNo + "', '" + email + "', '" + address + "', '" + gender + "')";
                MyCon.insertData(insert);
                JOptionPane.showMessageDialog(null, "Successfully Inserted");
            }
        });

        buttonReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfName.setText("");
                tfContactNo.setText("");
                tfEmail.setText("");
                tfAddress.setText("");
                cbGender.setSelectedIndex(0); 
            }
        });

        buttonClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new C();
            }
        });

        f.setSize(1550, 990);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new E();
    }
}
