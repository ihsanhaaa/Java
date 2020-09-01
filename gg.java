import java.util.regex.*;
import java.io.*;

/**
 * gg
 */
public class gg {

    public static void main(String[] args) {
        String angka = "", jwbLoop = "";
        int loop = 1;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        do {

            try {
                do {
                    System.out.print("Masukkan angka : ");
                    angka = in.readLine();
                } while (!Validasi.validasiInteger(angka));
            } catch (Exception e) {
                // TODO: handle exception
            }

            System.out.println("");

            try {
                System.out.print("Mau coba lagi ? (Y/N)");
                jwbLoop = in.readLine();
                if (jwbLoop.compareTo("Y") == 0 || jwbLoop.compareTo("y") == 0) {
                    loop++;
                } else {
                    System.out.println("Arigato");
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

        } while (loop > 0);
    }
}