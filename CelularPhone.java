/**
 * CelularPhone
 */
public class CelularPhone {

    String merek, warna, sistemOperasi;
    int ukuran;

//constructor
    public CelularPhone(String merkHP, String warna, String sistemOperasi, int ukuran){
        merek = merkHP;
        this.warna = warna;
        this.sistemOperasi = sistemOperasi;
        this.ukuran = ukuran;
    }

    public CelularPhone(String merkHP, String warna){
        merek = merkHP;
        this.warna = warna;
    }
    /**
     * @return the merek
     */
    public String getMerek() {
        return merek;
    }

    /**
     * @param merek the merek to set
     */
    public void setMerek(String merek) {
        this.merek = merek;
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
     * @return the sistemOperasi
     */
    public String getSistemOperasi() {
        return sistemOperasi;
    }

    /**
     * @param sistemOperasi the sistemOperasi to set
     */
    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
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
}