package hust.soict.hedspi.lab01;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("## Display a triangle with a height of n stars ##");
    	System.out.print("n = ");
        int n = sc.nextInt();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                builder.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                builder.append("*");
            }
            builder.append("\n");
        }
        
        String result = builder.toString();
        
        System.out.println(result);
    }
}