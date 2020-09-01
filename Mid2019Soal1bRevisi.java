import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Mid2019Soal1b
 */
public class Mid2019Soal1bRevisi {

    static ArrayList<String> itemBiaya = new ArrayList<String>();

    public static void main(String[] args) {
        int jumInput = 4;
        int hitungJumInput = 0;
        int loopProgram = 1;
        String jwbLoop = "";
        String inputBiaya = "";

        ulang: while (loopProgram > 0) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Selamat pagi Nilson\nMasukkan nominal uang pengeluaran anda hari ini");
            tampilDataBiaya();

            try {
                ulangisi: while (hitungJumInput < jumInput) {
                    try {
                        do {
                            System.out.print("Pengeluaran ke-" + (itemBiaya.size() + 1) + " : ");
                            inputBiaya = input.readLine().trim();
                            boolean cekValidasi = validasiInput(inputBiaya);
                            if (!cekValidasi) {
                                System.out.println("\t***Maaf, input nominal uang pengeluaran ke-"
                                        + (itemBiaya.size() + 1) + " invalid***");
                            }
                        } while (!validasiInput(inputBiaya));
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    itemBiaya.add(inputBiaya);
                    hitungJumInput++;

                    if (hitungJumInput == jumInput) {
                        System.out.print(
                                "\nMenu Perintah :\n1. Input penambahan nominal uang pengeluaran\n2. Restart program\n3. Keluar dari Program\nPilihan Anda (input nomor) : ");
                        jwbLoop = input.readLine();
                        System.out.println("");
                        if (jwbLoop.compareTo("1") == 0) {
                            hitungJumInput = 0;
                            continue ulangisi;
                        } else if (jwbLoop.compareTo("2") == 0) {
                            loopProgram++;
                            hitungJumInput = 0;
                            itemBiaya.clear();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            continue ulang;
                        } else {
                            System.out.println("Daftar final nominal uang pengeluaran hari ini : ");
                            tampilDataBiaya();
                            System.out.println("\nTerima kasih Nilson");
                            loopProgram = 0;
                        }
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

        }

    }

    static void tampilDataBiaya() {
        int totalBiaya = 0;
        for (int i = 0; i < itemBiaya.size(); i++) {
            System.out.printf("%2d. %,13d", (i + 1), Integer.parseInt(itemBiaya.get(i)));
            totalBiaya += Integer.valueOf(itemBiaya.get(i));
            System.out.println();
        }
        if (itemBiaya.size() > 0) {
            System.out.printf("Total pengeluaran anda hari ini : %,13d ", totalBiaya);
        }
    }

    static boolean validasiInput(String s) {
        String regexInput = "[1-9]\\d{0,9}";
        if (s.length() != 0 && Pattern.matches(regexInput, s) && Integer.valueOf(s) > 0) {
            return true;
        } else {
            return false;
        }
    }
}