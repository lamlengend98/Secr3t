package ABC_XYZ;
import java.util.Scanner;

class MyDate{
	private int date;
	private int month;
	private int year;
	
	public void MyDate(int date, int month, int year){
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public void MyDate(){
	}
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		do{
		System.out.print("Year: ");
		year = new Scanner(System.in).nextInt();
		System.out.print("Month: ");
		month = sc.nextInt();
		System.out.println("Date: ");
		date = sc.nextInt();
		if(date()){
			System.out.printf("%d / %d / %d", date, month, year);
		}
		else{
			System.out.println("Loi!!");
		}
		break;
		}while(true);
		
	}
	
	public boolean date(){
            if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 12 || month == 10) {
                    if (date > 31 && date < 0) {
                        return false;
                    }
                    else{
                        return true;
                    }
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11){
                if(date > 30 && date < 0){
                    return false;
                }
            }
            else{
                if(year % 4 == 0){
                    if(date > 29)
                        return false;
                    else return true;
                }
                else return false;
                }
            return true;
	}
}