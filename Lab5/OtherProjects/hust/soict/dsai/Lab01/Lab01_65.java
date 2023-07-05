import java.util.Scanner;

public class Lab01_65 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // take element as inputs
        System.out.print("Enter the array element: ");
        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }       

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int sum = 0;
        double avg = 0;
        for (int i: arr) {
            System.out.print(i + " ");
            sum += i;
        }
        avg = sum/n;
        System.out.println("\nArray sum: " + sum + "\n" + "Array average: " + avg);
        sc.close();
    }
    
}
