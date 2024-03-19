package CP1;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import MyConnection.MyCon;

public class H extends JFrame {
    private JLabel jlabel0;

    public H() {
        JFrame f = new JFrame("Add Product", null);

        ImageIcon backgroundImage = new ImageIcon("C:/Users/Darshan/Downloads/mn7.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        backgroundLabel.setLayout(null);
        f.setContentPane(backgroundLabel);

        JLabel labelAddProduct = new JLabel();
        JLabel labelid = new JLabel();
        JLabel labelname = new JLabel();
        JTextField tfName = new JTextField();
        JLabel labelPrice = new JLabel();
        JTextField tfPrice = new JTextField();
        JLabel labeldes = new JLabel();
        JTextField tfdes = new JTextField();
        JLabel labelava = new JLabel();
        JComboBox<String> cbava = new JComboBox<>();
        JButton buttonSave = new JButton();
        JButton buttonReset = new JButton();
        JButton buttonClose = new JButton();

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);

        labelAddProduct.setFont(new java.awt.Font("Segoe UI", 1, 80)); 
        labelAddProduct.setForeground(new java.awt.Color(255,255,255));
        labelAddProduct.setText("Add Product");
        f.add(labelAddProduct);
        labelAddProduct.setBounds(540, 30, 540, 108);

        labelid.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelid.setForeground(new java.awt.Color(255,255,255));
        labelid.setText("Product ID");
        f.add(labelid);
        labelid.setBounds(360, 210, 149, 50);

        jlabel0 = new JLabel();
        jlabel0.setBackground(new java.awt.Color(204, 204, 204));
        jlabel0.setFont(new java.awt.Font("Segoe UI", 1, 26));
        jlabel0.setForeground(new java.awt.Color(255,255,255));
        f.add(jlabel0);
        jlabel0.setBounds(790, 220, 395, 42);


        labelname.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelname.setForeground(new java.awt.Color(255,255,255));
        labelname.setText("Product Name");
        f.add(labelname);
        labelname.setBounds(360, 310, 217, 36);

        tfName.setBackground(new java.awt.Color(230,230,230));
        tfName.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        tfName.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfName);
        tfName.setBounds(790, 310, 395, 42);

        labelPrice.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelPrice.setForeground(new java.awt.Color(255,255,255));
        labelPrice.setText("Price");
        f.add(labelPrice);
        labelPrice.setBounds(360, 410, 127, 36);

        tfPrice.setBackground(new java.awt.Color(230,230,230));
        tfPrice.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        tfPrice.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfPrice);
        tfPrice.setBounds(790, 410, 395, 42);

        labeldes.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labeldes.setForeground(new java.awt.Color(255,255,255));
        labeldes.setText("Description");
        f.add(labeldes);
        labeldes.setBounds(360, 510, 159, 36);

        tfdes.setBackground(new java.awt.Color(230, 230, 230));
        tfdes.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        tfdes.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfdes);
        tfdes.setBounds(790, 510, 395, 42);

        labelava.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelava.setForeground(new java.awt.Color(255,255,255));
        labelava.setText("Availability");
        f.add(labelava);
        labelava.setBounds(360, 600, 176, 36);

        cbava.setBackground(new java.awt.Color(230,230,230));
        cbava.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        cbava.setForeground(new java.awt.Color(0, 0, 0));
        cbava.setModel(new DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        f.add(cbava);
        cbava.setBounds(790, 600, 395, 42);

        buttonSave.setBackground(new java.awt.Color(255,255,255));
        buttonSave.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        buttonSave.setForeground(new java.awt.Color(0, 0, 0));
        buttonSave.setText("Save");
        f.add(buttonSave);
        buttonSave.setBounds(300, 720, 232, 55);

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
                new D();

            }

        });

        buttonSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	generateAndSetProductID();
                String productID = jlabel0.getText();
                String productName = tfName.getText();
                String price = tfPrice.getText();
                String description = tfdes.getText();
                String availability = (String) cbava.getSelectedItem();
                String insertQuery = "INSERT INTO product_info (id,name, price, des, ava) VALUES ('"
                        + productID + "', '" + productName + "', '" + price + "', '" + description + "', '"
                        + availability + "')";
                MyCon.insertData(insertQuery);
                JOptionPane.showMessageDialog(null, "Successfully Inserted");

            }
        });

        buttonReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jlabel0.setText("");
                tfName.setText("");
                tfPrice.setText("");
                tfdes.setText("");
                cbava.setSelectedIndex(0);
            }
        });

        buttonClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new D();
            }
        });

        f.setSize(1550, 990);
        f.setVisible(true);
    }

    private void generateAndSetProductID() {
        try {
            String query = "SELECT MAX(id) FROM product_info"; 
            ResultSet resultSet = MyCon.retrieveData(query);

            if (resultSet.next()) {
                int maxProductID = resultSet.getInt(1);
                int nextProductID = maxProductID + 1;
                jlabel0.setText(String.valueOf(nextProductID));
            } else {
                jlabel0.setText("101");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error generating Product ID: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new H();
    }

}
