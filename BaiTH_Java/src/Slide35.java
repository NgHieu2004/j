

import java.util.Scanner;

public class Slide35 {
     public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập số thứ nhất: ");
        double soThuNhat = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double soThuHai = scanner.nextDouble();

        
        double soNhoNhat = timSoNhoNhat(soThuNhat, soThuHai);
        System.out.println("Số nhỏ nhất là: " + soNhoNhat);

        
        scanner.close();
    }

  
    public static double timSoNhoNhat(double a, double b) {
        return (a < b) ? a : b;
    }
}
