/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package firman240523.view;

import firman240523.controller.PengembalianController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author ASUS iD
 */
public class FormPengembalian extends javax.swing.JFrame {

    /**
     * Creates new form FormPengembalian
     */
    PengembalianController controller;
    public FormPengembalian() {
        initComponents();
        controller = new PengembalianController(this);
        controller.clearForm();
        controller.isiComboAnggota();
        controller.isiComboBuku();
        controller.tampilTabelPengembalian();
    }

    public JTable getTabelPengembalian() {
        return tabelPengembalian;
    }

    public JTextField getTxtDenda() {
        return txtDenda;
    }

    public JTextField getTxtTerlambat() {
        return txtTerlambat;
    }

    public JTextField getTxtTglDikembalikan() {
        return txtTglDikembalikan;
    }

    public JTextField getTxtTglPinjam() {
        return txtTglPinjam;
    }

    public JComboBox<String> getCboKodeBuku() {
        return cboKodeBuku;
    }

    public JComboBox<String> getCboNobp() {
        return cboNobp;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTglPinjam = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDenda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTglDikembalikan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTerlambat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPengembalian = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cboNobp = new javax.swing.JComboBox<>();
        cboKodeBuku = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("No. Bp");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 100, 16);

        jLabel3.setText("Kode Buku");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 40, 104, 16);

        jLabel5.setText("Denda");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 170, 81, 16);

        txtTglPinjam.setText("jTextField2");
        getContentPane().add(txtTglPinjam);
        txtTglPinjam.setBounds(140, 70, 440, 22);

        jLabel7.setText("Tgl Dikembalikan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 110, 100, 16);

        txtDenda.setText("jTextField2");
        getContentPane().add(txtDenda);
        txtDenda.setBounds(140, 170, 440, 22);

        jLabel8.setText("Tgl Pinjam");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 80, 81, 16);

        txtTglDikembalikan.setText("jTextField2");
        getContentPane().add(txtTglDikembalikan);
        txtTglDikembalikan.setBounds(140, 100, 440, 22);

        jLabel9.setText("Terlambat");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 140, 81, 16);

        txtTerlambat.setText("jTextField2");
        getContentPane().add(txtTerlambat);
        txtTerlambat.setBounds(140, 130, 440, 22);

        tabelPengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Bp", "Nama", "Kode Buki", "Judul", "TglPinjam", "TglKembali", "TglDikembalikan", "Terlambat", "Denda"
            }
        ));
        tabelPengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPengembalianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPengembalian);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 270, 630, 200);

        jButton1.setText("Delete");
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 220, 72, 23);

        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 220, 72, 23);

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(140, 220, 72, 23);

        cboNobp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboNobp);
        cboNobp.setBounds(140, 10, 440, 22);

        cboKodeBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboKodeBuku);
        cboKodeBuku.setBounds(140, 40, 440, 22);

        setSize(new java.awt.Dimension(644, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         controller.insert();
        controller.tampilTabelPengembalian();
        controller.clearForm();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelPengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPengembalianMouseClicked
        // TODO add your handling code here:
        controller.getPengembalian();
    }//GEN-LAST:event_tabelPengembalianMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         controller.update();
        controller.tampilTabelPengembalian();
        controller.clearForm();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboKodeBuku;
    private javax.swing.JComboBox<String> cboNobp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelPengembalian;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtTerlambat;
    private javax.swing.JTextField txtTglDikembalikan;
    private javax.swing.JTextField txtTglPinjam;
    // End of variables declaration//GEN-END:variables
}
