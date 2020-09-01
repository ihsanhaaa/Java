import java.util.regex.*;
import java.io.*;

public class ValidasiAngka {

    public static void main(String[] args) {
        String angka="",jwbLoop="";
        int loop = 1;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        do{
            //Syntax Utama-----------------------------------------------------
            try {
                do{
                System.out.print("Masukkan angka bertipe data 'Integer' : ");
                angka = in.readLine();
                }
                while (!validasiInteger(angka));

                System.out.println("");

                do{
                    System.out.print("Masukkan angka bertipe data 'Double' : ");
                    angka = in.readLine();
                    }
                while (!validasiDouble(angka));

            } catch (Exception e) {
                //TODO: handle exception
            }

            //---------------------Batas Syntax Utama ---------------------------
            System.out.println("");

            //Pengulangan eksekusi syntax utama
            try {
                System.out.print("Mau coba lagi ? (Y/N)");
                jwbLoop = in.readLine();
                if (jwbLoop.compareTo("Y") == 0 || jwbLoop.compareTo("y") == 0){
                    loop++;
                }else{
                    System.out.println("Arigato");
                    break;
                }
            } catch (Exception e) {
                //TODO: handle exception
            }
            
        }while(loop > 0);
    }

    //Kumpulan Fungsi
    //Versi Regex
    public static boolean validasiDouble(String s){
        boolean cek;
        /*
            \d = input angka dari 0-9
            * = memperbolehkan muncul 1 kali atau lebih
            [.] = input hanya karakter '.'
            ? = memperbolehkan muncul 0 atau 1 kali
        */
        String regexFloatDouble = "\\d*[.]?\\d*";

        if (s.length() != 0 && Pattern.matches(regexFloatDouble, s) && Double.valueOf(s) > 0)
            cek = true;
        else
            cek = false;

        return cek;
    }

    public static boolean validasiInteger(String s){
        boolean cek;
         /*
            [1-9] = inputan angka diawali 1-9
             \d = input angka dari 0-9
             * = memperbolehkan muncul 1 kali atau lebih
        */
        String regexInt = "[1-9]\\d*";
        
        if (s.length() != 0 && Pattern.matches(regexInt, s) && Integer.valueOf(s) > 0)
            cek = true;
        else
            cek = false;
        
        return cek;
    }

    //Versi Lainnya
    public static boolean isValidInteger(String s) {
        int i; 
        //length digunakan untuk membaca panjang string
            for (i = 0; i < s.length(); i++){
                //mengecek 1 per 1 digit apakah angka atau bukan
                if (!Character.isDigit(s.charAt(i)))
                break;
            }
    
            if (i==s.length() && i > 0 && Integer.parseInt(s) > 0)
            return true;
            else
            return false;
    }
}
