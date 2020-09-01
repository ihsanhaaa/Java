import java.io.*;

public class ValidasiAngka2{

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
                while (!Validasi.validasiInteger(angka));

                System.out.println("");

                do{
                    System.out.print("Masukkan angka bertipe data 'Double' : ");
                    angka = in.readLine();
                    }
                while (!Validasi.validasiDouble(angka));

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
}
