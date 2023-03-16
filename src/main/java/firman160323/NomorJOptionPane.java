/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firman160323;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author ASUS iD
 */
public class NomorJOptionPane {
    public static void main (String[] args){
        int [] nomor = new int [10];
        for (int i=0;i<nomor.length;i++){
            String input = JOptionPane.showInputDialog(null, "Masukkan nomor ke-" + (i+1));
            nomor[i] = Integer.parseInt(input);
        }
        String output = "Angka Yang Dimasukkan Adalah : \n";
        for (int i = 0; i < nomor.length; i++) {
            output += "\t"+nomor[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, "\t"+output);
        
        int terbesar = nomor[0];
        for(int i=1;i<nomor.length;i++){
        if(nomor[i]>terbesar){
            terbesar = nomor[i];
            }  
        }
        String angka = "Angka Terbesar Adalah : "+terbesar;
        JOptionPane.showMessageDialog(null,angka);
    }
}
