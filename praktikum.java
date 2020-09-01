/**
 * praktikum
 */
public class praktikum {

    public static void main(String[] args) {

        int a = 10;
        int b = 23;
        int c = 5;
        int terbesar;

        terbesar = a;  //anggap a adalah bilangan terbesar

        if (terbesar < b) {
            terbesar = b;
        } else {
            terbesar = c;
        }
        System.out.println(terbesar);
    }
}