package khalidalasiri.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Playing extends AppCompatActivity {

    Button bt_home, bt_playlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        bt_home = findViewById(R.id.bt_home);
        bt_playlist = findViewById(R.id.bt_playlist);

        bt_home.setOnClickListener(OCL);
        bt_playlist.setOnClickListener(OCL);

    }

    final View.OnClickListener OCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.bt_home:
                    Intent iHome = new Intent(Playing.this, Home.class);
                    startActivity(iHome);
                    break;
                case R.id.bt_playlist:
                    Intent iPlaylist = new Intent(Playing.this, Playlist.class);
                    startActivity(iPlaylist);
                    break;
            }

        }
    };
}
