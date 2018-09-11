import java.util.Scanner;

class Lab_0_8
{
	public static void main(String []arg){
		Scanner input = new Scanner(System.in);
		int mul = 1;
        double sum = 0;
        System.out.print("Nhap n = ");
        int n = Integer.parseInt(input.nextLine());
        
        for (int i = 1; i <= n; i++) {
            sum += (double)i/giaithua(i);
        }
        System.out.printf("Tong la: %.2f\n",sum);
    }
    
    public static int giaithua(int n){
        int mul = 1;
        if(n == 0 || n == 1){
            return mul;
        } else {
            for (int i = 2; i <= n; i++) {
                mul *= i;
            }
        return mul;
        }
	}
    
}