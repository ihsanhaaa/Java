import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.*;

/**
 * Soal1BIhsanD1042181021
 */
public class copySoal1B {
    static ArrayList<String> NominalUang = new ArrayList<String>();

    public static void main(String[] args) {

        String nominal = "";
        String menu = "";
        int batas = 2;
        int start = 1;
        int index = 0;
        int hasil = 0;
        int jumlahNominal = 0;
        boolean cek;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Selamat pagi Ihsan Haryansyah");
        System.out.println("Masukkan nominal uang pengeluaran anda hari ini");

        ulang: while (start > 0) {

            // input nominal uang
            do {
                try {
                    System.out.print("Pengeluaran ke-" + (NominalUang.size() + 1) + ": ");
                    nominal = input.readLine();
                    if (nominal.matches("[1-9]\\d*")) {

                    } else {
                        System.out.println("*** Error ***");
                        continue ulang;
                    }
                } catch (IOException error) {
                    System.out.println();
                }
                NominalUang.add(nominal);
                index++;
            } while (index < batas);

            // data menu perintah
            System.out.println("===== Menu Perintah =====");
            System.out.println("1. Input penambahan nominal uang pengeluaran");
            System.out.println("2. Restrat program");
            System.out.println("3. Keluar dari program");

            // input menu perintah
            try {
                System.out.print("Pilihan anda( input nomor ): ");
                menu = input.readLine();
            } catch (IOException err) {
                System.out.println("");
            }

            // eksekusi menu perintah
            // ---------------------------------------------------------------------------------
            switch (menu) {
            case "1":
                System.out.println("===== Penambahan nominal uang =====");
                start++;
                index = 0;
                continue ulang;

            case "2":
                System.out.println("===== Restart Program =====");
                System.out.println("Selamat pagi Ihsan Haryansyah");
                System.out.println("Masukkan nominal uang pengeluaran anda hari ini");
                NominalUang.clear();
                index = 0;
                continue ulang;

            case "3":
                System.out.println("===== Keluar dari Program =====");
                start = 0;
                index = 0;

                break;
            }
            // ---------------------------------------------------------------------------------
        }

        jumlahNominal = Integer.valueOf(nominal);

        System.out.println("Daftar final nominal uang pengeluaran hari ini: ");
        for (int i = 0; i < NominalUang.size(); i++) {
            // get(nomor_index) berfungsi untuk mengambil nilai Array berdasarkan indeks
            System.out.println("\t" + (i + 1) + ". " + NominalUang.get(i));

            int a = Integer.parseInt(NominalUang.get(i));
            hasil += a;
        }
        // menampilkan hasil
        System.out.println("Total pengeluaran anda hari ini: " + hasil);
        System.out.println("Terima Kasih Ihsan Haryansyah");
    }

}
