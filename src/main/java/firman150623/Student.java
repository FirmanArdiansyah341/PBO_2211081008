/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firman150623;

/**
 *
 * @author ASUS iD
 */
public class Student extends Person {
    public Student(){ 
    System.out.println("Inside Student:Constructor"); 
    //beberapa kode di sini 
    }
    public static void main(String[] args) {
        Student anna = new Student();
        anna.name = "Budi";
        anna.address = "Padang";
        System.out.println("Nama    : "+anna.name);
    }
}
