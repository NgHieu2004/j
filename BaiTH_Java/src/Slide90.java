

import java.util.Scanner;

public class Slide90 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Nhập vào một chuỗi: ");
        String chuoi = scanner.nextLine();

   
        hienThiKyTu(chuoi);

        scanner.close();
    }

    public static void hienThiKyTu(String chuoi) {
        System.out.println("Các ký tự trong chuỗi:");

        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }
    }
}
