import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**
 * belajarfor
 */
public class belajarfor {
    static ArrayList<String> NominalUang = new ArrayList<String>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nominal;
        int start = 1;

        System.out.println("Selamat pagi Ihsan Haryansyah");
        System.out.println("Masukkan nominal uang pengeluaran anda hari ini");
        System.out.print("Pengeluaran ke-" + (NominalUang.size() + 1) + ": ");
        nominal = input.nextInt();

        if (!Character.isDigit(nominal)) {

        } else {
            System.out.println("*** error ***");
        }

    }
}