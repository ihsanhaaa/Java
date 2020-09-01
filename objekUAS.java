/**
 * objekUAS
 */
public class objekUAS {

    String namaTim, asalTim, namaPelatih, grup;
    int banyakPertandingan, menang, seri, kalah, jumlahGoal, kemasukkanGoal;

    public objekUAS(String namaTim, String asalTim, String namaPelatih, String grup, int banyakPertandingan, int menang,
            int seri, int kalah, int jumlahGoal, int kemasukkanGoal) {
        this.namaTim = namaTim;
        this.namaPelatih = namaPelatih;
        this.asalTim = asalTim;
        this.grup = grup;
        this.banyakPertandingan = banyakPertandingan;
        this.menang = menang;
        this.seri = seri;
        this.kalah = kalah;
        this.jumlahGoal = jumlahGoal;
        this.kemasukkanGoal = kemasukkanGoal;
    }

    public String getNamaTim() {
        return namaTim;
    }

    public void setNamaTim(String namaTim) {
        this.namaTim = namaTim;
    }

    public String getAsalTim() {
        return asalTim;
    }

    public void setAsalTim(String asalTim) {
        this.asalTim = asalTim;
    }

    public String getNamaPelatih() {
        return namaPelatih;
    }

    public void setNamaPelatih(String namaPelatih) {
        this.namaPelatih = namaPelatih;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public int getBanyakPertandingan() {
        return banyakPertandingan;
    }

    public void setBanyakPertandingan(int banyakPertandingan) {
        this.banyakPertandingan = banyakPertandingan;
    }

    public int getMenang() {
        return menang;
    }

    public void setMenang(int menang) {
        this.menang = menang;
    }

    public int getSeri() {
        return seri;
    }

    public void setSeri(int seri) {
        this.seri = seri;
    }

    public int getKalah() {
        return kalah;
    }

    public void setKalah(int kalah) {
        this.kalah = kalah;
    }

    public int getJumlahGoal() {
        return jumlahGoal;
    }

    public void setJumlahGoal(int jumlahGoal) {
        this.jumlahGoal = jumlahGoal;
    }

    public int getKemasukkanGoal() {
        return kemasukkanGoal;
    }

    public void setKemasukkanGoal(int kemasukkanGoal) {
        this.kemasukkanGoal = kemasukkanGoal;
    }
}