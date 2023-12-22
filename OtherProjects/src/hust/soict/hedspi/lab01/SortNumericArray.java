package hust.soict.hedspi.lab01;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class SortNumericArray {

	public static void main(String[] args) {
		
		String title = "Sorting Numeric Array";
		String strInput = JOptionPane.showInputDialog(null, "Input array (separated by a space):", title, JOptionPane.QUESTION_MESSAGE);
		
		String[] strA = strInput.split("[ ]+");
		int n = strA.length;
		
		int[] a = new int[n];
		int sum = 0;
		
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(strA[i]);
			sum += a[i];
		}
		
		for (int j=n-1; j>0; j--)
			for (int i=0; i<j; i++) {
				if (a[i]>a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		
		JOptionPane.showMessageDialog(null, "Sorted array: " + Arrays.toString(a) + "\nSum = " + sum + "\nAvg = " + String.format("%.2f", (double) sum / n), title, JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
