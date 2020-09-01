/**
 * BungaEfektif
 */
public class BungaEfektif {
    int angBunga, angPokok, totAngsuran, ssAngsuran;

    public BungaEfektif(int angsuranBunga, int angsuranPokok, int totalAngsuran, int sisaAngsuran) {
        angBunga = angsuranBunga;
        angPokok = angsuranPokok;
        totAngsuran = totalAngsuran;
        ssAngsuran = sisaAngsuran;
    }

    /**
     * @return the angBunga
     */
    public int getAngBunga() {
        return angBunga;
    }

    /**
     * @return the angPokok
     */
    public int getAngPokok() {
        return angPokok;
    }

    /**
     * @return the totAngsuran
     */
    public int getTotAngsuran() {
        return totAngsuran;
    }

    /**
     * @return the ssAngsuran
     */
    public int getSsAngsuran() {
        return ssAngsuran;
    }

    /**
     * @param angBunga the angBunga to set
     */
    public void setAngBunga(int angBunga) {
        this.angBunga = angBunga;
    }

    /**
     * @param angPokok the angPokok to set
     */
    public void setAngPokok(int angPokok) {
        this.angPokok = angPokok;
    }

    /**
     * @param totAngsuran the totAngsuran to set
     */
    public void setTotAngsuran(int totAngsuran) {
        this.totAngsuran = totAngsuran;
    }

    /**
     * @param ssAngsuran the ssAngsuran to set
     */
    public void setSsAngsuran(int ssAngsuran) {
        this.ssAngsuran = ssAngsuran;
    }
}