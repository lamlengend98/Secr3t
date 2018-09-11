import java.util.Scanner;

class Lab_0_2_1
{
	

	public static void main(String []arg){
		Scanner input = new Scanner(System.in);
		int sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += i;
        }
        System.out.println("Tong 10 so dau tien la: "+sum);

	}
}