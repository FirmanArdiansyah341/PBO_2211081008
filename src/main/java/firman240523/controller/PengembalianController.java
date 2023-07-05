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
public class PengembalianController {
   FormPengembalian formPengembalian;
   FormPeminjaman formPeminjaman;
   Pengembalian pengembalian;
   Peminjaman peminjaman;
   PeminjamanDao peminjamanDao;
   AnggotaDao anggotaDao;
   BukuDao bukuDao;
   Connection connection;
   PengembalianDao pengembalianDao;
   
  public PengembalianController(FormPengembalian formPengembalian){
       try {
           this.formPengembalian = formPengembalian;
           connection = DatabaseHelper.getConnection();
           peminjamanDao = new PeminjamanDaoImpl(connection);
           anggotaDao = new AnggotaDaoImpl(connection);
           bukuDao = new BukuDaoImpl(connection);
           pengembalianDao = new PengembalianDaoImpl(connection);
       } catch (SQLException ex) {
           Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
  public void clearForm(){
      formPengembalian.getTxtDenda().setText("");
      formPengembalian.getTxtTerlambat().setText("");
      formPengembalian.getTxtTglDikembalikan().setText("");
      formPengembalian.getTxtTglPinjam().setText("");
  } 
  
  public void isiComboAnggota(){
       try {
           formPeminjaman.getCboNobp().removeAllItems();
           List<Anggota> list = anggotaDao.getAll();
           for (Anggota anggota : list){
               formPeminjaman.getCboNobp().addItem(anggota.getNobp()+"-"+anggota.getNama());
           }
       } catch (SQLException ex) {
           Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public void isiComboBuku(){
       try {
           formPeminjaman.getCboKodeBuku().removeAllItems();
           List<Buku> list =bukuDao.getAll();
           for (Buku buku : list){
               formPeminjaman.getCboKodeBuku().addItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
           }
       } catch (SQLException ex) {
           Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
  public void tampilTabelPeminjaman() {
    try {
        DefaultTableModel tabelModel = (DefaultTableModel) formPeminjaman.getTabelPeminjaman().getModel();
        tabelModel.setRowCount(0);
        List<Peminjaman> list = peminjamanDao.getAll();
        for (Peminjaman p : list) {
            Anggota anggota = anggotaDao.getAnggota(p.getNobp());
            Buku buku = bukuDao.getBuku(p.getKodeBuku());
            Object[] row = {
                p.getNobp(),
                anggota.getNama(),
                p.getKodeBuku(),
                buku.getJudulBuku(),
                p.getTglPinjam(),
                p.getTglKembali()
            };
            tabelModel.addRow(row);
        }
    } catch (SQLException ex) {
        Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
 
