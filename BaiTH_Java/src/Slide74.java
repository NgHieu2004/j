
public class Slide74 {
    public static void main(String[] args) {
        
        int[] mangSo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        
        int tongSoChan = tinhTongSoChan(mangSo);

        
        System.out.println("Tổng các số chẵn trong mảng là: " + tongSoChan);
    }

    
    public static int tinhTongSoChan(int[] mang) {
        int tong = 0;

        
        for (int so : mang) {
            
            if (so % 2 == 0) {
                
                tong += so;
            }
        }

        return tong;
    }
}
