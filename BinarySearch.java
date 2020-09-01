import java.io.*;
import java.util.Arrays;

/**
 * LinearSearch
 */
public class BinarySearch {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int jumlahAngka=0; 
        int init=0;
        int cariAngka=0; 
        
        //Meminta user menentukan berapa banyaknya angka yang akan diinput
        try 
            {
                System.out.print("Jumlah angka yang akan disimpan : ");
                jumlahAngka = Integer.valueOf(input.readLine());
            } 
        catch (Exception e) {}

        int[] inputAngka = new int[jumlahAngka];

        //Melakukan perulangan input data berdasarkan jumlah angka yang ditentukan user
        try 
            {
                do
                {
                    System.out.print("Angka "+(init+1)+" : ");
                    inputAngka[init] = Integer.parseInt(input.readLine());
                    init++;
                }
                while (init < jumlahAngka);    
            } 
        catch (Exception e) {}
        
        //Meminta user memasukkan angka yang akan dicari
        
        try 
            {
                System.out.print("Angka yang dicari : ");
                cariAngka = Integer.parseInt(input.readLine());
            } 
        catch (Exception e) {}
   
        //laksanakan Binary Search
        //int hasil = binarySearch(inputAngka, cariAngka, 0, inputAngka.length-1);
        int hasil = Arrays.binarySearch(inputAngka, 0, inputAngka.length-1, cariAngka);
        
        if (hasil == Integer.MAX_VALUE)
        {
            System.out.println("None");
        }   
        else
        {
            System.out.println("Angka "+cariAngka+" berada pada record ke "+(hasil));
        }   
    }

    //Fungsi Binary Search
    public static int binarySearch(int[] bilangan, int cariAngka, int indexAwal, int indexAkhir)
    {
        int indexHasil = Integer.MAX_VALUE;

        while (indexAwal <= indexAkhir)
        {
            int indexTengah = (indexAwal+indexAkhir)/2;
            if (bilangan[indexTengah] < cariAngka)
            {
                indexAwal = indexTengah + 1;
            }
            else if (bilangan[indexTengah] > cariAngka)
            {
                indexAkhir = indexTengah - 1;
            }
            else if (bilangan[indexTengah] == cariAngka)
            {
                indexHasil = indexTengah;
                break;
            }
        }
        return indexHasil;
    }
}