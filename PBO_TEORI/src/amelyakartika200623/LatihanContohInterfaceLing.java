/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelyakartika200623;

/**
 *
 * @author hp
 */
public class LatihanContohInterfaceLing {
    public static void main(String[] args) {
    Lingkaran lingkaran1 = new Lingkaran(7);
    Lingkaran lingkaran2 = new Lingkaran(14);
    
    Relation lingkaran = new Lingkaran();
    System.out.println("Lingkaran 1 > Lingkaran 2: " + lingkaran.isGreater(lingkaran1, lingkaran2));
    System.out.println("Lingkaran 1 < Lingkaran 2: " + lingkaran.isLess(lingkaran1, lingkaran2));
}
}
