/**
 * objekbuku
 */
public class objekbuku {

    String judul, pengarang;
    int tahun_terbit, harga;

    public objekbuku(String judul, String pengarang, int tahun_terbit, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun_terbit = tahun_terbit;
        this.harga = harga;
    }

    /**
     * @return the judul
     */
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * @return the pengarang
     */
    public String getPengarang() {
        return pengarang;
    }

    /**
     * @param pengarang the pengarang to set
     */
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    /**
     * @return the tahun_terbit
     */
    public int getTahun_terbit() {
        return tahun_terbit;
    }

    /**
     * @param tahun_terbit the tahun_terbit to set
     */
    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }
}