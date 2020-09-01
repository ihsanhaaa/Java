import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dellyDiah {
    public static void main(String[] args) {
        String nama = "", tanggal = "", kamar = "", pilih = "";
        int jenis = 0, Nomor = 0, Nomor2 = 0, Nomor3 = 0, status = 0, lama = 0, tarif = 0;
        String ruangan = "";
        String namakamar = "";
        double diskon = 0, bayar = 0;
        String stglAwal = "";
        String stglAkhir = "";
        DateFormat dateAwal = new SimpleDateFormat("dd MMM yyyy");
        DateFormat dateAkhir = new SimpleDateFormat("dd MMM yyyy");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // input
        System.out.println("--**-- SISTEM INFORMASI PERHOTELAN --**--");
        System.out.print("Nama Pelanggan \t\t\t: ");
        try {
            nama = br.readLine();
        } catch (IOException e) {
        }

        // masukkan tanggal
        System.out.print("Tanggal check-in (Contoh : 10 Apr 2019) \t: ");
        try {
            stglAwal = br.readLine();
        } catch (IOException e) {
        }
        System.out.print("Tanggal check-out (Contoh : 30 Jul 2019) \t: ");
        try {
            stglAkhir = br.readLine();
        } catch (IOException e) {
        }

        try {
            Date tglAwal = dateAwal.parse(stglAwal);
            Date tglAkhir = dateAkhir.parse(stglAkhir);

            Date TGLAwal = tglAwal;
            Date TGLAkhir = tglAkhir;
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(TGLAwal);
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(TGLAkhir);

            String hasil = String.valueOf(daysBetween(cal1, cal2));

            System.out.println("Tanggal Awal  = " + stglAwal);
            System.out.println("Tanggal Akhir = " + stglAkhir);
            String hasil2 = hasil;
            System.out.println("Selisih: " + hasil2 + " hari");
            lama = getStrToInt(hasil);
        } catch (ParseException e) {
        }

        System.out.println("\nPilih Jenis Kamar");
        System.out.println("1. Deluxe Room Rp 275.000/hari");
        System.out.println("2. Suite Room Rp 300.000/hari");
        System.out.println("3. President Room Rp 370.000/hari");
        System.out.print("Jenis kamar yang dipesan \t: ");
        try {
            pilih = br.readLine();
        } catch (NumberFormatException e) {
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        switch (pilih) {

        case "1":
            System.out.println("\nNomor kamar Deluxe Room ");
            System.out.println("1. D1");
            System.out.println("2. D2");
            System.out.println("3. D3");
            System.out.println("4. D4");
            System.out.println("5. D5");
            namakamar = "Deluxe Room";
            System.out.println("Masukkan Nomor Kamar");

            try {
                Nomor = Integer.parseInt(br.readLine());

                if (Nomor == 1) {
                    System.out.println("Anda memilih D1");
                    ruangan = "D1";
                }
                if (Nomor == 2) {
                    System.out.println("Anda memilih D2");
                    ruangan = "D2";
                }
                if (Nomor == 3) {
                    System.out.println("Anda memilih D3");
                    ruangan = "D3";
                }
                if (Nomor == 4) {
                    System.out.println("Anda memilih D4");
                    ruangan = "D4";
                }
                if (Nomor == 5) {
                    System.out.println("Anda memilih D5");
                    ruangan = "D5";

                }
            } catch (Exception e) {
                System.out.println("Error");
            }
            break;

        case "2":
            System.out.println("\nNomor kamar Suite Room");
            System.out.println("1. S1");
            System.out.println("2. S2");
            System.out.println("3. S3");
            System.out.println("4. S4");
            System.out.println("5. S5");
            namakamar = "Suite Room";
            System.out.println("Masukkan Nomor Kamar");

            try {
                Nomor = Integer.parseInt(br.readLine());

                if (Nomor == 1) {
                    System.out.println("Anda memilih S1");
                    ruangan = "S1";
                }
                if (Nomor == 2) {
                    System.out.println("Anda memilih S2");
                    ruangan = "S2";
                }
                if (Nomor == 3) {
                    System.out.println("Anda memilih S3");
                    ruangan = "S3";
                }
                if (Nomor == 4) {
                    System.out.println("Anda memilih S4");
                    ruangan = "S4";
                }
                if (Nomor == 5) {
                    System.out.println("Anda memilih S5");
                    ruangan = "S5";
                }
            } catch (Exception e) {
                System.out.println("Error");
            }
            break;

        case "3":
            System.out.println("\nNomor kamar President Room");
            System.out.println("1. P1");
            System.out.println("2. P2");
            System.out.println("3. P3");
            namakamar = "President Room";
            System.out.println("Masukkan Nomor Kamar");

            try {
                Nomor = Integer.parseInt(br.readLine());

                if (Nomor == 1) {
                    System.out.println("Anda memilih P1");
                    ruangan = "P1";
                }
                if (Nomor == 2) {
                    System.out.println("Anda memilih P2");
                    ruangan = "P2";
                }
                if (Nomor == 3) {
                    System.out.println("Anda memilih P3");
                    ruangan = "P3";
                }
            } catch (Exception e) {
                System.out.println("Error");
            }
            break;
        }
        // proses perhitungan
        if (Nomor == 1) {

            tarif = lama * 275000;
            kamar = "Deluxe Room";
        } else if (Nomor == 2) {
            tarif = lama * 300000;
            kamar = "Suite Room";
        } else if (Nomor == 3) {
            tarif = lama * 375000;
            kamar = "President Room";
        }
        // proses perhitungan
        /*
         * if (jenis == 1) { tarif = lama * 275000; kamar = "Deluxe Room"; } else if
         * (jenis == 2) { tarif = lama * 300000; kamar = "Suite Room"; } else if (jenis
         * == 3) { tarif = lama * 375000; kamar = "President Room"; }
         */
        // Status pelanggan
        System.out.println("\nStatus Pelanggan");
        System.out.println("1. Member");
        System.out.println("2. Non Member");
        System.out.print("Pilih status pelanggan \t\t: ");
        try {
            status = Integer.parseInt(br.readLine());
        } catch (Exception e) {

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
        System.out.println("Jenis Kamar \t\t\t: " + namakamar);
        System.out.println("Nomor Kamar \t\t\t: " + ruangan);
        System.out.println("Tarif Penginapan \t\t: Rp " + tarif + ",-");
        System.out.println("Diskon Menginap \t\t: Rp " + diskon + ",-");
        System.out.println("Nominal yang harus dibayar \t: Rp " + bayar + ",-");
        System.out.println("====================================================");
    }

    private static int getStrToInt(String n) {
        return Integer.parseInt(n);
    }

    private static long daysBetween(Calendar tanggalAwal, Calendar tanggalAkhir) {
        long lama = 0;
        Calendar tanggal = (Calendar) tanggalAwal.clone();
        while (tanggal.before(tanggalAkhir)) {
            tanggal.add(Calendar.DAY_OF_MONTH, 1);
            lama++;
        }
        return lama;
    }
}
