package lab01;

import java.util.Scanner;

public class TreeStar {
    public static void main(String[] args){
        Scanner row = new Scanner(System.in);
        System.out.println("Nhập số hàng n= ");
        int n = row.nextInt();
        int count =1;
        for(int i =1; i <=n; i++)
        {
            for(int k=1; k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j =1; j<= count; j++)
            {
                System.out.print("*");
            }
            count = count + 2;
            System.out.print("\n");
        }
    }
}
