/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utsB.model;
import java.util.*;
/**
 *
 * @author ASUS iD
 */
public interface PesananDao {
    void save(Pesanan pesanan);
    void update(int index, Pesanan pesanan);
    void delete(int index);
    Pesanan getPesanan(int index);
    public List<Pesanan> getAllPesanan();
}
