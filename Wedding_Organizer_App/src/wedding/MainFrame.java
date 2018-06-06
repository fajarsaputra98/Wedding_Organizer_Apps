package wedding;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();
        mnPemesanan.setVisible(false);
        mnLayanan.setVisible(false);
        mnLogout.setVisible(false);
        mnPembayaran.setVisible(false);
        mnPembayaranP.setVisible(false);
        mnChangePro.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mdiMainMenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnUser = new javax.swing.JMenu();
        mnLogin = new javax.swing.JMenuItem();
        mnLogout = new javax.swing.JMenuItem();
        mnChangePro = new javax.swing.JMenuItem();
        mnRegisterC = new javax.swing.JMenuItem();
        mnRegisterP = new javax.swing.JMenuItem();
        mnLayanan = new javax.swing.JMenu();
        mnPemesanan = new javax.swing.JMenu();
        mnNewPesan = new javax.swing.JMenuItem();
        mnLihatPesan = new javax.swing.JMenuItem();
        mnPembayaran = new javax.swing.JMenu();
        mnPembayaranP = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wedding Organizer");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 1000));

        mdiMainMenu.setDesktopManager(null);

        javax.swing.GroupLayout mdiMainMenuLayout = new javax.swing.GroupLayout(mdiMainMenu);
        mdiMainMenu.setLayout(mdiMainMenuLayout);
        mdiMainMenuLayout.setHorizontalGroup(
            mdiMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 993, Short.MAX_VALUE)
        );
        mdiMainMenuLayout.setVerticalGroup(
            mdiMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        mnUser.setText("User");

        mnLogin.setText("Login");
        mnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLoginActionPerformed(evt);
            }
        });
        mnUser.add(mnLogin);

        mnLogout.setText("Logout");
        mnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLogoutActionPerformed(evt);
            }
        });
        mnUser.add(mnLogout);

        mnChangePro.setText("Change Profile");
        mnChangePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnChangeProActionPerformed(evt);
            }
        });
        mnUser.add(mnChangePro);

        mnRegisterC.setText("Register Customer");
        mnRegisterC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegisterCActionPerformed(evt);
            }
        });
        mnUser.add(mnRegisterC);

        mnRegisterP.setText("Register Penyedia");
        mnRegisterP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegisterPActionPerformed(evt);
            }
        });
        mnUser.add(mnRegisterP);

        jMenuBar1.add(mnUser);

        mnLayanan.setText("Layanan");
        mnLayanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnLayananMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnLayanan);

        mnPemesanan.setText("Pemesanan");

        mnNewPesan.setText("Pemesanan Baru");
        mnNewPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewPesanActionPerformed(evt);
            }
        });
        mnPemesanan.add(mnNewPesan);

        mnLihatPesan.setText("Lihat Pemesanan");
        mnLihatPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLihatPesanActionPerformed(evt);
            }
        });
        mnPemesanan.add(mnLihatPesan);

        jMenuBar1.add(mnPemesanan);

        mnPembayaran.setText("Pembayaran");
        mnPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPembayaranMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnPembayaran);

        mnPembayaranP.setText("Laporan Pemesanan");
        mnPembayaranP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPembayaranPMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnPembayaranP);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mdiMainMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mdiMainMenu)
        );

        setSize(new java.awt.Dimension(1009, 635));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnRegisterCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegisterCActionPerformed
        RegisCustomer regcus = new RegisCustomer();
        mdiMainMenu.removeAll();
        repaint();
        mdiMainMenu.add(regcus);
        Dimension parentSize = mdiMainMenu.getSize();
        Dimension childSize = regcus.getSize();
 
        regcus.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        regcus.setVisible(true);
    }//GEN-LAST:event_mnRegisterCActionPerformed

    private void mnRegisterPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegisterPActionPerformed
        Verifikasi verifikasi = new Verifikasi();
        mdiMainMenu.removeAll();
        repaint();
        mdiMainMenu.add(verifikasi);
        Dimension parentSize = mdiMainMenu.getSize();
        Dimension childSize = verifikasi.getSize();
 
        verifikasi.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        verifikasi.setVisible(true);
    }//GEN-LAST:event_mnRegisterPActionPerformed

    private void mnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLoginActionPerformed
        Login login = new Login();
        mdiMainMenu.removeAll();
        repaint();
        mdiMainMenu.add(login);
 
        Dimension parentSize = mdiMainMenu.getSize();
        Dimension childSize = login.getSize();
 
        login.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
 
        login.setVisible(true);
        
    }//GEN-LAST:event_mnLoginActionPerformed

    private void mnLayananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnLayananMouseClicked
        Layanan layanan = new Layanan();
        mdiMainMenu.removeAll();
        repaint();
        mdiMainMenu.add(layanan);
        Dimension parentSize = mdiMainMenu.getSize();
        Dimension childSize = layanan.getSize();
 
        layanan.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        layanan.setVisible(true);
    }//GEN-LAST:event_mnLayananMouseClicked

    private void mnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLogoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Selamat Tinggal");
        mnLogout.setVisible(false);
        mnLogin.setVisible(true);
        mnPembayaran.setVisible(false);
        mnPemesanan.setVisible(false);
        mnRegisterC.setVisible(true);
        mnRegisterP.setVisible(true);
        mnLayanan.setVisible(false);
        mnChangePro.setVisible(false);
        mnPembayaranP.setVisible(false);            
        mdiMainMenu.removeAll();
        repaint();
        Koneksi.username="";
  
    }//GEN-LAST:event_mnLogoutActionPerformed

    private void mnPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPembayaranMouseClicked
        Pembayaran bayar = new Pembayaran();
        mdiMainMenu.removeAll();
        repaint();
        mdiMainMenu.add(bayar);
        Dimension parentSize = mdiMainMenu.getSize();
        Dimension childSize = bayar.getSize();
 
        bayar.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        bayar.setVisible(true);
    }//GEN-LAST:event_mnPembayaranMouseClicked

    private void mnChangeProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnChangeProActionPerformed
        ChangeProfile ganti = new ChangeProfile();
        mdiMainMenu.removeAll();
        repaint();
        mdiMainMenu.add(ganti);
        Dimension parentSize = mdiMainMenu.getSize();
        Dimension childSize = ganti.getSize();
 
        ganti.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        ganti.setVisible(true);
    }//GEN-LAST:event_mnChangeProActionPerformed

    private void mnPembayaranPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPembayaranPMouseClicked
        // TODO add your handling code here:
        PembayaranP bayar = new PembayaranP();
        mdiMainMenu.removeAll();
        repaint();
        mdiMainMenu.add(bayar);
        Dimension parentSize = mdiMainMenu.getSize();
        Dimension childSize = bayar.getSize();
 
        bayar.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        bayar.setVisible(true);
    }//GEN-LAST:event_mnPembayaranPMouseClicked

    private void mnNewPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewPesanActionPerformed
        // TODO add your handling code here:
        Pemesanan pemesanan = new Pemesanan();
        mdiMainMenu.removeAll();
        repaint();
        mdiMainMenu.add(pemesanan);
        Dimension parentSize = mdiMainMenu.getSize();
        Dimension childSize = pemesanan.getSize();
 
        pemesanan.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        pemesanan.setVisible(true);
    }//GEN-LAST:event_mnNewPesanActionPerformed

    private void mnLihatPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLihatPesanActionPerformed
        // TODO add your handling code here:
        LihatPesanan pemesanan = new LihatPesanan();
        mdiMainMenu.removeAll();
        repaint();
        mdiMainMenu.add(pemesanan);
        Dimension parentSize = mdiMainMenu.getSize();
        Dimension childSize = pemesanan.getSize();
 
        pemesanan.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        pemesanan.setVisible(true);
    }//GEN-LAST:event_mnLihatPesanActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JDesktopPane mdiMainMenu;
    public static javax.swing.JMenuItem mnChangePro;
    public static javax.swing.JMenu mnLayanan;
    private javax.swing.JMenuItem mnLihatPesan;
    public static javax.swing.JMenuItem mnLogin;
    public static javax.swing.JMenuItem mnLogout;
    private javax.swing.JMenuItem mnNewPesan;
    public static javax.swing.JMenu mnPembayaran;
    public static javax.swing.JMenu mnPembayaranP;
    public static javax.swing.JMenu mnPemesanan;
    public static javax.swing.JMenuItem mnRegisterC;
    public static javax.swing.JMenuItem mnRegisterP;
    private javax.swing.JMenu mnUser;
    // End of variables declaration//GEN-END:variables
}
