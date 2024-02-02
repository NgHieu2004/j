package lab2.src.lab2.src;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương: ");
        int soNguyenDuong = scanner.nextInt();

        if (soNguyenDuong <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
        } else {

            long giaiThua = tinhGiaiThua(soNguyenDuong);
            System.out.println("Giai thừa của " + soNguyenDuong + " là: " + giaiThua);
        }


        scanner.close();
    }

    public static long tinhGiaiThua(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * tinhGiaiThua(n - 1);
        }
    }
}
