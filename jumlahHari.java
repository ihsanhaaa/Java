/**
 * jumlahHari
 */
import java.util.Scanner;

public class jumlahHari {

    public static void main(String[] args) {
        
        int kode_bulan;
        Scanner user_input;

        user_input = new Scanner(System.in);
        System.out.println("Masukkan Kode Bulan(1,2,3,...,12): ");
        kode_bulan = user_input.nextInt();

        if (kode_bulan == 2) {
            System.out.println("Jumlah Hari 28 atau 29 hari");
        }
    }
}