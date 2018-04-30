
package baitap13_class;


public class Baitap13_Class {

    
    public static void main(String[] args) {
        Point d = new Point(1, 3);
        Elip e = new Elip(1, 3, 4, 6);
        Circle c = new Circle(1, 3);
        
        System.out.println("Tọa độ điểm A là: A("+d.hoanhDo()+", "+d.tungDo()+")");
        
        System.out.printf("Diện tích Elip là: %.2f",e.tinhDienTich());
        
        System.out.printf("\nDiện tích hình tròn là: %.2f",c.tinhDienTich());
    }
    
}
