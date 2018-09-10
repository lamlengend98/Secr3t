import java.util.Scanner;

class Lab_0_2_2
{
	

	public static void main(String []arg){
		Scanner input = new Scanner(System.in);
		int sum = 0;
        for (int i = 0; i <= 10; i+=2) {
            sum += i*2;
        }
        System.out.println("Tong 10 so chan dau tien la: "+sum);
	}
}