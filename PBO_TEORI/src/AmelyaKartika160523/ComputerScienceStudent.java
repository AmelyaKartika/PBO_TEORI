/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AmelyaKartika160523;

/**
 *
 * @author hp
 */
public class ComputerScienceStudent extends StudentRecord {
    private String programmingLanguage;
    
    public ComputerScienceStudent() {
        super(); // Memanggil konstruktor dari kelas induk
    }
    
    public ComputerScienceStudent(String temp) {
        super(temp); // Memanggil konstruktor dari kelas induk dengan parameter temp
    }
    
    public ComputerScienceStudent(String name, String address) {
        super(name, address); // Memanggil konstruktor dari kelas induk dengan parameter name dan address
    }
    
    public ComputerScienceStudent(double mGrade, double eGrade, double sGrade) {
        super(mGrade, eGrade, sGrade); // Memanggil konstruktor dari kelas induk dengan parameter mGrade, eGrade, dan sGrade
    }
    
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    
    @Override
    public void print(String temp) {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Age: " + getAge());
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
