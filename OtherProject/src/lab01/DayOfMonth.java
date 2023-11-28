package lab01;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days =0;
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        while (true) {
            System.out.println("Enter the month (in full name, abbreviation, in 3 letters, or in number): ");
            String inputMonth = scanner.nextLine().toLowerCase();// đọc chuỗi tên từng tháng và đưa tất cả về chữ thường

            int monthIndex = -1;//Vị trí của tháng
            for (int i = 0; i < months.length; i++) // i=0; i< độ dài mảng months; tăng i thêm 1
            {  //so sánh từng kí tự của tên từng tháng đã tạo trong mảng rồi so sánh với tên tháng nhập vào
                // đổi chuỗi months sang chữ thường và so sánh có giống với tên tháng đã nhập vào hay không
                // so sánh tên tháng đã nhập vào có phải là chuỗi bắt đầu của months hay không
                //so sánh vị trí của tháng +1 trong mảng đã tạo có trùng với tháng nhập vào hay không
                if (months[i].toLowerCase().equals(inputMonth) || months[i].toLowerCase().startsWith(inputMonth) || String.valueOf(i + 1).equals(inputMonth)) {
                    monthIndex = i;
                    break;
                }
            }

            if (monthIndex == -1) {
                System.out.println("Invalid month. Please enter again.");
                continue;
            }

            System.out.println("Enter the year (non-negative and all digits): ");
            String inputYear = scanner.nextLine();

            if (!inputYear.matches("\\d+")) {
                System.out.println("Invalid year. Please enter again.");
                continue;
            }

            int year = Integer.parseInt(inputYear);
            if (year < 0) {
                System.out.println("Invalid year. Please enter again.");
                continue;
            }

            switch(monthIndex){
                case 1:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29; // năm nhuận
                    } else {
                        days = 28; // năm không nhuận
                    } break;
                case 3:
                case 5:
                case 8:
                case 10: days = 30; break;
                case 0:
                case 2:
                case 4:
                case 6:
                case 7:
                case 9:
                case 11: days = 31; break;
            }
            System.out.println("Number of days in " + months[monthIndex] + " " + year + " is " + days + " days.");
            break;
        }

        scanner.close();
    }
}
