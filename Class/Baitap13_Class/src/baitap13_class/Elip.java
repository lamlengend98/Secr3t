
package baitap13_class;


public class Elip extends Point{
    private int a;
    private int b;    

    public Elip(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Elip() {
    }
    
    protected double tinhDienTich(){
        return Math.PI * a * b;
    }
}
