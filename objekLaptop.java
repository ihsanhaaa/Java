/**
 * objekLaptop
 */
public class objekLaptop {

    String merk, warna;
    int harga, ukuran_layar;

    public objekLaptop(String merk, String warna, int harga, int ukuran_layar) {
        this.merk = merk;
        this.warna = warna;
        this.ukuran_layar = ukuran_layar;
        this.harga = harga;
    }

    /**
     * @return the merk
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @param merk the merk to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }

    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
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

    /**
     * @return the ukuran_layar
     */
    public int getUkuran_layar() {
        return ukuran_layar;
    }

    /**
     * @param ukuran_layar the ukuran_layar to set
     */
    public void setUkuran_layar(int ukuran_layar) {
        this.ukuran_layar = ukuran_layar;
    }
}