

public class Slide55 {
    public static void main(String[] args) {
        System.out.println("Các số chia hết cho 5 trong phạm vi từ 0 đến 20:");

        
        for (int i = 0; i <= 20; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
