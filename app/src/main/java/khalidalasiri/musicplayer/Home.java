package khalidalasiri.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    Button bt_playlist, bt_playing_now;
    ArrayList<Music> MusicList;
    ListView music_list;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        music_list = findViewById(R.id.music_list);
        MusicList = new ArrayList<>();
        addNewMusic();
        MusicAdapter MA = new MusicAdapter(this, MusicList);
        music_list.setAdapter(MA);

        bt_playing_now = findViewById(R.id.bt_playing_now);
        bt_playlist = findViewById(R.id.bt_playlist);

        bt_playing_now.setOnClickListener(OCL);
        bt_playlist.setOnClickListener(OCL);
    }

    final View.OnClickListener OCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.bt_playing_now:
                    Intent iPlaying = new Intent(Home.this, Playing.class);
                    startActivity(iPlaying);
                    break;
                case R.id.bt_playlist:
                    Intent iPlaylist = new Intent(Home.this, Playlist.class);
                    startActivity(iPlaylist);
                    break;
            }

        }
    };

    public void addNewMusic() {
        MusicList.add(new Music(id++, "Hello", "Adele", R.drawable.hello));
        MusicList.add(new Music(id++, "La Robama", "Rashed Al Majid", R.drawable._rashed));
        MusicList.add(new Music(id++, "60 Dakikat Hayat", "Assala Nasri", R.drawable.asala));
    }
}
