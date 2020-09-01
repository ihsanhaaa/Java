import java.io.*;
import java.util.ArrayList;
import java.util.regex.*;

public class ContohSoal {
    public static void main(String[] args) {
        String inputPinjaman = "";
        String inputSukuBunga = "";
        String inputJangkaWaktu = "";
        int pinjaman, sukuBunga, jangkaWaktu;

        ArrayList<BungaEfektif> bgEfek = new ArrayList<BungaEfektif>();
        int angsurBunga = 0;
        int angsurPokok = 0;
        int totAngsuran = 0;
        int sisaAngsuran = 0;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Perhitungan Pinjaman dengan Bunga Efektif");

        // Input Pinjaman
        try {
            do {
                System.out.print("Pokok Pinjaman : ");
                inputPinjaman = input.readLine();
            } while (!validasiInteger(inputPinjaman.trim()));
        } catch (Exception e) {
            System.out.println(e);
        }
        // Input Suku Bunga
        try {
            do {
                System.out.print("Suku Bunga per tahun (%) : ");
                inputSukuBunga = input.readLine();
            } while (!validasiInteger(inputSukuBunga));
        } catch (Exception e) {
            System.out.println(e);
        }
        // Input jangka waktu pinjaman
        try {
            do {
                System.out.print("Jangka waktu pinjaman (bulan) : ");
                inputJangkaWaktu = input.readLine();
            } while (!validasiInteger(inputJangkaWaktu));
        } catch (Exception e) {
            System.out.println(e);
        }

        pinjaman = Integer.valueOf(inputPinjaman);
        sukuBunga = Integer.valueOf(inputSukuBunga);
        jangkaWaktu = Integer.valueOf(inputJangkaWaktu);
        sisaAngsuran = pinjaman;

        for (int i = 0; i < jangkaWaktu; i++) {
            // Perhitungan
            angsurPokok = (int) pinjaman / jangkaWaktu;
            angsurBunga = (int) ((pinjaman - (i * angsurPokok)) * sukuBunga) / 1200;
            totAngsuran = angsurBunga + angsurPokok;
            sisaAngsuran -= angsurPokok;
            // rekam ke arraylist
            bgEfek.add(new BungaEfektif(angsurBunga, angsurPokok, totAngsuran, sisaAngsuran));
        }

        // cetak hasilnya
        System.out.println("\nDaftar cicilan pinjaman sebagai berikut :");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("|%10s| %12s| %12s| %12s| %12s|", "Bulan Ke-", "Angs.Bunga", "Angs.Pokok", "Total Angs.",
                "Sisa Angs.");
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        for (int j = 0; j < bgEfek.size(); j++) {
            System.out.format("|%10d| %12d| %12d| %12d| %12d|", j + 1, bgEfek.get(j).getAngBunga(),
                    bgEfek.get(j).getAngPokok(), bgEfek.get(j).getTotAngsuran(), bgEfek.get(j).getSsAngsuran());
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
}