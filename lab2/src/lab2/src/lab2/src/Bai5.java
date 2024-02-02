package lab2.src.lab2.src;


import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int tong = 0;


        while (true) {
            System.out.print("Nhập một số nguyên (nhập 0 để kết thúc): ");
            int soNguyen = scanner.nextInt();

            if (soNguyen == 0) {
                break;
            }

            tong += soNguyen;
            

            if (tong > 100) {
                System.out.println("Tổng vượt quá 100. Kết thúc vòng lặp.");
                break;
            }
        }


        System.out.println("Tổng các số đã nhập là: " + tong);


        scanner.close();
    }
}
