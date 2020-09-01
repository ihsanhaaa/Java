import java.util.regex.*;
import java.io.*;

/**
 * Regex
 */
public class regex {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String angka = "", jwbLoop = "";
        int loop = 1;

        do {

            try {
                do {
                    System.out.print("Masukkan angka : ");
                    angka = in.readLine();
                } while (!validasiAngka(angka));
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

    public static boolean validasiAngka(String s) {
        boolean cek;
        // hanya integer
        String regexInt = "[1-9]\\d*";
        // float or double
        String regexFloatDouble = "\\d*[.]?\\d*";
        if (s.length() != 0 && Pattern.matches(regexFloatDouble, s) && Double.valueOf(s) > 0)
            cek = true;
        else
            cek = false;

        return cek;
    }
}