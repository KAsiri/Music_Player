package khalidalasiri.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    ArrayList<Music> MusicList ;
    ListView music_list ;
    int id ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        music_list = findViewById(R.id.music_list);
        MusicList = new ArrayList<>();
        MusicList.add(new Music(id++,"Hello","Adele", R.drawable.hello));
        MusicList.add(new Music(id++,"Hello","Adele", R.drawable.hello));
        MusicList.add(new Music(id++,"Hello","Adele", R.drawable.hello));

        MusicAdapter MA = new MusicAdapter(this,MusicList);
        music_list.setAdapter(MA);


    }

    public void getMusicList()
    {

    }
}
