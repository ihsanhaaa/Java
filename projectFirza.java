import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.*;
import java.io.*;

/**
 * projectFirza
 */
public class projectFirza {
    static ArrayList<String> rencanaKegiatan = new ArrayList<String>();

    public static void main(String[] args) {
        String kegiatan = "";
        String menu = "";
        int batas = 4;
        int start = 1;
        int index = 0;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Selamat pagi Muhammad Firza");
        System.out.println("Daftarkan rencana kegiatan anda hari ini");

        ulang: while (start > 0) {

            // input kegiatan
            do {
                try {
                    System.out.print("Rencana ke-" + (rencanaKegiatan.size() + 1) + ": ");
                    kegiatan = input.readLine();
                    rencanaKegiatan.add(kegiatan);
                } catch (IOException e) {
                    System.out.println();
                    // System.out.println("***Maaf, input uang pengeluaran ke-" +
                    // (NominalUang.size() + 1) + ": ");
                }

                index++;
            } while (index < batas);

            // data menu perintah
            System.out.println("===== Menu Perintah =====");
            System.out.println("1. Input data tambahan");
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
                System.out.println("Data tambahan");
                start++;
                index = 0;
                continue ulang;

            case "2":
                System.out.println("Restart Program");
                System.out.println("Selamat pagi Muhammad Firza");
                System.out.println("Daftarkan rencana kegiatan anda hari ini");
                rencanaKegiatan.clear();
                index = 0;
                continue ulang;

            case "3":
                System.out.println("Keluar dari Program");
                start = 0;
                index = 0;

                break;
            }
        }
        System.out.println("Daftar final nominal uang pengeluaran hari ini: ");
        for (int i = 0; i < rencanaKegiatan.size(); i++) {
            // get(nomor_index) berfungsi untuk mengambil nilai Array berdasarkan indeks
            System.out.println((i + 1) + ". " + rencanaKegiatan.get(i));
        }
    }
}
