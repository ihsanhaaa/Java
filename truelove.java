import java.io.*;

public class truelove {
    public static void main(String[] args) {
        int b = 1;
        while (b > 0) {
            BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
            String pria = "";
            String wanita = "";
            try {
                System.out.print("Masukkan nama pria :");
                pria = datain.readLine().toUpperCase();
                System.out.print("Masukkan nama wanita :");
                wanita = datain.readLine().toUpperCase();
            } catch (IOException e) {
            }
            ;
            System.out.println("");
            String iseng = "TRUELOVE";
            String gabung = pria.concat(wanita);
            char[] ch = gabung.toCharArray();
            char[] v = iseng.toCharArray();
            int[][] hi = new int[8][8];
            int hasil;

            for (int j = 0; j < v.length; j++) {
                for (int i = 0; i < ch.length; i++) {
                    if (v[j] == ch[i]) {
                        hi[0][j] = hi[0][j] + 1;
                    }
                }
                System.out.print(v[j] + " ");
            }
            System.out.println('\n');
            for (int k = 0; k < v.length - 1; k++) {
                for (int a = 0; a < (v.length - k); a++) {
                    if (k == 0) {
                        System.out.print(hi[k][a] + " ");
                    } else {
                        hi[k][a] = (hi[k - 1][a] + hi[k - 1][a + 1]) % 10;
                        System.out.print(hi[k][a] + " ");
                    }
                }
                System.out.println("");
                if (k == v.length - 2) {
                    System.out.println('\n');
                    hasil = (hi[k][0] * 10) + hi[k][1];
                    System.out.println("Kecocokan " + pria + " -- " + wanita + " : " + hasil + "%");
                }
            }
            System.out.println('\n');
            try {
                System.out.print("Apakah Anda ingin mengulangi? (Y/N)");
                String jwb = datain.readLine();
                if ((jwb.compareTo("y") == 0) || (jwb.compareTo("Y") == 0)) {
                    b++;
                } else {
                    System.out.println("Terima Kasih");
                    break;
                }
            } catch (IOException e) {
            }
        }
    }
}