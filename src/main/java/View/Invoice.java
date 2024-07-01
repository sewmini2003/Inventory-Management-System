/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.protocol.ResultsetRow;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shafry The Daredevil
 */
public class Invoice extends javax.swing.JPanel {

    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
        dataLoad();
       
    }

   public void dataLoad(){
   
       try {
           
           DefaultTableModel dt = (DefaultTableModel) inv_tbl.getModel();
           dt.setRowCount(0);
           
           Statement s = database.mycon().createStatement();
           ResultSet rs = s.executeQuery("SELECT * FROM salestbl");
           
           
           while (rs.next()){
           Vector v = new Vector();
           
           v.add(rs.getString(1));
           v.add(rs.getString(2));
           v.add(rs.getString(3));
           v.add(rs.getString(4));
           v.add(rs.getString(5));
           v.add(rs.getString(6));
           v.add(rs.getString(7));
           v.add(rs.getString(8));
           
           dt.addRow(v);
           
           
           
           }
           
           
       } catch (SQLException e) {
           
           System.out.println(e);
       }
   }
    public void tbl_data(){
    
    
        String invid = inidSearch.getText();
        String c_name=cus_search.getText();
        String stts = com_pay.getSelectedItem().toString();
        
        try {
            
            DefaultTableModel dt= (DefaultTableModel) inv_tbl.getModel();
            dt.setRowCount(0);
            
            Statement s=database.mycon().createStatement();
            
            ResultSet rs =s.executeQuery("SELECT * From salestbl WHERE INID LIKE '%"+invid+"%' AND Customer_Name LIKE '%"+c_name+"%' AND Status LIKE '%"+stts+"%'");
            
            while (rs.next()) {

                Vector v =new Vector();
                
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                
                dt.addRow(v);
                
                }   
            }
            catch(SQLException e){
                    System.out.println(e);
                    dataLoad();
                    
            }
        
    }
   
   
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        inv_tbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        inidSearch = new javax.swing.JTextField();
        cus_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        com_pay = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        inv_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SaleID", "INID", "CID", "Customer_Name", "Total_Qty", "Total BIll", "Status", "Balance"
            }
        ));
        jScrollPane1.setViewportView(inv_tbl);

        jLabel1.setText("INID  :");

        inidSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inidSearchActionPerformed(evt);
            }
        });
        inidSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inidSearchKeyReleased(evt);
            }
        });

        cus_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_searchActionPerformed(evt);
            }
        });
        cus_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cus_searchKeyReleased(evt);
            }
        });

        jLabel2.setText("Customer Name  :");

        jLabel3.setText("Payments   :");

        com_pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paid", "Partial", "UnPaid", " " }));
        com_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_payActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inidSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cus_search, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(com_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 372, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inidSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cus_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(com_pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inidSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inidSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inidSearchActionPerformed

    private void cus_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cus_searchActionPerformed

    private void inidSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inidSearchKeyReleased
        tbl_data();
            
    }//GEN-LAST:event_inidSearchKeyReleased

    private void cus_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cus_searchKeyReleased
        tbl_data();
      
    }//GEN-LAST:event_cus_searchKeyReleased

    private void com_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_payActionPerformed
        tbl_data();
    }//GEN-LAST:event_com_payActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dataLoad();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> com_pay;
    private javax.swing.JTextField cus_search;
    private javax.swing.JTextField inidSearch;
    private javax.swing.JTable inv_tbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
