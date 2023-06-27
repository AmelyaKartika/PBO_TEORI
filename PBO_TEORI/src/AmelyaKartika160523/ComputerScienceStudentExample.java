/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AmelyaKartika160523;

/**
 *
 * @author hp
 */
public class ComputerScienceStudentExample {
    public static void main(String[] args) {
        // Membuat objek ComputerScienceStudent
        ComputerScienceStudent student1 = new ComputerScienceStudent();
        student1.setName("John Doe");
        student1.setAddress("123 Main Street");
        student1.setAge(20);
        student1.setProgrammingLanguage("Java");
        
        // Mencetak informasi siswa menggunakan metode print(String temp) dari kelas StudentRecord
        student1.print(student1.getName());
        
        System.out.println("Student Count: " + StudentRecord.getStudentCount());
        
        System.out.println();
        
        // Membuat objek ComputerScienceStudent dengan menggunakan konstruktor lainnya
        ComputerScienceStudent student2 = new ComputerScienceStudent("Jane Smith", "456 Elm Street");
        student2.setAge(21);
        student2.setMathGrade(90);
        student2.setEnglishGrade(85);
        student2.setScienceGrade(95);
        student2.setProgrammingLanguage("Python");
        
        // Mencetak informasi siswa menggunakan metode print() yang telah di-override
        student2.print(student2.getName());
        System.out.println("Average Grade: " + student2.getAverage());
        
        System.out.println("Student Count: " + StudentRecord.getStudentCount());
    }
}

    

