import java.util.Scanner;

class Lab_0_7
{
	public static void main(String []arg){
		Scanner input = new Scanner(System.in);
		int mul = 1;
        System.out.print("Nhap n = ");
        int n = Integer.parseInt(input.nextLine());
        
        System.out.println(n+"! = "+ giaithua(n));
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