/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepaidwaterbillingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static prepaidwaterbillingsystem.Loginform.setUsername;
import static prepaidwaterbillingsystem.PREPAIDWATERBILLINGSYSTEM.setMeterno;


/**
 *
 * @author kelvinolang
 */
public class userdetails extends javax.swing.JFrame {
    private static String Username;

    Connection conn = null;
    PreparedStatement stmt = null;
    

    /**
     * Creates new form userdetails
     */
    public userdetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phoneno = new javax.swing.JTextField();
        meterno = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        residence = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        repeatpassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 68, 86, 31));

        jLabel2.setBackground(new java.awt.Color(255, 255, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Phoneno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 213, 86, 31));

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Meterno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 139, 86, 31));

        jLabel4.setBackground(new java.awt.Color(255, 255, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Residence");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 376, 86, 31));

        jLabel5.setBackground(new java.awt.Color(255, 255, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 271, 86, 31));
        getContentPane().add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 213, 147, 31));
        getContentPane().add(meterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 139, 139, 31));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 68, 139, 31));
        getContentPane().add(residence, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 376, 147, 31));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 425, 78, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setText("WATER FOR LIFE COMPANY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 340, 39));

        jLabel7.setBackground(new java.awt.Color(255, 255, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Repeat password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 326, 140, 28));

        repeatpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repeatpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(repeatpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 334, 147, 31));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 277, 147, 31));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Images\\istockphoto-1152418742-1024x1024.jpg")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 460));

        setSize(new java.awt.Dimension(816, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        String Username  = name.getText();
        setUsername(Username);
        String Meterno = meterno.getText();
        setMeterno(Meterno);
        String Phoneno = phoneno.getText();
        String Password = password.getText();
        String Repeatpassword =repeatpassword.getText();
        String Residence = residence.getText();
        
        if(Username.isEmpty()|| Meterno.isEmpty() || Phoneno.isEmpty() || Password.isEmpty() || Repeatpassword.isEmpty() || Residence.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill in all the fields");
        } else {
     
        try{
         String CONN_STRING =  "jdbc:mysql://localhost:3306/prepaid water system";
         String USERNAME = "Olang";
         String PASSWORD = "Olang254";
         
         String query = "INSERT userdetails VALUES(?,?,?,?,?,?)";
         
         conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
         
         stmt=conn.prepareStatement(query);
         
         stmt.setString(1,Username);
         stmt.setString(2,Meterno);
         stmt.setString(3,Phoneno);
         stmt.setString(4, Password);
         stmt.setString(5,Repeatpassword);
         stmt.setString(6,Residence);
         
        if((password.getText().equals(repeatpassword.getText()))) {
         stmt.executeUpdate();
         
         dispose();
                Dashboard d = new Dashboard();
                d.setTitle("Dashboard");
                d.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Password did not match");
        }
   
       } catch (Exception e)
            {
         JOptionPane.showMessageDialog(null, e);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void repeatpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repeatpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repeatpasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(userdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField meterno;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneno;
    private javax.swing.JPasswordField repeatpassword;
    private javax.swing.JTextField residence;
    // End of variables declaration//GEN-END:variables
}
