import java.util.ArrayList;

public class KacamataArrayList {

    static ArrayList<kacamata> data_kacamata = new ArrayList<kacamata>();

    public static void main(String[] args) {

        data_kacamata.add(new kacamata("Jiji", "baik", 30, 4000));
        data_kacamata.add(new kacamata("Afri", "Baik", 20, 2000));
        data_kacamata.add(new kacamata("aldi", "Lumayan", 15, 1500));
        data_kacamata.add(new kacamata("Firza", "Baik", 20, 2000));
        data_kacamata.add(new kacamata("Pardi", "Buruk", 5, 2000));

        System.out.println();

        System.out.print("No.\t| Merek\t| Kualitas\t| Ukuran\t| Harga\n");
        // size() digunakan untuk mengetahui banyaknya record / data
        for (int i = 0; i < data_kacamata.size(); i++) {
            System.out.print((i + 1) + "\t|" + data_kacamata.get(i).getMerk() + "\t|"
                    + data_kacamata.get(i).getKualitas() + "\t|" + data_kacamata.get(i).getUkuran() + "\t|");

            System.out.println("");
        }

    }
}