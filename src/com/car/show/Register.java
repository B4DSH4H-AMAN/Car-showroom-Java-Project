package com.car.show;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author badsh
 */
public class Register extends javax.swing.JFrame {
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        ph = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 98, -1));
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 98, -1));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 98, -1));

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 60, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Phone No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 90, -1));
        getContentPane().add(ph, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 90, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\Project\\Database\\Showroom\\src\\com\\car\\show\\bmw_headlights_black_style_99557_1920x1080.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(final java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        final String firstName = fname.getText();
        final String userName = uname.getText();
        final String passWord = pass.getText();
        final String address = add.getText();
        final String number = ph.getText();


        if(firstName.isEmpty()|| userName.isEmpty()|| passWord.isEmpty() ){
            JOptionPane.showMessageDialog(null,"Fill up the form properly");
        }else{
            //Start the Login
            userRegister(firstName,userName,passWord,address,number);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (final javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (final ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField ph;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables

    private void userRegister(String firstName, String userName, String passWord, String address, String number) {
        connection = MysqlConnect.ConnectDB();
        String Sql = "INSERT INTO CUSTOMER (username, name, password,address,phone_number) VALUES (?,?,?,?,?)";

        try {
            pst = connection.prepareStatement(Sql);
            pst.setString(1, userName);
            pst.setString(2, firstName);
            pst.setString(3, passWord);
            pst.setString(4, address);
            pst.setString(5, number);

            int rs = pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Account Created, You can now Login");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
