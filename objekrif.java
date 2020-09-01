/**
 * objekrif
 */
public class objekrif {

    String juduldrama, genredrama;
    int rating;

    public objekrif (String juduldrama, String genredrama, int rating){

        this.juduldrama = juduldrama;
        this.genredrama = genredrama;
        this.rating = rating;
    }

    public String getJuduldrama() {
        return juduldrama;
    }

    public void setJuduldrama(String juduldrama) {
        this.juduldrama = juduldrama;
    }

    public String getGenredrama() {
        return genredrama;
    }

    public void setGenredrama(String genredrama) {
        this.genredrama = genredrama;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}