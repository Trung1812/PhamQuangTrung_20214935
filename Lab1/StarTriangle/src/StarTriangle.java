import java.util.Scanner;
public class StarTriangle {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of line: ");
		int n = keyboard.nextInt();
		int h = 2*n - 1;
		for (int i = 0; i < n ; i++) {
			int j = 2*i + 1;
			String line = "";
			for (int m = 0; m < (h-j)/2; m++) {
				line = line + ' ';
			}
			for (int m = 0; m < j; m++) {
				line = line + '*';
			}
			for (int m = 0; m < (h-j)/2; m++) {
				line = line + ' ';
			}
			System.out.println(line);
		}
		
	}
}
