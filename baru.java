import java.util.ArrayList;
import java.io.*;

/**
 * baru
 */
public class baru {

    static ArrayList<objekrif> drama = new ArrayList<objekrif>();

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String pilihan = "";
        String kataKunci = "";
        int start = 1;
        boolean running1 = true;
        int index = 0;
        int loop = 1;

        // drama
        drama.add(new objekrif("What Wrong With Secretary Kim", "Komedi Romantis", 6));
        drama.add(new objekrif("Descendants Of the sun", "Aksi", 8));
        drama.add(new objekrif("The Heirs", "Percintaan", 5));
        drama.add(new objekrif("My Love From The Stars", "Percintaan", 8));
        drama.add(new objekrif("Doctors", "Romantis", 4));
        drama.add(new objekrif("Pinocchio", "Percintaan", 6));
        drama.add(new objekrif("I Am Not Robot", "Romantis", 5));
        drama.add(new objekrif("Goblin", "Aksi", 10));
        drama.add(new objekrif("Boys Over Flowers", "Romantis", 9));
        drama.add(new objekrif("City Hunter", "Aksi", 7));

        tampildata();

        ulang: while (start > 0) {
            // data menu perintah
            System.out.println("Menu Perintah: ");
            System.out.println("1. Lihat Rating Drama Korea");
            System.out.println("2. Opsi Pencarian");
            System.out.println("3. Keluar dari program");
            System.out.println("");

            try {
                System.out.print("Pilihan Anda: ");
                pilihan = input.readLine();
            } catch (Exception err) {
                System.out.println();
            }
        }
        switch (pilihan) {
        case "1":
            System.out.println("---------------------------------------------------------------------------------");
            System.out.printf("No.\t| Judul Drama Korea \t\t| Genre \t| Rating");
            System.out.println("---------------------------------------------------------------------------------");
            for (int a = 0; a < drama.size(); a++) {
                System.out.println((a + 1) + "\t|" + drama.get(a).getJuduldrama() + "\t\t|"
                        + drama.get(a).getGenredrama() + "\\t|" + drama.get(a).getRating());
            }
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("");
            start++;

        case "2":

            try {
                System.out.print("Masukkan Kata Kunci(Sensitif Case): ");
                kataKunci = input.readLine();
            } catch (Exception err) {
                System.out.println();
            }

            System.out.println("");
            for (int j = 0; j < drama.size(); j++) {
                if (kataKunci.equals(drama.get(j).getJuduldrama())) {
                    System.out.println(">> Hasil Pencarian:");
                    System.out.println("Judul Drama korea: " + drama.get(j).getJuduldrama());
                    System.out.println("Genre: " + drama.get(j).getGenredrama());
                    System.out.println("Rating: " + drama.get(j).getRating());
                    System.out.println("");

                } else if (kataKunci.equals(drama.get(j).getGenredrama())) {
                    System.out.println(">> Hasil Pencarian:");
                    System.out.println("Judul Drama korea: " + drama.get(j).getJuduldrama());
                    System.out.println("Genre: " + drama.get(j).getGenredrama());
                    System.out.println("Rating: " + drama.get(j).getRating());
                    System.out.println("");
                }
            }
            // start++

        case "3":
            System.out.println("Terima Kasih");
            start = 0;

            break;

        }

    }

    public static void tampildata() {
        System.out.println("Data Tim yang mengikuti LIGA CHAMPION 2018-2019");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("No.\t| Nama Tim\t\t| Asal Tim\t| Manajer\t\t\n");
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < drama.size(); i++) {
            System.out.println((i + 1) + "\t|" + drama.get(i).getJuduldrama() + "\t\t|" + drama.get(i).getGenredrama()
                    + "\\t|" + drama.get(i).getRating() + "\t");
        }
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("");
    }
}