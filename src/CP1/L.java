package CP1;

import javax.swing.*;

import MyConnection.MyCon;
import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class L extends JFrame {
	private JTable jTable2;
    public L() {
        JFrame f = new JFrame("Product Details", null);

        ImageIcon backgroundImage = new ImageIcon("C:/Users/Darshan/Downloads/mn8.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        backgroundLabel.setLayout(null);
        f.setContentPane(backgroundLabel);

        JLabel labelProductDetails = new JLabel();
        JScrollPane jScrollPane2 = new JScrollPane();
        JButton buttonView = new JButton();
        JButton buttonClose = new JButton();
        JButton buttonPrint = new JButton();
        jTable2 = new JTable();

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);

        labelProductDetails.setFont(new java.awt.Font("Segoe UI", 1, 80));
        labelProductDetails.setForeground(new java.awt.Color(0,0,0));
        labelProductDetails.setText("Product Details");
        f.add(labelProductDetails);
        labelProductDetails.setBounds(533, 45, 600, 120);

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "ProductID", "ProductName", "Price", "Description", "Availability"
                }));
        for (int i = 0; i < jTable2.getColumnCount(); i++) {
        	jTable2.getColumnModel().getColumn(i).setCellEditor(null);
        }
        jTable2.setRowHeight(30);

        jScrollPane2.setViewportView(jTable2);

        f.add(jScrollPane2);
        jScrollPane2.setBounds(140, 200, 1270, 460);

        buttonView.setBackground(new java.awt.Color(255,255,255));
        buttonView.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        buttonView.setForeground(new java.awt.Color(0, 0, 0));
        buttonView.setText("View");
        f.add(buttonView);
        buttonView.setBounds(140, 730, 230, 55);

        buttonClose.setBackground(new java.awt.Color(255,255,255));
        buttonClose.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        buttonClose.setForeground(new java.awt.Color(0, 0, 0));
        buttonClose.setText("Close");
        f.add(buttonClose);
        buttonClose.setBounds(1180, 720, 230, 55);
        
        buttonPrint.setBackground(new java.awt.Color(255,255,255));
        buttonPrint.setFont(new java.awt.Font("Segoe UI", 1, 36));
        buttonPrint.setForeground(new java.awt.Color(0, 0, 0));
        buttonPrint.setText("Print");
        f.add(buttonPrint); 
        buttonPrint.setBounds(670, 720, 230, 55); 
        
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



        buttonPrint.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                	jTable2.print(JTable.PrintMode.NORMAL);
                }
                catch(Exception ex) {
                	
                }
            }
        });
        buttonClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new D();
            }
        });
        buttonView.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                model.setRowCount(0);
                try {
                	ResultSet rs = MyCon.retrieveData("SELECT * FROM product_info");

                    while (rs.next()) {
                        model.addRow(new Object[] { rs.getString("id"), rs.getString("name"),
                                rs.getString("price"), rs.getString("des"), rs.getString("ava") });
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

                }
            }
        });
        

        f.setSize(1550, 990);
        f.setVisible(true);
    }
    
    public void formComponentShown(java.awt.event.ComponentEvent evt) {
        try {
            ResultSet resultSet = MyCon.retrieveData("select * from buyer_info");
            jTable2.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void main(String[] args) {
        new L();
    }
}
