/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurangtmanagementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Home extends javax.swing.JFrame {
    public String email;
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }
    
    public Home(String userEmail) {
        initComponents();
        this.email = userEmail;
        if (!email.equals("admin@gmail.com")) {
            btnManageCat.setVisible(false);
            btnModifyProduct.setVisible(false);
            btnNewProduct.setVisible(false);
            btnVerifyUser.setVisible(false);
            
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogOut = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnChangeSQ = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnManageCat = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnModifyProduct = new javax.swing.JButton();
        btnVerifyUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogOut.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        btnView.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnView.setText("View Bill & Order Detailed");
        getContentPane().add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 0, -1, -1));

        btnPlaceOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPlaceOrder.setText("Place Order");
        getContentPane().add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        btnChangePassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnChangePassword.setText("Change Password");
        getContentPane().add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 0, -1, -1));

        btnChangeSQ.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnChangeSQ.setText("Change Security Question");
        getContentPane().add(btnChangeSQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 0, -1, -1));

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1031, 0, -1, -1));

        btnManageCat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnManageCat.setText("Manage Category");
        btnManageCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCatActionPerformed(evt);
            }
        });
        getContentPane().add(btnManageCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 744, -1, -1));

        btnNewProduct.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNewProduct.setText("New Product");
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 744, -1, -1));

        btnModifyProduct.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModifyProduct.setText("Edit & Delete Product");
        getContentPane().add(btnModifyProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 744, -1, -1));

        btnVerifyUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnVerifyUser.setText("Verify Users");
        getContentPane().add(btnVerifyUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 744, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to log out?", "Select", JOptionPane.YES_NO_OPTION);
        if ( a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close Application?", "Select", JOptionPane.YES_NO_OPTION);
        if ( a == 0) {
            System.exit(0);
        }    
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnManageCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCatActionPerformed
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnManageCatActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnChangeSQ;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageCat;
    private javax.swing.JButton btnModifyProduct;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnVerifyUser;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
