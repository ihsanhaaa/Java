/**
 * nilaiMaksimum2
 */
public class nilaiMaksimum2 {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 23;
        int c = 5;
        int terbesar;

        if (a > b && a > c) {
            terbesar = a;
        }
        else 
            if (b > a && b > c) {
                terbesar = b;
            }
            else
                terbesar = c;

        System.out.println("Nilai Tertingginya adalah Angka= " + terbesar);
    }
}