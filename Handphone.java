import java.util.ArrayList;

/**
 * Handphone
 */
public class Handphone {

    public static void main(String[] args) {
        ArrayList<String> daftarHP = new ArrayList<String>();

        // Menambahkan data
        daftarHP.add("Oppo");
        daftarHP.add("Xiaomi");
        daftarHP.add("Realme");
        daftarHP.add("Acer");

        System.out.println("Daftar Merk HP yang ada di Toko Sebelah");
        for (int i = 0; i < daftarHP.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + daftarHP.get(i));
        }

        System.out.println();
        System.out.println("Merubah indeks ke 1");
        int no = 1;
        daftarHP.set(1, "Asus");
        System.out.println("Daftar Merk HP yang ada di Toko Sebelah");
        for (String daftar : daftarHP) {
            System.out.println("\t" + (no) + ". " + daftar);
            no++;
        }

        System.out.println();
        System.out.println("Menghapus Data Realme");
        daftarHP.remove(2);
        for (int i = 0; i < daftarHP.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + daftarHP.get(i));
        }

    }
}