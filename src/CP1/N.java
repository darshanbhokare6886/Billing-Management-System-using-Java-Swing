package CP1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class N extends JFrame {
    public N() {
        JFrame f = new JFrame("GIF", null);

        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\Darshan\\Downloads\\mn001.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        backgroundLabel.setLayout(null);
        f.setContentPane(backgroundLabel);

        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel1 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 120)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BILLING MANAGEMENT");
        f.add(jLabel2);
        jLabel2.setBounds(230, 350, 1063, 131);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 120)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SYSTEM");
        f.add(jLabel3);
        jLabel3.setBounds(530, 500, 354, 131);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Darshan\\Downloads\\mn001.png")); 
        jLabel1.setText("jLabel1");
        f.add(jLabel1);
        jLabel1.setBounds(0, 0, 1591, 990);

           Timer timer = new Timer(3000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new A();
            }
        });

        timer.setRepeats(false); 
        timer.start();

        f.setSize(1550, 990);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new N();
    }
}