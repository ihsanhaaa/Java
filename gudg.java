import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.*;
import java.io.IOException;

public class gudg {
    static ArrayList<String> Pengeluaran = new ArrayList<String>();

    public static void main(String[] args) {
        String uang = " ";
        int Uang;
        int batas = 9;// input lebih dari 1
        int start = 1;// looping program
        int index = 0;// variabel menghitung ulang input
        int total = 0;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // Menampilkan Data
        System.out.println("Selamat pagi Afriani");
        System.out.println("Masukkan nominal uang pengeluaran anda hari ini");
        ulang: while (start > 0) {
            do {
                try {
                    do {
                        System.out.print("Pengeluaran ke-" + (Pengeluaran.size() + 1) + " : ");

                        uang = input.readLine();

                    } while (!Validasi.validasiInteger(uang));

                } catch (Exception e) {
                }
                Pengeluaran.add(uang);
                index++;
            } while (index < batas);

            System.out.println("Menu Perintah : ");
            System.out.println("1. Input penambahan nominal uang pengeluaran");
            System.out.println("2. Restart Program");
            System.out.println("3. Keluar dari Program");

            BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

            int pilih = 0;
            System.out.print("Pilihan anda (input nomor) : ");
            try {

                pilih = Integer.parseInt(dataIn.readLine());
            } catch (IOException e) {
                System.out.println(" ");
            }

            Uang = Integer.valueOf(uang);

            switch (pilih) {
            case 1:

                start++;
                index = 0;
                continue ulang;

            case 2:
                Pengeluaran.clear();

                index = 0;
                continue ulang;

            case 3:
                System.out.println("Daftar final nominal uang pengeluaran hari ini : ");
                start = 0;
                index = 0;

                for (int i = 0; i < Pengeluaran.size(); i++) {
                    // get(nomor_index) berfungsi untuk mengambil nilai Array berdasarkan indeks
                    System.out.println("\t" + (i + 1) + ". " + Pengeluaran.get(i));

                }
                total += Uang;
                System.out.println("Total pengeluaran anda hari ini :  " + total);
                System.out.println("Terima kasih Afriani");

                break;
            default:
                System.out.println("Error !");
            }
        }
    }

    // Fungsi Validasi
    public static boolean validasiInteger(String s) {
        boolean cek;

        String regexInt = "[1-9]\\d*";

        if (s.length() != 0 && Pattern.matches(regexInt, s) && Integer.valueOf(s) > 0)
            cek = true;
        else {
            cek = false;
            System.out.println(
                    "          ***Maaf, input uang pengeluaran ke-" + (Pengeluaran.size() + 1) + " invalid***");
        }

        return cek;

    }

}