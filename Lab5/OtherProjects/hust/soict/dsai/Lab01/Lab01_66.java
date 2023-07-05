import java.util.Scanner;

public class Lab01_66 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] c = new int[m][n];

        System.out.println("Enter the first matrix: ");
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second matrix: ");
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("The sum: ");
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
