/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firman240523.controller;

import firman240523.view.*;
import firman240523.model.*;
import firman240523.dao.*;
import firman240523.database.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS iD
 */
public class AnggotaController {
    FormAnggota formAnggota;
    Anggota anggota;
    AnggotaDao dao;

    public AnggotaController(FormAnggota formAnggota) throws SQLException {
        this.formAnggota = formAnggota;
        try {
            dao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    public void clearForm() {
        formAnggota.getTxtNobp().setText("");
        formAnggota.getTxtNama().setText("");
        formAnggota.getTxtAlamat().setText("");
        formAnggota.getCboJenisKelamin().removeAllItems();
        formAnggota.getCboJenisKelamin().addItem("L");
        formAnggota.getCboJenisKelamin().addItem("P");
    }
    public void insert(){
        try {
            anggota = new Anggota();
            anggota.setNobp(formAnggota.getTxtNobp().getText());
            anggota.setNama(formAnggota.getTxtNama().getText());
            anggota.setAlamat(formAnggota.getTxtAlamat().getText());
            anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
            dao.insert(anggota);
            JOptionPane.showMessageDialog(formAnggota, "Entri Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formAnggota, ex.getMessage());
        }
    }
    public void tampilTabel(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) formAnggota.getTblAnggota().getModel();
            tabelModel.setRowCount(0);
            List<Anggota> list = dao.getAll();
            for (Anggota anggota1 : list){
                Object [] row = {
                    anggota1.getNobp(),
                    anggota1.getNama(),
                    anggota1.getAlamat(),
                    anggota1.getJenisKelamin(),
                };
                tabelModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}