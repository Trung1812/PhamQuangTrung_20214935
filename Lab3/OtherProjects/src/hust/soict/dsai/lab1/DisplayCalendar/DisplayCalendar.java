package hust.soict.dsai.lab1.DisplayCalendar;
import java.util.Scanner;

public class DisplayCalendar {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String[] months = {"January","Jan.","Jan","1",
		                  "February", "Feb", "Feb.", "2",
		                  "March", "Mar", "Mar.", "3",
		                  "April", "Apr", "Apr.", "4",
		                  "May", "5",
		                  "June","Jun", "6",
		                  "July", "Jul", "7",
		                  "August", "Aug.", "Aug", "8",
		                  "September", "Sept.", "Sep", "9",
		                  "October", "Oct.", "Oct", "10",
		                  "November", "Nov.","Nov", "11",
		                  "December", "Dec.", "Dec", "12"};
		String[] month31 = {"January","Jan.","Jan","1",
                "March", "Mar", "Mar.", "3",
                "May", "5",
                "July", "Jul", "7",
                "August", "Aug.", "Aug", "8",
                "October", "Oct.", "Oct", "10",
                "December", "Dec.", "Dec", "12"};
		String[] month30 = {
                "April", "Apr", "Apr.", "4",
                "June","Jun", "6",
                "September", "Sept.", "Sep", "9",
                "November", "Nov.","Nov", "11"};
		
		StringArray month31A = new StringArray(month31);
		StringArray month30A = new StringArray(month30);
		StringArray validMonth = new StringArray(months);

		String inMonth;
		while (true) {
			System.out.println("Please enter the month:");
			inMonth = keyboard.nextLine();
			if (validMonth.contain(inMonth)) {
				break;
			} else {
				System.out.println("Invalid input format!");
			}
		}
		int inNum;
		while (true) {
			System.out.println("Please enter the year:");
			inNum = keyboard.nextInt();
			if (inNum < 0) {
				System.out.println("Year cannot be a negative number!");
			} else {
				break;
			}
		}
		Year year = new Year(inNum);
		if (month31A.contain(inMonth)) {
			System.out.println(31);
		} else if (month30A.contain(inMonth)) {
			System.out.println(30);
		} else {
			if (year.isLeap()) {
				System.out.println(29);
			} else {
				System.out.println(28);
			}
		}
		
			
				
		
		}
}