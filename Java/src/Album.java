/**
 * Created by kaleena on 1/29/14.
 */
public class Album extends Artist{
    String albumTitle;
    int numberOfSongs;
    int yearOfRelease;

    public Album(){

    }

    public Album(String albumTitle, int yearOfRelease, int numberOfSongs) {
        this.albumTitle = albumTitle;
        this.yearOfRelease = yearOfRelease;
        this.numberOfSongs = numberOfSongs;
    }

    public Album(String artistName, int debutYear, String albumTitle, int yearOfRelease, int numberOfSongs) {
        super(artistName, debutYear);
        this.albumTitle = albumTitle;
        this.yearOfRelease = yearOfRelease;
        this.numberOfSongs = numberOfSongs;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getAlbumDiscography(){
        return this.albumTitle + " " + "("+this.yearOfRelease+")";
    }
}
