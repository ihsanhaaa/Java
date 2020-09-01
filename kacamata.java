/**
 * kacamata
 */
public class kacamata {

    String merk, kualitas;
    int ukuran, harga;

    public kacamata(String merk, String kualitas, int ukuran, int harga) {
        this.merk = merk;
        this.kualitas = kualitas;
        this.ukuran = ukuran;
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
     * @return the kualitas
     */
    public String getKualitas() {
        return kualitas;
    }

    /**
     * @param kualitas the kualitas to set
     */
    public void setKualitas(String kualitas) {
        this.kualitas = kualitas;
    }

    /**
     * @return the ukuran
     */
    public int getUkuran() {
        return ukuran;
    }

    /**
     * @param ukuran the ukuran to set
     */
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
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