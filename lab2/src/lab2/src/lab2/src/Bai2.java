package lab2.src.lab2.src;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int soNguyen = scanner.nextInt();

        
        if (soNguyen % 2 == 0) {
            System.out.println(soNguyen + " la so chan.");
        } else {
            System.out.println(soNguyen + " la so le.");
        }

        scanner.close();
    }
}
