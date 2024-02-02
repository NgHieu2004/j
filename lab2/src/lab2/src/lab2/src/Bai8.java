package lab2.src;

import java.util.Scanner;

public class Bai8 {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số lượng số nguyên (n): ");
        int n = scanner.nextInt();

        int tong = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ": ");
            int soNguyen = scanner.nextInt();
            tong += soNguyen;
        }

        if (n > 0) {
            double trungBinhCong = (double) tong / n;
            System.out.println("Trung bình cộng của " + n + " số nguyên là: " + trungBinhCong);
        } else {
            System.out.println("Không có số nguyên để tính trung bình cộng.");
        }

        scanner.close();
    }
}
