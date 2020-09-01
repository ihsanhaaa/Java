public class Latihan_Mandiri_1 {
    public static void main(String[] args) {
        // input
        String NamaPengirim = "Stark Inc";
        String AlamatPengirim = "Tengah Kota";
        String NamaPenerima = "Tony Stark";
        String AlamatPenerima = "Tepian Laut";
        char kode = 'J';
        int BeratKiriman = 5;
        int TarifPerKg = 3500;
        String KotaTujuan = " ";
        int BiayaKiriman;
        int Pembayaran;
        int BiayaPacking = 2000;
        int untung;

        if (kode == 'J') {
            KotaTujuan = "Jakarta";
            TarifPerKg = 3500;
        } else if (kode == 'B') {
            KotaTujuan = "Bandung";
            TarifPerKg = 4500;
        } else if (kode == 'C') {
            KotaTujuan = "Cirebon";
            TarifPerKg = 3000;
        } else if (kode == 'T') {
            KotaTujuan = "Tanggerang";
            TarifPerKg = 4000;
        }

        BiayaKiriman = (BeratKiriman * BiayaPacking);
        if (BeratKiriman > 30) {
            // Ubah biaya packing = 10.000
            BiayaKiriman = BeratKiriman * 10000;
        }
        Pembayaran = (BiayaKiriman + TarifPerKg);
        untung = Pembayaran / 2;
        System.out.println("Nama Pengirim \t\t:" + NamaPengirim);
        System.out.println("Alamat Pengirim \t:" + AlamatPengirim);
        System.out.println("Nama Penerima \t\t:" + NamaPenerima);
        System.out.println("Alamat Penerima \t:" + AlamatPenerima);
        System.out.println("Kode \t\t\t:" + kode);
        System.out.println("Kota Tujuan \t\t:" + KotaTujuan);
        System.out.println("Alamaat Tujuan \t\t:" + AlamatPenerima);
        System.out.println("Tarif Per Kg \t\t:" + TarifPerKg);
        System.out.println("Berat Kiriman \t\t:" + BiayaKiriman);
        System.out.println("Pembayaran\t\t: " + Pembayaran);
        System.out.println("Keuntungan Perusahaan 50% dari pembayaran \t: " + untung);

    }
}
