package hospitalmanagement;

import java.awt.*;
import javax.swing.*;
public class HomePage extends javax.swing.JFrame {

    
    public HomePage() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/images/hospital management logo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 0, 942, 140);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/images/login.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 380, 350, 90);

        jLabel2.setText("Enter Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 200, 110, 50);

        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 280, 100, 50);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(250, 200, 340, 50);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(250, 280, 340, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/images/aboutus1.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(730, 180, 390, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = jTextField1.getText();
        String password = jPasswordField1.getText();

        if(name.equals("admin") && password.equals("admin"))
        {
         AdminPanel admin = new AdminPanel();
         admin.setSize(1400,700);
admin.setVisible(true);
        }
 else
        {
          JOptionPane.showMessageDialog(this , "Login Failed");
 }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       About abt = new About();
         abt.setSize(1400,700);
abt.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomePage home = new HomePage();
                home.setSize(1400,700);
                home.setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
   

}

