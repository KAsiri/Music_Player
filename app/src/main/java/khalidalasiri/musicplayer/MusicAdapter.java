package khalidalasiri.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kasir on 12/27/2017.
 */

public class MusicAdapter extends ArrayAdapter<Music> {

    public MusicAdapter(Context context, ArrayList<Music> music) {
        super(context, 0,music);
    }

    public View getView(int index, View convertView , ViewGroup parent)
    {
        Music music = getItem(index);

        View music_item = convertView ;
        if(music_item == null) {
            music_item = LayoutInflater.from(getContext()).inflate(R.layout.music_item_layout, parent, false);
        }
        ImageView image = convertView.findViewById(R.id.image);
        TextView tilte = convertView.findViewById(R.id.tv_title);
        TextView artsit = convertView.findViewById(R.id.tv_artist);

        image.setImageResource(music.getImage_resours());
        tilte.setText(music.getMusic_title());
        artsit.setText(music.getMusic_artist());

        return convertView ;

    }
}
