package lab2.src;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Nhập số hàng của ma trận: ");
        int soHang = scanner.nextInt();

        System.out.print("Nhập số cột của ma trận: ");
        int soCot = scanner.nextInt();

        int[][] maTran = new int[soHang][soCot];

        System.out.println("Nhập giá trị cho ma trận:");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "][" + j + "]: ");
                maTran[i][j] = scanner.nextInt();
            }
        }

        int phanTuLonNhat = timPhanTuLonNhat(maTran);
        System.out.println("Phần tử lớn nhất trong ma trận là: " + phanTuLonNhat);

        scanner.close();
    }

    public static int timPhanTuLonNhat(int[][] maTran) {
        int max = maTran[0][0];

        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[i].length; j++) {
                if (maTran[i][j] > max) {
                    max = maTran[i][j];
                }
            }
        }

        return max;
    }
}
