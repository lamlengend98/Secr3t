
package baitap14_class;

public class TamGiac {
    private double canh1;
    private double canh2;
    private double canh3;
    private double duongCaoXuongCanh1;

    public TamGiac(double canh1, double canh2, double canh3, double duongCaoXuongCanh1) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
        this.duongCaoXuongCanh1 = duongCaoXuongCanh1;
    }

    public TamGiac() {
    }
    
    protected double tinhChuVi(){
        return (canh1 + canh2+ canh3);
    }
    protected double tinhDienTich(){
        return (canh1 * duongCaoXuongCanh1)/2;
    }
}
