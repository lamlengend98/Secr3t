/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author USER
 */
public class SaveStudent implements Serializable{
    public void read(Student[] studentList) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("L:/Demo/studentList.txt"));
            oos.writeObject(studentList);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void write(Student[] studentList) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("L:/Demo/studentList.txt"));
            studentList = (Student[]) ois.readObject();
            ois.close();

            for (Student student : studentList) {
                System.out.println(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException cex) {
            cex.printStackTrace();
        }
    }

    
}
