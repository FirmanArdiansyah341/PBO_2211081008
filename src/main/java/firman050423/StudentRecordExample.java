/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firman050423;

/**
 *
 * @author ASUS iD
 */
class StudentRecord {
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average;
    
    private static int studentCount;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
     public double getMathGrade(){
        return mathGrade;
    }
     public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
     public double getEnglishGrade(){
        return englishGrade;
    }
     public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
     
     public double getScienceGrade(){
        return scienceGrade;
    }
     public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
     
     public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
     
     public static int getStudentCount(){
         return studentCount;
     }
     
    public void print( String temp ){ 
    System.out.println("Name:" + name); 
    System.out.println("Address:" + address); 
    System.out.println("Age:" + age); 
    } 
    public void print(double eGrade, double mGrade, double sGrade) {
    //System.out.println("Name:" + name); 
    System.out.println("Math Grade:" + mGrade); 
    System.out.println("English Grade:" + eGrade); 
    System.out.println("Science Grade:" + sGrade); 
    }
}

public class StudentRecordExample{
    public static void main(String[] args){
        StudentRecord annaRecord = new StudentRecord();
        StudentRecord crisRecord = new StudentRecord(); 
        
        //Memberi 
        annaRecord.setName("Anna");  
        annaRecord.setAddress("Padang");
        annaRecord.setAge(20);
        annaRecord.setMathGrade(85);
        annaRecord.setEnglishGrade(90);
        annaRecord.setScienceGrade(80);
        
        crisRecord.setName("Cris");  
        crisRecord.setAddress("Padang Panjang");
        crisRecord.setAge(21); 
        
        //Menampilkan nama siswa “Anna” 
        System.out.println("Nama    :   "+annaRecord.getName());
        System.out.println("Asal    :   "+annaRecord.getAddress());
        System.out.println("Umur    :   "+annaRecord.getAge());
//        System.out.println("Nilai Matematika    :   "+annaRecord.getMathGrade());
//        System.out.println("Nilai English       :   "+annaRecord.getEnglishGrade());
//        System.out.println("Nilai Science       :   "+annaRecord.getScienceGrade());
//        System.out.println("\nRata - Rata       :   "+annaRecord.getAverage());

        System.out.println("\nNama    :   "+crisRecord.getName());
        System.out.println("Asal    :   "+crisRecord.getAddress());
        System.out.println("Umur    :   "+crisRecord.getAge());
        
        StudentRecord aliRecord = new StudentRecord();
        aliRecord.setName("Ali");
        aliRecord.setAddress("Bukittinggi");
        aliRecord.setAge(23);
        
        System.out.println();
        aliRecord.print("");
        aliRecord.print(70, 80, 90);
        
        //Menampilkan jumlah siswa 
        System.out.println("Count = "+StudentRecord.getStudentCount());
    }
}
