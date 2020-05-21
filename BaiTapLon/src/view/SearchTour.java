/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.DiaDiem;
import Dao.Tour;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author quang
 */
public class SearchTour extends javax.swing.JFrame {

    /**
     * Creates new form SearchTour
     */
    private static ArrayList<DiaDiem> listDD ;
    private static ArrayList<Tour> listTour;
    public DBConnector db = new DBConnector();
    private static String query=null;
    private static Connection con=null;
    private static Statement st=null;
    private static ResultSet rs=null;
    public SearchTour() {
        db.establishConnection("jdbc:derby://localhost:1527/BTL", "admins", "123");
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
        jPanel1 = new javax.swing.JPanel();
        btnNuocngoai = new javax.swing.JButton();
        btnTrongnuoc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbDiemden = new javax.swing.JComboBox();
        cbKhoihanh = new javax.swing.JComboBox();
        cbGia = new javax.swing.JComboBox();
        btnXacnhan = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Công ty du lịch VietTravel");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnNuocngoai.setText("Du Lịch Nước Ngoài");
        btnNuocngoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuocngoaiActionPerformed(evt);
            }
        });

        btnTrongnuoc.setText("Du Lịch Trong Nước");
        btnTrongnuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrongnuocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnTrongnuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(btnNuocngoai, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNuocngoai, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnTrongnuoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Khởi Hành");

        jLabel3.setText("Điểm Đến");

        jLabel4.setText("Ngày đi");

        jLabel5.setText("Giá");

        cbDiemden.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbKhoihanh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbGia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnXacnhan.setText("Tìm Tour");
        btnXacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacnhanActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(225, 225, 225)))
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbKhoihanh, 0, 204, Short.MAX_VALUE)
                                    .addComponent(jTextField1))))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDiemden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbKhoihanh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbDiemden, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cbGia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList getTrongNuoc(String query) throws Exception
    {
        //Lay thong tin trong nuoc
//        query = "select * from DIADIEM where MaQG='QG01'";
        rs = db.queryData(query);
        while(rs.next())
        {
            DiaDiem dd = new DiaDiem();
            dd.setMaDiaDiem(rs.getString("MaDD"));
            dd.setTenDiaDiem(rs.getString("TenDD"));
            dd.setMaQG(rs.getString("MaQG"));
            listDD.add(dd);
        }
        return listDD;
    }
    public ArrayList layGiaTien(String query) throws Exception
    {
        rs = db.queryData(query);
        while(rs.next())
        {
            Tour t = new Tour();
            t.setGia(rs.getString("MaTour"));
            t.setTenTour(rs.getString("TenTour"));
            t.setNgayKH(rs.getString("NgayKH"));
            t.setThoiLuong(rs.getInt("ThoiLuong"));
            t.setNoiKH(rs.getString("NoiKH"));
            t.setNoiDen(rs.getString("NoiDen"));
            t.setGia(rs.getString("Gia"));
            listTour.add(t);
        }
        return listTour;
    }
    private void btnTrongnuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrongnuocActionPerformed
        // TODO add your handling code here:
       listDD = new ArrayList<>();
       listTour = new ArrayList<>();
       Tour t = new Tour();
       query = "select * from DIADIEM where MaQG='QG01'";
        try {
            listTour = layGiaTien("select * from Tour");
            
        } catch (Exception ex) {
            Logger.getLogger(SearchTour.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            listDD=getTrongNuoc(query);
//            System.out.println(listDD);
        } catch (Exception ex) {
            Logger.getLogger(SearchTour.class.getName()).log(Level.SEVERE, null, ex);
        }
        cbGia.setModel(new DefaultComboBoxModel(listTour.toArray()));
        cbKhoihanh.setModel(new DefaultComboBoxModel(listDD.toArray()));
        cbDiemden.setModel(new DefaultComboBoxModel(listDD.toArray()));
        
    }//GEN-LAST:event_btnTrongnuocActionPerformed

    private void btnXacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacnhanActionPerformed
        // TODO add your handling code here:
        DSTour ds = new DSTour();
        ds.show();
    }//GEN-LAST:event_btnXacnhanActionPerformed

    private void btnNuocngoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuocngoaiActionPerformed
        // TODO add your handling code here:
        listDD = new ArrayList<>();
        listTour = new ArrayList<>();
       query = "select * from DIADIEM where MaQG='QG02'";
        try {
            listTour = layGiaTien("select * from Tour");
            listDD=getTrongNuoc(query);
//            System.out.println(listDD);
        } catch (Exception ex) {
            Logger.getLogger(SearchTour.class.getName()).log(Level.SEVERE, null, ex);
        }
        cbGia.setModel(new DefaultComboBoxModel(listTour.toArray()));
        cbKhoihanh.setModel(new DefaultComboBoxModel(listDD.toArray()));
        cbDiemden.setModel(new DefaultComboBoxModel(listDD.toArray()));
    }//GEN-LAST:event_btnNuocngoaiActionPerformed

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
            java.util.logging.Logger.getLogger(SearchTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchTour().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnNuocngoai;
    private javax.swing.JButton btnTrongnuoc;
    private javax.swing.JButton btnXacnhan;
    private javax.swing.JComboBox cbDiemden;
    private javax.swing.JComboBox cbGia;
    private javax.swing.JComboBox cbKhoihanh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
