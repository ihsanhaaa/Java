/**
 * objekDinaAfri
 */
public class objekDinaAfri {

    String MakananMinuman;
    int harga;

    public objekDinaAfri(String MakananMinuman, int harga) {
        this.MakananMinuman = MakananMinuman;
        this.harga = harga;
    }

    public String getMakananMinuman() {
        return MakananMinuman;
    }

    public void setMakananMinuman(String makananMinuman) {
        MakananMinuman = makananMinuman;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}