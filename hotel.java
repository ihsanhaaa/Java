import java.io.*;

class hotel {
    public static void main(String[] args) throws IOException {
        String nama = "", tanggal = "", kamar = "";
        int jenis = 0, status = 0, lama = 0, tarif = 0;
        double diskon = 0, bayar = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // input
        System.out.println("--**-- SISTEM INFORMASI PERHOTELAN --**--");
        System.out.print("Nama Pelanggan \t\t\t: ");
        nama = br.readLine();
        System.out.print("tanggal check-in \t\t:");
        tanggal = br.readLine();
        System.out.print("tanggal check-out \t\t:");
        tanggal = br.readLine();

        System.out.print("\nLama Menginap \t\t\t: ");
        lama = Integer.parseInt(br.readLine());

        System.out.println("\nPilih Jenis Kamar");
        System.out.println("1. Deluxe Room Rp 275.000/hari");
        System.out.println("2. Suite Room Rp 300.000/hari");
        System.out.println("3. President Room Rp 370.000/hari");
        System.out.print("Jenis kamar yang dipesan \t: ");
        jenis = Integer.parseInt(br.readLine());

        // Deluxe Room
        System.out.println("\nNomor kamar");
        System.out.println("1. D1");
        System.out.println("2. D2");
        System.out.println("3. D3");
        System.out.println("4. D4");
        System.out.println("5. D5");

        System.out.println("\nStatus Pelanggan");
        System.out.println("1. Member");
        System.out.println("2. Non Member");
        System.out.print("Pilih status pelanggan \t\t: ");
        status = Integer.parseInt(br.readLine());

        // proses perhitungan
        if (jenis == 1) {
            tarif = lama * 275000;
            kamar = "Deluxe Room";
        } else if (jenis == 2) {
            tarif = lama * 300000;
            kamar = "Suite Room";
        } else if (jenis == 3) {
            tarif = lama * 375000;
            kamar = "President Room";
        }
        if (status == 1) {
            if (lama >= 4 && lama <= 7) {
                diskon = 0.20 * tarif;
            } else if (lama > 7) {
                diskon = 0.35 * tarif;
            }
        } else if (status == 2) {
            if (lama >= 4 && lama <= 7) {
                diskon = 0.10 * tarif;
            } else if (lama > 7) {
                diskon = 0.15 * tarif;
            }
        }

        bayar = tarif - diskon;

        // output
        System.out.println("\n\n---***--- NOTA PEMBAYARAN HOTEL CONTOH123 ---***---");
        System.out.println("Nama Pelanggan \t\t\t: " + nama);
        System.out.println("Jenis Kamar \t\t\t: " + kamar);
        System.out.println("Tarif Penginapan \t\t: Rp " + tarif + ",-");
        System.out.println("Diskon Menginap \t\t: Rp " + diskon + ",-");
        System.out.println("Nominal yang harus dibayar \t: Rp " + bayar + ",-");
        System.out.println("====================================================");
    }
}
