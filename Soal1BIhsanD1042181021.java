import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.*;

/**
 * Soal1BIhsanD1042181021
 */
public class Soal1BIhsanD1042181021 {
    static ArrayList<String> NominalUang = new ArrayList<String>();

    public static void main(String[] args) {

        String nominal = "";
        String menu = "";
        int batas = 2;
        int start = 1;
        int index = 0;
        int hasil = 0;
        int jumlahNominal = 0;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Selamat pagi Ihsan Haryansyah");
        System.out.println("NIM: D1042181021\n");
        System.out.println("Masukkan nominal uang pengeluaran anda hari ini");

        ulang: while (start > 0) {
            do {
                // input nominal uang
                try {
                    System.out.print("Pengeluaran ke-" + (NominalUang.size() + 1) + ": ");
                    nominal = input.readLine();
                    // validasi
                    if (nominal.matches("[1-9]\\d*")) {

                    } else {
                        System.out.println("\t" + "***Maaf, input nominal uang pengeluaran ke-"
                                + (NominalUang.size() + 1) + " invalid***");
                        continue ulang;
                    }
                } catch (IOException error) {
                }
                NominalUang.add(nominal); // rekam ke arraylist
                index++;
            } while (index < batas);

            System.out.println("");

            // data menu perintah
            System.out.println("Menu Perintah: ");
            System.out.println("1. Input penambahan nominal uang pengeluaran");
            System.out.println("2. Restrat program");
            System.out.println("3. Keluar dari program");

            // input menu perintah
            try {
                System.out.print("Pilihan anda (input nomor): ");
                menu = input.readLine();
            } catch (IOException err) {
                System.out.println("");
            }

            // eksekusi menu perintah
            // ---------------------------------------------------------------------------------
            switch (menu) {
            case "1":
                System.out.println("");
                start++;
                index = 0;

                continue ulang;

            case "2":
                System.out.println("");
                System.out.println("Selamat pagi Ihsan Haryansyah");
                System.out.println("Masukkan nominal uang pengeluaran anda hari ini");
                NominalUang.clear();
                index = 0;

                continue ulang;

            case "3":
                System.out.println("");
                start = 0;
                index = 0;

                break;
            }
            // ---------------------------------------------------------------------------------
        }

        System.out.println("Daftar final nominal uang pengeluaran hari ini: ");
        for (int i = 0; i < NominalUang.size(); i++) {
            // get(nomor_index) berfungsi untuk mengambil nilai Array berdasarkan indeks
            System.out.println("\t" + (i + 1) + ". " + NominalUang.get(i));
            // mencari total pengeluaran
            int a = Integer.parseInt(NominalUang.get(i));
            hasil += a;
        }
        // menampilkan total pengeluaran
        System.out.println("Total pengeluaran anda hari ini:  " + hasil);
        System.out.println("Terima Kasih Ihsan Haryansyah");
    }

}
