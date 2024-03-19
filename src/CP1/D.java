package CP1;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class D extends JFrame{
    public D(){
        JFrame f=new JFrame("ProductInfo", null);

        ImageIcon backgroundImage = new ImageIcon("C:/Users/Darshan/Downloads/mn4.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        backgroundLabel.setLayout(null);
        f.setContentPane(backgroundLabel);
        
        JLabel labelProductInfo = new JLabel();
        JButton buttonDeleteProduct = new JButton();
        JButton buttonUpdateProduct = new JButton();
        JButton buttonAddProduct = new JButton();
        JButton buttonProductDetails = new JButton();

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);

        labelProductInfo.setFont(new java.awt.Font("Segoe UI", 1, 80)); 
        labelProductInfo.setForeground(new java.awt.Color(255,255,255));
        labelProductInfo.setText("Product Information");
        f.add(labelProductInfo);
        labelProductInfo.setBounds(400, 90, 1008, 108);

        buttonAddProduct.setBackground(new java.awt.Color(255,255,255));
        buttonAddProduct.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        buttonAddProduct.setForeground(new java.awt.Color(0, 0, 0));
        buttonAddProduct.setText("Add Product");
        f.add(buttonAddProduct);
        buttonAddProduct.setBounds(220, 310, 400, 71);

        buttonUpdateProduct.setBackground(new java.awt.Color(255,255,255));
        buttonUpdateProduct.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        buttonUpdateProduct.setForeground(new java.awt.Color(0, 0, 0));
        buttonUpdateProduct.setText("Update Product");
        f.add(buttonUpdateProduct);
        buttonUpdateProduct.setBounds(960, 310, 400, 71);

        buttonDeleteProduct.setBackground(new java.awt.Color(255,255,255));
        buttonDeleteProduct.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        buttonDeleteProduct.setForeground(new java.awt.Color(0, 0, 0));
        buttonDeleteProduct.setText("Delete Product");
        f.add(buttonDeleteProduct);
        buttonDeleteProduct.setBounds(220, 580, 400, 71);

        buttonProductDetails.setBackground(new java.awt.Color(255,255,255));
        buttonProductDetails.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        buttonProductDetails.setForeground(new java.awt.Color(0, 0, 0));
        buttonProductDetails.setText("Product Details");
        f.add(buttonProductDetails);
        buttonProductDetails.setBounds(960, 580, 400, 71);
        
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


        buttonAddProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new H();
            }

        });

        buttonUpdateProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new I();
            }

        });

        buttonDeleteProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new J();

            }

        });

        buttonProductDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new L();

            }

        });

        f.setSize(1550, 990);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new D();
    }
}
