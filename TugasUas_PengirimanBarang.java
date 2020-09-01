import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TugasUas_PengirimanBarang {
    static ArrayList<String> namaKota = new ArrayList<String>();

    public static void main(String[] args) {

        // input
        String NamaPengirim = "";
        // "Stark Inc";
        String AlamatPengirim = "";
        // "Tengah Kota";
        String NamaPenerima = "";
        // "Tony Stark";
        String AlamatPenerima = "";
        // "Tepian Laut";
        // String kode = "";
        int BeratKiriman = 0;
        int TarifPerKg = 2000;
        // int Tarif30kg = 10000;
        String KotaAsal = "";
        String KotaTujuan = " ";
        int BiayaKiriman;
        int Pembayaran;
        int BiayaPacking = 5000;
        int untung;
        String name1;
        String number1;
        int menu = 1;
        int barang1 = 1;
        String login = "";
        String pilih = "";
        String jenisbrg = "";
        String jenisbrg1 = " Elektronik ";
        String jenisbrg2 = " Perlengkapan ";
        String jenisbrg3 = " Edukasi ";
        int jumlah = 1;
        String keluar = "";
        // int mencari = 1;
        String menucari = "";
        // String name1 = "";

        BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader dataku = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("");

        System.out.println("Selamat datang di Michael & Shanty Inc. ");
        System.out.println("");
        System.out.println("Khusus Kota Pontianak,Surabaya dan Batam Kami Ada harga Spesial Loh");
        System.out.println("Silahkan Lihat Menu Pencarian dan cari Harga Spesial");
        System.out.println("Jangan Sampai Ketinggalan !!!");
        System.out.println("");
        System.out.println("Setiap barang Berat 1kg = Rp.2000 untuk berat lebih dari 30kg = Rp.10000");
        System.out.println("Untuk Pengemasan \nBerat 1kg = Rp.5000 untuk berat lebih dari 30kg = Rp.30000");
        // String name = "";
        // String nama = "";
        System.out.println("");
        // membuat menu awal untuk memulai memakai aplikasi
        // cari: while (mencari > 0)

        masuk: while (jumlah > 0)
            try {
                System.out.println("Tampilan Aplikasi : ");
                System.out.println("1. Masuk ");
                System.out.println("2. Menu Pencarian");
                System.out.println("3. Riwayat Pengiriman");
                System.out.println("4. Keluar");

                try {
                    System.out.print("Pilih Menu Aplikasi : ");
                    login = keyboard.readLine();
                } catch (IOException err) {
                    System.out.println("");
                }

                switch (login) {
                case "1":
                    System.out.print("Masukkan Nama Pengirim: ");
                    // try 1 masukkan Nama pengirim
                    try {
                        NamaPengirim = datain.readLine();

                    } catch (IOException e) {
                        System.out.println("Error!");
                    }
                    // try 2 masukkan Nama penerima

                    // ==
                    System.out.print("Kota Asal : ");
                    // try 1 masukkan Nama pengirim
                    try {
                        KotaAsal = datain.readLine();
                    } catch (IOException e) {
                        System.out.println("Error!");
                    }
                    System.out.print("Masukkan Alamat Pengirim: ");
                    try {
                        AlamatPengirim = datain.readLine();

                    } catch (IOException e) {
                        System.out.println("Error!");
                    }
                    // try 2 masukkan Nama penerima
                    System.out.print("Masukkan Nama Penerima: ");
                    try {
                        NamaPenerima = datain.readLine();
                    } catch (IOException e) {
                        System.out.println("Error!");
                    }

                    System.out.print("Kota Tujuan: ");
                    try {
                        KotaTujuan = datain.readLine();
                        /*
                         * if (KotaTujuan.matches("[Pontianak]")) { HargaKirim = 8000; break;
                         * 
                         * } if (KotaTujuan.matches("[Surabaya]")) { HargaKirim = 8700; break;
                         * 
                         * } if (KotaTujuan.matches("[Batam]")) { HargaKirim = 9400; break;
                         * 
                         * }
                         */
                    } catch (IOException e) {
                        System.out.println("Error!");
                    }
                    // batas

                    // try 3 masukkan Alamat penerima
                    System.out.print("Masukkan Alamat Penerima: ");
                    try {
                        AlamatPenerima = datain.readLine();
                    } catch (IOException e) {
                        System.out.println("Error!");
                    }
                    System.out.println();
                    System.out.println(
                            " Jenis Barang yang dapat dikirim \n A = Elektronik \n B = Perlengkapan \n C = Edukasi");
                    System.out.println();
                    System.out.print("Masukkan Jenis Barang ");
                    jumlah = 0;
                    break;
                // menu pencarian
                case "2":

                    System.out.println("2. Menu Pencarian");
                    System.out.println("Berikut Daftar Kata Kunci Pencarian");

                    System.out.println("A. Kota Favorit         | B. Kota Termurah      | C. Jenis Kiriman ");
                    System.out.println("D. Jumlah Kiriman       | E. Harga Spesial      | F. Tarif per Kg ");

                    try {
                        menucari = keyboard.readLine();

                        if (menucari.matches("[A,a,Kota Favorit]++")) {
                            System.out.println("");
                            System.out.println("Kota Favorit Pengiriman");
                            System.out.println("1. Jakarta \t 2. Bandung \t 3. Pontianak");
                            System.out.println("=================================");
                            break;

                        }
                        if (menucari.matches("[B,b,Kota Termurah]++")) {
                            System.out.println("");
                            System.out.println("Kota Termurah Pengiriman");
                            System.out.println("1. Pontianak \t 2. Surabaya \t 3. Batam");
                            System.out.println("=================================");
                            break;

                        }
                        if (menucari.matches("[C,c,Jenis Kiriman]++")) {
                            System.out.println("");
                            System.out.println("Jenis Kiriman Terbanyak");
                            System.out.println("1. Edukasi \t 2. Elektronik \t 3. Perlengkapan");
                            System.out.println("=================================");
                            break;
                        }
                        if (menucari.matches("[D,d,Jumlah Kiriman]++")) {
                            System.out.println("");
                            System.out.println("Jumlah Kiriman Terbanyak");
                            System.out.println(
                                    "1.Kota Jakarta = 290 Kiriman \t 2. Bandung = 268 Kiriman \t 3. Pontianak = 199 Kiriman");
                            System.out.println("=================================");
                            break;
                        }
                        if (menucari.matches("[E,e,Harga Kirim,Harga Spesial]++")) {
                            System.out.println("");
                            System.out.println("Harga Kirim Pengemasan di atas 30kg");
                            System.out.println(
                                    "1. Pontianak = Rp.28.000 \t 2. Surabaya = Rp.28.700 \t 3. Batam = 29.400");
                            System.out.println("=================================");
                            break;

                        }
                        if (menucari.matches("[F,f,Tarif per Kg]++")) {
                            System.out.println("");
                            System.out.println("Kami memberlakukan sama untuk setiap jenis kiriman Rp.2.000 per kg");
                            System.out.println(
                                    "Apabila berat barang lebih dari 30kg tarif per Kg naik menjadi Rp. 10.000");
                            System.out.println("=================================");
                            break;
                        }
                        // "[A,a,A.,a.,Favorit,favorit,fav,KotaFavorit,KotaFav,kotafavorit,B,b,B.,b.,murah,kotamurah,kotamurah,KotaMurah,C,c,C.,c.,banyak,Banyak,Terbanyak,Kotaterbanyak,kotaterbanyak,KotaTerbanyak]+"))
                        // {

                        if (!menucari.matches("[A,a,B,b,C,c,D,d,E,e,F,f]+")) {
                            System.out.println("Maaf yang anda cari tidak dapat ditemukan");
                            break;
                        }
                    } catch (Exception e) {

                    }
                    continue masuk;
                // pilihan menu ke dua menampilkan kota terbanyak di pakai
                case "3":
                    System.out.println("Kota riwayat pengiriman :");
                    System.out.println("");
                    tampilData();

                    continue masuk;
                // NamaKota.add("Singkawang");
                case "4":
                    // menu keluar maka semua menjadi (nol) 0
                    jumlah = 0;
                    barang1 = 0;
                    menu = 0;
                    TarifPerKg = 0;
                    BiayaPacking = 0;
                    System.out.println("");
                    break;

                }

            } catch (

            Exception e) {
                //
            }

        /*
         * harga: while (pilih > 0) { if (kode == "J && j") { KotaTujuan = "Jakarta";
         * TarifPerKg = 3500; } else if (kode == "B") { KotaTujuan = "Bandung";
         * TarifPerKg = 4500; } else if (kode == "C") { KotaTujuan = "Cirebon";
         * TarifPerKg = 3000; } else if (kode == "T") { KotaTujuan = "Tanggerang";
         * TarifPerKg = 4000; } }
         */
        // masukkan menu pencarian

        // batas
        jenis: while (barang1 > 0)

            try {
                name1 = keyboard.readLine();
                // if (!name1.matches("[a-zA-Z_]+")) {
                // System.out.println("Invalid name");
                // }
                if (name1.matches("[a,A,Elektronik]++")) {
                    System.out.println("Anda Memilih Elektronik");
                    barang1 = 0;
                    jenisbrg1 = "Elektronik";
                    jenisbrg = jenisbrg1;
                    break;
                }
                if (name1.matches("[b,B,Perlengkapan]++")) {
                    System.out.println("Anda Memilih Perlengkapan");
                    barang1 = 0;
                    jenisbrg2 = "Perlengkapan";
                    jenisbrg = jenisbrg2;
                    break;
                }
                if (name1.matches("[c,C,Edukasi]++")) {
                    System.out.println("Anda Memilih Edukasi");
                    barang1 = 0;
                    jenisbrg3 = "Edukasi";
                    jenisbrg = jenisbrg3;
                    break;
                }
                if (!name1.matches("[a,b,c,A,B,C_]+")) {
                    System.out.println(" Pilih Jenis Barang Anda");
                    continue jenis;
                }
            } catch (IOException e1) {
            }
        // String number1;

        System.out.println("");
        // namaKota.add("Jakarta");
        // namaKota.add("Bandung");

        harga: while (menu > 0) {

            System.out.println("Menu Perintah: ");
            System.out.println("1. Masukkan Jumlah Berat");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Riwayat Pengiriman");
            System.out.println("4. Keluar dan Cetak Kiriman");

            /*
             * if (!pilih.matches("[1,2,3]+")) { System.out.println(""); continue harga; }
             */
            try {
                System.out.print("Pilih menu : ");
                pilih = keyboard.readLine();
            } catch (IOException err) {
                System.out.println("");
            }

            switch (pilih) {

            case "1":
                System.out.print("Masukkan Jumlah Berat dalam angka (Kg): ");

                try {
                    number1 = keyboard.readLine();
                    if (!number1.matches("[1-9,0_]+")) {

                        System.out.print("Masukkan jumlah berat : " + number1 + " kg ");
                        System.out.println("");
                        continue harga;
                    }
                    System.out.println("Jumlah berat = " + number1 + "kg ");
                    BeratKiriman = Integer.valueOf(number1);
                } catch (Exception e) {
                }
                // BeratKiriman = Integer.valueOf(number1);
                // if (!number1.matches("[0-9]+")) {
                // System.out.println("Invalid number");
                // }

                menu++;
                break;

            // continue harga;
            case "2":
                BiayaKiriman = (BeratKiriman * TarifPerKg);

                if (BeratKiriman > 30) {
                    // Ubah biaya packing = 10.000
                    BiayaKiriman = BeratKiriman * 10000;
                    TarifPerKg = 10000;
                    BiayaPacking = 0;
                    if (KotaAsal.matches("[Pontianak]++")) {
                        BiayaPacking = 28000;

                    }
                    if (KotaAsal.matches("[Surabaya]++")) {
                        BiayaPacking = 28700;

                    }
                    if (KotaAsal.matches("[Batam]++")) {
                        BiayaPacking = 29400;

                    }
                    if (!KotaAsal.matches("[Pontianak,Surabaya,Batam]++")) {
                        BiayaPacking = 30000;

                    }
                }
                System.out.println("===================================");
                System.out.println("Daftar Transaksi Anda");
                System.out.println("===================================");
                Pembayaran = (BiayaKiriman + BiayaPacking);
                untung = Pembayaran / 2;
                System.out.println("Nama Pengirim \t\t:" + NamaPengirim);
                System.out.println("Kota Asal Pengirim \t:" + KotaAsal);
                System.out.println("Alamat Pengirim \t:" + AlamatPengirim);
                System.out.println(" ");
                System.out.println("Nama Penerima \t\t:" + NamaPenerima);
                System.out.println("Kota Tujuan \t\t:" + KotaTujuan);
                System.out.println("Alamat Penerima \t:" + AlamatPenerima);
                System.out.println("Jenis Barang \t\t:" + jenisbrg);
                System.out.println("Berat \t\t\t:" + BeratKiriman + " kg ");
                System.out.println("Tarif Per Kg \t\t:" + "Rp." + TarifPerKg);
                System.out.println("Jumlah Biaya \t\t:" + BiayaKiriman + " kg");
                System.out.println("Biaya Kemas \t\t:" + BiayaPacking);
                System.out.println("===$=============================$===");
                System.out.println("Pembayaran \t\t:" + "Rp." + Pembayaran);
                System.out.println("===#=============================#===");

                continue harga;
            case "3":
                System.out.println("");

                System.out.println("Kota hasil Pengiriman :");
                System.out.println("Kota " + KotaAsal);
                System.out.println("Kota " + KotaTujuan);
                System.out.println("");
                // tampilData();
                break;

            case "4":

                System.out.println("");

                try {
                    System.out.print("Anda Yakin ingin keluar ? (Y/N)");
                    keluar = keyboard.readLine();
                    if// (keluar.matches("Y,y"))
                    (keluar.compareTo("Y") == 0 || keluar.compareTo("y") == 0) {
                        System.out.println("Terima kasih");
                        jumlah = 0;
                        menu = 0;
                        break;
                    } else {

                        jumlah++;
                        // index = 0;
                        continue harga;

                    }
                } catch (Exception e) {
                }

            }
        }

        // batas
        // boolean isWordOnly = Pattern.matches("\w*", name1); //name is in your code
        // boolean isFloatOnly = Pattern.matches("\d*.?\d*", number); //number is in
        // your code too
        /*
         * try { kode = datain.readLine(); } catch (IOException e) {
         * System.out.println("Error!"); }
         */

        // BiayaKiriman = (BeratKiriman * BiayaPacking);
        BiayaKiriman = (BeratKiriman * TarifPerKg);
        if (BeratKiriman > 30) {
            // Ubah biaya packing = 10.000
            BiayaKiriman = BeratKiriman * 10000;
            TarifPerKg = 10000;
            BiayaPacking = 0;
            if (KotaAsal.matches("[Pontianak]++")) {
                BiayaPacking = 28000;

            }
            if (KotaAsal.matches("[Surabaya]++")) {
                BiayaPacking = 28700;

            }
            if (KotaAsal.matches("[Batam]++")) {
                BiayaPacking = 29400;

            }
            if (!KotaAsal.matches("[Pontianak,Surabaya,Batam]++")) {
                BiayaPacking = 30000;

            }
        }
        Pembayaran = (BiayaKiriman + TarifPerKg);
        untung = Pembayaran / 2;
        System.out.println("===================================");
        System.out.println("Daftar Transaksi Anda");
        System.out.println("===================================");
        Pembayaran = (BiayaKiriman + BiayaPacking);
        untung = Pembayaran / 2;
        System.out.println("        Tampilan Untuk Pengguna ");
        System.out.println("Nama Pengirim \t\t:" + NamaPengirim);
        System.out.println("Kota Asal Pengirim \t:" + KotaAsal);
        System.out.println("Alamat Pengirim \t:" + AlamatPengirim);
        System.out.println("Nama Penerima \t\t:" + NamaPenerima);
        System.out.println("Kota Tujuan \t\t:" + KotaTujuan);
        System.out.println("Alamat Penerima \t:" + AlamatPenerima);
        System.out.println("Jenis Barang \t\t:" + jenisbrg);
        System.out.println("Berat \t\t\t:" + BeratKiriman + " kg ");
        System.out.println("Tarif Per Kg \t\t:" + "Rp." + TarifPerKg);
        System.out.println("Jumlah Biaya \t\t:" + BiayaKiriman + " kg");
        System.out.println("Biaya Kemas \t\t:" + BiayaPacking);
        System.out.println("===================================");
        System.out.println("Pembayaran \t\t:" + "Rp." + Pembayaran);
        System.out.println("===================================");
        System.out.println("        Tampilan Untuk Perusahaan ");
        System.out.println("Nama Pengirim \t\t:" + NamaPengirim);
        System.out.println("Kota Asal Pengirim \t:" + KotaAsal);
        System.out.println("Alamat Pengirim \t:" + AlamatPengirim);
        System.out.println("Nama Penerima \t\t:" + NamaPenerima);
        System.out.println("Kota Tujuan \t\t:" + KotaTujuan);
        System.out.println("Alamat Penerima \t:" + AlamatPenerima);
        System.out.println("Jenis Barang \t\t:" + jenisbrg);
        System.out.println("Berat \t\t\t:" + BeratKiriman + " kg ");
        System.out.println("Tarif Per Kg \t\t:" + "Rp." + TarifPerKg);
        System.out.println("Jumlah Biaya \t\t:" + BiayaKiriman + " kg");
        System.out.println("Biaya Kemas \t\t:" + BiayaPacking);
        System.out.println("===================================");
        System.out.println("Pembayaran \t\t:" + "Rp." + Pembayaran);
        System.out.println("===================================");
        System.out.println("Keuntungan Perusahaan 50% dari pembayaran \t: " + "Rp." + untung);
        System.out.println("===================================");
        System.out.println(" ");
        System.out.println("=============== License by Company Series V1.1 ====================");
    }

    private static void tampilData() {
        for (int i = 0; i < namaKota.size(); i++) {
            // get(nomor_index) berfungsi untuk mengambil nilai Array berdasarkan indeks
            System.out.println("\t" + (i + 1) + ". " + namaKota.get(i));
        }
    }
}
