import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.*;

/**
 * projectUAS
 */
public class projectUAS {

    static ArrayList<objekUAS> dataTim = new ArrayList<objekUAS>();

    public static void main(String[] args) {
        BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));

        String pilihan = "";
        String kataKunci = "";
        int start = 1;
        boolean running1 = true;
        int index = 0;
        int loop = 1;

        // grub a
        dataTim.add(new objekUAS("Dortmund", "Jerman", "Lucien Favre", "Grup A", 6, 4, 1, 1, 10, 2));
        dataTim.add(new objekUAS("AT Madrid", "Spanyol", "Diego Simeone", "Grup A", 6, 4, 1, 1, 9, 6));
        dataTim.add(new objekUAS("Club Brugge", "Belgia", "Ivan Leko", "Grup A", 6, 1, 3, 2, 6, 5));
        dataTim.add(new objekUAS("Monaco FC", "Prancis", "Leonardo Jardim", "Grup A", 6, 0, 1, 5, 2, 14));
        // grub b
        dataTim.add(new objekUAS("Barcelona", "Spanyol", "Ernesto Valverde", "Grup B", 6, 4, 2, 0, 14, 5));
        dataTim.add(new objekUAS("Tottenham", "Inggris", "Mauricio Pochettino", "Grup B", 6, 2, 2, 2, 9, 10));
        dataTim.add(new objekUAS("Inter Milan", "Italia", "Antonio Conte", "Grup B", 6, 2, 2, 2, 6, 7));
        dataTim.add(new objekUAS("PSV Eindhoven", "Belanda", "Mark Van Bommel", "Grup B", 6, 0, 2, 4, 6, 13));
        // grub c
        dataTim.add(new objekUAS("Paris Saint G", "Prancis", "Thomas Tuchel", "Grup C", 6, 3, 2, 1, 17, 9));
        dataTim.add(new objekUAS("Liverpool", "Inggris", "Jurgen Klopp", "Grup C", 6, 3, 0, 3, 9, 7));
        dataTim.add(new objekUAS("Napoli FC", "Italia", "Carlo Ancelotti", "Grup C", 6, 2, 3, 1, 7, 5));
        dataTim.add(new objekUAS("FK Crvena", "Serbia", "Vladan Milojevic", "Grup C", 6, 1, 1, 4, 5, 17));
        // grub d
        dataTim.add(new objekUAS("FC Porto", "Portugal", "Sergio Conceicao", "Grup D", 6, 5, 1, 0, 15, 6));
        dataTim.add(new objekUAS("Schalke 04", "Jerman", "Domenico Tedesco", "Grup D", 6, 3, 2, 1, 6, 4));
        dataTim.add(new objekUAS("Galatasaray", "Turki", "Fatih Terim", "Grup D", 6, 1, 1, 4, 5, 8));
        dataTim.add(new objekUAS("Lokomotif", "Rusia", "Yuri Semin", "Grup D", 6, 1, 0, 5, 4, 12));
        // grub e
        dataTim.add(new objekUAS("Bayern.M", "Jerman", "Niko Kovac", "Grup E", 6, 4, 2, 0, 15, 5));
        dataTim.add(new objekUAS("AFC Ajax", "Belanda", "Erik ten Hag", "Grup E", 6, 3, 3, 0, 11, 5));
        dataTim.add(new objekUAS("SL Benfica", "Portugal", "Bruno Lage", "Grup E", 6, 2, 1, 3, 6, 11));
        dataTim.add(new objekUAS("AEK Athena", "Yunani", "Miguel Cardoso", "Grup E", 6, 0, 0, 6, 2, 13));
        // grub f
        dataTim.add(new objekUAS("Man City", "Inggris", "Pep Guardiola", "Grup F", 6, 4, 1, 1, 16, 6));
        dataTim.add(new objekUAS("Olimpique.L", "Perancis", "Bruno Genesio", "Grup F", 6, 1, 5, 0, 12, 11));
        dataTim.add(new objekUAS("Shakhtar", "Ukraina", "Paulo Fonseca", "Grup F", 6, 1, 3, 2, 8, 16));
        dataTim.add(new objekUAS("Hoffenfeim", "Jerman", "Julian Nagelsmann", "Grup F", 6, 0, 3, 3, 11, 14));
        // grub g
        dataTim.add(new objekUAS("Real Madrid", "Spanyol", "Zinedine Zidane", "Grup G", 6, 4, 0, 2, 12, 5));
        dataTim.add(new objekUAS("A.S.Roma", "Italia", "Claudio Ranieeri", "Grup G", 6, 3, 0, 3, 11, 8));
        dataTim.add(new objekUAS("Viktoria Plzen", "Republik Ceko", "Roman Pivarnik", "Grup G", 6, 2, 1, 3, 7, 16));
        dataTim.add(new objekUAS("CSKA Moscow", "Rusia", "Viktor Goncharenko", "Grup G", 6, 2, 1, 3, 8, 9));
        // grub h
        dataTim.add(new objekUAS("Juventus", "Italia", "Massimiliano Allegri", "Grup H", 6, 4, 0, 2, 9, 4));
        dataTim.add(new objekUAS("Man United", "Inggris", "Ole Gunnar Solskjaer", "Grup H", 6, 3, 1, 2, 7, 4));
        dataTim.add(new objekUAS("Valencia", "Spanyol", "Marcelino", "Grup H", 6, 2, 2, 2, 6, 6));
        dataTim.add(new objekUAS("Young Boys", "Swiss", "Gerardo Seoane", "Grup H", 6, 1, 1, 4, 4, 12));

        tampilData();

        ulang: while (start > 0) {

            // data menu perintah
            System.out.println("Menu Perintah: ");
            System.out.println("1. Lihat Hasil Pertandingan");
            System.out.println("2. Opsi Pencarian");
            System.out.println("3. Keluar dari program");
            System.out.println("");

            try {
                System.out.print("Pilihan Anda: ");
                pilihan = inputUser.readLine();
            } catch (Exception err) {
                System.out.println();
            }

            switch (pilihan) {
            case "1":
                System.out.println("---------------------------------------------------------------------------------");
                System.out.printf("No.\t| Nama Tim\t\t| MP \t| Win\t| Draw\t| Lose\t| GF\t| GA\t|\n");
                System.out.println("---------------------------------------------------------------------------------");
                for (int a = 0; a < dataTim.size(); a++) {
                    System.out.println((a + 1) + "\t|" + dataTim.get(a).getNamaTim() + "\t\t|"
                            + dataTim.get(a).getBanyakPertandingan() + "\t|" + dataTim.get(a).getMenang() + "\t|"
                            + dataTim.get(a).getSeri() + "\t|" + dataTim.get(a).getKalah() + "\t|"
                            + dataTim.get(a).getJumlahGoal() + "\t|" + dataTim.get(a).getKemasukkanGoal() + "\t|");
                }
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println("");
                start++;
                continue ulang;

            case "2":

                try {
                    System.out.print("Masukkan Kata Kunci(Sensitif Hurup Besar dan Kecil): ");
                    kataKunci = inputUser.readLine();
                } catch (Exception err) {
                    System.out.println();
                }

                System.out.println("");

                for (int j = 0; j < dataTim.size(); j++) {
                    if (kataKunci.equals(dataTim.get(j).getNamaTim())
                            || kataKunci.equals(dataTim.get(j).getNamaPelatih())
                            || kataKunci.equals(dataTim.get(j).getAsalTim())
                            || kataKunci.equals(dataTim.get(j).getGrup())) {
                        System.out.println(">> Hasil Pencarian:");
                        System.out.println(dataTim.get(j).getGrup());
                        System.out.println("  Nama Tim \t: " + dataTim.get(j).getNamaTim());
                        System.out.println("  Manager \t: " + dataTim.get(j).getNamaPelatih());
                        System.out.println("  Asal Tim \t: " + dataTim.get(j).getAsalTim());
                        System.out.println("  MP \t\t: " + dataTim.get(j).getBanyakPertandingan());
                        System.out.println("  GF \t\t: " + dataTim.get(j).getJumlahGoal());
                        System.out.println("  GA \t\t: " + dataTim.get(j).getKemasukkanGoal());
                        System.out.println("");
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

    // fungsi untuk menampilkan nama-nama tim
    public static void tampilData() {
        System.out.println("Data Tim yang mengikuti LIGA CHAMPION 2018-2019");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("No.\t| Nama Tim\t\t| Asal Tim\t| Manajer\t\t\n");
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < dataTim.size(); i++) {
            System.out.println((i + 1) + "\t|" + dataTim.get(i).getNamaTim() + "\t\t|" + dataTim.get(i).getAsalTim()
                    + "\t\t|" + dataTim.get(i).getNamaPelatih() + "\t");
        }
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("");
    }
}
