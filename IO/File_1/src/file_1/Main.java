/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
//        WRFile wrf = new WRFile();
        nv.show();
//        System.out.println(nv.toString());
        nv.wFile();
        nv.rFile();
    }

}
