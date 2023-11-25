package lab01;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int size = scanner.nextInt();

        double[] numbers = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        Arrays.sort(numbers);

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(numbers));
        System.out.println("Tổng của các phần tử trong mảng: " + sum);
        System.out.println("Giá trị trung bình của các phần tử trong mảng: " + average);

        scanner.close();
    }
}
