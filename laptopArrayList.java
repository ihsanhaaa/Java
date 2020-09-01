import java.util.ArrayList;

/**
 * laptopArrayList
 */
public class laptopArrayList {

    static ArrayList<objekLaptop> dataLaptop = new ArrayList<objekLaptop>();

    public static void main(String[] args) {

        dataLaptop.add(new objekLaptop("ASUS", "Hitam", 150000, 14));
        dataLaptop.add(new objekLaptop("ACER", "Merah", 120000, 20));
        dataLaptop.add(new objekLaptop("DELL", "Kuning", 180000, 12));
        dataLaptop.add(new objekLaptop("HP", "Hijau", 130000, 10));

        // memanggil fungsi
        tampilData();
    }

    static void tampilData() {
        System.out.print("No. \t| Merk\t| Warna\t| Harga\t| Ukuran Layar\n");
        for (int i = 0; i < dataLaptop.size(); i++) {
            System.out.print((i + 1) + "\t|" + dataLaptop.get(i).getMerk() + "\t|" + dataLaptop.get(i).getWarna()
                    + "\t|" + dataLaptop.get(i).getHarga() + "\t|" + dataLaptop.get(i).getUkuran_layar());
            System.out.println("");
        }
    }

}