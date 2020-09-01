import java.util.Scanner;
/**
 * cobaTugas
 */
public class cobaTugas {

    public static void main(String[] args) {
        
        //Deklarasi Variabel
        Scanner input;
        String nama, alamat;
        short umur;

        //Baca Inputan User
        input = new Scanner(System.in);
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Tinggal di: ");
        alamat = input.nextLine();
        System.out.print("Umur: ");
        umur = input.nextShort();
        

        //Cetak Hasil
        System.out.println("\nNama saya: " + nama + ", " + "Tinggal di: " + alamat + ", " + "Berumur: " + umur + " Tahun");
    }
}