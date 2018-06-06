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

public class Pemesanan extends javax.swing.JInternalFrame {
    public Pemesanan() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtHari = new javax.swing.JTextField();
        txtBulan = new javax.swing.JTextField();
        txtTahun = new javax.swing.JTextField();
        txtJam = new javax.swing.JTextField();
        txtMenit = new javax.swing.JTextField();
        txtLama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtKodePesan = new javax.swing.JTextField();

        setTitle("Pemesanan");
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

        btnSimpan.setText("Simpan");
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });

        jLabel1.setText("Customer ID");

        jLabel2.setText("Tanggal Acara");

        btnBatal.setText("Batal");
        btnBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBatalMouseClicked(evt);
            }
        });

        jLabel3.setText("Waktu Mulai");

        jLabel4.setText("Berapa Lama");

        txtUsername.setEditable(false);

        txtHari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHariKeyTyped(evt);
            }
        });

        txtBulan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBulanFocusLost(evt);
            }
        });
        txtBulan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBulanKeyTyped(evt);
            }
        });

        txtTahun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTahunKeyTyped(evt);
            }
        });

        txtJam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJamFocusLost(evt);
            }
        });
        txtJam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJamKeyTyped(evt);
            }
        });

        txtMenit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMenitFocusLost(evt);
            }
        });
        txtMenit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMenitKeyTyped(evt);
            }
        });

        txtLama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLamaKeyTyped(evt);
            }
        });

        jLabel5.setText("DD");

        jLabel6.setText("MM");

        jLabel7.setText("YY");

        jLabel8.setText("HH");

        jLabel9.setText("MM");

        jLabel10.setText("HH");

        jLabel11.setText("Kode Pemesanan");

        txtKodePesan.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHari, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtKodePesan)
                            .addComponent(txtUsername)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtJam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMenit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addGap(4, 4, 4)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtKodePesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMenit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnBatal))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String Tgl;
    public static String tanggal, bulan, tahun;
    public static Integer jam, menit, lama;
    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        tanggal = txtHari.getText();
        bulan = txtBulan.getText();
        tahun = txtTahun.getText();
        jam = Integer.parseInt(txtJam.getText());
        menit = Integer.parseInt(txtMenit.getText());
        lama = Integer.parseInt(txtLama.getText());
        String c = txtTahun.getText() + "-" + txtBulan.getText()+ "-" + txtHari.getText() ;
        Integer u = Integer.parseInt(txtJam.getText());
        Integer m = Integer.parseInt(txtMenit.getText());
        Integer l = Integer.parseInt(txtLama.getText());
        Integer um = u + l;
        String mwktu = u.toString() + ":" + m.toString() + ":00";
        String kwktu = um.toString() + ":" + m.toString() + ":00";
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "INSERT INTO `hdr_tr_pemesanan` (`kodePemesanan`, `customerID`, "
                    + "`tanggalPemesanan`, `tanggalAcara`, `waktuMulaiAcara`, `waktuSelesaiAcara`) "
                    + "VALUES ('"+txtKodePesan.getText()+"', '"+txtUsername.getText()+"', "
                    + "'"+Tgl+"', '"+c+"', '"+mwktu+"', '"+kwktu+"');";
            stm = kon.createStatement();
            stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Register Berhasil");
                this.setVisible(false);
                DetailPemesanan detailpesan = new DetailPemesanan();
        MainFrame.mdiMainMenu.add(detailpesan);
        detailpesan.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Register Gagal");
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSimpanMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat tahun = new SimpleDateFormat("yy");
        SimpleDateFormat bulan = new SimpleDateFormat("MM");
        SimpleDateFormat hari = new SimpleDateFormat("dd");
        SimpleDateFormat jam = new SimpleDateFormat("HH");
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        String Tahun = tahun.format(cal.getTime());
        String Bulan = bulan.format(cal.getTime());
        String Hari = hari.format(cal.getTime());
        String Jam = jam.format(cal.getTime());
        String kodeakhir;
        String kodebaruakhir="";
        Tgl = tanggal.format(cal.getTime());
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT COUNT(`kodePemesanan`) AS hitung FROM hdr_tr_pemesanan WHERE `kodePemesanan` LIKE '"+Hari+Bulan+Tahun+Jam+"%'";
            stm = kon.createStatement();
            rs = stm.executeQuery(sql);
            if(rs.next()){
                kodeakhir = rs.getString("hitung");
                int angka = Integer.parseInt(kodeakhir);
                if(angka<10){
                    kodebaruakhir = "0"+(angka+1);
                    
                }
                 else{
                    kodebaruakhir = ""+(angka+1);
                }
            }
            
         } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String kodebaru = Hari+Bulan+Tahun+Jam+kodebaruakhir;
        txtKodePesan.setText(kodebaru);
        conn.kodepesan = kodebaru;
        txtUsername.setText(conn.username);
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtHariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHariKeyTyped
        // TODO add your handling code here:
        if(txtHari.getText().length()>1)
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
         }}
    }//GEN-LAST:event_txtHariKeyTyped

    private void txtBulanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBulanKeyTyped
        // TODO add your handling code here:
        if(txtBulan.getText().length()>1)
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
    }//GEN-LAST:event_txtBulanKeyTyped

    private void txtTahunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTahunKeyTyped
        // TODO add your handling code here:
        if(txtTahun.getText().length()>3)
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
    }//GEN-LAST:event_txtTahunKeyTyped

    private void txtJamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJamKeyTyped
        // TODO add your handling code here:
        if(txtJam.getText().length()>1)
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
    }//GEN-LAST:event_txtJamKeyTyped

    private void txtMenitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMenitKeyTyped
        // TODO add your handling code here:
        if(txtMenit.getText().length()>1)
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
    }//GEN-LAST:event_txtMenitKeyTyped

    private void txtLamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLamaKeyTyped
        // TODO add your handling code here:
        if(txtLama.getText().length()>1)
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
    }//GEN-LAST:event_txtLamaKeyTyped

    private void btnBatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnBatalMouseClicked

    private void txtBulanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBulanFocusLost
        // TODO add your handling code here:
        String bulan = txtBulan.getText();
        Integer Bulan = Integer.parseInt(bulan);
        if(Bulan>12)
        {
            txtBulan.setText("12");
        }
        if(Bulan==1||Bulan==3||Bulan==5||Bulan==7||Bulan==8||Bulan==10||Bulan==12)
        {
            String hari = txtHari.getText();
            Integer Hari = Integer.parseInt(hari);
            if(Hari>31)
            {
                txtHari.setText("31");
            }
        }
        else if(Bulan==2)
        {
            String hari = txtHari.getText();
            Integer Hari = Integer.parseInt(hari);
            if(Hari>28)
            {
                txtHari.setText("28");
            }
        }
        else
        {
            String hari = txtHari.getText();
            Integer Hari = Integer.parseInt(hari);
            if(Hari>30)
            {
                txtHari.setText("30");
            }
        }
    }//GEN-LAST:event_txtBulanFocusLost

    private void txtJamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJamFocusLost
        // TODO add your handling code here:
        String jam = txtJam.getText();
        Integer Jam = Integer.parseInt(jam);
        if(Jam>=24)
        {
            txtJam.setText("00");
        }
    }//GEN-LAST:event_txtJamFocusLost

    private void txtMenitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMenitFocusLost
        // TODO add your handling code here:
        String menit = txtMenit.getText();
        Integer Menit = Integer.parseInt(menit);
        if(Menit>=60)
        {
            txtMenit.setText("00");
        }
    }//GEN-LAST:event_txtMenitFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBulan;
    private javax.swing.JTextField txtHari;
    private javax.swing.JTextField txtJam;
    public static javax.swing.JTextField txtKodePesan;
    private javax.swing.JTextField txtLama;
    private javax.swing.JTextField txtMenit;
    private javax.swing.JTextField txtTahun;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
