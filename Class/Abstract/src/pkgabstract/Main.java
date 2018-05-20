/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;
import java.util.*;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Util u = new Util();
        Square sq = new Square();
        Rectangle rec = new Rectangle();
        Circle c = new Circle();
        
        do{
        System.out.println("=======================================");
        System.out.println("1. Tinh dien tich hinh vuong");
        System.out.println("2. Tinh dien tich hinh chu nhat.");
        System.out.println("3. Tinh dien tich hinh tron.");
        System.out.println("4. Thoat");
        System.out.print("Moi ban chon: ");
        int choice = Integer.parseInt(input.nextLine());
        System.out.println("=======================================");
        
        switch(choice){
            case 1:
                System.out.print("Moi ban nhap canh: ");
                sq.setWidth(Integer.parseInt(input.nextLine()));
                double area1 = u.calShape(sq);
                System.out.println("Dien tich hinh vuong la: "+area1);
                break;
            case 2:
                do{
                    
                    System.out.print("Moi ban nhap chieu dai: ");
                    rec.setLength(Integer.parseInt(input.nextLine()));
                    System.out.print("Moi ban nhap chieu rong: ");
                    rec.setWidth(Integer.parseInt(input.nextLine()));
                    if(rec.getLength() < rec.getWidth()){
                        System.out.println("Chieu dai phai lon hon chieu rong!! Moi ban nhap lai!!!");
                    }
                }while(rec.getLength() < rec.getWidth());
                
                double area2 = u.calShape(rec);
                System.out.println("Dien tich hinh chu nhat la: "+area2);
                break;
            case 3:
                System.out.print("Nhap ban kinh hinh tron: ");
                c.setRadius(Integer.parseInt(input.nextLine()));
                double area3 = u.calShape(c);
                System.out.printf("Dien tich hinh tron la: %.2f\n",area3);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Loi!! Moi ban nhap lai!!!");
        }
        }while(true);

    }
    
}
