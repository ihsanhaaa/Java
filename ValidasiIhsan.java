import java.io.*;

/**
 * ValidasiIhsan
 */
public class ValidasiIhsan {

    public static void main(String[] args) {

        String angka, yn;
        int loop = 1;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            do {
                System.out.print("Masukkan Angka Bertipe Integer: ");
                angka = input.readLine();
            } while (!Validasi.validasiInteger(angka));

            System.out.println();
            do {
                System.out.print("Masukkan Angka Bertipe Double: ");
                angka = input.readLine();
            } while (!Validasi.validasiDouble(angka));

        } catch (Exception e) {
            System.out.println();
        }
        try {
            System.out.print("Ingin Mengulangi[y/t]: ");
            yn = input.readLine();
            if (yn.compareTo("Y") == 0 || yn.compareTo("y") == 0) {
                loop++;

            } else {
                System.out.println("Terima Kasih");

            }
        } catch (Exception e) {
            System.out.println();
        }
        while (loop > 0)
            ;
    }
}