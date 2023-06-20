/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelyakartika200623;

/**
 *
 * @author hp
 */
public class Lingkaran implements Relation {

    
    private int r;

    public Lingkaran() {
    }

    public Lingkaran(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double hitungLuas() {
        double luas = Math.PI * Math.pow(r, 2);
        return luas;
    }

    public boolean isGreater(Object a, Object b) {
        double aLen = ((Lingkaran) a).hitungLuas();
        double bLen = ((Lingkaran) b).hitungLuas();
        return (aLen > bLen);
    }

    public boolean isLess(Object a, Object b) {
        double aLen = ((Lingkaran) a).hitungLuas();
        double bLen = ((Lingkaran) b).hitungLuas();
        return (aLen < bLen);
    }

    public boolean isEqual(Object a, Object b) {
        double aLen = ((Lingkaran) a).hitungLuas();
        double bLen = ((Lingkaran) b).hitungLuas();
        return (aLen == bLen);
    }
}
