import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.*;

/**
 * fizaSoalA
 */
public class fizaSoalA {
    static ArrayList<String> kegiatanPusat = new ArrayList<String>();

    public static void main(String[] args) {

        String namaKegiatan = "";
        String menu = "";
        int loop = 0;
        int index = 0;
        int batas = 2;
        int hasil = 0;
        int start = 1;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Selamat pagi Muhammad Firza");
        System.out.println("NIM: -\n");
        System.out.println("Daftarkaan rencana kegiatan anda hari ini");

        ulang: while (start > 0) {
            do {
                // input nominal uang
                try {
                    System.out.print("Kegiatan ke-" + (kegiatanPusat.size() + 1) + ": ");
                    namaKegiatan = input.readLine();
                    if (namaKegiatan.matches("[a-zA-Z]*")) {

                    } else {
                        System.out.println(
                                "\t" + "***Maaf, input kegiatan ke-" + (kegiatanPusat.size() + 1) + " invalid***");
                        continue ulang;
                    }
                } catch (IOException error) {
                }
                kegiatanPusat.add(namaKegiatan); // rekam ke arraylist
                index++;
            } while (index < batas);

            System.out.println("");

            // data menu perintah
            System.out.println("Menu Perintah: ");
            System.out.println("1. Input data tambahan");
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
                System.out.println("Selamat pagi Muhammad Firza");
                System.out.println("Daftarkaan rencana kegiatan anda hari ini");
                kegiatanPusat.clear();
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

        System.out.println("Daftar final rencana kegiatan hari ini: ");
        for (int i = 0; i < kegiatanPusat.size(); i++) {
            // get(nomor_index) berfungsi untuk mengambil nilai Array berdasarkan indeks
            System.out.println("\t" + (i + 1) + ". " + kegiatanPusat.get(i));
            // mencari total pengeluaran

        }
        System.out.println("Terima Kasih Muhammad Firza");

    }

}
