/**
 * mahasiswa
 */
public class mahasiswa {

    String nama, nim, prodi;
    short umur, tgl_lahir;

    // constructor
    public mahasiswa(String nama, String nim, String prodi, short umur, short tgl_lahir) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.umur = umur;
        this.tgl_lahir = tgl_lahir;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * @return the prodi
     */
    public String getProdi() {
        return prodi;
    }

    /**
     * @param prodi the prodi to set
     */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    /**
     * @return the umur
     */
    public short getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(short umur) {
        this.umur = umur;
    }

    /**
     * @return the tgl_lahir
     */
    public short getTgl_lahir() {
        return tgl_lahir;
    }

    /**
     * @param tgl_lahir the tgl_lahir to set
     */
    public void setTgl_lahir(short tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }
}