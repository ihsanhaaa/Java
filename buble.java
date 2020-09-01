import java.io.*;

public class buble {
    public static void main(String[] args) {
        int jumlah, i, j, swap;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukkan Jumlah Bilangan Yang Mau DiInputkan :");
            jumlah = Integer.valueOf(BR.readLine());
            int array[] = new int[jumlah];
            System.out.println("\nMasukkan " + jumlah + " Buah Bilangan Integer");
            System.out.println("===========================================");
            for (i = 0; i < jumlah; i++) {
                System.out.print("Bilangan Ke- " + (i + 1) + " =");
                array[i] = Integer.valueOf(BR.readLine());
            }
            System.out.println("\nBilangan Belum Terurutnya");
            for (int a = 0; a < jumlah; a++) {
                System.out.print(array[a] + " ");
            }

            for (i = 0; i < (jumlah - 1); i++) {
                for (j = 0; j < jumlah - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        swap = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = swap;
                    }
                }
            }
            System.out.println("\n\nBilangan Terurut (ascending) adalah :");

            for (i = 0; i < jumlah; i++)
                System.out.print(array[i] + " ");

            for (i = 0; i < (jumlah - 1); i++) {
                for (j = 0; j < jumlah - i - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        swap = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = swap;
                    }
                }
            }
            System.out.println("\n\nBilangan Terurut (descending) adalah :");
            for (i = 0; i < jumlah; i++)
                System.out.print(array[i] + " ");
        } catch (IOException e) {
        }
    }
}
