package khalidalasiri.musicplayer;

/**
 * Created by kasir on 12/27/2017.
 */

public class Music
{
    private int id ;
    private String musicTitle, musicArtist;
    private int imageResours;

    public Music (int id, String music_title,String music_artist, int image_resours)
    {
        this.id = id ;
        this.musicTitle = music_title ;
        this.musicArtist = music_artist ;
        this.imageResours = image_resours ;

    }

    public int getId() {
        return id;
    }

    public String getMusicTitle() {
        return musicTitle;
    }

    public String getMusicArtist() {
        return musicArtist;
    }

    public int getImageResours() {
        return imageResours;
    }
}
