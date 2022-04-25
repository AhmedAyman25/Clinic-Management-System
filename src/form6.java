

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class form6 extends javax.swing.JFrame {

    /**
     * Creates new form form6
     */
    public form6() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JsearchTable = new javax.swing.JTable();
        jTextFilter = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jsearchType = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        ahmedNumPat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ibrahimNumPat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        totalNumPat = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JsearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "phone", "age", "e-mail", "gender", "the disease", "Dr_id"
            }
        ));
        JsearchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JsearchTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JsearchTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 81, 667, 124));

        jTextFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFilterActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 36, 234, 27));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Search");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 36, -1, -1));

        jsearchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pat_id", "name", "age", "gander", "disease", "email", "phone", "Doc_Id" }));
        getContentPane().add(jsearchType, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 36, 71, 27));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 390, 85, -1));
        getContentPane().add(ahmedNumPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 241, 45, 28));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("The number of Dr. ibrahim patients");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 297, 222, 28));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("The number of Dr. Ahmed patients");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 240, 222, 28));
        getContentPane().add(ibrahimNumPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 298, 45, 28));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Total clinic patients");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 353, 222, 28));
        getContentPane().add(totalNumPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 356, 45, 28));

        calculate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        getContentPane().add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 295, 127, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/e.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JsearchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JsearchTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JsearchTableMouseClicked

    private void jTextFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFilterActionPerformed
        // TODO add your handling code here:
                Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic", "root", "root");
            String sql ;
            if (jsearchType.getSelectedItem().toString().equals("Pat_id")){
            sql = "select * from patint where pat_id like '"+jTextFilter.getText()+ "%'";
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             JsearchTable.setModel(DbUtils.resultSetToTableModel(rs));}
            else if (jsearchType.getSelectedItem().toString().equals("name")){
            sql = "select * from patint where Pat_name like '"+jTextFilter.getText()+ "%'";
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             JsearchTable.setModel(DbUtils.resultSetToTableModel(rs));}
            else if (jsearchType.getSelectedItem().toString().equals("age")){
            sql = "select * from patint where Pat_age like '"+jTextFilter.getText()+ "%'";
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             JsearchTable.setModel(DbUtils.resultSetToTableModel(rs));}
            else if (jsearchType.getSelectedItem().toString().equals("gander")){
            sql = "select * from patint where M_F_type like '"+jTextFilter.getText()+ "%'";
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             JsearchTable.setModel(DbUtils.resultSetToTableModel(rs));}
            else if (jsearchType.getSelectedItem().toString().equals("disease")){
            sql = "select * from patint where Pat_disease like '"+jTextFilter.getText()+ "%'";
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             JsearchTable.setModel(DbUtils.resultSetToTableModel(rs));}
            else if (jsearchType.getSelectedItem().toString().equals("email")){
            sql = "select * from patint where Pat_email like '"+jTextFilter.getText()+ "%'";
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             JsearchTable.setModel(DbUtils.resultSetToTableModel(rs));}
            else if (jsearchType.getSelectedItem().toString().equals("phone")){
            sql = "select * from patint where Pat_Phone_num like '"+jTextFilter.getText()+ "%'";
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             JsearchTable.setModel(DbUtils.resultSetToTableModel(rs));}
            else if (jsearchType.getSelectedItem().toString().equals("Doc_Id")){
            sql = "select * from patint where Doc_id like '"+jTextFilter.getText()+ "%'";
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             JsearchTable.setModel(DbUtils.resultSetToTableModel(rs));}
        } catch (SQLException ex) {
            Logger.getLogger(form6.class.getName()).log(Level.SEVERE, null, ex);
        }
                                 
    }//GEN-LAST:event_jTextFilterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
       
         
        Connection con;
         try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic", "root", "root");
             String sql = "select count(Pat_id) from patint where Doc_id = 1";
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             String num1;
            if(rs.next()){
             num1 = String.valueOf(rs.getInt(1));
        ahmedNumPat.setText(num1);}
            String sql2 = "select count(Pat_id) from patint where Doc_id = 2";
             PreparedStatement est = con.prepareStatement(sql2);
             ResultSet rs2 = est.executeQuery();
             String num2;
            if(rs2.next()){
             num2 = String.valueOf(rs2.getInt(1));
        ibrahimNumPat.setText(num2);}
             String sql3 = "select count(Pat_id) from patint ";
             PreparedStatement ent = con.prepareStatement(sql3);
             ResultSet rs3 = ent.executeQuery();
             String num3;
             int size;
            if(rs3.next()){
                size=rs3.getInt(1);
             num3 = String.valueOf(size);
        totalNumPat.setText(num3);
            if (size<=10)
                JOptionPane.showMessageDialog(this, "The number of patients is less than usual");
            else if (size>10&&size<=25)
                JOptionPane.showMessageDialog(this, "The number of patients is normal");
            else
               JOptionPane.showMessageDialog(this, "The number of patients is more than usual"); 
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(form6.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_calculateActionPerformed

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
            java.util.logging.Logger.getLogger(form6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JsearchTable;
    private javax.swing.JTextField ahmedNumPat;
    private javax.swing.JButton calculate;
    private javax.swing.JTextField ibrahimNumPat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFilter;
    private javax.swing.JComboBox<String> jsearchType;
    private javax.swing.JTextField totalNumPat;
    // End of variables declaration//GEN-END:variables
}
