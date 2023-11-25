package lab01;

import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args){
        //Hiển thị hộp thoại lựa chọn
        Object[] options = {"Yes", "No"};
        int option = JOptionPane.showOptionDialog(null, "Do you want to change the first class ticket:", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        //Xử lí lựa chọn
//        JOptionPane.showMessageDialog(null,"You've chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        if(option == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"You've chosen: " + "Yes");
        } else if (option==JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null,"You've chosen: " + "No");
        } else {System.exit(0);}
        System.exit(0);
    }
}
