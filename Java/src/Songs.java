/**
 * Created by kaleena on 1/29/14.
 */
public class Songs extends Album {
    String songTitle;
    int songLength;

    public Songs(String songTitle, int songLength) {
        this.songTitle = songTitle;
        this.songLength = songLength;
    }

    public Songs(String albumTitle, int yearOfRelease, int numberOfSongs, String songTitle, int songLength) {
        super(albumTitle, yearOfRelease, numberOfSongs);
        this.songTitle = songTitle;
        this.songLength = songLength;
    }

    public Songs(String artistName, int debutYear, String albumTitle, int yearOfRelease, int numberOfSongs, String songTitle, int songLength) {
        super(artistName, debutYear, albumTitle, yearOfRelease, numberOfSongs);
        this.songTitle = songTitle;
        this.songLength = songLength;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getSongLength() {
        return songLength;
    }

    public String getSongTitleLength(){
        return this.getSongTitle() + " " + "(Duration: " + this.getSongLength() +" minutes)";
    }
}
