/**
 * objekDrakor
 */
public class objekDrakor {

    String judulDrama, genreDrama;
    int rating;

    public objekDrakor(String judulDrama, String genreDrama, int rating) {
        this.judulDrama = judulDrama;
        this.genreDrama = genreDrama;
        this.rating = rating;
    }

    public String getJudulDrama() {
        return judulDrama;
    }

    public void setJudulDrama(String judulDrama) {
        this.judulDrama = judulDrama;
    }

    public String getGenreDrama() {
        return genreDrama;
    }

    public void setGenreDrama(String genreDrama) {
        this.genreDrama = genreDrama;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}