/**
 * ridho_objek
 */
public class ridho_objek {

    String merkHp, warna, OS;
    int noSeri, ukuranLayar, harga;

    public ridho_objek(String merkHp, String OS, String warna, int noSeri, int ukuranLayar, int harga) {
        this.merkHp = merkHp;
        this.OS = OS;
        this.warna = warna;
        this.noSeri = noSeri;
        this.ukuranLayar = ukuranLayar;
        this.harga = harga;
    }

    public String getMerkHp() {
        return merkHp;
    }

    public void setMerkHp(String merkHp) {
        this.merkHp = merkHp;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String oS) {
        OS = oS;
    }

    public int getNoSeri() {
        return noSeri;
    }

    public void setNoSeri(int noSeri) {
        this.noSeri = noSeri;
    }

    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}