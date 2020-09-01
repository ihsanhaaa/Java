import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
 * kaskus
 */
public class kaskus {
    static ArrayList<String> NominalUang = new ArrayList<String>();

    public static void main(String[] args) {

        int qty = 0;
        boolean salah = true;
        int index = 0;
        int batas = 2;
        int hasil = 0;
        String menu = "";
        int start = 1;
        String angka = "";
        int Angka = 0;
        Scanner s;

        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));

        ulang: while (start > 0) {
            do {
                try {
                    System.out.print("Pengeluaran ke-" + (NominalUang.size() + 1) + ": ");
                    s = new Scanner(System.in);
                    angka = s.next("[1-9]\\d*");
                    /*
                     * [1-9] = inputan angka diawali 1-9 \d = input angka dari 0-9 = memperbolehkan
                     * muncul 1 kali atau lebih
                     */
                    qty = Integer.valueOf(angka);
                    salah = false;

                } catch (InputMismatchException ime) {
                    System.out.println(
                            "\t" + "***Maaf, input uang pengeluaran ke-" + (NominalUang.size() + 1) + " invalid***");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                NominalUang.add(angka);
                index++;
            } while (index < batas);

            // -----------------------------------------------------------------------------
            System.out.println("");
            System.out.println("========== Menu Perintah ==========");
            System.out.println("1. Input penambahan nominal uang pengeluaran");
            System.out.println("2. Restrat program");
            System.out.println("3. Keluar dari program");

            // input menu perintah
            try {
                System.out.print("Pilihan anda( input nomor ): ");
                menu = data.readLine();
            } catch (IOException err) {
                System.out.println("");
            }

            // eksekusi menu perintah
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

            Angka = Integer.valueOf(angka);

            System.out.println("Daftar final nominal uang pengeluaran hari ini: ");
            for (int i = 0; i < NominalUang.size(); i++) {
                // get(nomor_index) berfungsi untuk mengambil nilai Array berdasarkan indeks
                System.out.println("\t" + (i + 1) + ". " + NominalUang.get(i));
                NominalUang.add(angka);

                int a = Integer.parseInt(NominalUang.get(i));
                hasil += a;
            }
            // menampilkan hasil
            System.out.println("Total pengeluaran anda hari ini: " + hasil);
            System.out.println("Terima Kasih Ihsan Haryansyah");
        }
        // ---------------------------------------------------------------------------------

    }

}