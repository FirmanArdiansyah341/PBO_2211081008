/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firman240523.controller;
import firman240523.model.*;
import firman240523.dao.*;
import firman240523.database.DatabaseHelper;
import firman240523.view.*;
import java.sql.Connection;
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
public class PeminjamanController {
   FormPeminjaman formPeminjaman;
   Peminjaman peminjaman;
   PeminjamanDao peminjamanDao;
   AnggotaDao anggotaDao;
   BukuDao bukuDao;
   
   public PeminjamanController(FormPeminjaman formPeminjaman){
       try {
           this.formPeminjaman = formPeminjaman;
           peminjamanDao = new PeminjamanDaoImpl(DatabaseHelper.getConnection());
           anggotaDao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
           bukuDao = new BukuDaoImpl(DatabaseHelper.getConnection());
       } catch (SQLException ex) {
           Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public void clearForm(){
       formPeminjaman.getTxtTglPinjam().setText("");
       formPeminjaman.getTxtTglKembali().setText("");
   }
   public void isiComboAnggota(){
       try {
           formPeminjaman.getCboNobp().removeAllItems();
           List<Peminjaman> list = peminjamanDao.getAll();
           for (Peminjaman p : list){
               Anggota anggota = anggotaDao.getAnggota(p.getNobp());
               formPeminjaman.getCboNobp().addItem(p.getNobp()+"-"+anggota.getNama());
           }
       } catch (SQLException ex) {
           Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public void isiComboBuku(){
       try {
           formPeminjaman.getCboKodeBuku().removeAllItems();
           List<Peminjaman> list = peminjamanDao.getAll();
           for (Peminjaman p : list){
               Buku buku = bukuDao.getBuku(p.getNobp());
               formPeminjaman.getCboKodeBuku().addItem(p.getKodeBuku()+"-"+buku.getJudulBuku());
           }
       } catch (SQLException ex) {
           Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public void insert(){
       try {
           peminjaman = new Peminjaman();
           peminjaman.setNobp(formPeminjaman.getCboNobp().getSelectedItem().toString().split("-") [0]);
           peminjaman.setKodeBuku(formPeminjaman.getCboKodeBuku().getSelectedItem().toString().split("-") [0]);
           peminjaman.setTglPinjam(formPeminjaman.getTxtTglPinjam().getText());
           peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
           peminjamanDao.insert(peminjaman);
           JOptionPane.showMessageDialog(formPeminjaman, "Insert Ok");
       } catch (SQLException ex) {
           Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public void getPeminjaman(){
       try {
           String nobp = formPeminjaman.getTabelPeminjaman()
                   .getValueAt(formPeminjaman.getTabelPeminjaman().getSelectedRow(), 0).toString();
           String kodeBuku = formPeminjaman.getTabelPeminjaman()
                   .getValueAt(formPeminjaman.getTabelPeminjaman().getSelectedRow(), 2).toString();
           String tglPinjam = formPeminjaman.getTabelPeminjaman()
                   .getValueAt(formPeminjaman.getTabelPeminjaman().getSelectedRow(), 4).toString();
           
           peminjaman = peminjamanDao.getPeminjaman(nobp, kodeBuku, tglPinjam);
           Anggota anggota = anggotaDao.getAnggota(peminjaman.getNobp());
           formPeminjaman.getCboNobp().setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
           Buku buku = bukuDao.getBuku(peminjaman.getKodeBuku());
           formPeminjaman.getCboKodeBuku().setSelectedItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
           formPeminjaman.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
           formPeminjaman.getTxtTglKembali().setText(peminjaman.getTglKembali());
       } catch (SQLException ex) {
           Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
