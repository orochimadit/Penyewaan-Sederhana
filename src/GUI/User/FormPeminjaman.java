/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.User;

import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import entitas.mobil;
import entitas.peminjaman;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import source.koneksi;

/**
 *
 * @author badra
 */
public class FormPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form FormPeminjaman
     */
    public FormPeminjaman() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jTextField1 = new javax.swing.JTextField();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        FieldIdPegawai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldIdPeminjaman = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FieldIdPelanggan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FieldLamaPinjam = new javax.swing.JTextField();
        ButtonGenerate = new javax.swing.JButton();
        CalenderPinjam = new com.toedter.calendar.JCalendar();
        ComboMerkMobil = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        FieldTanggalPinjam = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        FieldKembali = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        FieldBiayaSewa = new javax.swing.JTextField();
        FieldTotalSewa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ButtonSave = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        jLabel1.setText("Peminjaman ");

        jLabel3.setText("Id Pegawai");

        jLabel4.setText("ID peminjaman");

        jLabel5.setText("Id Pelanggan");

        jLabel6.setText("Merek Mobil");

        jLabel7.setText("Tanggal Pinjam");

        jLabel8.setText("Lama Pinjam");

        ButtonGenerate.setText("Generate");
        ButtonGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGenerateActionPerformed(evt);
            }
        });

        ComboMerkMobil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(ButtonGenerate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FieldIdPegawai)
                            .addComponent(FieldIdPeminjaman)
                            .addComponent(FieldIdPelanggan)
                            .addComponent(CalenderPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FieldLamaPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboMerkMobil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(FieldIdPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(FieldIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(FieldIdPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ComboMerkMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(CalenderPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FieldLamaPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addComponent(ButtonGenerate)
                .addGap(30, 30, 30))
        );

        jLabel2.setText("Input data Transaksi Peminjaman ");

        jLabel10.setText("Total Sewa");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel11.setText("Tanggal Pinjam");

        jLabel12.setText("Tanggal Kembali");

        jLabel13.setText("Biaya Sewa");

        jLabel14.setText("Total Sewa");

        ButtonSave.setText("Save");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        ButtonCancel.setText("Cancel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FieldTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(ButtonCancel))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FieldTotalSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FieldBiayaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FieldKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(FieldTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(FieldKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(FieldBiayaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldTotalSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSave)
                    .addComponent(ButtonCancel))
                .addGap(35, 35, 35))
        );

        jLabel9.setText("Biaya Transaksi Peminjaman ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(188, 188, 188)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGenerateActionPerformed
        // TODO add your handling code here:
        koneksi kon = new koneksi();
        double totalSewa,hargaSewa;
        int lamaPinjam,tglPinjam,tglKembali,blnPinjam,thnPinjam,blnKembali=0,thnKembali=0;
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
        Date now = new Date();
        
        JDayChooser tanggal = CalenderPinjam.getDayChooser();
        JMonthChooser bulan = CalenderPinjam.getMonthChooser();
        JYearChooser tahun = CalenderPinjam.getYearChooser();
        
        boolean tidak_ada = true;
        ResultSet rs = null;
        if(FieldIdPelanggan.getText().equals("")||
           FieldIdPeminjaman.getText().equals("")||
            FieldLamaPinjam.getText().equals("")||
            ComboMerkMobil.getSelectedIndex()==0){
            
            JOptionPane.showMessageDialog(null, "Lengkapi data!","Warning",JOptionPane.WARNING_MESSAGE);
        }else{
            try {
              rs = kon.getData("select id_pelanggan from t_pelanggan where id_pelanggan = '"+FieldIdPelanggan.getText()+"'");
              while(rs.next()){
                  rs=kon.getData("select harga_sewa from t_mobil where merek_mobil = '"+ComboMerkMobil.getSelectedItem()+"'");
                  while(rs.next()){
                      FieldBiayaSewa.setText(rs.getString("harga_sewa"));
                  }
                  rs.close();
                  
                 lamaPinjam = Integer.parseInt(FieldLamaPinjam.getText());
                 tglPinjam = tanggal.getDay();
                 blnPinjam = bulan.getMonth()+1;
                 thnPinjam = tahun.getYear();
                 hargaSewa = Double.parseDouble(FieldBiayaSewa.getText());
                 
                 tglKembali = tglPinjam+lamaPinjam;
                 
                 if((blnPinjam%2)==0){
                     if(tglKembali>30){
                         tglKembali=tglKembali-30;
                         blnKembali=blnKembali+1;
                     }else{
                         tglKembali=tglKembali;
                         blnKembali=blnKembali;
                     }
                 }else if((blnPinjam%2)!=0){
                     if(tglKembali>0){
                         tglKembali=tglKembali-31;
                         blnKembali=blnPinjam+1;
                     }else{
                         tglKembali = tglKembali;
                         blnKembali = blnPinjam;
                     }
                 }
                 
                 if(blnPinjam>12){
                     blnKembali=blnPinjam-12;
                     thnKembali = thnPinjam+1;
                 }else{
                     blnKembali = blnPinjam;
                     thnKembali=thnPinjam;
                 }
                 totalSewa =lamaPinjam*hargaSewa;
                 FieldBiayaSewa.setText("RP "+String.valueOf(hargaSewa));
                 FieldTotalSewa.setText("RP "+String.valueOf(totalSewa));
                 FieldTanggalPinjam.setText(String.valueOf(tglPinjam)+"/"+
                         String.valueOf(blnPinjam)+"/"+String.valueOf(thnPinjam));
                 FieldKembali.setText(String.valueOf(tglKembali)+"/"+
                         String.valueOf(blnKembali)+"/"+String.valueOf(thnKembali));
                 tidak_ada=false;
              }
              rs.close();
            } catch (Exception e) {
            }
            if(tidak_ada){
                JOptionPane.showMessageDialog(null, "ID pelanggan tidak terdaftar Kembali","Warning",JOptionPane.WARNING_MESSAGE);
                FieldIdPelanggan.setText(null);
                FieldIdPelanggan.requestFocus();
            }
        }
        
        
    }//GEN-LAST:event_ButtonGenerateActionPerformed

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        // TODO add your handling code here:
        peminjaman dataPinjam = new peminjaman();
        mobil dataMobil = new mobil();
        koneksi kon = new koneksi();
        ResultSet rs = null;
        
        if(FieldIdPelanggan.getText().equals("")||
           FieldIdPeminjaman.getText().equals("")||
            FieldLamaPinjam.getText().equals("")||
            FieldBiayaSewa.getText().equals("")||
            FieldTotalSewa.getText().equals("")||
            FieldTanggalPinjam.getText().equals("")||
             ComboMerkMobil.getSelectedIndex()==0){
            
            JOptionPane.showMessageDialog(null, "Data tidak lengkap!","Warning",JOptionPane.WARNING_MESSAGE);
            
        }else{
            try {
                rs=kon.getData("select id_mobil,stok from t_mobil where merek_mobil= '"+ComboMerkMobil.getSelectedItem()+"'");
                while(rs.next()){
                    dataPinjam.setId_pegawai(FieldIdPegawai.getText());
                    dataPinjam.setId_pelanggan(FieldIdPelanggan.getText());
                    dataPinjam.setId_peminjaman(FieldIdPeminjaman.getText());
                    dataPinjam.setStatus("pinjam");
                    dataPinjam.setTgl_pinjam(FieldTanggalPinjam.getText());
                    dataPinjam.setLama(Integer.parseInt(FieldLamaPinjam.getText()));
                //    dataPinjam.setBiaya(totalSewa);
                    dataPinjam.setId_mobil(rs.getString("id_mobil"));
                    dataPinjam.setTgl_kembali(FieldKembali.getText());
                    dataMobil.setStok(rs.getInt("stok"));
                    dataMobil.setId_mobil(rs.getString("id_mobil"));
                    dataMobil.updateStokPinjam();
                    dataPinjam.insertData();
                }
                rs.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_ButtonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonGenerate;
    private javax.swing.JButton ButtonSave;
    private com.toedter.calendar.JCalendar CalenderPinjam;
    private javax.swing.JComboBox<String> ComboMerkMobil;
    private javax.swing.JTextField FieldBiayaSewa;
    private javax.swing.JTextField FieldIdPegawai;
    private javax.swing.JTextField FieldIdPelanggan;
    private javax.swing.JTextField FieldIdPeminjaman;
    private javax.swing.JTextField FieldKembali;
    private javax.swing.JTextField FieldLamaPinjam;
    private javax.swing.JTextField FieldTanggalPinjam;
    private javax.swing.JTextField FieldTotalSewa;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
