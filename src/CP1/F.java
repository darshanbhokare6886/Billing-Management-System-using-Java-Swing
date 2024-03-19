package CP1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import MyConnection.MyCon;

public class F extends JFrame {
    public F() {
        JFrame f = new JFrame("Update Buyer", null);

        ImageIcon backgroundImage = new ImageIcon("C:/Users/Darshan/Downloads/mn5.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        backgroundLabel.setLayout(null);
        f.setContentPane(backgroundLabel);

        JLabel labelUpdateBuyer = new JLabel();
        JLabel labelName = new JLabel();
        JTextField tfName = new JTextField();
        JLabel labelEmail = new JLabel();
        JTextField tfEmail = new JTextField();
        JLabel labelAddress = new JLabel();
        JTextField tfAddress = new JTextField();
        JLabel labelGender = new JLabel();
        JComboBox<String> cbGender = new JComboBox<>();
        JButton buttonUpdate = new JButton();
        JButton buttonReset = new JButton();
        JButton buttonClose = new JButton();
        JLabel labelContactNo = new JLabel();
        JTextField tfContactNo = new JTextField();
        JButton buttonSearch = new JButton();
        JLabel labelContactNoSearch = new JLabel();
        JTextField tfContactNoSearch = new JTextField();

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);

        labelUpdateBuyer.setFont(new java.awt.Font("Segoe UI", 1, 80)); 
        labelUpdateBuyer.setForeground(new java.awt.Color(255,255,255));
        labelUpdateBuyer.setText("Update Buyer");
        f.add(labelUpdateBuyer);
        labelUpdateBuyer.setBounds(520, 15, 540, 108);

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelName.setForeground(new java.awt.Color(255,255,255));
        labelName.setText("Name");
        f.add(labelName);
        labelName.setBounds(360, 250, 149, 36);

        tfName.setBackground(new java.awt.Color(230, 230, 230));
        tfName.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        tfName.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfName);
        tfName.setBounds(790, 250, 395, 42);

        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelEmail.setForeground(new java.awt.Color(255,255,255));
        labelEmail.setText("Email");
        f.add(labelEmail);
        labelEmail.setBounds(360, 440, 127, 36);

        tfEmail.setBackground(new java.awt.Color(230, 230, 230));
        tfEmail.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfEmail);
        tfEmail.setBounds(790, 440, 395, 42);

        labelAddress.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelAddress.setForeground(new java.awt.Color(255,255,255));
        labelAddress.setText("Address");
        f.add(labelAddress);
        labelAddress.setBounds(360, 540, 159, 36);

        tfAddress.setBackground(new java.awt.Color(230, 230, 230));
        tfAddress.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        tfAddress.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfAddress);
        tfAddress.setBounds(790, 540, 395, 42);

        labelGender.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelGender.setForeground(new java.awt.Color(255,255,255));
        labelGender.setText("Gender");
        f.add(labelGender);
        labelGender.setBounds(360, 620, 176, 36);

        cbGender.setBackground(new java.awt.Color(230, 230, 230));
        cbGender.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        cbGender.setForeground(new java.awt.Color(0, 0, 0));
        cbGender.setModel(new DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        f.add(cbGender);
        cbGender.setBounds(790, 620, 395, 42);

        buttonUpdate.setBackground(new java.awt.Color(255,255,255));
        buttonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        buttonUpdate.setForeground(new java.awt.Color(0, 0, 0));
        buttonUpdate.setText("Update");
        f.add(buttonUpdate);
        buttonUpdate.setBounds(300, 720, 232, 55);

        buttonReset.setBackground(new java.awt.Color(255,255,255));
        buttonReset.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        buttonReset.setForeground(new java.awt.Color(0, 0, 0));
        buttonReset.setText("Reset");
        f.add(buttonReset);
        buttonReset.setBounds(640, 720, 232, 55);

        buttonClose.setBackground(new java.awt.Color(255,255,255));
        buttonClose.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        buttonClose.setForeground(new java.awt.Color(0, 0, 0));
        buttonClose.setText("Close");
        f.add(buttonClose);
        buttonClose.setBounds(1000, 720, 230, 55);

        labelContactNo.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelContactNo.setForeground(new java.awt.Color(255,255,255));
        labelContactNo.setText("Contact No.");
        f.add(labelContactNo);
        labelContactNo.setBounds(360, 340, 217, 36);

        tfContactNo.setBackground(new java.awt.Color(230, 230, 230));
        tfContactNo.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        tfContactNo.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfContactNo);
        tfContactNo.setBounds(790, 340, 395, 42);

        buttonSearch.setBackground(new java.awt.Color(255,255,255));
        buttonSearch.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        buttonSearch.setForeground(new java.awt.Color(0, 0, 0));
        buttonSearch.setText("");
        f.add(buttonSearch);
        buttonSearch.setBounds(1220, 170, 40, 40);

        labelContactNoSearch.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelContactNoSearch.setForeground(new java.awt.Color(255,255,255));
        labelContactNoSearch.setText("Contact No.");
        f.add(labelContactNoSearch);
        labelContactNoSearch.setBounds(360, 170, 149, 36);

        tfContactNoSearch.setBackground(new java.awt.Color(230, 230, 230));
        tfContactNoSearch.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        tfContactNoSearch.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfContactNoSearch);
        tfContactNoSearch.setBounds(790, 170, 395, 42);
        
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


        buttonUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                String contactNo = tfContactNo.getText();
                String email = tfEmail.getText();
                String address = tfAddress.getText();
                String gender = (String) cbGender.getSelectedItem();
                String update = "UPDATE buyer_info SET name = '" + name + "', contactno = '" + contactNo
                        + "', email = '" + email + "', address = '" + address + "', gender = '" + gender
                        + "' WHERE contactno = '" + tfContactNoSearch.getText() + "'";
                MyCon.updateData(update);
                JOptionPane.showMessageDialog(null, "Successfully Updated");
            }
        });

        buttonReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfName.setText("");
                tfEmail.setText("");
                tfAddress.setText("");
                tfContactNo.setText("");
                tfContactNoSearch.setText("");
                cbGender.setSelectedIndex(0);
            }
        });

        buttonClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new C();
            }
        });

        buttonSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String contactNO = tfContactNoSearch.getText();
                try {
                    ResultSet rs = MyCon.retrieveData("select * from buyer_info where contactno='" + contactNO + "'");
                    if (rs.next()) {
                        tfName.setText(rs.getString(1));
                        tfContactNo.setText(rs.getString(2));
                        tfEmail.setText(rs.getString(3));
                        tfAddress.setText(rs.getString(4));

                    } else {
                        JOptionPane.showMessageDialog(null, "Contactno does not exists");
                    }

                }

                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        });

        f.setSize(1550, 990);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new F();
    }
}
