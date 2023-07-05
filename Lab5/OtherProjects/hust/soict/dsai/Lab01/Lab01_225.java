import javax.swing.JOptionPane;
public class Lab01_225 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String notification;
        strNum1 = JOptionPane.showInputDialog(null, 
        "Enter the first number: ", 
        "First number",
        JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null, 
        "Enter the second number: ", 
        "Second number",
        JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        notification = "Sum: " + (num1 + num2) + "\nDifference: " + (num1 - num2) + "\nProduct: " + (num1*num2) + "\nQuotient: " + num1/num2;
        JOptionPane.showMessageDialog(null, notification, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
