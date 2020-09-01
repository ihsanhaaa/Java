import java.util.ArrayList;

/**
 * ArrayListBuku
 */
public class ArrayListBuku {

    static ArrayList<objekbuku> daftarBuku = new ArrayList<objekbuku>();

    public static void main(String[] args) {

        daftarBuku.add(new objekbuku("Hujan", "Tere liye", 2017, 120000));
        daftarBuku.add(new objekbuku("Rindu", "Tere liye", 2014, 95000));
        daftarBuku.add(new objekbuku("Hujan", "Gramedia", 2015, 11000));
        daftarBuku.add(new objekbuku("Bulan", "Tere liye", 2011, 85000));

        System.out.print("no. \t|" + "Judul Buku\t|" + "Nama Pengarang\t|" + "Tahun Terbit\t|" + "Harga Buku\n");
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.print((i + 1) + "\t|" + daftarBuku.get(i).getJudul() + "\t|" + daftarBuku.get(i).getJudul()
                    + "\t|" + daftarBuku.get(i).getPengarang() + "\t|" + daftarBuku.get(i).getTahun_terbit() + "\t|"
                    + daftarBuku.get(i).getHarga());
            System.out.println("");
        }
    }

}