/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsB.model;

import java.util.*;

/**
 *
 * @author ASUS iD
 */
public class PesananDaoImpl implements PesananDao{
    
    List<Pesanan> data = new ArrayList<>();
    
    
    
    public PesananDaoImpl(){
        data.add(new Pesanan("212", "JNE", "20-02-2023", "150000", "20000", calculateDiscount(150000)));
        
    }
    private String calculateDiscount(double total) {
    if (total > 100000) {
        return "2%";
    } else {
        return "0%";
    }
}

    @Override
    public void save(Pesanan pesanan) {
       data.add(pesanan);
    }

    @Override
    public void update(int index, Pesanan pesanan) {
       data.set(index, pesanan);
    }

    @Override
    public void delete(int index) {
        data.remove(index);
    }

    @Override
    public Pesanan getPesanan(int index) {
      return data.get(index);
    }

    @Override
    public List<Pesanan> getAllPesanan() {
        return data;
    }
    
}
