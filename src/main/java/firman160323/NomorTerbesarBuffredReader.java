/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firman160323;
import java.io.*;
import java.util.*;
/**
 *
 * @author ASUS iD
 */
public class NomorTerbesarBuffredReader {
    public static void main (String[] args){
        int [] nomor = new int [10];
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try{ 
            for (int i = 0; i < nomor.length; i++) {
            System.out.print("Masukkan nomor ke-" + (i+1) + " : ");
            nomor[i] = Integer.parseInt(dataIn.readLine());
        }
        
        }   catch( IOException e ){ 
        System.out.println("Error!"); 
        }
        System.out.println("Angka Yang Dimasukkan");
        for (int i=0;i<nomor.length;i++){
            System.out.print(nomor[i]);
        }
        int terbesar = nomor[0];
        for(int i=1;i<nomor.length;i++){
        if(nomor[i]>terbesar){
            terbesar = nomor[i];
            }  
        }
        System.out.println();
        System.out.println("Angka Terbesar Adalah : "+terbesar);
    }
}
