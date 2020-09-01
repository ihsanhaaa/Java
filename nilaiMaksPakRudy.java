/**
 * nilaiMaksPakRudy
 */
public class nilaiMaksPakRudy {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 23;
        int c = 5;

        int terbesar1 = (a > b)?
        a:b;

        int terbesar2 = (b > c)?(a > c)?
        b:c;

        System.out.println("angka terbesar: " + terbesar1);
        System.out.println("angka terbesar: " + terbesar2);
    }
}