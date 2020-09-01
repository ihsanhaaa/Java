import javax.swing.JOptionPane;
/**
 * latihan3b
 */
public class latihan3b {

    public static void main(String[] args) {
        
        //Deklarasi Variabel
        long simpanan, besarBunga, waktu, bungaDiperoleh, investasi;

        //Baca Inputan User
        String input1 = JOptionPane.showInputDialog("Masukkan Jumlah Simpanan: ");
        System.out.println("Masukkan Jumlah Simpanan: " + input1);
        simpanan = Long.parseLong(input1);

        String input2 = JOptionPane.showInputDialog("Masukkan besar bunga (%): ");
        System.out.println("Masukkan besar bunga (%): " + input2);
        besarBunga = Long.parseLong(input2);
        
        String input3 = JOptionPane.showInputDialog("Jangka waktu penyimpanan(perTahun): ");
        System.out.println("Jangka waktu penyimpanan(perTahun): " + input3);
        waktu = Long.parseLong(input3);

        bungaDiperoleh = simpanan * besarBunga / 100* waktu; //Menghitung Bunga
        investasi = simpanan + bungaDiperoleh;

        //Cetak Hasil
        System.out.println("Bunga yang diperoleh: " + bungaDiperoleh);
        System.out.println("Nilai investasi setelah " + waktu + " Tahun" + " adalah " + investasi);

    }
}