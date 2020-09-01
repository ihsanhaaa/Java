import java.util.Scanner;
/**
 * loop1
 */
public class loop1 {

    public static void main(String[] args) {
        
        Scanner input;
        short angka;

        input = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        angka = input.nextShort();

        //atas
        for(int i = 1; i <= angka; i++){
            for(int k = angka - 1; k >= i; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //bawah
        for(int i = angka - 1; i>= 1; i--){
            for(int k = angka - 1; k >= i; k--){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}