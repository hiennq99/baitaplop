/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminForm;

import Dao.DiaDiem;
import controller.DAOdiaDiem;
import controller.DAOuser;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import validate.Validator;

/**
 *
 * @author nvta1
 */
public class QuanLyDiaDiem extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyDiaDiem
     */
    private final String[] header = {"STT", "Mã Địa Điểm", "Tên Địa Điểm", "Mã QG"};
    private ArrayList<DiaDiem> items = new ArrayList<>();
    private int selectedIndex;
    private DefaultTableModel model;

    public QuanLyDiaDiem() {
        initComponents();
        model = (DefaultTableModel) tbQuanLyDiaDiem.getModel();
        model.setColumnIdentifiers(header);
        showTable();
    }
    class jPanelGradient extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
            Color color1 = new Color(255,255,255);
            Color color2 = new Color(200,255,255);
            GradientPaint gp = new GradientPaint(0,0,color1,180,height,color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }

    public void clearText() {
        txtMaDD.setText("");
        txtTenDD.setText("");
        txtMaQG.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new jPanelGradient();
        jlable6 = new javax.swing.JLabel();
        txtMaQG = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaDD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbQuanLyDiaDiem = new javax.swing.JTable();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtTenDD = new javax.swing.JTextField();
        btnThoai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Địa Điểm");

        jlable6.setText("Mã quốc gia");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Quản Lý Địa Điểm");

        jLabel2.setText("Mã địa điểm");

        jLabel4.setText("Tên địa điểm");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        tbQuanLyDiaDiem.setBackground(new java.awt.Color(204, 255, 255));
        tbQuanLyDiaDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbQuanLyDiaDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQuanLyDiaDiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbQuanLyDiaDiem);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThoai.setText("Thoát");
        btnThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(btnThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtMaDD, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtTenDD, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(jlable6)
                            .addGap(18, 18, 18)
                            .addComponent(txtMaQG, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(215, 215, 215)
                            .addComponent(jLabel1)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtMaDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtTenDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlable6)
                        .addComponent(txtMaQG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnThoai)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addGap(0, 90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(950, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        boolean isSuccess = true;
        ArrayList<Validator> data = new ArrayList<>();
        Validator maDD = new Validator(txtMaDD.getText(), new String[]{"required"}, "Mã địa điểm"),
                tenDD = new Validator(txtTenDD.getText(), new String[]{"required", "isString"}, "Tên địa điểm"),
                maQG = new Validator(txtMaQG.getText(), new String[]{"required"}, "Mã quốc gia");
        data.add(maDD);
        data.add(tenDD);
        data.add(maQG);
        for (Validator s : data) {
            if (!s.setTextField(this)) {
                isSuccess = false;
            }
        }
        if (isSuccess) {
            DiaDiem item = new DiaDiem(maDD.getText(), tenDD.getText(), maQG.getText().toUpperCase());
            if (new DAOdiaDiem().addItem(item)) {
                this.showTable();
                JOptionPane.showMessageDialog(this, "Thêm mới thành công!");
                clearText();
            } else {
                JOptionPane.showMessageDialog(this, "Địa Điểm đã tồn tại!");
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tbQuanLyDiaDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQuanLyDiaDiemMouseClicked
        // TODO add your handling code here:
        int rơw = tbQuanLyDiaDiem.getSelectedRow();
        txtMaDD.setText(model.getValueAt(rơw, 1).toString());
        txtTenDD.setText(model.getValueAt(rơw, 2).toString());
        txtMaQG.setText(model.getValueAt(rơw, 3).toString());

    }//GEN-LAST:event_tbQuanLyDiaDiemMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        boolean isSuccess = true;
        ArrayList<Validator> data = new ArrayList<>();
        Validator maDD = new Validator(txtMaDD.getText(), new String[]{"required"}, "Mã địa điểm"),
                tenDD = new Validator(txtTenDD.getText(), new String[]{"required", "isString"}, "Tên địa điểm"),
                maQG = new Validator(txtMaQG.getText(), new String[]{"required"}, "Mã quốc gia");
        data.add(maDD);
        data.add(tenDD);
        data.add(maQG);
        for (Validator s : data) {
            if (!s.setTextField(this)) {
                isSuccess = false;
            }
        }
        if (isSuccess) {
            DiaDiem item = new DiaDiem(txtMaDD.getText(), txtTenDD.getText(), txtMaQG.getText());
            if (new DAOdiaDiem().updateItem(item)) {
                this.showTable();
                JOptionPane.showMessageDialog(this, "Sửa mới thành công!");
                clearText();
            } else {
                JOptionPane.showMessageDialog(this, "Không sửa được");
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        DiaDiem item = new DiaDiem(txtMaDD.getText(), txtTenDD.getText(), txtMaQG.getText());
        if (new DAOdiaDiem().deleteItem(item)) {
            this.showTable();
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
            clearText();
        } else {
            JOptionPane.showMessageDialog(this, "Không xóa được");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoaiActionPerformed
        // TODO add your handling code here:
        MenuQuanLy a= new MenuQuanLy();
        a.show();
        this.dispose();
    }//GEN-LAST:event_btnThoaiActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyDiaDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiaDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiaDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiaDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyDiaDiem().setVisible(true);
            }
        });
    }

    // hien thi danh sach
    public void showTable() {
        items = new DAOdiaDiem().getAllDiaDiem();
        model.setRowCount(0);
        for (DiaDiem item : items) {
            model.addRow(new Object[]{
                model.getRowCount() + 1, item.getMaDiaDiem(), item.getTenDiaDiem(), item.getMaQG()
            });
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlable6;
    private javax.swing.JTable tbQuanLyDiaDiem;
    private javax.swing.JTextField txtMaDD;
    private javax.swing.JTextField txtMaQG;
    private javax.swing.JTextField txtTenDD;
    // End of variables declaration//GEN-END:variables
}
