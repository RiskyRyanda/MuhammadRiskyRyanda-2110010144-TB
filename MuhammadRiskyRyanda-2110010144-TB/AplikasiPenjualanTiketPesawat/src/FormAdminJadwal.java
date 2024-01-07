/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author acer
 */

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class FormAdminJadwal extends javax.swing.JInternalFrame {
    
    private final Connection conn;
    private DefaultTableModel tabmode;
    protected void aktif() {
        txtIdJadwal.setEnabled(true);
        txtKeberangkatan.setEnabled(true);
        txtKedatangan.setEnabled(true);
        txtHarga.setEnabled(true);
    }
    protected void kosong() {
        txtIdJadwal.setText("");
        txtKeberangkatan.setText("");
        txtKedatangan.setText("");
        txtHarga.setText("");
    }
    public FormAdminJadwal() throws SQLException{
        initComponents();
        this.conn = config.configDB();
        initComponents();
        cb_pesawat.removeAllItems();
        cb_kotaawal.removeAllItems();
        cb_kotatujuan.removeAllItems();
        load_data();
        datatable();
    }
    protected void datatable() {
        Object[] Baris = {"ID_JADWAL", "ID_PESAWAT", "KOTA_AWAL", "KOTA_TUJUAN", "KEBERANGKATAN", "KEDATANGAN", "HARGA"};
        tabmode = new DefaultTableModel(null, Baris);
        tbl_jadwal.setModel(tabmode);
        String sql = "select * from jadwal";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String id_jadwal = hasil.getString("ID_JADWAL");
                String id_pesawat = hasil.getString("ID_PESAWAT");
                String kota_awal = hasil.getString("KOTA_AWAL");
                String kota_tujuan = hasil.getString("KOTA_TUJUAN");
                String keberangkatan = hasil.getString("KEBERANGKATAN");
                String kedatangan = hasil.getString("KEDATANGAN");
                String harga = hasil.getString("HARGA");

                String[] data = {id_jadwal, id_pesawat, kota_awal, kota_tujuan, keberangkatan, kedatangan, harga};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
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

        jPanel1 = new javax.swing.JPanel();
        lblJadwal = new javax.swing.JLabel();
        lblIDJadwal = new javax.swing.JLabel();
        lblIDPesawat = new javax.swing.JLabel();
        lblKotaAwal = new javax.swing.JLabel();
        lblKotaTujuan = new javax.swing.JLabel();
        lblKeberangkatan = new javax.swing.JLabel();
        lblKedatangan = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        txtIdJadwal = new javax.swing.JTextField();
        txtKeberangkatan = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtHarga = new javax.swing.JTextField();
        txtKedatangan = new javax.swing.JTextField();
        cb_kotaawal = new javax.swing.JComboBox<>();
        cb_pesawat = new javax.swing.JComboBox<>();
        cb_kotatujuan = new javax.swing.JComboBox<>();
        btnCetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_jadwal = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(104, 142, 78));
        jPanel1.setMaximumSize(new java.awt.Dimension(896, 507));
        jPanel1.setMinimumSize(new java.awt.Dimension(896, 507));
        jPanel1.setPreferredSize(new java.awt.Dimension(896, 507));

        lblJadwal.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        lblJadwal.setText("JADWAL");

        lblIDJadwal.setText("ID JADWAL");

        lblIDPesawat.setText("ID PESAWAT");

        lblKotaAwal.setText("KOTA AWAL");

        lblKotaTujuan.setText("KOTA TUJUAN");

        lblKeberangkatan.setText("KEBERANGKATAN");

        lblKedatangan.setText("KEDATANGAN");

        lblHarga.setText("HARGA");

        btnTambah.setBackground(new java.awt.Color(255, 255, 51));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Tambah.png"))); // NOI18N
        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(51, 255, 51));
        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Ubah.png"))); // NOI18N
        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 51, 51));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hapus.png"))); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(51, 255, 204));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Clear.png"))); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCetak.setBackground(new java.awt.Color(153, 153, 153));
        btnCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cetak.png"))); // NOI18N
        btnCetak.setText("CETAK");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        tbl_jadwal.setBackground(new java.awt.Color(204, 204, 204));
        tbl_jadwal.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_jadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_jadwalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_jadwal);

        btnExit.setBackground(new java.awt.Color(102, 153, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Exit.png"))); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIDJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIDPesawat)
                                    .addComponent(lblKotaAwal)
                                    .addComponent(lblKotaTujuan)
                                    .addComponent(lblKeberangkatan))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKeberangkatan, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtHarga)
                                    .addComponent(txtKedatangan, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cb_kotaawal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_pesawat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_kotatujuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtIdJadwal)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKedatangan)
                                    .addComponent(lblHarga))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(169, 169, 169))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUbah)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addGap(16, 16, 16)
                        .addComponent(btnCetak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(403, 403, 403)
                            .addComponent(lblJadwal))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDJadwal)
                    .addComponent(txtIdJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDPesawat)
                    .addComponent(cb_pesawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKotaAwal)
                    .addComponent(cb_kotaawal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKotaTujuan)
                    .addComponent(cb_kotatujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKeberangkatan)
                    .addComponent(txtKeberangkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKedatangan)
                    .addComponent(txtKedatangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHarga)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnClear)
                    .addComponent(btnCetak)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String sql = "insert into jadwal values (?,?,?,?,?,?,?)";
        String pesawat = String.valueOf(cb_pesawat.getSelectedItem());
        String kotaawal = String.valueOf(cb_kotaawal.getSelectedItem());
        String kotatujuan = String.valueOf(cb_kotatujuan.getSelectedItem());
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtIdJadwal.getText());
            stat.setString(2, pesawat.substring(0, 4));
            stat.setString(3, kotaawal.substring(0, 4));
            stat.setString(4, kotatujuan.substring(0, 4));
            stat.setString(5, txtKeberangkatan.getText());
            stat.setString(6, txtKedatangan.getText());
            stat.setString(7, txtHarga.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DISIMPAN");
            kosong();
            txtIdJadwal.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DATA GAGAL DISIMPAN" + e);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try {
            String pesawat = String.valueOf(cb_pesawat.getSelectedItem());
            String kotaawal = String.valueOf(cb_kotaawal.getSelectedItem());
            String kotatujuan = String.valueOf(cb_kotatujuan.getSelectedItem());
            String sql = "update jadwal set ID_PESAWAT=?, KOTA_AWAL=?, "
            + "KOTA_TUJUAN=?, KEBERANGKATAN=?, KEDATANGAN=?, HARGA=? where ID_JADWAL='" + txtIdJadwal.getText() + "'";
            //String sql = "update jadwal set JADWAL=?"
            // + "where ID_JADWAL='"+txtIdJadwal.getText()+"'";

            PreparedStatement stat = conn.prepareStatement(sql);
            //stat.setString(1, txtIdJadwal.getText());
            stat.setString(1, pesawat.substring(0, 4));
            stat.setString(2, kotaawal.substring(0, 4));
            stat.setString(3, kotatujuan.substring(0, 4));
            stat.setString(4, txtKeberangkatan.getText());
            stat.setString(5, txtKedatangan.getText());
            stat.setString(6, txtHarga.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DIUBAH");
            kosong();
            txtIdJadwal.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "DATA GAGAL DIUBAH" + e);
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "YAKIN MAU HAPUS?", "PESAN KONFIRMASI", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok == 0) {
            String sql = "delete from jadwal where ID_JADWAL = '" + txtIdJadwal.getText() + "'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS");
                kosong();
                txtIdJadwal.requestFocus();
                datatable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "data gagal dihapus" + e);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtIdJadwal.setText("");
        txtKeberangkatan.setText("");
        txtKedatangan.setText("");
        txtHarga.setText("");
        txtIdJadwal.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        cetak();
        }
        private void load_data() {
            //menampilkan data database kedalam tabel
            try {
                String sql_pesawat = "SELECT * FROM pesawat";
                String sql_kota = "SELECT * FROM kota";
                java.sql.Connection conn = (Connection) config.configDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res;
                res = stm.executeQuery(sql_pesawat);
                while (res.next()) {
                    cb_pesawat.addItem(res.getString("ID_PESAWAT") + " - " + res.getString("MASKAPAI"));
                }
                res = stm.executeQuery(sql_kota);
                while (res.next()) {
                    cb_kotaawal.addItem(res.getString("ID_KOTA") + " - " + res.getString("KOTA"));
                    cb_kotatujuan.addItem(res.getString("ID_KOTA") + " - " + res.getString("KOTA"));
                }
            } catch (Exception e) {
            }// TODO add your handling code here:
    }//GEN-LAST:event_btnCetakActionPerformed

    private void tbl_jadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_jadwalMouseClicked
        int bar = tbl_jadwal.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        String g = tabmode.getValueAt(bar, 6).toString();
        txtIdJadwal.setText(a);
        txtIdJadwal.setEnabled(false);
        for (int i = 0; i < cb_pesawat.getWidth(); i++) {
            String z = cb_pesawat.getItemAt(i);
            if (z.substring(0,4).equals(b)) {
                cb_pesawat.setSelectedIndex(i);
                break;
            }
        }
        for (int i = 0; i < cb_kotaawal.getWidth(); i++) {
            String z = cb_kotaawal.getItemAt(i);
            if (z.substring(0,4).equals(c)) {
                cb_kotaawal.setSelectedIndex(i);
                break;
            }
        }
        for (int i = 0; i < cb_kotatujuan.getWidth(); i++) {
            String z = cb_kotatujuan.getItemAt(i);
            if (z.substring(0,4).equals(d)) {
                cb_kotatujuan.setSelectedIndex(i);
                break;
            }
        }
        txtKeberangkatan.setText(e);
        txtKedatangan.setText(f);
        txtHarga.setText(g);
    }//GEN-LAST:event_tbl_jadwalMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        FormMenuAdmin k = null;
        k = new FormMenuAdmin();
        k.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cb_kotaawal;
    private javax.swing.JComboBox<String> cb_kotatujuan;
    private javax.swing.JComboBox<String> cb_pesawat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblIDJadwal;
    private javax.swing.JLabel lblIDPesawat;
    private javax.swing.JLabel lblJadwal;
    private javax.swing.JLabel lblKeberangkatan;
    private javax.swing.JLabel lblKedatangan;
    private javax.swing.JLabel lblKotaAwal;
    private javax.swing.JLabel lblKotaTujuan;
    private javax.swing.JTable tbl_jadwal;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIdJadwal;
    private javax.swing.JTextField txtKeberangkatan;
    private javax.swing.JTextField txtKedatangan;
    // End of variables declaration//GEN-END:variables
    public void cetak() {
        try {
            tbl_jadwal.print(JTable.PrintMode.FIT_WIDTH, new MessageFormat("Laporan Data Jadwal"), null);
        } catch (PrinterException ex) {
            Logger.getLogger(FormAdminJadwal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}