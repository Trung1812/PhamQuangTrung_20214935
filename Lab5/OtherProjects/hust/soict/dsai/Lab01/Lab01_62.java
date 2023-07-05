import java.util.Scanner;

public class Lab01_62 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?: ");
        String name = sc.next();
        
        System.out.println("How old are you?: ");
        int age = sc.nextInt();
        
        System.out.println("How tall are you?: ");
        double height = sc.nextDouble();

        System.out.println("Mrs/Mr." + name + ", " + age + " years old. " + "Your height is " + height + ".");
        sc.close();
    }
}
