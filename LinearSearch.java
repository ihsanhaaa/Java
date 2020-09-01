import java.io.*;

/**
 * LinearSearch
 */
public class LinearSearch {
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
   
        int cek=0;
        //Linear Search
        for (init = 0; init < jumlahAngka; init++)
                {
                    if (inputAngka[init] == cariAngka)
                    {
                        System.out.println("Angka "+cariAngka+" berada di record ke "+(init+1));           
                        cek++;
                    }
                }
        if (cek == 0)
        {
            System.out.println("Angka "+cariAngka+" TIDAK ADA DALAM RECORD");
        }        
    }
}