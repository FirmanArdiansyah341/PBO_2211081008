/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firman160323;
import java.util.*;
/**
 *
 * @author ASUS iD
 */
public class HariDoWhile {
    public static void main (String [] args){
        String days [] = {"Senin","Selasa","Rabu","Kamis","Kamis","Jum'at","Sabtu","Minggu"};
        int i=0;
        do {
            System.out.println(days[i]);
            i++;
        }while(i<days.length);
    }
}
