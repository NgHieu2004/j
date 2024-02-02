package lab2.src.lab2.src;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double soThuNhat = scanner.nextDouble();

        System.out.print("Nhap so thu hai: ");
        double soThuHai = scanner.nextDouble();

        double tong = soThuNhat + soThuHai;
        double hieu = soThuNhat - soThuHai;
        double tich = soThuNhat * soThuHai;

        double thuong = 0;
        double chiaLayDu = 0;
        if (soThuHai != 0) {
            thuong = soThuNhat / soThuHai;
            chiaLayDu = soThuNhat % soThuHai;
        } else {
            System.out.println("Khong the thuc hien phep chia voi so bang 0.");
        }

        
        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);

       
        if (soThuHai != 0) {
            System.out.println("Thuong: " + thuong);
            System.out.println("Chia lay du: " + chiaLayDu);
        }

        
        System.out.println("So sanh so thu nhat > so thu hai: " + (soThuNhat > soThuHai));
        System.out.println("So sanh so thu nhat < so thu hai: " + (soThuNhat < soThuHai));
        System.out.println("So sanh so thu nhat >= so thu hai: " + (soThuNhat >= soThuHai));
        System.out.println("So sanh so thu nhat <= so thu hai: " + (soThuNhat <= soThuHai));
        System.out.println("So sanh so thu nhat == so thu hai: " + (soThuNhat == soThuHai));
        System.out.println("So sanh so thu nhat != so thu hai: " + (soThuNhat != soThuHai));

        scanner.close();
    }
}


