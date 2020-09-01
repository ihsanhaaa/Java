import java.util.Scanner;
/**
 * Tugasno2
 */
public class Tugasno2 {

    public static void main(String[] args) {
        
        //Deklarasi Variabel
        Scanner inputUser;
        int simpanan, besarBunga, waktu, bungaDiperoleh, investasi;

        //Baca Inputan User
        inputUser = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Simpanan: ");
        simpanan = inputUser.nextInt();
        System.out.print("Besar Bunga(%): ");
        besarBunga = inputUser.nextInt();
        System.out.print("Masukkan Jangka waktu penyimpanan(perTahun): ");
        waktu = inputUser.nextInt();

        bungaDiperoleh = simpanan * besarBunga / 100; //Menghitung Bunga
        investasi = simpanan + bungaDiperoleh;

        //Cetak Hasil
        System.out.println("Bunga yang diperoleh: " + bungaDiperoleh);
        System.out.println("Nilai investasi setelah " + waktu + " Tahun" + " adalah " + investasi);
    }
}