import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.regex.*;

/**
 * Poject12345
 */
public class Poject12345 {
    static ArrayList<objekDinaAfri> dataMakanan = new ArrayList<objekDinaAfri>();

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String pesanan = "";
        String menu = "";
        String noMeja = "";
        int pilihan;
        int start = 1;
        int batas = 1;
        int index = 0;
        int hasil = 0;
        int loop = 1;

        // Makanan
        dataMakanan.add(new objekDinaAfri("Bubur Pedas", 10000));
        dataMakanan.add(new objekDinaAfri("Mie Sagu", 10000));
        dataMakanan.add(new objekDinaAfri("Mie Kepiting", 20000));
        dataMakanan.add(new objekDinaAfri("KwaTiaw goreng", 10000));
        dataMakanan.add(new objekDinaAfri("Chai Kue", 10000));
        // Minuman
        dataMakanan.add(new objekDinaAfri("Es Lidah Buaya", 5000));
        dataMakanan.add(new objekDinaAfri("Es Jeruk", 3000));
        dataMakanan.add(new objekDinaAfri("Es KacangMerah", 7000));
        dataMakanan.add(new objekDinaAfri("Es SariKacang", 7000));
        dataMakanan.add(new objekDinaAfri("Es Teler", 10000));

        daftarMenu();

        ulang: while (start > 0) {

            System.out.println("");

            // data menu perintah
            System.out.println("Menu Perintah: ");
            System.out.println("1. Daftar Menu");
            System.out.println("2. Pemesanan Makanan");
            System.out.println("3. Laporan");
            System.out.println("4. Opsi Pencarian");
            System.out.println("5. Exit");

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
                System.out.println("===== Daftar Menu =====");
                daftarMenu();
                break;

            case "2":
                System.out.println("===== Pemesanan Makanan =====");

                try {
                    do {
                        System.out.print("No Meja: ");
                        noMeja = input.readLine();
                    } while (!Validasi.validasiInteger(noMeja));
                } catch (IOException error) {
                    System.out.println();
                }

                ulang2: while (start > 0) {
                    try {
                        System.out.print("Pesanan yang akan dipesan: ");
                        pesanan = input.readLine();
                        if (pesanan.matches("[a-z A-Z]*")) {
                            loop++;
                        } else {
                            System.out.println("\t" + "***Maaf, salah input***");
                            continue ulang2;
                        }
                    } catch (Exception err) {
                        System.out.println();

                    }

                    try {
                        System.out.print("Pesan lagi? (Y/N): ");
                        String ulang = input.readLine();
                        if ((ulang.compareTo("y") == 0) || (ulang.compareTo("Y") == 0)) {
                            loop++;

                        } else {
                            System.out.println();
                            break;
                        }
                    } catch (Exception err) {
                        System.out.println();
                    }

                }

                for (int d = 0; d < dataMakanan.size(); d++) {
                    if (pesanan.equals(dataMakanan.get(d).getMakananMinuman())) {
                        System.out.println("Makanan: " + dataMakanan.get(d).MakananMinuman);
                    }
                }

            case "3":
                System.out.println("");
                start++;
                index = 0;

                continue ulang;

            case "4":
                System.out.println("");
                start++;
                index = 0;

                continue ulang;

            case "5":
                System.out.println("Terima Kasih");
                start = 0;
                index = 0;

                break;
            }
            // ---------------------------------------------------------------------------------
        }
    }

    // fungsi untuk menampilkan menu makanan
    public static void daftarMenu() {
        System.out.println("Daftar Menu Masakan Melayu");
        System.out.println("---------------------------------------------------------");
        System.out.printf("No.\t| Menu Masakan dan Minuman\t\t| Harga\t|\n");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < dataMakanan.size(); i++) {
            System.out.println((i + 1) + "\t|" + dataMakanan.get(i).getMakananMinuman() + "\t\t\t\t|"
                    + dataMakanan.get(i).getHarga() + "\t|");
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("");
    }

}