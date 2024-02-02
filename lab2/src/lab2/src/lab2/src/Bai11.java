package lab2.src;

import java.util.Arrays;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();


        int[] A = new int[n];

        System.out.println("Nhập giá trị cho mảng A:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

 
        Arrays.sort(A);

        System.out.println("Mảng ban đầu:");
        inMang(A);

        System.out.println("Mảng đã sắp xếp tăng dần:");
        inMang(A);

        scanner.close();
    }

    public static void inMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

