import java.util.Scanner;

class Lab_0_10
{
	public static void main(String []arg){
		Scanner input = new Scanner(System.in);
		int number, avg;
		int sum = 0;
		System.out.print("Nhap so: ");
		number = input.nextInt();
		
		while(number > 0){
		avg = number % 10;
		sum += avg;
		number /= 10;
		}
		
		System.out.println("Tong cac chu so la: "+sum);
	}
}