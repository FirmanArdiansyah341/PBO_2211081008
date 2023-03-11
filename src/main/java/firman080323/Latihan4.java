/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firman080323;
import java.io.*;

/**
 *
 * @author ASUS iD
 */
public class Latihan4 {
    public static void main (String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int number = 0;
        char letter ;
        boolean result = false ;
        try{ 
            System.out.print("str :"); 
            str = dataIn.readLine();
            System.out.print("number : "); 
            number = Integer.parseInt(dataIn.readLine());
            System.out.print("letter : "); 
            letter = (char)dataIn.read();
            System.out.print("result : "); 
            result = dataIn.markSupported();
            
        }   catch( IOException e ){ 
        System.out.println("Error!"); 
        } 
    }
}
