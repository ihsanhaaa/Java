/**
 * Forex
 */
public class Forex {

    long danaAwal;
    short persenProfit;

    public Forex(long danaAwal, short persenProfit){
        this.danaAwal = danaAwal;
        this.persenProfit = persenProfit;
    }

    public long getNominalProfit(){
        return (long) (danaAwal*persenProfit)/100;
    }

      /**
     * @return the danaAkhir
     */
    public long getDanaAkhir() {
        return (long) danaAwal+((danaAwal*persenProfit)/100);
    }

    /**
     * @return the danaAwal
     */
    public long getDanaAwal() {
        return danaAwal;
    }

    /**
     * @param danaAwal the danaAwal to set
     */
    public void setDanaAwal(long danaAwal) {
        this.danaAwal = danaAwal;
    }

    /**
     * @return the persenProfit
     */
    public short getPersenProfit() {
        return persenProfit;
    }

    /**
     * @param persenProfit the persenProfit to set
     */
    public void setPersenProfit(short persenProfit) {
        this.persenProfit = persenProfit;
    }

   
}