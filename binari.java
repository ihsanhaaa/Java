import java.util.Scanner;

/*
*binari
*/
public class binari {

    public static void main(String[] args) {
        int num;

        System.out.println("Konversi Bilangan Desimal Ke Biner");
        System.out.println("===================================");
        Scanner scan = new Scanner(System.in);

        System.out.print("\nMasukkan Bilangan Desimal :");
        num = scan.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println("Bilangan binernya adalah : " + binary);

    }
}
