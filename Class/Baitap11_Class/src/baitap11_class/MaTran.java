
package baitap11_class;

import java.util.Scanner;


public class MaTran {
    private int row;
    private int col;
    private int row2;
    private int col2;
    private int [][] matrix;
    private int [][] matrix2;
    

    public MaTran(int row, int col, int row2, int col2) {
        this.row = row;
        this.col = col;
        this.row2 = row2;
        this.col2 = col2;
        matrix = new int[row][col];
        matrix2 = new int[row2][col2];
        
    }

    public MaTran(int[][] matrix, int [][] matrix2) {
        this.col = matrix.length;
        this.row = matrix.length;
        this.row2 = matrix2.length;
        this.col2 = matrix2.length;
        this.matrix = new int[row][col];
        this.matrix2 = new int[row2][col2];
    }

    public MaTran() {
        row = 0;
        col = 0;
        row2 = 0;
        col2= 0;
        matrix2 = null;
        matrix = null;
    }

    public void setRow2(int row2) {
        this.row2 = row2;
    }

    public void setCol2(int col2) {
        this.col2 = col2;
    }

    public int getRow2() {
        return row2;
    }

    public int getCol2() {
        return col2;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }
    
    public void input1(){
        Scanner input = new Scanner(System.in);
        System.out.println("==========Nhập vào ma trận 1===========");
        System.out.print("Nhập vào số dòng: ");
        row = Integer.parseInt(input.nextLine());
        System.out.print("Nhập vào số cột: ");
        col = Integer.parseInt(input.nextLine());
        matrix = new int[row][col];
        
        for(int m = 0; m < row; m++){
            for(int n = 0; n < col; n++){
                System.out.printf("Nhập hàng %d, cột %d: ",m,n);
                matrix[m][n] = input.nextInt();
            }
            System.out.print("\n");
        }
    }
    
    public void print1(){
        System.out.println("Ma trận 1 vừa nhập vào là: ");
        for(int m = 0; m < row;m++){
            for(int n = 0; n < col; n++){
                System.out.print(matrix[m][n]+"\t");
            }
            System.out.print("\n");
        }
    }
    
    public void input2(){
        Scanner input = new Scanner(System.in);
        System.out.println("==========Nhập vào ma trận 2===========");
        System.out.print("Nhập vào số dòng: ");
        row2 = Integer.parseInt(input.nextLine());
        System.out.print("Nhập vào số cột: ");
        col2 = Integer.parseInt(input.nextLine());
        matrix2 = new int[row2][col2];
        
        for(int i = 0; i < row2; i++){
            for(int j = 0; j < col2; j++){
                System.out.printf("Nhập hàng %d, cột %d: ",i,j);
                matrix2[i][j] = input.nextInt();
            }
            System.out.print("\n");
        }
    }
    
    public void print2(){
        System.out.println("Ma trận 2 vừa nhập vào là: ");
        for(int i = 0; i < row2;i++){
            for(int j = 0; j < col2; j++){
                System.out.print(matrix2[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    
    public void add(){
        int [][] sum = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < row2; j++){
                sum[i][j] = matrix[i][j] + matrix2[i][j];
            }
            System.out.print("\n");
        }
        
        System.out.println("Tổng 2 ma trận là: ");
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < row2; j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    
    public void mul(){
        if(col == row2){
        int [][] product = new int[row][col2];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col2; j++){
                product[i][j] = 0;
                for(int k = 0; k < col; k++){
                    product[i][j] = product[i][j] + matrix[i][k] * matrix2[k][j];
                }
            }
        }
        
        System.out.println("Tích 2 ma trận là: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col2; j++){
                System.out.print(product[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    }
}
