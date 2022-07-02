/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.ThongKeDAO;
import DTO.TongDKVeThangDTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FThongKeVeThang extends javax.swing.JFrame {

    DefaultTableModel tblModel = new DefaultTableModel();

    /**
     * Creates new form FThongKeVeThang
     */
    public FThongKeVeThang() {
        initComponents();
        setSize(1270, 720);
        setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀN QUẢN LÝ BÃI GỬI XE");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        showTable();
        loadAll();
        loadCountAll();
        loadTien();
    }

    private void showTable() {
        tblModel.setColumnIdentifiers(new String[]{"STT", "Mã Vé", "Tên Khách", "SDT", "Biển Số", "Loại Xe", "Màu Xe", "Ngày Đăng Ký", "Tiền"});
        TableDKVeThang.setModel(tblModel);
    }

    private void loadAll() {
        ArrayList<TongDKVeThangDTO> list = ThongKeDAO.loadTableVethang();
        DefaultTableModel tblModel = (DefaultTableModel) TableDKVeThang.getModel();
        Object[] row = new Object[9];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getStt();
            row[1] = list.get(i).getMaVethang();
            row[2] = list.get(i).getTenKhach();
            row[3] = list.get(i).getSdt();
            row[4] = list.get(i).getBienSo();
            row[5] = list.get(i).getLoaiXe();
            row[6] = list.get(i).getMauXe();
            row[7] = list.get(i).getNgayDk();
            row[8] = list.get(i).getSoTien();
            tblModel.addRow(row);
        }
    }

    private void find(String TuNgay, String DenNgay) {
        ArrayList<TongDKVeThangDTO> list = ThongKeDAO.findDKYVETHANG(TuNgay, DenNgay);
        DefaultTableModel tblModel = (DefaultTableModel) TableDKVeThang.getModel();
        Object[] row = new Object[9];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getStt();
            row[1] = list.get(i).getMaVethang();
            row[2] = list.get(i).getTenKhach();
            row[3] = list.get(i).getSdt();
            row[4] = list.get(i).getBienSo();
            row[5] = list.get(i).getLoaiXe();
            row[6] = list.get(i).getMauXe();
            row[7] = list.get(i).getNgayDk();
            row[8] = list.get(i).getSoTien();
            tblModel.addRow(row);
        }
    }

    private void loadCountTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String TuNgay = sdf.format(tuNgay.getDate());
        String DenNgay = sdf.format(denNgay.getDate());
        ThongKeDAO tk = new ThongKeDAO();
        txtTongVT.setText(tk.loadCountTime2(TuNgay, DenNgay));
    }

    private void loadCountAll() {
        ThongKeDAO tk = new ThongKeDAO();
        txtTongVT.setText(tk.loadCountAll2());
    }

    private void loadTien() {
        ThongKeDAO tk = new ThongKeDAO();
        txtTongTien.setText(tk.loadTien());
    }

    private void loadTienTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String TuNgay = sdf.format(tuNgay.getDate());
        String DenNgay = sdf.format(denNgay.getDate());
        ThongKeDAO tk = new ThongKeDAO();
        txtTongTien.setText(tk.loadTienTime(TuNgay, DenNgay));
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDKVeThang = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTongVT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnQuayLai = new javax.swing.JButton();
        tuNgay = new com.toedter.calendar.JDateChooser();
        denNgay = new com.toedter.calendar.JDateChooser();
        btnTracuu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1270, 720));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thống Kê Lượt Đăng Kí Vé Tháng");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        TableDKVeThang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Vé", "Tên Khách Hàng", "Số Điện Thoại", "Loại Xe", "Biển Số Xe", "Màu Xe", "Ngày Đăng Ký", "Giá Vé"
            }
        ));
        jScrollPane1.setViewportView(TableDKVeThang);
        if (TableDKVeThang.getColumnModel().getColumnCount() > 0) {
            TableDKVeThang.getColumnModel().getColumn(0).setPreferredWidth(80);
            TableDKVeThang.getColumnModel().getColumn(0).setMaxWidth(80);
            TableDKVeThang.getColumnModel().getColumn(1).setPreferredWidth(200);
            TableDKVeThang.getColumnModel().getColumn(1).setMaxWidth(200);
            TableDKVeThang.getColumnModel().getColumn(3).setPreferredWidth(100);
            TableDKVeThang.getColumnModel().getColumn(3).setMaxWidth(100);
            TableDKVeThang.getColumnModel().getColumn(4).setPreferredWidth(150);
            TableDKVeThang.getColumnModel().getColumn(4).setMaxWidth(150);
            TableDKVeThang.getColumnModel().getColumn(5).setPreferredWidth(120);
            TableDKVeThang.getColumnModel().getColumn(5).setMaxWidth(120);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tổng Tiền :");

        txtTongTien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongTien.setBorder(null);
        txtTongTien.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTongTien.setEnabled(false);
        txtTongTien.setName("txtTongTienThang"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("VND");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Số lượt đăng kí trong tháng :");

        txtTongVT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTongVT.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongVT.setBorder(null);
        txtTongVT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTongVT.setEnabled(false);
        txtTongVT.setFocusable(false);
        txtTongVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongVTActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("lượt");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTongVT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(66, 66, 66)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtTongVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnQuayLai.setBackground(new java.awt.Color(102, 102, 255));
        btnQuayLai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.setBorder(null);
        btnQuayLai.setBorderPainted(false);
        btnQuayLai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuayLai.setFocusPainted(false);
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        tuNgay.setDateFormatString("yyyy-MM-dd");
        tuNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        denNgay.setDateFormatString("yyyy-MM-dd");
        denNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnTracuu.setBackground(new java.awt.Color(102, 102, 255));
        btnTracuu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTracuu.setText("Tra Cứu");
        btnTracuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTracuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTracuuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Đến ngày");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Từ ngày");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 266, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(denNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTracuu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 266, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(denNgay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tuNgay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTracuu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnTracuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTracuuActionPerformed
        if (tuNgay.getDate() == null && denNgay.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Chưa nhập thời gian!");
        } else if (tuNgay.getDate() == null && denNgay.getDate() != null) {
            JOptionPane.showMessageDialog(this, "Chưa nhập thời gian bắt đầu!");
        } else if (tuNgay.getDate() != null && denNgay.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Chưa nhập thời gian kết thúc!");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String TuNgay = sdf.format(tuNgay.getDate());
            String DenNgay = sdf.format(denNgay.getDate());
            find(TuNgay, DenNgay);
            loadCountTime();
            loadTienTime();
        }
    }//GEN-LAST:event_btnTracuuActionPerformed

    private void txtTongVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongVTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongVTActionPerformed

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
            java.util.logging.Logger.getLogger(FThongKeVeThang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FThongKeVeThang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FThongKeVeThang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FThongKeVeThang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FThongKeVeThang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableDKVeThang;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnTracuu;
    private com.toedter.calendar.JDateChooser denNgay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser tuNgay;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtTongVT;
    // End of variables declaration//GEN-END:variables
}
