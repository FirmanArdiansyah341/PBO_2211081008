/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsB.controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utsB.model.Pesanan;
import utsB.model.PesananDao;
import utsB.model.PesananDaoImpl;
import utsB.view.FormPesanan;

/**
 *
 * @author ASUS iD
 */
public class PesananController2 {
    private FormPesanan formPesanan;
    private Pesanan pesanan;
    private PesananDao pesananDao;
    
    public PesananController2(FormPesanan formPesanan){
        this.formPesanan = formPesanan;
        pesananDao = new PesananDaoImpl();
    }
    public void bersihForm(){
        formPesanan.getTxtKodePesanan().setText("");
        formPesanan.getTxtNamaPesanan().setText("");
        formPesanan.getTxtTglPesan().setText("");
        formPesanan.getTxtHarga().setText("");
        formPesanan.getTxtOngkosKirim().setText("");
        formPesanan.getTxtDiskon().setText("");
    }
   public void savePesanan() {
    pesanan = new Pesanan();
    pesanan.setKodePesanan(formPesanan.getTxtKodePesanan().getText());
    pesanan.setNamaPesanan(formPesanan.getTxtNamaPesanan().getText());
    pesanan.setTglPesan(formPesanan.getTxtTglPesan().getText());
    pesanan.setHarga(formPesanan.getTxtHarga().getText());
    pesanan.setOngkosKirim(formPesanan.getTxtOngkosKirim().getText());

    // Menghitung total belanja
    double harga = Double.parseDouble(formPesanan.getTxtHarga().getText());
    double ongkosKirim = Double.parseDouble(formPesanan.getTxtOngkosKirim().getText());
    double total = harga + ongkosKirim;

    // Mengecek apakah total belanja melebihi 100.000
    if (total > 100000) {
        // Menghitung diskon sebesar 2%
        
        pesanan.setDiskon("2%");
    } else {
        pesanan.setDiskon("0%"); // Tidak ada diskon
    }

    pesananDao.save(pesanan);
    JOptionPane.showMessageDialog(formPesanan, "Insert Ok");
}

    public void updatePesanan(){
        int index = formPesanan.getTblPesanan().getSelectedRow();
        pesanan = new Pesanan();
        pesanan.setKodePesanan(formPesanan.getTxtKodePesanan().getText());
        pesanan.setNamaPesanan(formPesanan.getTxtNamaPesanan().getText());
        pesanan.setTglPesan(formPesanan.getTxtTglPesan().getText());
        pesanan.setHarga(formPesanan.getTxtHarga().getText());
        pesanan.setOngkosKirim(formPesanan.getTxtOngkosKirim().getText());
        pesanan.setDiskon(formPesanan.getTxtDiskon().getText());
        pesananDao.update(index,pesanan);
        JOptionPane.showMessageDialog(formPesanan, "Update Ok");
    }
    public void getPesanan(){
         int index = formPesanan.getTblPesanan().getSelectedRow();
        pesanan = pesananDao.getPesanan(index);
        if(pesanan != null){
            formPesanan.getTxtKodePesanan().setText(pesanan.getKodePesanan());
            formPesanan.getTxtNamaPesanan().setText(pesanan.getNamaPesanan());
            formPesanan.getTxtTglPesan().setText(pesanan.getTglPesan());
            formPesanan.getTxtHarga().setText(pesanan.getHarga());
            formPesanan.getTxtOngkosKirim().setText(pesanan.getOngkosKirim());
            formPesanan.getTxtDiskon().setText(pesanan.getDiskon());
        }
    }
    public void delete(){
         int index = formPesanan.getTblPesanan().getSelectedRow();
         pesananDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPesanan,"Delete Ok");
    }
    public void tampil(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formPesanan.getTblPesanan().getModel();
        tabelModel.setRowCount(0);
        List<Pesanan> list = pesananDao.getAllPesanan();
        for(Pesanan pesanan1 : list){
            Object row[] = {
               pesanan1.getKodePesanan(),
               pesanan1.getNamaPesanan(),
               pesanan1.getTglPesan(),
               pesanan1.getHarga(),
               pesanan1.getOngkosKirim(),
               pesanan1.getDiskon()
            };
            tabelModel.addRow(row);
        }
    }
}
