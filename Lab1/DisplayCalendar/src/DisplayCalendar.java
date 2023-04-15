import java.util.Scanner;
public class Array {
	
}
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
		
		System.out.println("Please enter the month: ");
		String month = keyboard.nextLine();
		while (months.indexOf(month) == -1) {
			System.out.println("Invalid format, please reenter");
			System.out.println("Please enter the month: ");
			
				
		
		}
	
}
}