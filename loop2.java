import java.io.*;
/**
 * loop2
 */
public class loop2 {

    public static void main(String[] args) {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tinggi=0;
        int baris, kolom;
        int method;
       
        System.out.print("Masukkan tinggi ketupat: (angka)");
        try
        {
        tinggi = Integer.parseInt(in.readLine());
        for (baris = 1; baris <= tinggi; baris++)
        {
        if (baris <= ((tinggi+1)/2))
        method = baris;
        else
        method = ((tinggi+1)-baris);
       
        for (kolom=1; kolom <= tinggi-method; kolom++)
        System.out.print(" ");
       
        for (kolom=1; kolom < 2*method; kolom++)
        System.out.print("*");
       
        System.out.println("");
        }
        }
        catch (IOException e) {}
    }
}