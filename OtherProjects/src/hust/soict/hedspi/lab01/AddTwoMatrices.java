package hust.soict.hedspi.lab01;
import java.util.Arrays;
import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n;
		
		System.out.println("## Add two matrices of size m x n ##");
		System.out.print("Input m, n: ");
		m = sc.nextInt();
		n = sc.nextInt();
		
		double[][] a = new double[m][n];
		double[][] b = new double[m][n];
		double[][] c = new double[m][n];
		
		System.out.println("\nInput matrix A:");
		for (int i=0; i<m; i++)
			for (int j=0; j<n; j++) {
				a[i][j] = sc.nextDouble();
			}
		
		System.out.println("\nInput matrix B:");
		for (int i=0; i<m; i++)
			for (int j=0; j<n; j++) {
				b[i][j] = sc.nextDouble();
				c[i][j] = a[i][j] + b[i][j];
			}
		
		System.out.println("\nSum of A and B:");
		for (int i=0; i<m; i++) {
			System.out.println(Arrays.toString(c[i]));
		}

	}

}
