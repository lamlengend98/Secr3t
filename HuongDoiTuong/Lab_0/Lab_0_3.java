import java.util.Scanner;

class Lab_0_3
{
	public static void main(String []arg){
		Scanner input = new Scanner(System.in);
		int a,b;
        double x;
        System.out.print("a = ");
        a = Integer.parseInt(input.nextLine());
        System.out.print("b = ");
        b = Integer.parseInt(input.nextLine());
        
        if (a == 0) {
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
            x = -b/a;
            System.out.println("Phuong trinh co nghiem duy nhat x = "+x);
        }

	}
}