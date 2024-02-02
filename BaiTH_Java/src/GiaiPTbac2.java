
import java.util.Scanner;

public class GiaiPTbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.print("Phuong trinh co hai nghiem phan biet:");
            System.out.print("x1 = " + x1);
            System.out.print("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.print("Phuong trinh co mot nghiem kep: x = " + x);
        } else {
            System.out.print("Phuong trinh vo nghiem.");
        }

        scanner.close();
    }
}
