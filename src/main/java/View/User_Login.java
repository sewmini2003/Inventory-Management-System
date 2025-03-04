/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Shafry The Daredevil
 */
public class User_Login extends javax.swing.JFrame {

    /**
     * Creates new form User_Login
     */
    public User_Login() {
        initComponents();
        txtUsername.setBackground(new java.awt.Color(0,0,0,1));
        txtPassword.setBackground(new java.awt.Color(0,0,0,1));
        
    }
    

    // Other code for JFrameB
    // ...

    
        // Use receivedData as needed in this JFrame
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        userline = new javax.swing.JLabel();
        Disable = new javax.swing.JLabel();
        Show = new javax.swing.JLabel();
        btnUserLogin = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        passline = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shafry The Daredevil\\Desktop\\ICONS\\user.png")); // NOI18N
        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 457, 44));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 339, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 340, -1));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 387, 56, 56));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shafry The Daredevil\\Desktop\\ICONS\\user.png")); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 39, 32));

        userline.setForeground(new java.awt.Color(255, 255, 255));
        userline.setText("_________________________________________________________________________");
        jPanel2.add(userline, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 181, 353, 32));

        Disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Disable.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shafry The Daredevil\\Desktop\\ICONS\\eye-off.png")); // NOI18N
        Disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisableMouseClicked(evt);
            }
        });
        jPanel2.add(Disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 43, 41));

        Show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Show.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shafry The Daredevil\\Desktop\\ICONS\\eye.png")); // NOI18N
        Show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMouseClicked(evt);
            }
        });
        jPanel2.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 43, 41));

        btnUserLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnUserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUserLogin.setText("Admin Login");
        btnUserLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserLoginMouseClicked(evt);
            }
        });
        jPanel2.add(btnUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 255));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 314, 412, 33));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 0, 32, 37));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 350, -1));

        passline.setForeground(new java.awt.Color(255, 255, 255));
        passline.setText("_________________________________________________________________________");
        jPanel2.add(passline, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 264, 353, 32));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        txtUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 350, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 460, 440));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shafry The Daredevil\\Documents\\NetBeansProjects\\OOP_project_2023\\src\\main\\java\\View\\LOGORpng_1.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 440));

        setSize(new java.awt.Dimension(877, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myshare","root","");
            String sql="Select * from Usertbl where Username=? and Password=?";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1, txtUsername.getText());
            pst.setString(2, txtPassword.getText());
            ResultSet rs= pst.executeQuery();
            if(rs.next()){
                User_Dashboard UserDash= new User_Dashboard();
                UserDash.setVisible(true);
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            }
            con.close();
        }
            
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void DisableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisableMouseClicked
        txtPassword.setEchoChar((char)0);
        
        Disable.setVisible(false);
        Disable.setVisible(false);
        Show.setVisible(true);
        Show.setVisible(true);
    }//GEN-LAST:event_DisableMouseClicked

    private void ShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseClicked
        txtPassword.setEchoChar((char)8226);
        
        Disable.setVisible(true);
        Disable.setVisible(true);
        Show.setVisible(false);
        Show.setVisible(false);
    }//GEN-LAST:event_ShowMouseClicked

    private void btnUserLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserLoginMouseClicked
        Admin_Login LogUser= new Admin_Login();
        LogUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUserLoginMouseClicked

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
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Disable;
    private javax.swing.JLabel Show;
    private javax.swing.JLabel btnUserLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel passline;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel userline;
    // End of variables declaration//GEN-END:variables
}
