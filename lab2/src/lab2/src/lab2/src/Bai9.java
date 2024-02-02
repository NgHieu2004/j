package lab2.src;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập một chuỗi: ");
        String chuoi = scanner.nextLine();


        demVaInSoKyTu(chuoi);


        scanner.close();
    }

    public static void demVaInSoKyTu(String chuoi) {
        int kyTuThuong = 0;
        int kyTuHoa = 0;
        int so = 0;


        for (char kyTu : chuoi.toCharArray()) {

            if (Character.isLowerCase(kyTu)) {
                kyTuThuong++;
            } else if (Character.isUpperCase(kyTu)) {
                kyTuHoa++;
            } else if (Character.isDigit(kyTu)) {
                so++;
            }
        }

        System.out.println("Số ký tự thường trong chuỗi: " + kyTuThuong);
        System.out.println("Số ký tự hoa trong chuỗi: " + kyTuHoa);
        System.out.println("Số chữ số trong chuỗi: " + so);
    }
}
