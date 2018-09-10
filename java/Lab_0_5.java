import java.util.Scanner;

class Lab_0_5
{
	public static void main(String []arg){
		Scanner input = new Scanner(System.in);
		int sum = 0;
        System.out.print("Nhap n = ");
        int n = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("Tong la: "+sum);
        
	}
}