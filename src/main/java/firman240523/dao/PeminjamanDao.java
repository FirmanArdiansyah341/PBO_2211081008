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
    void insert(Peminjaman peminjaman) throws SQLException;
    void update(Peminjaman peminjaman) throws SQLException;
    void delete(String nobp) throws SQLException;
    Peminjaman getAnggota(String nobp) throws SQLException;
    public List<Peminjaman> getAll() throws SQLException;
}
