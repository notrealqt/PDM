package UI;

import java.util.*;
import model.*;
import DataAccessObject.*;

public class AddNewProduct extends javax.swing.JFrame {

    public AddNewProduct() {
        initComponents();
        btnSave.setEnabled(false);
    }

    
    public void validateFields(){
        String name = txtName.getText();
        String price = txtPrice.getText();
        if(!name.equals("") && !price.equals(""))
            btnSave.setEnabled(true);
        else
            btnSave.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCategory = new javax.swing.JComboBox<>();
        txtPrice = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 134));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, 30));

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 410, -1));

        txtCategory.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 410, -1));

        txtPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 410, -1));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/small-page-background.png"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(700, 400));
        jLabel6.setMinimumSize(new java.awt.Dimension(700, 400));
        jLabel6.setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Product product = new Product();
        product.setName(txtName.getText());
        product.setCategory((String)txtCategory.getSelectedItem());
        product.setPrice( Double.parseDouble(txtPrice.getText()));
        product.setCategory_ID(CategoryDao.getCategoryByname(product.getCategory()).getId());
        double x = product.getPrice();
        System.out.print(x);
        ProductDao.save(product);
        setVisible(false);
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        validateFields();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        validateFields();
    }//GEN-LAST:event_txtPriceKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ArrayList<Category> list = CategoryDao.getAllRecords();
        Iterator <Category> itr = list.iterator();
        while (itr.hasNext()){
            Category CategoryObj = itr.next();
            txtCategory.addItem(CategoryObj.getName());
            
        }
    }//GEN-LAST:event_formComponentShown

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        setVisible(false);
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> txtCategory;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
