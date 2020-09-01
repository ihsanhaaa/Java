import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.*;

/**
 * Soal1ARenaldiD1042181017
 */
public class Soal1ARenaldiD1042181017 {
    static ArrayList<String> aktivitasKegiatan = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String kegiatan = "";
        String menu = "";
        int start = 1;
        int batas = 8;
        int loop = 0;
        int index = 0;
        int hasil = 0;

        System.out.println("Selamat pagi Renaldi Sutiawan");
        System.out.println("NIM: D1042181017");
        System.out.println("Daftarkaan rencana kegiatan anda hari ini");

        ulang: while (start > 0) {
            do {
                // input nominal uang
                try {
                    System.out.print("Kegiatan ke-" + (aktivitasKegiatan.size() + 1) + ": ");
                    kegiatan = input.readLine();
                    if (kegiatan.matches("[a-zA-Z]*")) {

                    } else {
                        System.out.println(
                                "\t" + "***Maaf, input kegiatan ke-" + (aktivitasKegiatan.size() + 1) + " invalid***");
                        continue ulang;
                    }
                } catch (IOException error) {
                }
                aktivitasKegiatan.add(kegiatan); // rekam ke arraylist
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
            switch (menu) {
            case "1":
                System.out.println("");
                start++;
                index = 0;

                continue ulang;

            case "2":
                System.out.println("");
                System.out.println("Selamat pagi Renaldi Sutiawan");
                System.out.println("Daftarkaan rencana kegiatan anda hari ini");
                aktivitasKegiatan.clear();
                index = 0;

                continue ulang;

            case "3":
                System.out.println("");
                start = 0;
                index = 0;

                break;
            }

        }

        System.out.println("Daftar final rencana kegiatan hari ini: ");
        for (int i = 0; i < aktivitasKegiatan.size(); i++) {
            // get(nomor_index) berfungsi untuk mengambil nilai Array berdasarkan indeks
            System.out.println("\t" + (i + 1) + ". " + aktivitasKegiatan.get(i));

        }
        System.out.println("Terima Kasih Renaldi Sutiawan");

    }

}
