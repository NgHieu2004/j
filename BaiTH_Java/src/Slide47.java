

import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        int tong = 0;

      
        while (true) {
            System.out.print("Nhập một số nguyên (nhập 0 để kết thúc): ");
            int soNguyen = scanner.nextInt();

           
            if (soNguyen == 0 || (tong + soNguyen) > 100) {
                break;
            }

          
            tong += soNguyen;
        }

        System.out.println("Tổng của các số đã nhập là: " + tong);

   
        scanner.close();
    }
}
