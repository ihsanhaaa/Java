import java.util.ArrayList;
import java.io.*;
import java.util.regex.*;

/**
 * inputUser
 */
public class inputUser {

    public static void main(String[] args) {

        String inputPinjaman = "";
        String inputBunga = "";
        String inputJangkaWaktu = "";
        int pinjaman, sukuBunga, jangkaWaktu;

        ArrayList<objekBungaIhsan> dataBunga = new ArrayList<objekBungaIhsan>();
        int angsurBunga = 0;
        int angsurPokok = 0;
        int totAngsuran = 0;
        int sisaAngsuran = 0;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            do {
                System.out.print("Masukkan Jumlah Simpanan: ");
                inputPinjaman = input.readLine();
            } while (!Validasi.validasiInteger(inputPinjaman));
        } catch (Exception err) {
            System.out.println();
        }

        try {
            do {
                System.out.println("Suku Bunga Pertahun(%): ");
                inputBunga = input.readLine();
            } while (!Validasi.validasiInteger(inputBunga));
        } catch (Exception e) {
            System.out.println();
        }
        try {
            do {
                System.out.print("Jangka Waktu Pinjaman(perbulan): ");
                inputJangkaWaktu = input.readLine();
            } while (!Validasi.validasiInteger(inputJangkaWaktu));
        } catch (Exception err) {
            System.out.println();
        }

        pinjaman = Integer.valueOf(inputPinjaman);
        sukuBunga = Integer.valueOf(inputBunga);
        jangkaWaktu = Integer.valueOf(inputJangkaWaktu);
        sisaAngsuran = pinjaman;

        for (int i = 0; i < jangkaWaktu; i++) {
            // Perhitungan
            angsurPokok = (int) pinjaman / jangkaWaktu;
            angsurBunga = (int) ((pinjaman - (i * angsurPokok)) * sukuBunga) / 1200;
            totAngsuran = angsurBunga + angsurPokok;
            sisaAngsuran -= angsurPokok;
            // rekam ke arraylist
            dataBunga.add(new objekBungaIhsan(angsurBunga, angsurPokok, totAngsuran, sisaAngsuran));
        }

        // cetak hasilnya
        System.out.println("\nDaftar cicilan pinjaman sebagai berikut :");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("|%10s| %12s| %12s| %12s| %12s|", "Bulan Ke-", "Angs.Bunga", "Angs.Pokok", "Total Angs.",
                "Sisa Angs.");
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        for (int j = 0; j < dataBunga.size(); j++) {
            System.out.format("|%10d| %,12d| %,12d| %,12d| %,12d|", j + 1, dataBunga.get(j).getAngBunga(),
                    dataBunga.get(j).getAngPokok(), dataBunga.get(j).getTotAngsuran(),
                    dataBunga.get(j).getSsAngsuran());
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------");
    }

    // Fungsi Validasi
    public static boolean validasiInteger(String s) {
        boolean cek;
        /*
         * [1-9] = inputan angka diawali 1-9 \d = input angka dari 0-9 = memperbolehkan
         * muncul 1 kali atau lebih
         */
        String regexInt = "[1-9]\\d*";

        if (s.length() != 0 && Pattern.matches(regexInt, s) && Integer.valueOf(s) > 0)
            cek = true;
        else
            cek = false;

        return cek;

    }

    public static String readLine() {
        return null;
    }
}
