package CP1;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import MyConnection.MyCon;

public class G extends JFrame {
    public G() {
        JFrame f = new JFrame("Delete Buyer", null);

        ImageIcon backgroundImage = new ImageIcon("C:/Users/Darshan/Downloads/mn5.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        backgroundLabel.setLayout(null);
        f.setContentPane(backgroundLabel);

        JLabel labelDeleteBuyer = new JLabel();
        JLabel labelContactNoSearch = new JLabel();
        JTextField tfContactNoSearch = new JTextField();
        JTextField tfName = new JTextField();
        JLabel labelName = new JLabel();
        JLabel labelContactNo = new JLabel();
        JTextField tfContactNo = new JTextField();
        JTextField tfEmail = new JTextField();
        JLabel labelEmail = new JLabel();
        JLabel labelAddress = new JLabel();
        JTextField tfAddress = new JTextField();
        JComboBox<String> cbGender = new JComboBox<>();
        JLabel labelGender = new JLabel();
        JButton buttonDelete = new JButton();
        JButton buttonReset = new JButton();
        JButton buttonClose = new JButton();
        JButton buttonSearch = new JButton();

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);

        labelDeleteBuyer.setFont(new java.awt.Font("Segoe UI", 1, 80)); 
        labelDeleteBuyer.setForeground(new java.awt.Color(255,255,255));
        labelDeleteBuyer.setText("Delete Buyer");
        f.add(labelDeleteBuyer);
        labelDeleteBuyer.setBounds(560, 10, 540, 108);

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

        tfName.setBackground(new java.awt.Color(230, 230, 230));
        tfName.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        tfName.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfName);
        tfName.setBounds(790, 250, 395, 42);

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelName.setForeground(new java.awt.Color(255,255,255));
        labelName.setText("Name");
        f.add(labelName);
        labelName.setBounds(360, 250, 149, 36);

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

        tfEmail.setBackground(new java.awt.Color(230, 230, 230));
        tfEmail.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfEmail);
        tfEmail.setBounds(790, 440, 395, 42);

        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelEmail.setForeground(new java.awt.Color(255,255,255));
        labelEmail.setText("Email");
        f.add(labelEmail);
        labelEmail.setBounds(360, 440, 127, 36);

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

        cbGender.setBackground(new java.awt.Color(230, 230, 230));
        cbGender.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        cbGender.setForeground(new java.awt.Color(0, 0, 0));
        cbGender.setModel(new DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        f.add(cbGender);
        cbGender.setBounds(790, 620, 395, 42);

        labelGender.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelGender.setForeground(new java.awt.Color(255,255,255));
        labelGender.setText("Gender");
        f.add(labelGender);
        labelGender.setBounds(360, 620, 176, 36);

        buttonDelete.setBackground(new java.awt.Color(255,255,255));
        buttonDelete.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        buttonDelete.setForeground(new java.awt.Color(0, 0, 0));
        buttonDelete.setText("Delete");
        f.add(buttonDelete);
        buttonDelete.setBounds(300, 720, 232, 55);

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

        buttonSearch.setBackground(new java.awt.Color(255,255,255));
        buttonSearch.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        buttonSearch.setForeground(new java.awt.Color(0, 0, 0));
        buttonSearch.setText("");
        f.add(buttonSearch);
        buttonSearch.setBounds(1220, 170, 40, 40);
        
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

        buttonDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String contactNo = tfContactNoSearch.getText();
                String deleteQuery = "DELETE FROM buyer_info WHERE contactno = '" + contactNo + "'";
                MyCon.deleteData(deleteQuery);
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
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
        new G();
    }
}
