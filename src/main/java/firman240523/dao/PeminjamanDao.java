/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package firman240523.dao;
import firman240523.model.*;
import java.sql.*;
import java.util.List;
/**
 *
 * @author ASUS iD
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman, Anggota anggota, Buku buku) throws SQLException;
    void update(Peminjaman peminjaman, Anggota anggota, Buku buku) throws SQLException;
    void delete(String kodePeminjaman) throws SQLException;
    Peminjaman getPeminjaman(String kodePeminjaman, String nobp, String kodeBuku) throws SQLException;
    public List<Peminjaman> getAll() throws SQLException;
}
