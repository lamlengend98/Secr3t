/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_file;

import java.io.*;
import java.util.*;

/**
 *
 * @author USER
 */
public class File_Options {

    private String link;
    private File file;

    private String input() {
        System.out.print("Nhap vao duong dan folder: ");
        link = new Scanner(System.in).nextLine();
        return link;
    }

    private File goiLink() {
        String link = input();
        file = new File(link);
        if (file.exists()) {
            return file;
        } else {
            System.out.println("Duong dan khong ton tai!!");
            return null;
        }
    }

    public void hienThi() {
        do {
            File file = goiLink();
            if (file != null) {
                File[] listFiles = file.listFiles();
                if (file.isDirectory()) {
                    for (int i = 0; i < listFiles.length; i++) {
                        File filename = listFiles[i];
                        System.out.println(filename);
                    }
                    break;
                } else {
                    System.out.println("Thu muc khong ton tai!!");
                }
            }
        } while (true);
    }

    public void xoa() {

        do {
            File file = goiLink();
            
            System.out.print("Nhap ten file muon xoa: ");
            StringBuffer sb = new StringBuffer(link);
            sb.append(new Scanner(System.in).nextLine());
            System.out.println(sb);
            file = new File(sb.toString());

            if (file.exists()) {
                boolean dlt = file.delete();
                if (dlt) {
                    System.out.println("Da xoa!!");
                    break;
                } else {
                    System.out.println("Khong xoa duoc!!");
                }

            } else {
                System.out.println("File khong ton tai!!");
            }
        } while (true);
    }

    public void tao() {

        do {
            try {
                File file = goiLink();

                if (file != null) {
                    System.out.print("Nhap ten file muon tao: ");
                    StringBuffer sb = new StringBuffer(link);
                    sb.append(new Scanner(System.in).nextLine());
                    System.out.println(sb);
                    file = new File(sb.toString());

                    if (file.exists()) {
                        System.out.println("File da ton tai!!");
                    } else {
                        boolean create = file.createNewFile();

                        System.out.print("Nhap noi dung file muon tao: ");
                        String content = new Scanner(System.in).nextLine();
                        PrintWriter cont = new PrintWriter(new File(sb.toString()));
                        cont.write(content);
                        cont.flush();
                        cont.close();

                        if (create) {
                            System.out.println("Tao file thanh cong!!");
                            break;
                        } else {
                            System.out.println("Tao file khong thanh cong!!");
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public void doiTen() {

        do {
            try {
                File file = goiLink();

                if (file != null) {
                    System.out.print("Nhap ten file can doi ten: ");
                    StringBuilder sb = new StringBuilder(link);
                    sb.append(new Scanner(System.in).nextLine());
                    System.out.println(sb);
                    file = new File(sb.toString());

                    if (file.exists()) {
                        System.out.print("Nhap ten file sau khi doi ten: ");
                        String rename = new Scanner(System.in).nextLine();
                        StringBuilder sbrn = new StringBuilder(link).append(rename);

                        boolean renameFile = file.renameTo(new File(sbrn.toString()));
                        if (renameFile) {
                            System.out.println("Doi ten thanh cong");
                            break;
                        } else {
                            System.out.println("Doi ten khong thanh cong!!");
                        }
                    } else {
                        System.out.println("File khong ton tai!!");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }

}
