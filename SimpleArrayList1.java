import java.util.ArrayList;

public class SimpleArrayList1 {

    // Membuat Objek alias Instansiasi Objek ArrayList dan diglobalkan
    static ArrayList<CelularPhone> smartPhone = new ArrayList<CelularPhone>();

    public static void main(String[] args) {

        // Instansiasi Objek CelularPhone
        smartPhone.add(new CelularPhone("Oppo", "Hitam", "Android 8", 5));
        smartPhone.add(new CelularPhone("Xiaomi", "Emas", "Android 7", 4));
        smartPhone.add(new CelularPhone("Meizu", "Perak", "Android 6", 5));

        // Menampilkan Data dengan looping for
        System.out.println("Tampilan Data dengan looping for");
        // pemanggilan fungsi
        tampilData();

        System.out.println("");

        // Mengubah warna celular phone Xiaomi menjadi Perak
        System.out.println("Mengubah warna celular phone Xiaomi jadi warna 'Perak'");
        smartPhone.get(1).setWarna("Perak");
        // pemanggilan fungsi
        tampilData();
    }

    // fungsi tanpa mengembalikan nilai
    public static void tampilData() {
        if (smartPhone.isEmpty()) {
            System.out.println("Data tidak ada");
        } else {
            System.out.print("No.\t| Merek\t| Warna\t| Sistem Oper.\t| Ukuran Layar (Inches)\n");
            // size() digunakan untuk mengetahui banyaknya record / data
            for (int i = 0; i < smartPhone.size(); i++) {
                System.out.print((i + 1) + "\t|" + smartPhone.get(i).getMerek() + "\t|" + smartPhone.get(i).getWarna()
                        + "\t|" + smartPhone.get(i).getSistemOperasi() + "\t|" + smartPhone.get(i).getUkuran());
                System.out.println("");
            }
        }
    }
}