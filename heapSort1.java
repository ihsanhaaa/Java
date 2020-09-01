import java.io.BufferedReader;
import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * heapSort1
 */
public class heapSort1 {

    // Fungsi untuk menerapkan heapsort menggunakan Priority Queue
    static void heapSort(int array[]) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        int i;

        for (i = 0; i < array.length; i++) {
            priorityQueue.add(array[i]); // menambahkan elemen array ke antrian prioritas
        }
        i = 0;
        while (!priorityQueue.isEmpty()) {
            array[i++] = priorityQueue.poll(); // mengekstrak elemen dari antrian prioritas dan menambahkannya ke
                                               // antrian
        }
    }

    // Fungsi untuk membaca input user
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int size;

        try {
            System.out.print("Masukkan Ukuran Array: ");
            size = Integer.parseInt(input.readLine());
        } catch (Exception e) {
            System.out.println("Input tidak valid");
            return;
        }

        int array[] = new int[size]; // mendeklarasi
        System.out.println("Masukkan Elemen Array:");
        int i;
        for (i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.out.println("*error, masukkan input berupa angka");
            }
        }
        // Cetak hasil
        System.out.println("Array Awal");
        System.out.println(Arrays.toString(array));
        System.out.println("Array yang sudah diurutkan");
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}