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

public class PembayaranP extends javax.swing.JInternalFrame {
    public PembayaranP() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCekBayar = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLayanan = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

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

        tblCekBayar.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCekBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCekBayarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCekBayar);

        btnClose.setText("Close");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        tblLayanan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblLayanan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 114, Short.MAX_VALUE)
                        .addComponent(btnClose)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseMouseClicked
    private void fillTable()
    {
        DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
        };
        tblCekBayar.setModel(model);
        model.addColumn("Kode Pemesanan");
        model.addColumn("Customer");
        model.addColumn("Bank");
        model.addColumn("No Rekening");
        model.addColumn("Total");
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT hdr_tr_pemesanan.kodePemesanan, ms_customer.namaCustomer, ms_bank.namaBank, ms_customer.noRekeningCustomer, SUM(dtl_tr_pemesanan.qtyLayanan * ms_layanan.hargaSatuan) AS subtotal FROM dtl_tr_pemesanan\n" +
"INNER JOIN ms_layanan ON dtl_tr_pemesanan.kodeLayanan=ms_layanan.kodeLayanan\n" +
"INNER JOIN hdr_tr_pemesanan ON dtl_tr_pemesanan.kodePemesanan=hdr_tr_pemesanan.kodePemesanan\n" +
"INNER JOIN ms_customer ON hdr_tr_pemesanan.customerID=ms_customer.customerID\n" +
"INNER JOIN ms_bank ON ms_bank.kodeBank = ms_customer.kodeBank\n" +
"INNER JOIN ms_penyedia ON ms_layanan.kodePenyedia = ms_penyedia.kodePenyedia AND ms_penyedia.kodePenyedia = '"+conn.username+"'\n" +
"AND dtl_tr_pemesanan.status = 1 GROUP BY hdr_tr_pemesanan.kodePemesanan";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Object [] o = new Object[5];
                o[0] = rs.getString("kodePemesanan");
                o[1] = rs.getString("namaCustomer");
                o[2] = rs.getString("namaBank");
                o[3] = rs.getString("noRekeningCustomer");
                o[4] = rs.getString("subtotal");
                
                model.addRow(o);
                
            }
            conn.disc();
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    private void fillTableLayanan()
    {
        DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
        };
        tblLayanan.setModel(model);
        model.addColumn("Tipe Layanan");
        model.addColumn("Keterangan Layanan");
        model.addColumn("Keterangan Tambahan");
        model.addColumn("Kuantitas");
        model.addColumn("Harga");
        model.addColumn("Subtotal");
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT ms_tipelayanan.tipeLayanan, ms_layanan.keteranganLayanan, dtl_tr_pemesanan.keterangan, dtl_tr_pemesanan.qtyLayanan, ms_layanan.hargaSatuan, (dtl_tr_pemesanan.qtyLayanan * ms_layanan.hargaSatuan) AS subtotal FROM `dtl_tr_pemesanan`\n" +
"INNER JOIN ms_layanan ON dtl_tr_pemesanan.kodeLayanan=ms_layanan.kodeLayanan\n" +
"INNER JOIN ms_tipelayanan ON ms_layanan.kodeTipeLayanan = ms_tipelayanan.kodeTipeLayanan\n" +
"AND dtl_tr_pemesanan.kodePemesanan = '"+kodePesan+"' AND ms_layanan.kodePenyedia = '"+conn.username+"'";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                Object [] o = new Object[6];
                o[0] = rs.getString("tipeLayanan");
                o[1] = rs.getString("keteranganLayanan");
                o[2] = rs.getString("keterangan");
                o[3] = rs.getString("qtyLayanan");
                o[4] = rs.getString("hargaSatuan");
                o[5] = rs.getString("subtotal");          
                model.addRow(o);
                
            }
            conn.disc();
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        fillTable();
        kodePesan = "0";
        fillTableLayanan();
    }//GEN-LAST:event_formInternalFrameOpened
    String kodePesan;
    private void tblCekBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCekBayarMouseClicked
        int i = tblCekBayar.getSelectedRow();
        TableModel model = tblCekBayar.getModel();
        if(i!=-1)
        {
            kodePesan = model.getValueAt(i, 0).toString();
            fillTableLayanan();
        }
    }//GEN-LAST:event_tblCekBayarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblCekBayar;
    private javax.swing.JTable tblLayanan;
    // End of variables declaration//GEN-END:variables
}
