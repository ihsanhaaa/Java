import java.util.ArrayList;

/**
 * Mahasiswa2ArrayList
 */
public class Mahasiswa2ArrayList {

    static ArrayList<Mahasiswa2> data_mahasiswa = new ArrayList<Mahasiswa2>();

    public static void main(String[] args) {

        data_mahasiswa.add(new Mahasiswa2("Ihsan", "D1042181021", "Baik", 80));
        data_mahasiswa.add(new Mahasiswa2("Elma", "D12345678", "Sangat Baik", 85));
        data_mahasiswa.add(new Mahasiswa2("Jihan", "E23456789", "Lumayan Baik", 90));
        data_mahasiswa.add(new Mahasiswa2("Nuri", "U7654321", "Cumluade", 80));

        tampilData();

        System.out.println("");
        System.out.println("Mengubah Nama Jihan");
        data_mahasiswa.get(2).setNama("Opang");

        tampilData();
    }

    public static void tampilData() {

        for (int i = 0; i < data_mahasiswa.size(); i++) {
            System.out.print((i + 1) + "\t|" + data_mahasiswa.get(i).getNama() + "\t|" + data_mahasiswa.get(i).getNim()
                    + "\t|" + data_mahasiswa.get(i).getCapaian() + "\t|" + data_mahasiswa.get(i).getNilai());
            System.out.println("");
        }

    }
}