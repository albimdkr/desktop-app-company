/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import koneksi.CKoneksi21552011235;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import session.idDivSession;
import session.idSession;
import session.kodepeSession;

/**
 *
 * @author albin
 */
public class FProfil21552011235 extends javax.swing.JFrame {
    Connection conn = CKoneksi21552011235.getKoneksi();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    String sql, idUser, level, id, kosong;


    
    public FProfil21552011235() {
        initComponents();
        this.idUser = idUser;
        this.conn = conn;
        tampilkanProfil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
        public void tampilkanProfil() {
        String kodepegawai = kodepeSession.getkodepegLogin();
        String kodeuser = idSession.getidUSerLogin();
        String kodeDiv = idDivSession.getidDivLogin();

        try {
            sql = "SELECT kodePegawai, nama, jk, tglmasuk, alamat, idUser FROM tblpegawai WHERE kodePegawai = '" + kodepegawai + "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                String dd = rs.getString("kodePegawai");
                String dd1 = rs.getString("nama");
                String dd2 = rs.getString("jk");
                String dd3 = rs.getString("tglmasuk");
                String dd4 = rs.getString("alamat");

                txtFieldKodePegawai.setText(dd);
                txtFieldNamaPegawai.setText(dd1);
                txtFieldJenisKelamin.setText(dd2);
                txtFieldTglMasukKerja.setText(dd3);
                txtFieldAlamat.setText(dd4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            sql = "SELECT idUser, email FROM tbluser WHERE idUser = '" + kodeuser + "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                String dd1 = rs.getString("email");
                txtFieldEmail.setText(dd1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            sql = "SELECT idDivisi, namaDivisi, gapok, tunjangan FROM tbldivisi WHERE idDivisi = '" + kodeDiv + "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                String dd1 = rs.getString("namaDivisi");
                String dd2 = rs.getString("gapok");
                String dd3 = rs.getString("tunjangan");

                txtFieldNamaDivisi.setText(dd1);
                txtFieldGajiPokok.setText(dd2);
                txtFieldTunjangan.setText(dd3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
   

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtFieldKodePegawai = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFieldTglMasukKerja = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtFieldAlamat = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFieldNamaPegawai = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtFieldEmail = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFieldNamaDivisi = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtFieldGajiPokok = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtFieldTunjangan = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        txtFieldJenisKelamin = new javax.swing.JTextField();

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("____________________________________________________________");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" 21552011235_Albi Mudakar Nasyabi");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Form Profil");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 30));

        txtFieldKodePegawai.setBorder(null);
        txtFieldKodePegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldKodePegawaiActionPerformed(evt);
            }
        });
        jPanel1.add(txtFieldKodePegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 180, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("_______________________________");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 240, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("_______________________________");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 240, 30));

        txtFieldTglMasukKerja.setBorder(null);
        txtFieldTglMasukKerja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldTglMasukKerjaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFieldTglMasukKerja, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 180, 40));

        jLabel13.setText("Jenis Kelamin");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("_______________________________");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 320, 30));

        txtFieldAlamat.setBorder(null);
        txtFieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAlamatActionPerformed(evt);
            }
        });
        jPanel1.add(txtFieldAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 710, 40));

        jLabel15.setText("Tanggal Masuk Kerja");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jLabel9.setText("Kode Pegawai");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("_______________________________");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 280, 30));

        txtFieldNamaPegawai.setBorder(null);
        txtFieldNamaPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNamaPegawaiActionPerformed(evt);
            }
        });
        jPanel1.add(txtFieldNamaPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 240, 40));

        jLabel18.setText("Nama Pegawai");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("__________________________________________________________________________________________________________");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 760, 30));

        jLabel20.setText("Alamat");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 10));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("_______________________________");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 280, 30));

        txtFieldEmail.setBorder(null);
        txtFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 230, 40));

        jLabel23.setText("Email");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("_______________________________");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 240, 30));

        txtFieldNamaDivisi.setBorder(null);
        txtFieldNamaDivisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNamaDivisiActionPerformed(evt);
            }
        });
        jPanel1.add(txtFieldNamaDivisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 180, 40));

        jLabel17.setText("Nama Divisi");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("_______________________________");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 280, 30));

        txtFieldGajiPokok.setBorder(null);
        txtFieldGajiPokok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldGajiPokokActionPerformed(evt);
            }
        });
        jPanel1.add(txtFieldGajiPokok, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 230, 40));

        jLabel24.setText("Gaji Pokok");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("_______________________________");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 280, 30));

        txtFieldTunjangan.setBorder(null);
        txtFieldTunjangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldTunjanganActionPerformed(evt);
            }
        });
        jPanel1.add(txtFieldTunjangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 220, 40));

        jLabel26.setText("Tunjangan");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/icons8-back-to-24.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 30, 30));

        txtFieldJenisKelamin.setBorder(null);
        txtFieldJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldJenisKelaminActionPerformed(evt);
            }
        });
        jPanel1.add(txtFieldJenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldKodePegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldKodePegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldKodePegawaiActionPerformed

    private void txtFieldTglMasukKerjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldTglMasukKerjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldTglMasukKerjaActionPerformed

    private void txtFieldNamaPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNamaPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNamaPegawaiActionPerformed

    private void txtFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEmailActionPerformed

    private void txtFieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAlamatActionPerformed

    private void txtFieldNamaDivisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNamaDivisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNamaDivisiActionPerformed

    private void txtFieldGajiPokokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldGajiPokokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldGajiPokokActionPerformed

    private void txtFieldTunjanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldTunjanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldTunjanganActionPerformed

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
       btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/icons8-back-to-24.png")));
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/icons8-back-to-24-hover.png")));
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        FMenuUtama21552011235 fm = new FMenuUtama21552011235();
        fm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void txtFieldJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldJenisKelaminActionPerformed

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
            java.util.logging.Logger.getLogger(FProfil21552011235.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FProfil21552011235.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FProfil21552011235.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FProfil21552011235.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FProfil21552011235().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFieldAlamat;
    private javax.swing.JTextField txtFieldEmail;
    private javax.swing.JTextField txtFieldGajiPokok;
    private javax.swing.JTextField txtFieldJenisKelamin;
    private javax.swing.JTextField txtFieldKodePegawai;
    private javax.swing.JTextField txtFieldNamaDivisi;
    private javax.swing.JTextField txtFieldNamaPegawai;
    private javax.swing.JTextField txtFieldTglMasukKerja;
    private javax.swing.JTextField txtFieldTunjangan;
    // End of variables declaration//GEN-END:variables


}