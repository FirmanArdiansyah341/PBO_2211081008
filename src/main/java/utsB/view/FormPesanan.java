/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package utsB.view;

import javax.swing.JTable;
import javax.swing.JTextField;
import utsB.controller.*;

/**
 *
 * @author ASUS iD
 */
public class FormPesanan extends javax.swing.JFrame {

    /**
     * Creates new form FormPesanan
     */
    PesananController2 controller;
    public FormPesanan() {
        initComponents();
        controller = new PesananController2(this);
        controller.tampil();
        controller.bersihForm();
    }

    public JTable getTblPesanan() {
        return tblPesanan;
    }

    public void setTblPesanan(JTable tblPesanan) {
        this.tblPesanan = tblPesanan;
    }

    public JTextField getTxtDiskon() {
        return txtDiskon;
    }

    public void setTxtDiskon(JTextField txtDiskon) {
        this.txtDiskon = txtDiskon;
    }

    public JTextField getTxtHarga() {
        return txtHarga;
    }

    public void setTxtHarga(JTextField txtHarga) {
        this.txtHarga = txtHarga;
    }

    public JTextField getTxtKodePesanan() {
        return txtKodePesanan;
    }

    public void setTxtKodePesanan(JTextField txtKodePesanan) {
        this.txtKodePesanan = txtKodePesanan;
    }

    public JTextField getTxtNamaPesanan() {
        return txtNamaPesanan;
    }

    public void setTxtNamaPesanan(JTextField txtNamaPesanan) {
        this.txtNamaPesanan = txtNamaPesanan;
    }

    public JTextField getTxtOngkosKirim() {
        return txtOngkosKirim;
    }

    public void setTxtOngkosKirim(JTextField txtOngkosKirim) {
        this.txtOngkosKirim = txtOngkosKirim;
    }

    public JTextField getTxtTglPesan() {
        return txtTglPesan;
    }

    public void setTxtTglPesan(JTextField txtTglPesan) {
        this.txtTglPesan = txtTglPesan;
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKodePesanan = new javax.swing.JTextField();
        txtNamaPesanan = new javax.swing.JTextField();
        txtTglPesan = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtOngkosKirim = new javax.swing.JTextField();
        txtDiskon = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPesanan = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Pesanan");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 9, 80, 16);

        jLabel2.setText("Nama Pesanan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 43, 80, 16);

        jLabel3.setText("Tgl Pesan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(6, 77, 80, 16);

        jLabel4.setText("Harga");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(6, 111, 60, 16);

        jLabel5.setText("Ongkos Kirim");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(6, 145, 80, 16);

        jLabel6.setText("Diskon");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(6, 176, 70, 16);

        txtKodePesanan.setText("jTextField1");
        getContentPane().add(txtKodePesanan);
        txtKodePesanan.setBounds(91, 6, 479, 22);

        txtNamaPesanan.setText("jTextField1");
        getContentPane().add(txtNamaPesanan);
        txtNamaPesanan.setBounds(91, 40, 479, 22);

        txtTglPesan.setText("jTextField1");
        getContentPane().add(txtTglPesan);
        txtTglPesan.setBounds(91, 74, 479, 22);

        txtHarga.setText("jTextField1");
        getContentPane().add(txtHarga);
        txtHarga.setBounds(91, 108, 479, 22);

        txtOngkosKirim.setText("jTextField1");
        getContentPane().add(txtOngkosKirim);
        txtOngkosKirim.setBounds(91, 142, 479, 22);

        txtDiskon.setText("jTextField1");
        getContentPane().add(txtDiskon);
        txtDiskon.setBounds(90, 170, 479, 22);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(6, 204, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(93, 204, 72, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(180, 204, 72, 23);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(267, 204, 72, 23);

        tblPesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Pesanan", "Nama Pesanan", "Tgl Pesan", "Harga", "Ongkos Kirim", "Diskon"
            }
        ));
        tblPesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPesananMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPesanan);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(-10, 240, 590, 402);

        setSize(new java.awt.Dimension(590, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controller.savePesanan();
        controller.tampil();
        controller.bersihForm();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.updatePesanan();
        controller.tampil();
        controller.bersihForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         controller.delete();
        controller.tampil();
        controller.bersihForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        controller.bersihForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tblPesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPesananMouseClicked
        // TODO add your handling code here:
        controller.getPesanan();
    }//GEN-LAST:event_tblPesananMouseClicked

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
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblPesanan;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKodePesanan;
    private javax.swing.JTextField txtNamaPesanan;
    private javax.swing.JTextField txtOngkosKirim;
    private javax.swing.JTextField txtTglPesan;
    // End of variables declaration//GEN-END:variables
}
