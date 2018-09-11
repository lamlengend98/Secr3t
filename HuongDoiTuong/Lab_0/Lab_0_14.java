import java.util.Scanner;

class Lab_0_14
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
        show(matrix, n, m);
        
        //Tim phan tu lon nhat va chi so    
        int max = matrix[0][0];
        int imax = 0;
        int jmax = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                    imax = i;
                    jmax = j;
                }
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran la "+max+" o vi tri ("+imax+", "+jmax+")");
        
        //In ra so nguyen to
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!kiemTraSoNguyenTo(matrix[i][j])) {
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println("Ma tran sau khi thay cac phan tu khong phai so nguyen to = 0");
        show(matrix, n, m);
        
        //Sap xep cot
        System.out.println("Ma tran sau khi duoc sap xep tang dan theo cot");
        sapXep(matrix, n, m);
        show(matrix, n, m);
        
    }
    
    public static boolean kiemTraSoNguyenTo(int n){
        if(n < 2)
            return false;       
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
                return true;            
    }
    
    public static void sapXep(int[][] matrix, int n, int m){
        for(int k = 0; k<m ; k++){
            for(int j = 0; j<m-1 ; j++){
                for(int i = m-1; i>j ; i--)
                if(matrix[i][k]<matrix[i-1][k])
                {
                   int temp = matrix[i][k];
                   matrix[i][k] = matrix[i-1][k];
                   matrix[i-1][k] = temp;
                }
            }
        }
    }
    
    public static void show(int [][] matrix, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}