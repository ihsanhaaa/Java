import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * ArrayListPrimitive
 */
public class arrayListUpdateMakanan {
    static ArrayList<String> namaMasakan = new ArrayList<String>();

    public static void main(String[] args) {
        int batas = 5;
        int start = 1;
        String jwbLoop = "";
        int index = 0;
        // Menambahkan data awal menggunakan perintah 'add'
        namaMasakan.add("Ayam Goreng Patah Tulang");
        namaMasakan.add("Ayam Geprek");
        namaMasakan.add("Ikan Salju");
        namaMasakan.add("Ikan Goreng Sambal Neraka");
        namaMasakan.add("Bebek Goreng Penyet");
        namaMasakan.add("Bebek Peking");

        ulang: while (start > 0) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            // Menampilkan Data
            System.out.println("Menu Masakan Kantin Pak Joko :");
            tampilData();
            System.out.println("");

            System.out.println("Penambahan menu masakan : ");

            do {
                try {
                    System.out.print("Menu masakan baru yang ke-" + (namaMasakan.size() + 1) + " : ");
                    namaMasakan.add(input.readLine());
                } catch (Exception e) {
                    // TODO: handle exception
                }

                index++;
            } while (index < batas);

            System.out.println("\nDaftar Menu Masakan Kantin Pak Joko (Update)");
            tampilData();

            // Pengulangan eksekusi syntax utama
            try {
                System.out.print("Mau coba lagi ? (Y/N)");
                jwbLoop = input.readLine();
                if (jwbLoop.compareTo("Y") == 0 || jwbLoop.compareTo("y") == 0) {
                    start++;
                    index = 0;
                    continue ulang;
                } else {
                    System.out.println("Terima kasih");
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    static void tampilData() {
        for (int i = 0; i < namaMasakan.size(); i++) {
            // get(nomor_index) berfungsi untuk mengambil nilai Array berdasarkan indeks
            System.out.println("\t" + (i + 1) + ". " + namaMasakan.get(i));
        }
    }
}