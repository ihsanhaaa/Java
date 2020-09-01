import java.util.ArrayList;

/**
 * ArrayListPrimitive
 */
public class ArrayListPrimitive {

    public static void main(String[] args) {
        ArrayList<String> namaMasakan = new ArrayList<String>();

        // Menambahkan Data
        namaMasakan.add("Ayam Goreng Patah Tulang");
        namaMasakan.add("Ayam Geprek");
        namaMasakan.add("Ikan Salju");
        namaMasakan.add("Ikan Goreng Sambal Neraka");
        namaMasakan.add("Bebek Goreng Penyet");
        namaMasakan.add("Bebek Peking");

        // Menampilkan Data
        System.out.println("Menu Masakan Kantin Pak Joko :");
        for (int i = 0; i < namaMasakan.size(); i++) {
            // get(nomor_index) berfungsi untuk mengambil nilai Array berdasarkan indeks
            System.out.println("\t" + (i + 1) + ". " + namaMasakan.get(i));
        }
        System.out.println("");

        try {
            System.out.println("Pilihan anda: ");
        } catch (Exception err) {
            System.out.println();
        }

    }
}