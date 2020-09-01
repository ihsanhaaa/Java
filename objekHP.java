/**
 * ridhoObjek2
 */
public class objekHP {

    String merek, warna, sistemOperasi;
    int memori, ukuran, harga;

    public objekHP(String merek, String warna, String sistemOperasi, int memori, int ukuran, int harga) {
        this.merek = merek;
        this.warna = warna;
        this.sistemOperasi = sistemOperasi;
        this.memori = memori;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getSistemOperasi() {
        return sistemOperasi;
    }

    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }

    public int getMemori() {
        return memori;
    }

    public void setMemori(int memori) {
        this.memori = memori;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
