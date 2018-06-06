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

public class LihatPesanan extends javax.swing.JInternalFrame {
    public LihatPesanan() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLihat = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        cmbKodePesan = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Pemesanan Layanan");
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

        tblLihat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipe Layanan", "Kuantitas", "Harga per Kuantitas", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLihat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLihatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLihat);

        btnBack.setText("Close");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        cmbKodePesan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbKodePesanItemStateChanged(evt);
            }
        });

        jLabel2.setText("Kode Pemesanan");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(23, 23, 23)
                            .addComponent(cmbKodePesan, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbKodePesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int kodeLayanan;
    private void tblLihatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLihatMouseClicked
        // TODO add your handling code here:
        int i = tblLihat.getSelectedRow();
        TableModel model = tblLihat.getModel();
        String temp;
        if(i!=-1)
        {
        temp = model.getValueAt(i, 0).toString();
        kodeLayanan = Integer.parseInt(temp);
        }
    }//GEN-LAST:event_tblLihatMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnBackMouseClicked
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
    
    private void cmbKodePesanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbKodePesanItemStateChanged
        // TODO add your handling code here:
        int i = cmbKodePesan.getSelectedIndex();
        String kodePesan = cmbKodePesan.getItemAt(i);
        DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
        };
        tblLihat.setModel(model);
        model.addColumn("Kode Layanan");
        model.addColumn("Tipe Layanan");
        model.addColumn("Kuantitas"); 
        model.addColumn("Harga Per Kuantitas");
        model.addColumn("Keterangan");
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT ms_layanan.kodeLayanan, ms_tipelayanan.tipeLayanan,"
  + "dtl_tr_pemesanan.qtyLayanan, ms_layanan.hargaSatuan, dtl_tr_pemesanan.keterangan FROM ms_layanan " +
"INNER JOIN ms_tipelayanan ON ms_tipelayanan.kodeTipeLayanan=ms_layanan.kodeTipeLayanan " +
"INNER JOIN dtl_tr_pemesanan ON dtl_tr_pemesanan.kodeLayanan=ms_layanan.kodeLayanan"
                    + " AND dtl_tr_pemesanan.kodePemesanan = '"+kodePesan+"'";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Object [] o = new Object[5];
                o[0] = rs.getString("ms_layanan.kodeLayanan");
                o[1] = rs.getString("ms_tipelayanan.tipeLayanan");
                o[2] = rs.getString("dtl_tr_pemesanan.qtyLayanan");
                o[3] = rs.getString("ms_layanan.hargaSatuan");
                o[4] = rs.getString("dtl_tr_pemesanan.keterangan");
                model.addRow(o);
            }
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cmbKodePesanItemStateChanged
private void fillTable()
    {
        int i = cmbKodePesan.getSelectedIndex();
        String kodePesan = cmbKodePesan.getItemAt(i);
        DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
        };
        tblLihat.setModel(model);
        model.addColumn("Kode Layanan");
        model.addColumn("Tipe Layanan");
        model.addColumn("Kuantitas"); 
        model.addColumn("Harga Per Kuantitas");
        model.addColumn("Keterangan");
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT ms_layanan.kodeLayanan, ms_tipelayanan.tipeLayanan,"
  + "dtl_tr_pemesanan.qtyLayanan, ms_layanan.hargaSatuan, dtl_tr_pemesanan.keterangan FROM ms_layanan " +
"INNER JOIN ms_tipelayanan ON ms_tipelayanan.kodeTipeLayanan=ms_layanan.kodeTipeLayanan " +
"INNER JOIN dtl_tr_pemesanan ON dtl_tr_pemesanan.kodeLayanan=ms_layanan.kodeLayanan"
                    + " AND dtl_tr_pemesanan.kodePemesanan = '"+kodePesan+"'";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Object [] o = new Object[5];
                o[0] = rs.getString("ms_layanan.kodeLayanan");
                o[1] = rs.getString("ms_tipelayanan.tipeLayanan");
                o[2] = rs.getString("dtl_tr_pemesanan.qtyLayanan");
                o[3] = rs.getString("ms_layanan.hargaSatuan");
                o[4] = rs.getString("dtl_tr_pemesanan.keterangan");
                model.addRow(o);
            }
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        fillCombo();
        fillTable();
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbKodePesan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLihat;
    // End of variables declaration//GEN-END:variables
}
