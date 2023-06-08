/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firman240523.dao;
import firman240523.model.*;
import firman240523.dao.*;
import java.util.*;
import java.sql.*;
/**
 *
 * @author ASUS iD
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
    
    Connection connection;
    
    public PeminjamanDaoImpl(Connection connection){
        this.connection = connection;
        AnggotaDao daoAnggota = new AnggotaDaoImpl();
        BukuDao daoBuku = new BukuDaoImpl();
    }

    public PeminjamanDaoImpl() {
        
    }

    @Override
    public void insert(Peminjaman peminjaman, Anggota anggota, Buku buku) throws SQLException {
        String sql = "insert into peminjaman values (?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodePeminjaman());
        ps.setString(2, anggota.getNobp());
        ps.setString(3, buku.getKodeBuku());
        ps.setString(4,peminjaman.getTglPinjam());
        ps.setString(5,peminjaman.getTglKembali());
    }

    @Override
    public void update(Peminjaman peminjaman, Anggota anggota, Buku buku) throws SQLException {
       String sql = "update peminjaman set nobp=?, kodebuku=?, tglpinjam=?, tglkembali=? where kode_peminjaman=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodeBuku());
        ps.setString(2, anggota.getNobp());
        ps.setString(3,peminjaman.getTglPinjam());
        ps.setString(4,peminjaman.getTglKembali());
        ps.setString(5, peminjaman.getKodePeminjaman());
        ps.executeUpdate();
    }

    @Override
    public void delete(String kodePeminjaman) throws SQLException {
        String sql = "delete from peminjaman where  kode_peminjaman=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodePeminjaman);
        ps.executeUpdate();  
    }

    @Override
    public Peminjaman getPeminjaman(String kodePeminjaman, String nobp, String kodeBuku) throws SQLException {
       
    }

    @Override
    public List<Peminjaman> getAll() throws SQLException {
    String sql = "SELECT * FROM peminjaman";
    PreparedStatement ps = connection.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    List<Peminjaman> list = new ArrayList<>();

    while (rs.next()) {
        Peminjaman peminjaman = new Peminjaman();
        Anggota anggota = new Anggota();
        Buku buku = new Buku();

        peminjaman.setKodePeminjaman(rs.getString(1));
        anggota.setNobp(rs.getString(2));
        buku.setKodeBuku(rs.getString(3));

        peminjaman.setNobp(anggota.getNobp());
        peminjaman.setKodeBuku(buku.getKodeBuku());


        peminjaman.setTglPinjam(rs.getString(4));
        peminjaman.setTglKembali(rs.getString(5));

        list.add(peminjaman);
        }
         return list;
    }    
}
