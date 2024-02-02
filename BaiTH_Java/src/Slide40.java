

import java.util.Scanner;

public class Slide40 {
     public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Nhập vào một số ngày trong tuần (từ 1 đến 7): ");
        int soNgay = scanner.nextInt();

      
        hienThiNgayTrongTuan(soNgay);

        scanner.close();
    }

    public static void hienThiNgayTrongTuan(int soNgay) {
        switch (soNgay) {
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ hai");
                break;
            case 3:
                System.out.println("Thứ ba");
                break;
            case 4:
                System.out.println("Thứ tư");
                break;
            case 5:
                System.out.println("Thứ năm");
                break;
            case 6:
                System.out.println("Thứ sáu");
                break;
            case 7:
                System.out.println("Thứ bảy");
                break;
            default:
                System.out.println("Số ngày không hợp lệ. Nhập từ 1 đến 7.");
        }
    }
}
