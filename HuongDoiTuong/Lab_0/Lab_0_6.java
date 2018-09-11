import java.util.Scanner;

class Lab_0_6
{
	public static void main(String []arg){
		Scanner input = new Scanner(System.in);
		double sum = 0;
        System.out.print("Nhap n = ");
        int n = Integer.parseInt(input.nextLine());
        
        for (int i = 1; i <= n; i++) {
            sum += (double)1/i;
        }
        
        System.out.printf("Tong la %.2f\n",sum);
	}
}