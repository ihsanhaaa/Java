import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.*;

/**
 * Drakor
 */
public class Drakor {
    static ArrayList<objekDrakor> dataFilm = new ArrayList<objekDrakor>();

    public static void main(String[] args) {
        BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));
        boolean running1 = true;
        int start = 1;
        int index = 0;
        int loop = 1;
        String pilih = "";
        String cari = "";

        dataFilm.add(new objekDrakor("What Wrong With Secretary Kim", "Komedi", 1));
        dataFilm.add(new objekDrakor("Descendants Of the sun", "Aksi", 2));
        dataFilm.add(new objekDrakor("The Heirs", "Percintaan", 3));
        dataFilm.add(new objekDrakor("My Love From The Stars", "Percintaan", 4));
        dataFilm.add(new objekDrakor("Doctors", "Romantis", 5));

        dataFilm.add(new objekDrakor("Pinocchio", "Percintaan", 6));
        dataFilm.add(new objekDrakor("I Am Not Robot", "Romantis", 7));
        dataFilm.add(new objekDrakor("Goblin", "Aksi", 8));
        dataFilm.add(new objekDrakor("Boys Over Flowers", "Romantis", 9));
        dataFilm.add(new objekDrakor("City Hunter", "Aksi", 10));

        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("No. \t| Judul Film \t\t\t\t| Genre \t\t|");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("No.1 \t| I Am Not Robot \t\t\t\t| Romaantis \t|");
        System.out.println("No.2 \t| Goblin \t\t\t\t| Aksi \t|");
        System.out.println("No.3 \t| City Hunter \t\t\t\t| Aksi \t|");
        System.out.println("No.4 \t| Boys Over Flowers \t\t\t\t| Romaantis \t|");
        System.out.println("No.5 \t| Pinocchio \t\t\t\t| Percintaan \t|");
        System.out.println("No.6 \t| Descendants Of the sun \t\t\t\t| Aksi \t|");
        System.out.println("No.7 \t| What Wrong With Secretary Kim \t\t\t\t| Komedi \t|");
        System.out.println("No.8 \t| Doctors \t\t\t\t| Romantis \t|");
        System.out.println("No.9 \t| My Love From The Stars \t\t\t\t| Percintaan \t|");
        System.out.println("No.10 \t| The Heirs \t\t\t\t| Percintaan \t|");
        System.out.println("-------------------------------------------------------------------------");

        ulang: while (start > 0) {

            // data menu perintah
            System.out.println("Menu Perintah: ");
            System.out.println("1. Lihat Rating Drama korea");
            System.out.println("2. Opsi Pencarian");
            System.out.println("3. Keluar dari program");
            System.out.println("");

            try {
                System.out.print("Pilihan Anda: ");
                pilih = inputUser.readLine();
            } catch (Exception err) {
                System.out.println();
            }

            switch (pilih) {
            case "1":
                // tampilkan drama korea
                System.out.println(
                        "-----------------------------------------------------------------------------------------");
                System.out.printf("No. \t| Judul Film \t\t\t\t| Genre \t\t| Rating \t|");
                System.out.println();
                System.out.println(
                        "-----------------------------------------------------------------------------------------");
                for (int a = 0; a < dataFilm.size(); a++) {
                    System.out.println((a + 1) + "\t|" + dataFilm.get(a).getJudulDrama() + "\t\t\t\t|"
                            + dataFilm.get(a).getGenreDrama() + "\t\t|" + dataFilm.get(a).getRating() + "\t|");
                }
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println();
                continue ulang;

            case "2":

                try {
                    System.out.print("Masukkan Kata Kunci(Sensitif Hurup Besar dan Kecil): ");
                    cari = inputUser.readLine();
                } catch (Exception err) {
                    System.out.println();
                }

                System.out.println("");

                for (int j = 0; j < dataFilm.size(); j++) {
                    if (cari.equals(dataFilm.get(j).getJudulDrama()) || cari.equals(dataFilm.get(j).getGenreDrama())) {
                        System.out.println(">> Hasil Pencarian: ");
                        System.out.println(">> Judul Film: " + dataFilm.get(j).getJudulDrama());
                        System.out.println(">> Genre: " + dataFilm.get(j).getGenreDrama());
                        System.out.println(">> Rating: " + dataFilm.get(j).getRating());
                    } else {
                        System.out.println(">> Data tidak ditemukan");
                    }
                }
                continue ulang;

            case "3":
                System.out.println("Terima Kasih");
                start = 0;
                break;
            }
        }

    }
}