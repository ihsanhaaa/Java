import java.util.Scanner;
/**
 * ganjilGenap
 */
public class ganjilGenap {

    public static void main(String[] args) {
        
        Scanner input;
        short angka;
        
        input = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        angka = input.nextShort();

        if (angka == 0) {
            System.out.println("Bilangan Netral");
        }
        else if (angka % 2 == 0) {
            System.out.println("Bilangan Genap");
        }
        else
        {
            System.out.println("Bilangan Ganjil");
        }
        
    }
}