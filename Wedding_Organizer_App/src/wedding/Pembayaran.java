package wedding;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Pembayaran extends javax.swing.JInternalFrame {
    public Pembayaran() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBayar = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbKodePesan = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnBayar = new javax.swing.JButton();

        setTitle("Pembayaran");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
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

        jLabel3.setText("Customer ID");

        tblBayar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Kode Penyedia", "Subtotal"
            }
        ));
        tblBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBayarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBayar);

        jLabel4.setText("Total Harga");

        txtUsername.setEditable(false);

        txtHarga.setEditable(false);

        jLabel2.setText("Kode Pemesanan");
        jLabel2.setToolTipText("");

        cmbKodePesan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbKodePesanItemStateChanged(evt);
            }
        });

        jButton1.setText("Close");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        btnBayar.setText("Bayar");
        btnBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBayarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addComponent(cmbKodePesan, 0, 148, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBayar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbKodePesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnBayar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int total;
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
        };
        total = 0;
        tblBayar.setModel(model);
        model.addColumn("Nama Penyedia");
        model.addColumn("Bank");
        model.addColumn("No Rekening");
        model.addColumn("Subtotal");
        Koneksi conn = new Koneksi();
        txtUsername.setText(conn.username);
        Connection kon=conn.conn();
        Statement stm = null;
        ResultSet rs = null;
        try{
            String sql = "SELECT ms_layanan.kodePenyedia, ms_bank.namaBank, ms_penyedia.noRekeningPenyedia, SUM(dtl_tr_pemesanan.qtyLayanan * ms_layanan.hargaSatuan) AS \n" +
                        "subtotal FROM dtl_tr_pemesanan\n" +
                        "INNER JOIN ms_layanan ON dtl_tr_pemesanan.kodeLayanan=ms_layanan.kodeLayanan INNER JOIN ms_penyedia ON ms_penyedia.kodePenyedia = ms_layanan.kodePenyedia INNER JOIN ms_bank ON ms_penyedia.kodeBank = ms_bank.kodeBank AND \n" +
                        "dtl_tr_pemesanan.kodePemesanan = '0' AND dtl_tr_pemesanan.status = 0\n" +
                        "GROUP BY ms_layanan.kodePenyedia";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Object [] o = new Object[4];
                o[0] = rs.getString("kodePenyedia");
                o[1] = rs.getString("namaBank");
                o[2] = rs.getString("noRekeningPenyedia");
                o[3] = rs.getString("subtotal");
                model.addRow(o);
                String temp = rs.getString("subtotal");
                int tempa = Integer.parseInt(temp);
                total+=tempa;
            }
            fillCombo();
            cmbKodePesan.setSelectedIndex(-1);
            txtHarga.setText(""+total);
            conn.disc();
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked
    private void fillTable()
    {
        total =0;
        int i = cmbKodePesan.getSelectedIndex();
        String kodePesan = cmbKodePesan.getItemAt(i);
        DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
        };
        tblBayar.setModel(model);
        model.addColumn("Penyedia");
        model.addColumn("Bank");
        model.addColumn("No Rekening");
        model.addColumn("Subtotal");
        Koneksi conn = new Koneksi();
        txtUsername.setText(conn.username);
        Connection kon=conn.conn();
        Statement stm = null;
        ResultSet rs = null;
        try{
            String sql = "SELECT ms_layanan.kodePenyedia, ms_bank.namaBank, ms_penyedia.noRekeningPenyedia, SUM(dtl_tr_pemesanan.qtyLayanan * ms_layanan.hargaSatuan) AS \n" +
                        "subtotal FROM dtl_tr_pemesanan\n" +
                        "INNER JOIN ms_layanan ON dtl_tr_pemesanan.kodeLayanan=ms_layanan.kodeLayanan INNER JOIN ms_penyedia ON ms_penyedia.kodePenyedia = ms_layanan.kodePenyedia INNER JOIN ms_bank ON ms_penyedia.kodeBank = ms_bank.kodeBank AND \n" +
                        "dtl_tr_pemesanan.kodePemesanan = '"+kodePesan+"' AND dtl_tr_pemesanan.status = 0\n" +
                        "GROUP BY ms_layanan.kodePenyedia";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Object [] o = new Object[4];
                o[0] = rs.getString("kodePenyedia");
                o[1] = rs.getString("namaBank");
                o[2] = rs.getString("noRekeningPenyedia");
                o[3] = rs.getString("subtotal");
                model.addRow(o);
                String temp = rs.getString("subtotal");
                int tempa = Integer.parseInt(temp);
                total+=tempa;
            }
            txtHarga.setText(""+total);
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    private void cmbKodePesanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbKodePesanItemStateChanged
        // TODO add your handling code here:
        fillTable();        
    }//GEN-LAST:event_cmbKodePesanItemStateChanged

    private void btnBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBayarMouseClicked
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm = null;
        ResultSet rs = null;
        int i = cmbKodePesan.getSelectedIndex();
        String kodePesan = cmbKodePesan.getItemAt(i);
        try{
            String sql = "SELECT * FROM `hdr_tr_pembayaran` WHERE kodePemesanan = '"+kodePesan+"'";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            if(!rs.next())
            {
                stm.close();
                sql = "SELECT * FROM `dtl_tr_pembayaran` WHERE kodePembayaran = '"+kodePesan+"' AND kodePenyedia = '"+kodePenyedia+"'";
                stm = kon.createStatement();
                rs = stm.executeQuery(sql);
                if(!rs.next())
                {
                    stm.close();
                    sql = "INSERT INTO `hdr_tr_pembayaran`(`kodePembayaran`, `kodePemesanan`, `customerID`) VALUES ('"+kodePesan+"','"+kodePesan+"','"+conn.username+"')";
                    stm = kon.createStatement();
                    stm.executeUpdate(sql);
                    stm.close();
                    sql = "INSERT INTO `dtl_tr_pembayaran`(`kodePembayaran`, `kodePenyedia`) VALUES ('"+kodePesan+"','"+kodePenyedia+"')";
                    stm = kon.createStatement();
                    stm.executeUpdate(sql);
                    stm.close();
                    sql = "UPDATE dtl_tr_pemesanan INNER JOIN ms_layanan ON dtl_tr_pemesanan.kodeLayanan = ms_layanan.kodeLayanan SET status = 1"
                    + " WHERE dtl_tr_pemesanan.kodePemesanan = '"+kodePesan+"' AND ms_layanan.kodePenyedia = '"+kodePenyedia+"'";
                    stm = kon.createStatement();
                    stm.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Proses Pembayaran Sukses");
                    fillTable();
                }
                else
                    JOptionPane.showMessageDialog(null, "Pemesanan Sudah Dibayarkan");
            }
            else
            {
                stm.close();
                sql = "SELECT * FROM `dtl_tr_pembayaran` WHERE kodePembayaran = '"+kodePesan+"' AND kodePenyedia = '"+kodePenyedia+"'";
                stm = kon.createStatement();
                rs = stm.executeQuery(sql);
                if(!rs.next())
                {
                    stm.close();
                    sql = "INSERT INTO `dtl_tr_pembayaran`(`kodePembayaran`, `kodePenyedia`) VALUES ('"+kodePesan+"','"+kodePenyedia+"')";
                    stm = kon.createStatement();
                    stm.executeUpdate(sql);
                    stm.close();
                    sql = "UPDATE dtl_tr_pemesanan INNER JOIN ms_layanan ON dtl_tr_pemesanan.kodeLayanan = ms_layanan.kodeLayanan SET status = 1"
                    + " WHERE dtl_tr_pemesanan.kodePemesanan = '"+kodePesan+"' AND ms_layanan.kodePenyedia = '"+kodePenyedia+"'";
                    stm = kon.createStatement();
                    stm.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Proses Pembayaran Sukses");
                    fillTable();
                }
                else
                    JOptionPane.showMessageDialog(null, "Pemesanan Sudah Dibayarkan");
            }
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Proses Pembayaran Gagal");
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnBayarMouseClicked
    String kodePenyedia;
    private void tblBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBayarMouseClicked
        // TODO add your handling code here:
        int i = tblBayar.getSelectedRow();
        TableModel model = tblBayar.getModel();
        if(i!=-1)
        {
            kodePenyedia = model.getValueAt(i, 0).toString();
        }
    }//GEN-LAST:event_tblBayarMouseClicked
    
    private void fillCombo(){
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT * FROM hdr_tr_pemesanan WHERE customerID = '"+conn.username+"'";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                String w = rs.getString("kodePemesanan");
                cmbKodePesan.addItem(w);
            }
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JComboBox<String> cmbKodePesan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBayar;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
