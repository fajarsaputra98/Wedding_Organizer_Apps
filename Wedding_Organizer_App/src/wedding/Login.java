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

public class Login extends javax.swing.JInternalFrame {
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnLupa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblUsername.setText("ID");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPassword.setText("Password");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        txtUsername.setName(""); // NOI18N
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 190, 30));

        txtPassword.setName(""); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 190, 30));

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 90, -1));

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 90, -1));

        btnLupa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLupa.setText("Forgot Password");
        btnLupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLupaMouseClicked(evt);
            }
        });
        getContentPane().add(btnLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 190, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wedding/backgroundlogin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        String id = txtUsername.getText();
        String password = txtPassword.getText();
        Koneksi conn = new Koneksi();
        Connection kon=conn.conn();
        Statement stm;
        ResultSet rs;
        try{
            String sql = "SELECT * FROM ms_customer WHERE customerID = '"+id+"' AND password = '"+password+"';";
            stm = (Statement) kon.createStatement();
            rs = stm.executeQuery(sql);
            if(rs.next()){
                String success = rs.getString("customerID");
                String namaku = rs.getString("namaCustomer");
                conn.username = success;
                conn.nama = namaku;
                JOptionPane.showMessageDialog(null, "Selamat Datang, "+namaku);
                MainFrame.mnPemesanan.setVisible(true);
                MainFrame.mnChangePro.setVisible(true);
                MainFrame.mnLogin.setVisible(false);
                MainFrame.mnLogout.setVisible(true);
                MainFrame.mnPembayaran.setVisible(true);
                MainFrame.mnRegisterC.setVisible(false);
                MainFrame.mnRegisterP.setVisible(false);
                this.setVisible(false);
            }
            else
            {
                stm.close();
                sql = "SELECT * FROM ms_penyedia WHERE kodePenyedia = '"+id+"' AND password = '"+password+"';";
                stm = (Statement) kon.createStatement();
                rs = stm.executeQuery(sql);
                if(rs.next()){
                    String success = rs.getString("kodePenyedia");
                    String namaku = rs.getString("namaPenyedia");
                    conn.username = success;
                    conn.nama = namaku;
                    JOptionPane.showMessageDialog(null, "Selamat Datang, "+namaku);
                    MainFrame.mnLayanan.setVisible(true);
                    MainFrame.mnChangePro.setVisible(true);
                    MainFrame.mnPembayaranP.setVisible(true);
                    MainFrame.mnLogin.setVisible(false);
                    MainFrame.mnLogout.setVisible(true);
                    MainFrame.mnRegisterC.setVisible(false);
                    MainFrame.mnRegisterP.setVisible(false);
                    this.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Login Gagal, Silahkan cek username dan password anda");
                    txtPassword.setText("");
                    txtUsername.setText("");
                    txtUsername.requestFocus();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnLupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLupaMouseClicked
        ForgotPassword lupa = new ForgotPassword();
        mdiMainMenu.removeAll();
        repaint();
        mdiMainMenu.add(this);
        mdiMainMenu.add(lupa);
        Dimension parentSize = mdiMainMenu.getSize();
        Dimension childSize = lupa.getSize();
 
        lupa.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);

        this.setVisible(true);
        lupa.setVisible(true);
    }//GEN-LAST:event_btnLupaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLupa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
