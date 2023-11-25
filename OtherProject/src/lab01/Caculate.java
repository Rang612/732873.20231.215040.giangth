package lab01;

import javax.swing.JOptionPane;
public class Caculate {
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,"Please input the firsr number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double Num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,"Please input the sencond number: ","Input the sencond number", JOptionPane.INFORMATION_MESSAGE);
        double Num2 = Double.parseDouble(strNum2);
//        tính tổng
        double sum = Num1 + Num2;

        JOptionPane.showMessageDialog(null,"Tong la: " + sum,"Ket qua: ", JOptionPane.INFORMATION_MESSAGE);
//       tinh hieu
        double difference = Num1 - Num2;
        JOptionPane.showMessageDialog(null,"Hieu la: " + difference,"Ket qua: ", JOptionPane.INFORMATION_MESSAGE);

//      tính tích
        double product = Num1 * Num2;
        JOptionPane.showMessageDialog(null,"Tich la: " + product,"Ket qua: ", JOptionPane.INFORMATION_MESSAGE);
//        kiểm tra só chia và tich thuong
        if(Num2 != 0) {
            double quotient = Num1 / Num2;
            JOptionPane.showMessageDialog(null, "Thuong la: " + quotient, "Ket qua: ", JOptionPane.INFORMATION_MESSAGE);
        } else JOptionPane.showMessageDialog(null,"Khong the chia cho 0");
        System.exit(0);

    }
}
