import java.util.Scanner;

class Lab_0_13
{
	public static void main(String []arg){
		Scanner input = new Scanner(System.in);
		//Tao va nhap mang
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        System.out.print("Nhap m: ");
        int m = input.nextInt();
        int[][] matrix = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("(%d, %d) = ",i,j);
                matrix[i][j] = input.nextInt();
            }
            System.out.println("");
        }
        
        //In ra ma tran
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println(" ");
        }
        
        //Tim phan tu nho nhat
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] < min)
                    min = matrix[i][j];
            }
        }
        System.out.println("Phan tu nho nhat trong ma tran la: "+min);
        
        //Tim phan tu le lon nhat
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] % 2 == 1){
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
            }
        }
        System.out.println("Phan tu le lon nhat la: "+max);
        
        //In dong co tong lon nhat
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[0][j];
            }
        }
        int maxline = sum;
        int rP = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
                if(sum > maxline){
                    maxline = sum;
                    rP = i;
                 }
            }
        }
        System.out.print("Dong co tong lon nhat la: ");
        for (int i = rP; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(matrix[i][j]+"\t");
            }
            System.out.println(" ");
        }
	}
}