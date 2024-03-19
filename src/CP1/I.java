package CP1;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import MyConnection.MyCon;

public class I extends JFrame {
	private JTextField jlabel0;
    public I() {
        JFrame f = new JFrame("Update Product", null);

        ImageIcon backgroundImage = new ImageIcon("C:/Users/Darshan/Downloads/mn7.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        backgroundLabel.setLayout(null);
        f.setContentPane(backgroundLabel);

        JLabel labelUpdateProduct = new JLabel();
        JLabel labelid = new JLabel();
        JLabel labelname = new JLabel();
        JLabel labelPrice = new JLabel();
        JLabel labeldes = new JLabel();
        JLabel labelava = new JLabel();
        JButton buttonUpdate = new JButton();
        JButton buttonReset = new JButton();
        JButton buttonClose = new JButton();
        JComboBox<String> cbava = new JComboBox<>();
        JTextField tfdes = new JTextField();
        JTextField tfPrice = new JTextField();
        JTextField tfname = new JTextField();
        JButton jButton4 = new JButton();

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);

        labelUpdateProduct.setFont(new java.awt.Font("Segoe UI", 1, 80));
        labelUpdateProduct.setForeground(new java.awt.Color(255,255,255));
        labelUpdateProduct.setText("Update Product");
        f.add(labelUpdateProduct);
        labelUpdateProduct.setBounds(500, 30, 620, 108);

        labelid.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelid.setForeground(new java.awt.Color(255,255,255));
        labelid.setText("Product ID");
        f.add(labelid);
        labelid.setBounds(360, 210, 149, 50);

        labelname.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelname.setForeground(new java.awt.Color(255,255,255));
        labelname.setText("Product Name");
        f.add(labelname);
        labelname.setBounds(360, 310, 217, 36);

        labelPrice.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelPrice.setForeground(new java.awt.Color(255,255,255));
        labelPrice.setText("Price");
        f.add(labelPrice);
        labelPrice.setBounds(360, 410, 127, 36);

        labeldes.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labeldes.setForeground(new java.awt.Color(255,255,255));
        labeldes.setText("Description");
        f.add(labeldes);
        labeldes.setBounds(360, 510, 159, 36);

        labelava.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        labelava.setForeground(new java.awt.Color(255,255,255));
        labelava.setText("Availability");
        f.add(labelava);
        labelava.setBounds(360, 600, 176, 36);

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

        cbava.setBackground(new java.awt.Color(230, 230, 230));
        cbava.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        cbava.setForeground(new java.awt.Color(0, 0, 0));
        cbava.setModel(new DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        f.add(cbava);
        cbava.setBounds(790, 600, 395, 42);

        tfdes.setBackground(new java.awt.Color(230, 230, 230));
        tfdes.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        tfdes.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfdes);
        tfdes.setBounds(790, 510, 395, 42);

        tfPrice.setBackground(new java.awt.Color(230, 230, 230));
        tfPrice.setFont(new java.awt.Font("Segoe UI", 1, 26)); 
        tfPrice.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfPrice);
        tfPrice.setBounds(790, 410, 395, 42);

        tfname.setBackground(new java.awt.Color(230, 230, 230));
        tfname.setFont(new java.awt.Font("Segoe UI", 1, 26));
        tfname.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfname);
        tfname.setBounds(790, 310, 395, 42);

        jlabel0 = new JTextField();
        jlabel0.setBackground(new java.awt.Color(255,255,255));
        jlabel0.setFont(new java.awt.Font("Segoe UI", 1, 26));
        jlabel0.setForeground(new java.awt.Color(0, 0, 0));
        f.add(jlabel0);
        jlabel0.setBounds(790, 220, 395, 42);

        jButton4.setBackground(new java.awt.Color(255,255,255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("");
        f.add(jButton4);
        jButton4.setBounds(1220, 220, 40, 40);
        
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


        buttonUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String productid=jlabel0.getText();
                String productName = tfname.getText();
                String productprice = tfPrice.getText();
                String productdes = tfdes.getText();
                String productava = (String) cbava.getSelectedItem();
                String updateQuery = "UPDATE product_info SET name = '" + productName + "', price = " + productprice + ", des = '" + productdes + "', ava = '" + productava + "' WHERE id = " + productid;
                MyCon.updateData(updateQuery);
                JOptionPane.showMessageDialog(null, "Successfully Updated");
      
            }
        });


        buttonReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jlabel0.setText("");
                tfname.setText("");
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

        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String productID=  jlabel0.getText();
                try {
                    ResultSet rs = MyCon.retrieveData("select * from product_info where id='" + productID + "'");
                    if (rs.next()) {
                    	tfname.setText(rs.getString(2));
                    	tfPrice.setText(rs.getString(3));
                    	tfdes.setText(rs.getString(4));

                    } else {
                        JOptionPane.showMessageDialog(null, "ProductID does not exists");
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
        new I();
    }
}
