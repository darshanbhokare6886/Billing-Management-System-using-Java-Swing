package CP1;

import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import MyConnection.MyCon;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class M extends JFrame{
	private JLabel jLabel4; 
    private JLabel jLabel5; 
    public int finalTotal=0;
    
    public M(){
    	 jLabel4 = new JLabel();
         jLabel5 = new JLabel();
    	 billing();
        
        
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        
        
        jLabel4.setText(dFormat.format(date));
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        
       jLabel5.setText(dtf.format(now));
        

    }
    
    public void billing() {
        JFrame f = new JFrame("Billing", null);

        ImageIcon backgroundImage = new ImageIcon("C:/Users/Darshan/Downloads/mn13.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        backgroundLabel.setLayout(null);
        f.setContentPane(backgroundLabel);

        JLabel labelBillingWindow = new JLabel();
        JLabel labelDate = new JLabel();
        JLabel labelTime = new JLabel();
        JLabel labelCalculationDetails = new JLabel();
        JLabel labelProductDetails = new JLabel();
        JLabel labelName = new JLabel();
        JTextField tfName = new JTextField();
        JLabel labelContactNo = new JLabel();
        JTextField tfContactNo = new JTextField();
        JLabel labelEmail = new JLabel();
        JTextField tfEmail = new JTextField();
        JLabel labelAddress = new JLabel();
        JTextField tfAddress = new JTextField();
        JLabel labelid = new JLabel();
        JTextField tfid = new JTextField();
        JLabel labelProductName = new JLabel();
        JTextField ProcuctName = new JTextField();
        JLabel labelPrice = new JLabel();
        JTextField tfPrice = new JTextField();
        JLabel labelQuantity = new JLabel();
        JTextField tfQuantity = new JTextField();
        JLabel labeldes = new JLabel();
        JTextField tfdes = new JTextField();
        JScrollPane jScrollPane1 = new JScrollPane();
        JTable jTable1 = new JTable();
        JLabel labelBuyerDetails = new JLabel();
        JLabel labelTotal = new JLabel();
        JLabel labelPaidAmount = new JLabel();
        JLabel labelReturnAmount = new JLabel();
        JTextField  tfTotal = new JTextField();
        JTextField  tfPaidAmount = new JTextField();
        JTextField  tfReturnAmount = new JTextField();
        JButton buttonReset = new JButton();
        JButton buttonSave = new JButton();
        JButton buttonClose = new JButton();
        JButton buttonAdd = new JButton();

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);

        labelBillingWindow.setFont(new java.awt.Font("Segoe UI", 1, 80)); 
        labelBillingWindow.setForeground(new java.awt.Color(0, 0, 0));
        labelBillingWindow.setText("Billing Window ");
        f.add(labelBillingWindow);
        labelBillingWindow.setBounds(50, 40, 690, 108);

        labelDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        labelDate.setForeground(new java.awt.Color(0, 0, 0));
        labelDate.setText("Date");
        f.add(labelDate);
        labelDate.setBounds(1114, 87, 70, 25);

        labelTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        labelTime.setForeground(new java.awt.Color(0, 0, 0));
        labelTime.setText("Time");
        f.add(labelTime);
        labelTime.setBounds(1114, 139, 70, 25);
        
   	    jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Date");
        f.add(jLabel4);
        jLabel4.setBounds(1294, 87, 113, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Time");
        f.add(jLabel5);
        jLabel5.setBounds(1294, 139, 113, 25);
       

        labelCalculationDetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        labelCalculationDetails.setForeground(new java.awt.Color(0, 0, 0));
        labelCalculationDetails.setText("Calculation Details :");
        f.add(labelCalculationDetails);
        labelCalculationDetails.setBounds(730, 580, 276, 32);

        labelProductDetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        labelProductDetails.setForeground(new java.awt.Color(0, 0, 0));
        labelProductDetails.setText("Product Details :");
        f.add(labelProductDetails);
        labelProductDetails.setBounds(54, 362, 199, 32);

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        labelName.setForeground(new java.awt.Color(0, 0, 0));
        labelName.setText("Name");
        f.add(labelName);
        labelName.setBounds(54, 283, 65, 25);

        tfName.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        tfName.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfName);
        tfName.setBounds(146, 280, 201, 31);

        labelContactNo.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        labelContactNo.setForeground(new java.awt.Color(0, 0, 0));
        labelContactNo.setText("Contact No.");
        f.add(labelContactNo);
        labelContactNo.setBounds(406, 283, 113, 25);

        tfContactNo.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        tfContactNo.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfContactNo);
        tfContactNo.setBounds(525, 280, 201, 31);

        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setText("Email");
        f.add(labelEmail);
        labelEmail.setBounds(792, 283, 79, 25);

        tfEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfEmail);
        tfEmail.setBounds(889, 280, 201, 31);

        labelAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        labelAddress.setForeground(new java.awt.Color(0, 0, 0));
        labelAddress.setText("Address");
        f.add(labelAddress);
        labelAddress.setBounds(1170, 280, 116, 25);

        tfAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        tfAddress.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfAddress);
        tfAddress.setBounds(1320, 280, 200, 31);

        labelid.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        labelid.setForeground(new java.awt.Color(0, 0, 0));
        labelid.setText("Product ID");
        f.add(labelid);
        labelid.setBounds(54, 449, 120, 25);

        tfid.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        tfid.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfid);
        tfid.setBounds(180, 446, 83, 31);

        labelProductName.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        labelProductName.setForeground(new java.awt.Color(0, 0, 0));
        labelProductName.setText("Product Name");
        f.add(labelProductName);
        labelProductName.setBounds(281, 449, 131, 25);

        ProcuctName.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        ProcuctName.setForeground(new java.awt.Color(0, 0, 0));
        f.add(ProcuctName);
        ProcuctName.setBounds(448, 446, 161, 31);

        labelPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        labelPrice.setForeground(new java.awt.Color(0, 0, 0));
        labelPrice.setText("Price");
        f.add(labelPrice);
        labelPrice.setBounds(647, 449, 79, 25);

        tfPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        tfPrice.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfPrice);
        tfPrice.setBounds(732, 446, 153, 31);

        labelQuantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        labelQuantity.setForeground(new java.awt.Color(0, 0, 0));
        labelQuantity.setText("Quantity");
        f.add(labelQuantity);
        labelQuantity.setBounds(903, 449, 101, 25);

        tfQuantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        tfQuantity.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfQuantity);
        tfQuantity.setBounds(1022, 446, 103, 31);

        labeldes.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        labeldes.setForeground(new java.awt.Color(0, 0, 0));
        labeldes.setText("Description");
        f.add(labeldes);
        labeldes.setBounds(1169, 449, 115, 25);

        tfdes.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        tfdes.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfdes);
        tfdes.setBounds(1330, 446, 200, 31);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Price", "Quantity", "Total"
            }
        ));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jTable1.setRowHeight(30);
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
        	jTable1.getColumnModel().getColumn(i).setCellEditor(null);
        }        
        jScrollPane1.setViewportView(jTable1);

        f.add(jScrollPane1);
        jScrollPane1.setBounds(30, 580, 675, 250);

        labelBuyerDetails.setFont(new java.awt.Font("Segoe UI", 1, 24));
        labelBuyerDetails.setForeground(new java.awt.Color(0, 0, 0));
        labelBuyerDetails.setText("Buyer Details :");
        f.add(labelBuyerDetails);
        labelBuyerDetails.setBounds(54, 213, 173, 32);

        labelTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        labelTotal.setForeground(new java.awt.Color(0, 0, 0));
        labelTotal.setText("Total");
        f.add(labelTotal);
        labelTotal.setBounds(730, 650, 86, 25);

        labelPaidAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        labelPaidAmount.setForeground(new java.awt.Color(0, 0, 0));
        labelPaidAmount.setText("Paid Amount");
        f.add(labelPaidAmount);
        labelPaidAmount.setBounds(730, 720, 126, 25);

        labelReturnAmount.setFont(new java.awt.Font("Segoe UI", 1, 18));
        labelReturnAmount.setForeground(new java.awt.Color(0, 0, 0));
        labelReturnAmount.setText("Return Amount ");
        f.add(labelReturnAmount);
        labelReturnAmount.setBounds(730, 790, 170, 25);

        tfTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        tfTotal.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfTotal);
        tfTotal.setBounds(1000, 650, 271, 31);

        tfPaidAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        tfPaidAmount.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfPaidAmount);
        tfPaidAmount.setBounds(1000, 720, 271, 31);

        tfReturnAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        tfReturnAmount.setForeground(new java.awt.Color(0, 0, 0));
        f.add(tfReturnAmount);
        tfReturnAmount.setBounds(1000, 790, 271, 31);

        buttonReset.setBackground(new java.awt.Color(255,255,255));
        buttonReset.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        buttonReset.setForeground(new java.awt.Color(0, 0, 0));
        buttonReset.setText("Reset");
        f.add(buttonReset);
        buttonReset.setBounds(1350, 720, 163, 39);

        buttonSave.setBackground(new java.awt.Color(255,255,255));
        buttonSave.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        buttonSave.setForeground(new java.awt.Color(0, 0, 0));
        buttonSave.setText("Save");
        f.add(buttonSave);
        buttonSave.setBounds(1350, 660, 163, 39);

        buttonClose.setBackground(new java.awt.Color(255,255,255));
        buttonClose.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        buttonClose.setForeground(new java.awt.Color(0, 0, 0));
        buttonClose.setText("Close");
        f.add(buttonClose);
        buttonClose.setBounds(1350, 780, 163, 39);

        buttonAdd.setBackground(new java.awt.Color(255,255,255));
        buttonAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        buttonAdd.setForeground(new java.awt.Color(0, 0, 0));
        buttonAdd.setText("Add");
        f.add(buttonAdd);
        buttonAdd.setBounds(1330, 521, 200, 39);
        
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


        tfName.addActionListener(new ActionListener() {
     
            public void actionPerformed(ActionEvent e) {
            	String name=tfName.getText();
            	 try {
                     String query = "select * from buyer_info where name like '"+name+"%'"; 
                     ResultSet resultSet = MyCon.retrieveData(query);

                     if (resultSet.next()) {
                        tfName.setText(resultSet.getString(1));
                        tfContactNo.setText(resultSet.getString(2));
                        tfEmail.setText(resultSet.getString(3));
                        tfAddress.setText(resultSet.getString(4));

                     } else {
                         tfContactNo.setText("");
                         tfEmail.setText("");
                         tfAddress.setText("");


                     }
                 } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null, e);
                 }
            }
        });
        tfContactNo.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	String contact=tfContactNo.getText();
            	 try {
                     String query = "select * from buyer_info where contactno like '"+contact+"%'"; 
                     ResultSet resultSet = MyCon.retrieveData(query);

                     if (resultSet.next()) {
                        tfName.setText(resultSet.getString(1));
                        tfContactNo.setText(resultSet.getString(2));
                        tfEmail.setText(resultSet.getString(3));
                        tfAddress.setText(resultSet.getString(4));

                     } else {
                         tfName.setText("");
                         tfEmail.setText("");
                         tfAddress.setText("");


                     }
                 } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null, e);
                 }
            }
        });
        
        tfid.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	String id=tfid.getText();
            	 try {
                     String query = "select * from product_info where id ='"+id+"%'"; 
                     ResultSet resultSet = MyCon.retrieveData(query);

                     if (resultSet.next()) {
                        ProcuctName.setText(resultSet.getString(2));
                        tfPrice.setText(resultSet.getString(3));
                        tfdes.setText(resultSet.getString(5));

                     } else {
                         ProcuctName.setText("");
                         tfPrice.setText("");
                         tfdes.setText("");


                     }
                 } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null, e);
                 }
            }
        });
        
        buttonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int price=Integer.parseInt(tfPrice.getText());
            	int quantity=Integer.parseInt(tfQuantity.getText());
            	int total=price*quantity;
            	DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            	model.addRow(new Object[] {ProcuctName.getText(),tfdes.getText(),price,quantity,total});
            	finalTotal=finalTotal+total;
            	String finalTotal1=String.valueOf(finalTotal);
            	tfTotal.setText(finalTotal1);
            	tfTotal.setEditable(false);
            }
        });
        
        
        tfPaidAmount.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	String paidAmount=tfPaidAmount.getText();
            	int z=Integer.parseInt(paidAmount);
            	finalTotal=z-finalTotal;
            	String finalTotal1=String.valueOf(finalTotal);
            	tfReturnAmount.setText(finalTotal1);
            	tfReturnAmount.setEditable(false);
            }
        });
        
        buttonSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String name=tfName.getText();
            	String contactNo=tfContactNo.getText();
            	String email=tfEmail.getText();
            	String address=tfAddress.getText();
            	String path="C:\\Users\\Darshan\\Desktop\\BILL";
            	com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
            	try {
            		PdfWriter.getInstance(doc, new FileOutputStream(path + name + " " + jLabel4.getText() + ".pdf"));
            		doc.open();
            		Paragraph paragraph1=new Paragraph("                                                   Billing Management System\n                                                       Contact Number:(+91)9322506886");                                                                
            		doc.add(paragraph1);
            		Paragraph paragraph2=new Paragraph("Date & Time: "+jLabel5.getText()+" "+labelCalculationDetails.getText()+"\nBuyer Details: \nName: "+name+"\nContact NO "+contactNo+"\nEmail: "+email+"\nAddress "+address+"\n\n");
            		doc.add(paragraph2);
            		PdfPTable tb1=new PdfPTable(5);
            		tb1.addCell("Name");
            		tb1.addCell("Description");
            		tb1.addCell("Price");
            		tb1.addCell("Quantity");
            		tb1.addCell("Sub Total");
            		for(int i=0;i<jTable1.getRowCount();i++) {
            			String n=jTable1.getValueAt(i, 0).toString();
            			String d=jTable1.getValueAt(i, 1).toString();
            			String r=jTable1.getValueAt(i, 2).toString();
            			String q=jTable1.getValueAt(i, 3).toString();
            			String s=jTable1.getValueAt(i, 4).toString();
            			tb1.addCell(n);
            			tb1.addCell(d);
            			tb1.addCell(r);
            			tb1.addCell(q);
            			tb1.addCell(s);

            		}
            		doc.add(tb1);
            		Paragraph paragraph3=new Paragraph("\nTotal  "+tfTotal.getText()+"\nPaid Amount  "+tfPaidAmount.getText()+"\nReturn Amount  "+tfReturnAmount.getText()+"\n\nThanks you for visiting ! Please Come Again. \n Billing Management System");
            		doc.add(paragraph3);
            		JOptionPane.showMessageDialog(null, "Bill Generated");
            		f.setVisible(false);
            		new M();
            		
            	}
            	catch(Exception ex) {
            		JOptionPane.showMessageDialog(null, e);

            	}
            	doc.close();
            }
        });
        
        buttonReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfName.setText("");
                tfContactNo.setText("");
                tfEmail.setText("");
                tfAddress.setText("");
                tfid.setText("");
                ProcuctName.setText("");
                tfPrice.setText("");
                tfQuantity.setText("");
                tfdes.setText("");
                tfTotal.setText("");
                tfPaidAmount.setText("");
                tfReturnAmount.setText("");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0); // Clear the table
                finalTotal = 0;
            }
        });
        
        
        buttonClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        
        f.setSize(1550, 990);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new M();
    }
}
