/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_1;
import java.io.*;

/**
 *
 * @author USER
 */
public class WriteFile {
    private NhanVien[] listNV;
    private int index = 0;
    private int size  = 0;
    NhanVien nv = new NhanVien();


    public WriteFile() {
        this.listNV = new NhanVien[size];
    }
    
    public void input(){
        nv.show();
        listNV[index++] = nv;
    }

    @Override
    public String toString() {
        return nv.toString(); 
    }
    

    
    public void wFile(){
        try{
            ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("L:/Demo/person.out"));
            ous.writeObject(listNV);
            ous.flush();
            ous.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void rFile() {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("L:/Demo/person.out"));
            NhanVien[] arr = (NhanVien[])ois.readObject();
            ois.close();
            
            for (NhanVien nhanVien : arr) {
                System.out.println(nhanVien);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
