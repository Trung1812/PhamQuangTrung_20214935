import javax.swing.JOptionPane;

public class Lab01_61 {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null, "Do you wanna play?", null, 0);

        JOptionPane.showMessageDialog(null, "You have chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }

}
