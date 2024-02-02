

import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập một số nguyên n (n > 0): ");
        int n = scanner.nextInt();

        
        if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương.");
        } else {
            
            int tongChuSo = tinhTongChuSo(n);

            
            System.out.println("Tổng các chữ số của " + n + " là: " + tongChuSo);
        }

        scanner.close();
    }

    
    public static int tinhTongChuSo(int so) {
        int tong = 0;

        while (so > 0) {
            int chuSo = so % 10;  
            tong += chuSo;        
            so /= 10;             
        }

        return tong;
    }
}
