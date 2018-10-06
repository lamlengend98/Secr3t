/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_sp;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lamng
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {
            try {
                Scanner sc = new Scanner(System.in);
                QLSP qly = new QLSP();
                SanPham sp = new SanPham();

                System.out.println("---MENU---");
                System.out.println("1. Danh sach");
                System.out.println("2. Them SP");
                System.out.println("3. Tim kiem thong tin");
                System.out.println("4. Xoa SP");
                System.out.println("5. Thoat");
                System.out.print("Chon: ");
                int chon = Integer.parseInt(sc.nextLine());
                switch (chon) {
                    case 1:
                        List<SanPham> list = qly.getAll();
                        for (SanPham sanPham : list) {
                            System.out.println(sanPham);
                        }
                        break;
                    case 2:
                        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                        System.out.print("Name: ");
                        sp.setName(sc.nextLine());
                        System.out.print("Price: ");
                        sp.setPrice(Double.parseDouble(sc.nextLine()));
                        System.out.print("Descripion: ");
                        sp.setDescription(sc.nextLine());
                        System.out.print("Created at: ");
                        sp.setCreated(sdf.parse(sc.nextLine()));

                        int rs = qly.add(sp);
                        System.out.println("Ket qua: " + rs);
                        break;
                    case 3:
                        System.out.println("Nhap ten san pham can tim: ");
                        String name = sc.nextLine();
                        List<SanPham> search = qly.search(sp, name);
                        for (SanPham sanPham : search) {
                            System.out.println(sanPham);
                        }
                        break;
                    case 4:
                        System.out.println("Nhap id san pham can xoa: ");
                        int id = sc.nextInt();
                        qly.delete(id);
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
