package ex_file;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        File_Options fo = new File_Options();
        do {
            System.out.println("=====================");
            System.out.println("1. Duyet file.");
            System.out.println("2. Xoa file.");
            System.out.println("3. Tao file.");
            System.out.println("4. Doi ten file.");
            System.out.println("5. Thoat");
            System.out.print("Moi ban chon: ");
            int choice = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println("=====================");

            switch (choice) {
                case 1:
                    fo.hienThi();
                    break;
                case 2:
                    fo.xoa();
                    break;
                case 3:
                    fo.tao();
                    break;
                case 4:
                    fo.doiTen();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Moi ban chon lai!!");
            }
        } while (true);
    }

}


