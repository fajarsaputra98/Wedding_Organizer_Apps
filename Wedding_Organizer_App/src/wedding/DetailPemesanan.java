package wedding;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DetailPemesanan extends javax.swing.JInternalFrame {
    public DetailPemesanan() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBanyak = new javax.swing.JLabel();
        txtKodePemesanan = new javax.swing.JTextField();
        cmbTipeLayanan = new javax.swing.JComboBox<>();
        txtBanyak = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDetailPemesanan = new javax.swing.JTable();
        lblKodePemesanan = new javax.swing.JLabel();
        btnPilih = new javax.swing.JButton();
        lblTipeLayanan = new javax.swing.JLabel();
        lblKeterangan = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnSelesai = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();

        setTitle("Pilih Layanan");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        lblBanyak.setText("Kuantitas");

        txtKodePemesanan.setEditable(false);

        cmbTipeLayanan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipeLayananItemStateChanged(evt);
            }
        });

        txtBanyak.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBanyakKeyTyped(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        tblDetailPemesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Keterangan", "Harga Satuan", "Nama Penyedia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetailPemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetailPemesananMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDetailPemesanan);

        lblKodePemesanan.setText("Kode Pemesanan");

        btnPilih.setText("Pilih");
        btnPilih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPilihMouseClicked(evt);
            }
        });

        lblTipeLayanan.setText("Tipe Layanan");

        lblKeterangan.setText("Keterangan");

        jButton2.setText("Lihat Pemesanan");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        btnSelesai.setText("Selesai");
        btnSelesai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelesaiMouseClicked(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBatalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBanyak, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblKeterangan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPilih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSelesai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBanyak, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKodePemesanan)
                            .addComponent(lblTipeLayanan))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKodePemesanan)
                            .addComponent(cmbTipeLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKodePemesanan)
                    .addComponent(txtKodePemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipeLayanan)
                    .addComponent(cmbTipeLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBanyak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBanyak))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKeterangan)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPilih)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelesai)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String tglAcara, wktuM, wktuK;
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DefaultTableModel model = new DefaultTableModel();
        tblDetailPemesanan.setModel(model);
        model.addColumn("Nama Penyedia");
        model.addColumn("Harga");
        model.addColumn("Keterangan");
        tglAcara = Pemesanan.tahun + "-"+ Pemesanan.bulan +"-"+ Pemesanan.tanggal;
        wktuM = Pemesanan.jam.toString() +":"+Pemesanan.menit.toString() +":00";
        Integer c = Pemesanan.lama + Pemesanan.jam;
        
        wktuK = c.toString()+":"+ Pemesanan.menit.toString() +":00";
        Koneksi conn = new Koneksi();
        txtKodePemesanan.setText(conn.kodepesan);
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT * FROM `ms_layanan` WHERE NOT EXISTS (SELECT * FROM `dtl_tr_pemesanan` WHERE EXISTS "
                    + "(SELECT * FROM `hdr_tr_pemesanan` WHERE `tanggalAcara` = '"+tglAcara+"' AND ((`waktuMulaiAcara` BETWEEN '"+ wktuM +"' AND '"+ wktuK +"') "
                    + "OR `waktuSelesaiAcara` > '"+ wktuM +"') AND dtl_tr_pemesanan.kodePemesanan = hdr_tr_pemesanan.kodePemesanan AND ms_layanan.kodeLayanan = dtl_tr_pemesanan.kodeLayanan)) "
                    + "AND kodeTipeLayanan = 1";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Object [] o = new Object[3];
                o[0] = rs.getString("kodePenyedia");
                o[1] = rs.getString("hargaSatuan");
                o[2] = rs.getString("keteranganLayanan");
                model.addRow(o);
            }
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT * FROM ms_tipelayanan";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                String w = rs.getString("tipeLayanan");
                cmbTipeLayanan.addItem(w);
            }
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameActivated
    int angka;
    private void cmbTipeLayananItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipeLayananItemStateChanged
        fillTable();
    }//GEN-LAST:event_cmbTipeLayananItemStateChanged
    private void fillTable()
    {
        int cek = cmbTipeLayanan.getSelectedIndex();
        angka = cek + 1;
        DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
        };
        tblDetailPemesanan.setModel(model);
        model.addColumn("Kode Layanan");
        tblDetailPemesanan.getColumnModel().getColumn(0).setMinWidth(0);
        tblDetailPemesanan.getColumnModel().getColumn(0).setMaxWidth(0);
        model.addColumn("Nama Penyedia");
        model.addColumn("Harga");
        model.addColumn("Keterangan");
        Koneksi conn = new Koneksi();
        txtKodePemesanan.setText(conn.kodepesan);
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT * FROM `ms_layanan` WHERE NOT EXISTS "
                    + "(SELECT * FROM `dtl_tr_pemesanan` WHERE EXISTS "
                    + "(SELECT * FROM `hdr_tr_pemesanan` WHERE `tanggalAcara` = '"+tglAcara+"' "
                    + "AND ((`waktuMulaiAcara` BETWEEN '"+ wktuM +"' "
                    + "AND '"+wktuK+"') OR `waktuSelesaiAcara` > '"+wktuM+"') "
                    + "AND dtl_tr_pemesanan.kodePemesanan = hdr_tr_pemesanan.kodePemesanan "
                    + "AND ms_layanan.kodeLayanan = dtl_tr_pemesanan.kodeLayanan)) "
                    + "AND kodeTipeLayanan = "+angka;
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Object [] o = new Object[4];
                o[0] = rs.getString("kodeLayanan");
                o[1] = rs.getString("kodePenyedia");
                o[2] = rs.getString("hargaSatuan");
                o[3] = rs.getString("keteranganLayanan");
                model.addRow(o);
            }
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnPilihMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihMouseClicked
        // TODO add your handling code here:
        String e = cmbTipeLayanan.getSelectedItem().toString();
        int jml = Integer.parseInt(txtBanyak.getText());
        String w = jTextArea1.getText();
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        String kd = Pemesanan.txtKodePesan.getText().toString();
        try{
            String sql = "INSERT INTO `dtl_tr_pemesanan` (`kodePemesanan`, `kodeLayanan`, `qtyLayanan`, `keterangan`, `status`) "
                    + "VALUES ('"+kd+"', "+kodeLayanan+", '"+jml+"', '"+w+"', 0);" ;
            stm = kon.createStatement();
            stm.executeUpdate(sql);
            fillTable();
            JOptionPane.showMessageDialog(null, "Layanan telah disimpan");
            txtBanyak.setText("");
            jTextArea1.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Layanan gagal disimpan");
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPilihMouseClicked

    private void btnSelesaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelesaiMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnSelesaiMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        SelectedPemesanan sudahpesan = new SelectedPemesanan();
        MainFrame.mdiMainMenu.add(sudahpesan);
        sudahpesan.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked
    int kodeLayanan;
    private void tblDetailPemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetailPemesananMouseClicked
        int i = tblDetailPemesanan.getSelectedRow();
        TableModel model = tblDetailPemesanan.getModel();
        String temp;
        if(i!=-1)
        {
            temp = model.getValueAt(i, 0).toString();
            kodeLayanan = Integer.parseInt(temp);
        }
    }//GEN-LAST:event_tblDetailPemesananMouseClicked

    private void btnBatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseClicked
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        String kd = Pemesanan.txtKodePesan.getText().toString();
        try{
            String sql = "DELETE FROM dtl_tr_pemesanan WHERE kodePemesanan = '"+ kd +"'";
            stm = kon.createStatement();
            stm.executeUpdate(sql);
            fillTable();
                    
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            String sql = "DELETE FROM hdr_tr_pemesanan WHERE kodePemesanan = '"+ kd +"'";
            stm = kon.createStatement();
            stm.executeUpdate(sql);
            fillTable();
                JOptionPane.showMessageDialog(null, "Penghapusan Berhasil");    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Penghapusan Gagal");
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnBatalMouseClicked

    private void txtBanyakKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBanyakKeyTyped
        // TODO add your handling code here:
        if(txtBanyak.getText().length()>5)
        {
            JOptionPane.showMessageDialog(null,"Maaf Angka Terlalu Panjang !!!!");
            evt.consume();
        }
        else
        {
            char karakter = evt.getKeyChar();
            if(!(((karakter >= '0') && (karakter <= '9') || (karakter == java.awt.event.KeyEvent.VK_BACK_SPACE) || (karakter == java.awt.event.KeyEvent.VK_DELETE)))){
                getToolkit().beep();
            evt.consume();
            }
        }
    }//GEN-LAST:event_txtBanyakKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnPilih;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JComboBox<String> cmbTipeLayanan;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblBanyak;
    private javax.swing.JLabel lblKeterangan;
    private javax.swing.JLabel lblKodePemesanan;
    private javax.swing.JLabel lblTipeLayanan;
    private javax.swing.JTable tblDetailPemesanan;
    private javax.swing.JTextField txtBanyak;
    private javax.swing.JTextField txtKodePemesanan;
    // End of variables declaration//GEN-END:variables
}
