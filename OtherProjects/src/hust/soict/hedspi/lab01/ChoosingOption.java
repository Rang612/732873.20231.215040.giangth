package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
    	Object[] options = {"I do", "I don\'t"};
    	
    	/* option = JOptionPane.showOptionDialog(null, 
    			"Do you want to change to the first class ticket?", 
    			"Option Dialog", 
    			JOptionPane.DEFAULT_OPTION, 
    			JOptionPane.QUESTION_MESSAGE, 
    			null,
    			options,
    			options[0]
    			);
    			*/
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));

        System.exit(0);
    }
}
