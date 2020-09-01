/**
 * Mahasiswa2
 */
public class Mahasiswa2 {

    String nama, nim, capaian;
    int nilai;

    // membuat constructor
    public Mahasiswa2(String nama, String nim, String capaian, int nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        this.capaian = capaian;

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
     * @return the capaian
     */
    public String getCapaian() {
        return capaian;
    }

    /**
     * @param capaian the capaian to set
     */
    public void setCapaian(String capaian) {
        this.capaian = capaian;
    }

    /**
     * @return the nilai
     */
    public int getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}