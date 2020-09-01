import java.io.*;
import java.util.ArrayList;


public class Soal2BAfrianiD1042181029 {
    public static void main(String[] args) {
        String inputDanaAwal= ""; 
        short inputpersentprofitMin = 9;
        String inputpersentprofitMaks = "";
        int Ulang = 1;
        boolean cek = true;
        boolean cek1 = true;
        boolean cek2 = true;
        String chosen="";
        String inputJangkaWaktu= "";
        int DanaAwal, persentprofitMin, persentprofitMaks, jangkaWaktu;

        ArrayList<ObjekSoal2BAfri> keuntungan = new ArrayList<ObjekSoal2BAfri>();
        int saldoAwal = 0;
        int persentaseProfit = 0;
        int profit = 0;
        int saldoAkhir = 0;
         
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
       ulang: while (Ulang > 0) { 
        System.out.println("Simulasi Share Profit Perdagangan Forex");

            
                
                
                // Input Dana Awal
        try {
            
            while (cek) {
                System.out.print("Dana Awal : ");
                inputDanaAwal = input.readLine();
                if (inputDanaAwal.matches("[1-9]\\d*")) {
                    cek = false;
                } else {

                    System.out.println("\t" + "*** invalid number ***");
                }
                }
        } catch (Exception e) {
            System.out.println(e);
        }
        // Profit minimal

            System.out.println("Persentase profit Minimal (%) : " + inputpersentprofitMin);
                
        // Input Profit Maksimal
           try{
            
            while (cek1) {
             System.out.print("Persentase Profit Maksimal (%): ");
                    inputpersentprofitMaks = input.readLine();
                   
                // validasi
                if (inputpersentprofitMaks.matches("[1-9]\\d*") && Integer.valueOf(inputpersentprofitMaks) > 9) {
                    cek1 = false;
                 } else {
                    System.out.println("\t" + "*** invalid number ***");
                }
                
            }       
                      }   catch (Exception e) {
                System.out.println(e);
            }
            
       
        
        // Input jangka waktu investasi
        try {
            
            while (cek2) {
                System.out.print("Jangka Waktu Investasi (bulan) : ");
                inputJangkaWaktu = input.readLine();
             // validasi
             if (inputJangkaWaktu.matches("[1-9]\\d*")) {
                cek2 = false;
            } else {

                System.out.println("\t" + "*** invalid number ***");
            }
           
        }
            } catch (Exception e) {
            System.out.println(e);
        }

        DanaAwal = Integer.valueOf(inputDanaAwal);
        persentprofitMin = Integer.valueOf(inputpersentprofitMin);
        persentprofitMaks = Integer.valueOf(inputpersentprofitMaks); 
        jangkaWaktu = Integer.valueOf(inputJangkaWaktu);
        

        
            // Perhitungan
            
            for (int i = 0; i < jangkaWaktu; i++) {
            saldoAwal = (int) DanaAwal;
            persentaseProfit = randomPersentase((short) persentprofitMin, (short) persentprofitMaks);
            profit =  (int)(saldoAwal*persentaseProfit)/100;
            saldoAkhir = saldoAwal + profit;
            DanaAwal = saldoAkhir;
            
            
            //rekam ke arraylist
            keuntungan.add(new ObjekSoal2BAfri(saldoAwal, persentaseProfit, profit, saldoAkhir));
        }

        //cetak hasilnya
        System.out.println("\nRincian prediksi hasil investasi :");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("|%10s| %12s| %12s| %12s| %12s|","Bulan Ke-", "Saldo Awal", "%Profit", "Profit","Saldo Akhir");
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        for (int j = 0; j < keuntungan.size();j++){
            System.out.format("|%10d| %,12d| %,12d| %,12d| %,12d|",
                 j+1, 
                 keuntungan.get(j).getSaldowal(), 
                 keuntungan.get(j).getPersenprofit(), 
                 keuntungan.get(j).getHslprofit(),
                 keuntungan.get(j).getSaldokhir()
            );
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------");
    
    // pengulangan y/n
    try {
        System.out.println();
        System.out.print("Simulasikan lagi? (Y/N): ");
        chosen = input.readLine();
        if (chosen.compareTo("Y") == 0 || chosen.compareTo("y") == 0) {
            
            
            keuntungan.clear();
            Ulang++;

            continue ulang;
            
        } else {
            System.out.println("The end");
            break;
            
        }
    } catch (Exception e) {
        System.out.println();}
    }
}
    

    //fungsi untuk memperoleh nilai acak
    static short randomPersentase(short persentprofitMin, short persentprofitMaks)
    {
        short persenPrediksi = (short) (Math.random()*((persentprofitMaks-persentprofitMin)+1)+persentprofitMin);
        return persenPrediksi;
    }
}