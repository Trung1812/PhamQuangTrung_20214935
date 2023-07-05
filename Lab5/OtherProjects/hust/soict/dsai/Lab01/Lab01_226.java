import javax.swing.JOptionPane;
public class Lab01_226 {
    public static void main(String[] args) {
        String a_str, b_str;
        a_str = JOptionPane.showInputDialog(null, 
        "Enter the first coefficient: ", 
        "First coeffiecient", 
        JOptionPane.INFORMATION_MESSAGE);

        b_str = JOptionPane.showInputDialog(null,
        "Enter the second coefficient: ", 
        "Second coeffiecient", 
        JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(a_str);
        double b = Double.parseDouble(b_str);

        if (a == 0 && b == 0) {
            JOptionPane.showMessageDialog(null, "x = all real number", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (a == 0 && b != 0) {
            JOptionPane.showMessageDialog(null, "No solution", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "x = " + -b/a, "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
