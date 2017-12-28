package khalidalasiri.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    Button btPlaylist, btPlayingNow;
    ArrayList<Music> MusicList;
    ListView musicList;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        musicList = findViewById(R.id.music_list);
        MusicList = new ArrayList<>();
        addNewMusic();
        MusicAdapter MA = new MusicAdapter(this, MusicList);
        musicList.setAdapter(MA);

        btPlayingNow = findViewById(R.id.bt_playing_now);
        btPlaylist = findViewById(R.id.bt_playlist);

        btPlayingNow.setOnClickListener(OCL);
        btPlaylist.setOnClickListener(OCL);
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
        MusicList.add(new Music(id++, getString(R.string.hello), getString(R.string.adele), R.drawable.hello));
        MusicList.add(new Music(id++, getString(R.string.la_robama), getString(R.string.rashed), R.drawable.rashed));
        MusicList.add(new Music(id++, getString(R.string._60DakikatHayat), getString(R.string.assalaNasri), R.drawable.asala));
    }
}
