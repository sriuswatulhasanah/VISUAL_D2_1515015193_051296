
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class mahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form mahasiswa
     */
    public mahasiswa() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        NPM = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        Prodi = new javax.swing.JLabel();
        Alamat = new javax.swing.JLabel();
        No = new javax.swing.JLabel();
        txtNPM = new javax.swing.JTextField();
        txtProdi = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTelp = new javax.swing.JTextField();
        Simpan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabelmhs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        NPM.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        NPM.setText("NPM");

        Nama.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Nama.setText("Nama");

        Prodi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Prodi.setText("Prodi");

        Alamat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Alamat.setText("Alamat");

        No.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        No.setText("No. Telepon");

        txtNPM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNPMKeyPressed(evt);
            }
        });

        txtProdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProdiKeyPressed(evt);
            }
        });

        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaKeyPressed(evt);
            }
        });

        txtAlamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAlamatKeyPressed(evt);
            }
        });

        txtNo.setText("+62");
        txtNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoKeyPressed(evt);
            }
        });

        jLabel1.setText("-");

        txtTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelpActionPerformed(evt);
            }
        });
        txtTelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelpKeyPressed(evt);
            }
        });

        Simpan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Simpan.setText("SIMPAN");
        Simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SimpanMouseClicked(evt);
            }
        });
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NPM)
                                    .addComponent(Prodi))
                                .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Alamat)
                            .addComponent(No))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlamat)
                            .addComponent(txtProdi)
                            .addComponent(txtNama)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNPM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Simpan))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NPM)
                            .addComponent(txtNPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Prodi)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alamat)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(No, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Simpan)
                    .addComponent(jButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabelmhs.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelmhs.setText("Data Mahasiswa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelmhs)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelmhs)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelpActionPerformed

    private void txtNPMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPMKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER)
        {
        if (txtNPM.getText().length()== 0)
        {
            JOptionPane.showMessageDialog(null, "NPM Tidak Boleh Kosong", "Konfirmasi", JOptionPane.INFORMATION_MESSAGE );
            txtNPM.requestFocus();
            return;
        }
           Simpan.requestFocus();
        }
    }//GEN-LAST:event_txtNPMKeyPressed

    private void txtProdiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdiKeyPressed
        // TODO add your handling code here:
       if (evt.getKeyCode() == evt.VK_ENTER)
        {
        if (txtProdi.getText().length()== 0)
        {
            JOptionPane.showMessageDialog(null, "Prodi Tidak Boleh Kosong", "Konfirmasi", JOptionPane.INFORMATION_MESSAGE );
            txtProdi.requestFocus();
            return;
        }
           Simpan.requestFocus();
        }                          
    }//GEN-LAST:event_txtProdiKeyPressed

    private void txtNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == evt.VK_ENTER)
        {
        if (txtNama.getText().length()== 0)
        {
            JOptionPane.showMessageDialog(null, "Nama Tidak Boleh Kosong", "Konfirmasi", JOptionPane.INFORMATION_MESSAGE );
            txtNama.requestFocus();
            return;
        }
           Simpan.requestFocus();
        }
    }//GEN-LAST:event_txtNamaKeyPressed

    private void txtAlamatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlamatKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == evt.VK_ENTER)
        {
        if (txtAlamat.getText().length()== 0)
        {
            JOptionPane.showMessageDialog(null, "Alamat Tidak Boleh Kosong", "Konfirmasi", JOptionPane.INFORMATION_MESSAGE );
            txtAlamat.requestFocus();
            return;
        }
           Simpan.requestFocus();
        }
    }//GEN-LAST:event_txtAlamatKeyPressed

    private void txtNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == evt.VK_ENTER)
        {
        if (txtNo.getText().length()== 0)
        {
            JOptionPane.showMessageDialog(null, "No Tidak Boleh Kosong", "Konfirmasi", JOptionPane.INFORMATION_MESSAGE );
            txtNo.requestFocus();
            return;
        }
           Simpan.requestFocus();
        }
    }//GEN-LAST:event_txtNoKeyPressed

    private void txtTelpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelpKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == evt.VK_ENTER)
        {
        if (txtTelp.getText().length()== 0)
        {
            JOptionPane.showMessageDialog(null, "Telp Tidak Boleh Kosong", "Konfirmasi", JOptionPane.INFORMATION_MESSAGE );
            txtTelp.requestFocus();
            return;
        }
           Simpan.requestFocus();
        }
    }//GEN-LAST:event_txtTelpKeyPressed

    private void SimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SimpanMouseClicked
        // TODO add your handling code here:
        String NPM = txtNPM.getText();
        String Nama = txtNama.getText();
        String Prodi = txtProdi.getText();
        String Alamat = txtAlamat.getText();
        String No = txtNo.getText();
        String Telp = txtTelp.getText();
        JOptionPane.showMessageDialog(this, NPM+"\n"+Nama+"\n"+Prodi+"\n"+Alamat+"\n"+No+Telp);
    }//GEN-LAST:event_SimpanMouseClicked

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
       if(txtNPM.getText().length()== 0||txtNama.getText().length()== 0||txtProdi.getText().length()== 0||txtAlamat.getText().length()== 0||txtNo.getText().length()== 0||txtTelp.getText().length()==0)
       {
           JOptionPane.showMessageDialog(null, "Masukkan Data Tidak Boleh Kosong", "Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
           return;
       }  
       String NPM = txtNPM.getText();
       String Nama = txtNama.getText();
       String Prodi = txtProdi.getText();
       String Alamat = txtAlamat.getText();
       String No = txtNo.getText();
       String Telp = txtTelp.getText();
       JOptionPane.showMessageDialog(this, NPM+"\n"+Nama+"\n"+Prodi+"\n"+Alamat+"\n"+No+"-"+Telp);
               
    }//GEN-LAST:event_SimpanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat;
    private javax.swing.JLabel NPM;
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel No;
    private javax.swing.JLabel Prodi;
    private javax.swing.JButton Simpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelmhs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNPM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtProdi;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables
}
