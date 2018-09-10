import java.util.Scanner;

class Lab_0_9
{
	public static void main(String []arg){
		Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
    }
    
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    
}