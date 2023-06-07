/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firman240523.dao;

import firman240523.model.Buku;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ASUS iD
 */
public class BukuDaoImpl implements BukuDao{
    Connection connection;
    
    public BukuDaoImpl(Connection connection){
        this.connection = connection;
    }

    public BukuDaoImpl() {
        
    }

    @Override
    public void insert(Buku buku) throws SQLException {
        String sql = "insert into buku values (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodeBuku());
        ps.setString(2, buku.getJudulBuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4,buku.getPenerbit());
        ps.executeUpdate();
    }

    @Override
    public void update(Buku buku) throws SQLException {
      String sql = "update buku set judulbuku=?, pengarang=?, penerbit=? where kodebuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getJudulBuku());
        ps.setString(2, buku.getPengarang());
        ps.setString(3,buku.getPenerbit());
        ps.setString(4, buku.getKodeBuku());
        ps.executeUpdate();
    }

    @Override
    public void delete(String nobp) throws SQLException {
      String sql = "delete from anggota where  kodebuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodebuku);
        ps.executeUpdate();   
    }

    @Override
    public Buku getBuku(String nobp) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Buku> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
