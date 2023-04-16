import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Number of element in the array:"));
		int[] arr = {};
		
		for (int i = 0; i<n; i++) {
			arr = Arrays.copyOf(arr, arr.length + 1);
			int k = Integer.parseInt(JOptionPane.showInputDialog(null, (i+1) + "th element:"));
			arr[arr.length -1] = k;
		}
		
	    String[] options = { "sort", "average", "summation" };
	    int selection = JOptionPane.showOptionDialog(null, "Select one:", "What do you want to execute?", 
	                                                      0, 3, null, options, options[0]);
	    if (selection == 0) {
	    	int a = arr.length;
	    	Array.quickSort(arr, 0, a-1);
	    	Array.printArray(arr, a);
	    }
	    else if (selection == 1) { 
	    	int a = arr.length;
	    	double ave = Array.Average(arr, a);
	    	JOptionPane.showMessageDialog(null, "The mean of the array is: " + ave );
	    }
	    else if (selection == 2) { 
	      int a = arr.length;
	      int sum = Array.Sum(arr, a);
	      JOptionPane.showMessageDialog(null, "The sum of the array is: " + sum);
	    }
	  }
		
		
	}


