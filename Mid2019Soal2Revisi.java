import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Mid2019Soal2
 */
public class Mid2019Soal2Revisi {

    public static void main(String[] args) {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int loopProgram = 1;
        String jwbLoop = "";
        String sDanaAwal = "";
        String sPersenProfit = "";
        String sJInvestasi = "";
        long nilaiInvestasi = 0;
        short persenProfitMin = 7;
        short persenProfitMax = 0;
        int jInvestasi = 0;

        ArrayList<Forex> forex = new ArrayList<Forex>();
        long saldoAwal = 0;
        short persenPrediksi = 0;
        short nominalPrediksi = 0;
        long saldoAkhir = 0;

        while (loopProgram > 0) {
            System.out.println("Simulasi Share Profit Perdagangan Forex");
            // ------------------------------------------
            // Input Dana awal
            try {
                do {
                    System.out.print("Dana Awal : ");
                    sDanaAwal = input.readLine();
                    if (!validasiInput(sDanaAwal)) {
                        System.out.println("\t***Invalid Number***");
                    }
                } while (!validasiInput(sDanaAwal));

                // ubah ke int
                nilaiInvestasi = Long.parseLong(sDanaAwal);

            } catch (Exception e) {
                // TODO: handle exception
            }

            System.out.println("Persentase Profit Minimal (%) : " + persenProfitMin);

            // Input Persen Profit Max
            try {
                do {
                    System.out.print("Persentase Profit Maksimal (%) : ");
                    sPersenProfit = input.readLine();
                    if (!validasiInput(sPersenProfit) || !validasiInputMax(persenProfitMin, sPersenProfit)) {
                        System.out.println("\t***Invalid Number***");
                    }
                } while (!validasiInput(sPersenProfit) || !validasiInputMax(persenProfitMin, sPersenProfit));

                // ubah ke int
                persenProfitMax = Short.parseShort(sPersenProfit);

            } catch (Exception e) {
                // TODO: handle exception
            }

            // Input Jangka Waktu Investasi
            try {
                do {
                    System.out.print("Jangka Waktu Investasi (bulan) : ");
                    sJInvestasi = input.readLine();
                    if (!validasiInput(sJInvestasi)) {
                        System.out.println("\t***Invalid Number***");
                    }
                } while (!validasiInput(sJInvestasi));

                // ubah ke int
                jInvestasi = Integer.parseInt(sJInvestasi);

            } catch (Exception e) {
                // TODO: handle exception
            }

            saldoAwal = nilaiInvestasi;
            // Add to ArrayList
            for (int i = 0; i < jInvestasi; i++) {
                if (i > 0) {
                    saldoAwal += ((saldoAwal * persenPrediksi) / 100);
                }
                persenPrediksi = randomPersentase(persenProfitMin, persenProfitMax);
                forex.add(new Forex(saldoAwal, persenPrediksi));
            }

            // Cetak
            System.out.println("\nRincian prediksi hasil investasi :");
            System.out.println("------------------------------------------------------------------------");
            System.out.printf("|%10s| %13s| %13s| %13s| %13s|", "Bulan Ke-", "Saldo Awal", "%Profit", "Profit",
                    "Saldo Akhir");
            System.out.println();
            System.out.println("------------------------------------------------------------------------");
            for (int i = 0; i < forex.size(); i++) {
                System.out.format("|%10d| %,13d| %,13d| %,13d| %,13d|", i + 1, forex.get(i).getDanaAwal(),
                        forex.get(i).getPersenProfit(), forex.get(i).getNominalProfit(), forex.get(i).getDanaAkhir());
                System.out.println();
            }
            System.out.println("------------------------------------------------------------------------");

            // ------------------------------------------
            try {
                System.out.print("Simulasikan lagi ? (Y/N)");
                jwbLoop = input.readLine();
                if (jwbLoop.compareTo("Y") == 0 || jwbLoop.compareTo("y") == 0) {
                    loopProgram++;
                    forex.clear();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                } else {
                    System.out.println("Terima kasih");
                    break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }

    static boolean validasiInput(String s) {
        String polaInput = "[1-9]\\d*";

        if (s.length() != 0 && Pattern.matches(polaInput, s) && Long.parseLong(s) > 0) {
            return true;
        } else {
            return false;
        }

    }

    static boolean validasiInputMax(short min, String maks) {
        int max = Short.parseShort(maks);
        if (max > min) {
            return true;
        } else {
            return false;
        }
    }

    static short randomPersentase(short min, short max) {
        short persenPrediksi = (short) (Math.random() * ((max - min) + 1) + min);
        return persenPrediksi;
    }
}