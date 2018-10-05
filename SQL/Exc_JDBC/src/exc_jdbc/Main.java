/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc_jdbc;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lamng
 */
public class Main {

    public static void main(String[] args) {
        do {
            try {
                Scanner input = new Scanner(System.in);
                QLSV qlsv = new QLSV();

                System.out.println("---MENU---");
                System.out.println("1. Danh sach");
                System.out.println("2. Them SV");
                System.out.println("3. Xoa SV");
                System.out.println("4. Sua thong tin");
                System.out.println("5. Thoat");
                System.out.print("Chon: ");
                int chon = Integer.parseInt(input.nextLine());

                switch (chon) {
                    case 1:
                        List<SinhVien> lists = qlsv.getAll();
                        for (SinhVien sv : lists) {
                            System.out.println(sv);
                        }
                        break;
                    case 2:
                        SinhVien sv = new SinhVien();
                        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                        System.out.println("Ten: ");
                        sv.setName(input.nextLine());
                        System.out.println("Major: ");
                        sv.setMajor(input.nextLine());
                        System.out.println("Date of birth: ");
                        sv.setDate(sdf.parse(input.nextLine()));

                        int add = qlsv.add(sv);
                        System.out.println(sv);
                        break;
                    case 3:
                        System.out.print("Nhap id: ");
                        int id = Integer.parseInt(input.nextLine());
                        qlsv.delete(id);
                        break;
                    case 4:
                        SinhVien sv1 = new SinhVien();
                        SimpleDateFormat sdft = new SimpleDateFormat("dd-MM-yyyy");
                        System.out.println("Nhap thong tin sinh vien can sua");
                        System.out.println("Ten: ");
                        sv1.setName(input.nextLine());
                        System.out.println("Major: ");
                        sv1.setMajor(input.nextLine());
                        System.out.println("Date of birth: ");
                        sv1.setDate(sdft.parse(input.nextLine()));
                        System.out.println("Id: ");
                        sv1.setId(Integer.parseInt(input.nextLine()));

                        int ud = qlsv.update(sv1);
                        System.out.println("Ket qua");
                        System.out.println(ud);
                        break;
                    default:
                        throw new AssertionError();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }
}
