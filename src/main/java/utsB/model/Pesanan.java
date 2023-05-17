/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsB.model;

/**
 *
 * @author ASUS iD
 */
public class Pesanan {
    private String kodePesanan;
    private String namaPesanan;
    private String tglPesan;
    private String harga;
    private String ongkosKirim;
    private String diskon;
    
    public Pesanan(){
    
    }
    public Pesanan(String kodePesanan, String namaPesanan, String tglPesan, String harga, String ongkosKirim, String diskon){
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.tglPesan = tglPesan;
        this.harga = harga;
        this.ongkosKirim = ongkosKirim;
        this.diskon = diskon;
    }

    public String getKodePesanan() {
        return kodePesanan;
    }

    public void setKodePesanan(String kodePesanan) {
        this.kodePesanan = kodePesanan;
    }

    public String getNamaPesanan() {
        return namaPesanan;
    }

    public void setNamaPesanan(String namaPesanan) {
        this.namaPesanan = namaPesanan;
    }

    public String getTglPesan() {
        return tglPesan;
    }

    public void setTglPesan(String tglPesan) {
        this.tglPesan = tglPesan;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getOngkosKirim() {
        return ongkosKirim;
    }

    public void setOngkosKirim(String ongkosKirim) {
        this.ongkosKirim = ongkosKirim;
    }

    public String getDiskon() {
        return diskon;
    }

    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }
}
