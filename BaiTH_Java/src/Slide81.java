

import java.util.Scanner;

public class Slide81 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int soHang = scanner.nextInt();

        System.out.print("Nhập số cột của ma trận: ");
        int soCot = scanner.nextInt();


        int[][] maTran = new int[soHang][soCot];

    
        nhapMaTran(scanner, maTran);

        int phanTuLonNhat = timPhanTuLonNhat(maTran);
        System.out.println("Phần tử lớn nhất trong ma trận là: " + phanTuLonNhat);

        scanner.close();
    }

    public static void nhapMaTran(Scanner scanner, int[][] maTran) {
        System.out.println("Nhập các phần tử cho ma trận:");

        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[0].length; j++) {
                System.out.print("Nhập phần tử tại vị trí [" + i + "][" + j + "]: ");
                maTran[i][j] = scanner.nextInt();
            }
        }
    }

    public static int timPhanTuLonNhat(int[][] maTran) {
        int max = maTran[0][0];

        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[0].length; j++) {
                if (maTran[i][j] > max) {
                    max = maTran[i][j];
                }
            }
        }

        return max;
    }
}
