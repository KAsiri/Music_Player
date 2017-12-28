package khalidalasiri.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Playlist extends AppCompatActivity {

    Button bt_playing_now, bt_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        bt_home = findViewById(R.id.bt_home);
        bt_playing_now = findViewById(R.id.bt_playing_now);

        bt_home.setOnClickListener(OCL);
        bt_playing_now.setOnClickListener(OCL);

    }

    final View.OnClickListener OCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.bt_home:
                    Intent iHome = new Intent(Playlist.this, Home.class);
                    startActivity(iHome);
                    break;
                case R.id.bt_playing_now:
                    Intent iPlaying = new Intent(Playlist.this, Playing.class);
                    startActivity(iPlaying);
                    break;
            }

        }
    };
}
