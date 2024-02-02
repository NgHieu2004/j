package lab2.src;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Nhập một chuỗi không quá 80 ký tự: ");
            String chuoi = scanner.nextLine();

            if (chuoi.length() > 80) {
                System.out.println("Chuỗi vượt quá 80 ký tự. Vui lòng nhập lại.");
                return;
            }

            System.out.print("Nhập một ký tự: ");
            char kyTu = scanner.next().charAt(0);

            demVaInSoLanXuatHien(chuoi, kyTu);
        } 
    }


    public static void demVaInSoLanXuatHien(String chuoi, char kyTu) {
        int soLanXuatHien = 0;

        for (char c : chuoi.toCharArray()) {
            if (c == kyTu) {
                soLanXuatHien++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kyTu + " trong chuỗi là: " + soLanXuatHien);
    }
}
