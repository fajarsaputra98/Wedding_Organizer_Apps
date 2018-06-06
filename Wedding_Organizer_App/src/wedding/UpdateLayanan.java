package wedding;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static wedding.MainFrame.mdiMainMenu;

public class UpdateLayanan extends javax.swing.JInternalFrame {
    public UpdateLayanan() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTipeLayanan = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        lblHarga = new javax.swing.JLabel();
        lblKeterangan = new javax.swing.JLabel();
        lblIdPenyedia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();
        txtHarga = new javax.swing.JTextField();
        txtIdPenyedia = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtTipeLayanan = new javax.swing.JTextField();

        setTitle("Layanan");
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

        lblTipeLayanan.setText("Tipe Layanan");

        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        lblHarga.setText("Harga");

        lblKeterangan.setText("Keterangan");

        lblIdPenyedia.setText("Penyedia");

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        jScrollPane1.setViewportView(txtKeterangan);

        txtHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHargaKeyTyped(evt);
            }
        });

        txtIdPenyedia.setEditable(false);

        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        txtTipeLayanan.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdPenyedia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTipeLayanan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKeterangan, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTipeLayanan, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIdPenyedia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHarga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear)
                                .addGap(23, 23, 23)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdPenyedia)
                    .addComponent(txtIdPenyedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtTipeLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipeLayanan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKeterangan)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHarga))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel)
                    .addComponent(btnClear))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        txtHarga.setText("");
        txtKeterangan.setText("");

    }//GEN-LAST:event_btnClearMouseClicked

    private void txtHargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaKeyTyped
        // TODO add your handling code here:
        if(txtHarga.getText().length()>12)
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
    }//GEN-LAST:event_txtHargaKeyTyped

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        Koneksi conn = new Koneksi();
        int kode = Layanan.kodeLayanan;
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "UPDATE ms_layanan SET keteranganLayanan = '"+txtKeterangan.getText()+"', "
                    + "hargaSatuan = "+txtHarga.getText()+" WHERE kodeLayanan = '"+kode+"'";
            stm = kon.createStatement();
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Update Layanan Berhasil");
            this.setVisible(false);
            showLayanan();
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void showLayanan()
    {
        Layanan layanan = new Layanan();
        mdiMainMenu.removeAll();
        repaint();
        mdiMainMenu.add(layanan);
        Dimension parentSize = mdiMainMenu.getSize();
        Dimension childSize = layanan.getSize();
 
        layanan.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        layanan.setVisible(true);
    }
    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.setVisible(false);
        showLayanan();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        Layanan layanan = new Layanan();
        int kode = layanan.kodeLayanan;
        Koneksi conn = new Koneksi();
        txtIdPenyedia.setText(conn.username);
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT * FROM ms_layanan WHERE kodeLayanan = '"+kode+"'";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            if(rs.next()){
                String k = rs.getString("keteranganLayanan");
                int h = rs.getInt("hargaSatuan");
                txtHarga.setText(""+h);
                txtKeterangan.setText(k);
                txtTipeLayanan.setText(Layanan.tipe);
            }
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblIdPenyedia;
    private javax.swing.JLabel lblKeterangan;
    private javax.swing.JLabel lblTipeLayanan;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIdPenyedia;
    private javax.swing.JTextArea txtKeterangan;
    private javax.swing.JTextField txtTipeLayanan;
    // End of variables declaration//GEN-END:variables
}
