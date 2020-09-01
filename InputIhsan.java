import java.io.*;
import java.util.ArrayList;

/**
 * InputIhsan
 */
public class InputIhsan {

    public static void main(String[] args) {
        int loop = 1;
        String beli = "", yn = "";

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> daftarBelanja = new ArrayList<String>();
        do {
            try {
                System.out.print("Daftar Belanjaan: ");
                daftarBelanja.add(input.readLine());

            } catch (Exception e) {
                System.out.println();
            }

            // ulangi
            try {
                System.out.print("Ingin Belanja Lagi[y/t]: ");
                yn = input.readLine();
                if (yn.compareTo("Y") == 0 || yn.compareTo("y") == 0) {
                    loop++;
                } else {
                    System.out.println("Terima Kasih");
                    break;
                }
            } catch (Exception err) {
                System.out.println();
            }

        } while (loop > 0);

        System.out.println("===== Daftar Belanjaan Anda =====");
        for (int i = 0; i < daftarBelanja.size(); i++) {
            System.out.println((i + 1) + ". " + daftarBelanja.get(i));

            /* ihsan code */
        }
    }
}