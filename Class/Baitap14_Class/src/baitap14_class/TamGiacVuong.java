package baitap14_class;

public class TamGiacVuong extends TamGiac {
    private double canhVuong1;
    private double canhVuong2;
    private double canhKe;

    public TamGiacVuong(double canhVuong1, double canhVuong2, double canhKe) {
        this.canhVuong1 = canhVuong1;
        this.canhVuong2 = canhVuong2;
        this.canhKe = canhKe;
    }

    public TamGiacVuong() {
    }
    
    @Override
    protected double tinhChuVi(){
        return (canhVuong1 + canhVuong2 + canhKe);
    }
    
    @Override
    protected double tinhDienTich(){
        return (canhVuong1 * canhVuong2)/2;
    }
}
