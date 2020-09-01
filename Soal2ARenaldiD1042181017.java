import java.io.*;
import java.util.ArrayList;

/**
 * Soal2ARenaldiD1042181017
 */
public class Soal2ARenaldiD1042181017 {

    public static void main(String[] args) {
        String inputdanaAwal = "";
        short inputProfitMinimal = 8; // batasan profit minimal sesuai 2 digit terakhir nim
        String inputProfitMaksimal = "";
        String inputJangkaWaktu = "";
        int danaAwal, profitMinimal, jangkaWaktu;

        boolean back = true;
        boolean back1 = true;
        boolean back2 = true;

        int index = 0;
        int loop = 1;
        int profitMaksimal = 0;

        ArrayList<ObjekSoalRenaldi> profitForex = new ArrayList<ObjekSoalRenaldi>();
        int saldoAwal = 0;
        int profitPersen = 0;
        int profit = 0;
        int saldoAkhir = 0;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (loop > 0) {
            System.out.println("Simulasi Share Profit Perdagangan Forex");

            // input dana awal
            try {
                do {
                    System.out.print("Dana Awal: ");
                    inputdanaAwal = input.readLine();
                    // validasi
                    if (inputdanaAwal.matches("[1-9]\\d*")) {
                        back = false;
                    } else {
                        System.out.println("\t" + "*** invalid number ***");
                    }
                    index++;
                } while (back);
            } catch (Exception err) {
                System.out.println("");
            }

            // profit persentase minimal
            System.out.println("Persentase Profit Minimal (%): " + 8);

            // input persentase profit maksimal
            try {
                do {
                    System.out.print("Persentase Profit Maksimal (%): ");
                    inputProfitMaksimal = input.readLine();
                    profitMinimal = Integer.valueOf(inputProfitMaksimal);
                    // validasi
                    if (inputProfitMaksimal.matches("[1-9]\\d*") && profitMinimal > inputProfitMinimal) {
                        back1 = false;

                    } else {
                        System.out.println("\t" + "*** invalid number ***");
                    }
                    loop = 0;
                    index = 0;
                } while (back1);
            } catch (Exception err) {
                System.out.println("");
            }

            // input jangka inputJangkaWaktu
            try {
                do {
                    System.out.print("Jangka Waktu Investasi (Bulan): ");
                    inputJangkaWaktu = input.readLine();
                    // validasi
                    if (inputJangkaWaktu.matches("[1-9]\\d*")) {
                        back2 = false;
                    } else {
                        System.out.println("\t" + "*** invalid number ***");
                    }
                    index++;
                } while (back2);
            } catch (Exception err) {
                System.out.println("");
            }

            danaAwal = Integer.valueOf(inputdanaAwal);
            profitMinimal = Short.valueOf(inputProfitMinimal);
            profitMaksimal = Short.valueOf(inputProfitMaksimal);
            jangkaWaktu = Integer.valueOf(inputJangkaWaktu);

            // rumus
            for (int i = 0; i < jangkaWaktu; i++) {
                saldoAwal = danaAwal;
                profitPersen = randomPersentase((short) profitMinimal, (short) profitMaksimal);
                profit = (saldoAwal * profitPersen) / 100;
                saldoAkhir = saldoAwal + profit;
                danaAwal = saldoAkhir;
                // rekam ke ArrayList
                profitForex.add(new ObjekSoalRenaldi(saldoAwal, profitPersen, profit, saldoAkhir));
            }

            // cetak hasil
            System.out.println("Rincian prediksi hasil investasi");
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("|%10s| %12s| %12s| %12s| %12s|", "Bulan Ke-", "Saldo Awal", "%Profit", "Profit",
                    "Saldo Akhir");
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
            for (int j = 0; j < profitForex.size(); j++) {
                System.out.printf("|%10d| %,12d| %,12d| %,12d| %,12d|", j + 1, profitForex.get(j).getSaldoAwal(),
                        profitForex.get(j).getProfitPersen(), profitForex.get(j).getProfit(),
                        profitForex.get(j).getSaldoAkhir());
                System.out.println();
            }
            System.out.println("--------------------------------------------------------------------");

            // pengulangan ulang
            try {
                System.out.println();
                System.out.print("Simulasikan lagi? (Y/N): ");
                String ulang = input.readLine();
                if ((ulang.compareTo("y") == 0) || (ulang.compareTo("Y") == 0)) {
                    profitForex.clear();
                    index = 0;
                    loop++;

                } else {
                    System.out.println("Terima Kasih");
                    break;
                }
            } catch (Exception err) {
                System.out.println();
            }
        }
    }

    // rumus random
    static short randomPersentase(short profitMinimal, short profitMaksimal) {
        short persenPrediksi = (short) (Math.random() * ((profitMaksimal - profitMinimal) + 1) + profitMinimal);
        return persenPrediksi;
    }

}