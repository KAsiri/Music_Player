package khalidalasiri.musicplayer;

import android.graphics.drawable.Drawable;

/**
 * Created by kasir on 12/27/2017.
 */

public class Music
{
    private int id ;
    private String music_title, music_artist;
    private int image_resours ;

    public Music (int id, String music_title,String music_artist, int image_resours)
    {
        this.id = id ;
        this.music_title = music_title ;
        this.music_artist = music_artist ;
        this.image_resours = image_resours ;

    }

    public int getId() {
        return id;
    }

    public String getMusic_title() {
        return music_title;
    }

    public String getMusic_artist() {
        return music_artist;
    }

    public int getImage_resours() {
        return image_resours;
    }
}
