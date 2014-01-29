public class Main {
    public static void main(String[] args){
        Songs bieber = new Songs("Justin Bieber",2008,"My World 2.0",2010,10,"Baby",3);
        Songs lorde = new Songs("Lorde", 2012, "Pure Heroine",2013,10,"Royals",3);
        Songs beyonce = new Songs("Beyonce",1997,"BEYONCE",2013,14,"Blue",4);

        System.out.println("Playlist:");
        System.out.println("Name: " + beyonce.getArtistName());
        System.out.println("Debut: " + beyonce.getDebutYear());
        System.out.println("Album: " + beyonce.getAlbumDiscography());
        System.out.println("Song: " + beyonce.getSongTitleLength() +"\n");

        System.out.println("Name: " + lorde.getArtistName());
        System.out.println("Debut: " + lorde.getDebutYear());
        System.out.println("Album: " + lorde.getAlbumDiscography());
        System.out.println("Song: " + lorde.getSongTitleLength() +"\n");

        System.out.println("Name: " + bieber.getArtistName());
        System.out.println("Debut: " + bieber.getDebutYear());
        System.out.println("Album: " + bieber.getAlbumDiscography());
        System.out.println("Song: " + bieber.getSongTitleLength() +"\n");


    }
}
