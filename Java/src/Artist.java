/**
 * Created by kaleena on 1/29/14.
 */
public class Artist {
    String artistName;
    int debutYear;

    public Artist(){

    }

    public Artist(String artistName, int debutYear) {
        this.artistName = artistName;
        this.debutYear = debutYear;
    }


    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }


    public int getDebutYear() {

        return debutYear;
    }

    public void setDebutYear(int debutYear) {
        this.debutYear = debutYear;
    }

}
