import java.util.ArrayList;
import java.util.regex.*;

public class Validasi {

    // Kumpulan Fungsi
    // Versi Regex
    public static boolean validasiDouble(String s) {
        boolean cek;
        /*
         * \d = input angka dari 0-9 = memperbolehkan muncul 1 kali atau lebih [.] =
         * input hanya karakter '.' ? = memperbolehkan muncul 0 atau 1 kali
         */
        String regexFloatDouble = "\\d*[.]?\\d*";

        if (s.length() != 0 && Pattern.matches(regexFloatDouble, s) && Double.valueOf(s) > 0)
            cek = true;
        else
            cek = false;

        return cek;
    }

    public static boolean validasiInteger(String inputProfitMaksimal) {
        boolean cek;
        /*
         * [1-9] = inputan angka diawali 1-9 \d = input angka dari 0-9 = memperbolehkan
         * muncul 1 kali atau lebih
         */
        String regexInt = "[1-9]\\d*";

        if (inputProfitMaksimal.length() != 0 && Pattern.matches(regexInt, inputProfitMaksimal)
                && Integer.valueOf(inputProfitMaksimal) > 0)
            cek = true;
        else
            cek = false;

        return cek;
    }

    // Versi Lainnya
    public static boolean isValidInteger(String s) {
        int i;
        // length digunakan untuk membaca panjang string
        for (i = 0; i < s.length(); i++) {
            // mengecek 1 per 1 digit apakah angka atau bukan
            if (!Character.isDigit(s.charAt(i)))
                break;
        }

        if (i == s.length() && i > 0 && Integer.parseInt(s) > 0)
            return true;
        else
            return false;
    }
}