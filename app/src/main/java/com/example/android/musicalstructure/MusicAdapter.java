package com.example.android.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * {@link MusicAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Music} objects.
 */
public class MusicAdapter extends ArrayAdapter<Music> {

    /**
     * Create a new {@link MusicAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param music   is the list of {@link Music}s to be displayed.
     */
    public MusicAdapter(Context context, ArrayList<Music> music) {
        super(context, 0, music);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_item, parent, false);
        }

        // Get the {@link Music} object located at this position in the list
        Music currentMusic = getItem(position);

        // Find the TextView in the music_item.xml layout with the ID song_text_view.
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        // Get the song's title from the currentMusic object and set this text on
        // the Song Title TextView.
        songTextView.setText(currentMusic.getSongTitle());

        // Find the TextView in the music_item.xml layout with the ID artist_text_view.
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the artist's name from the currentMusic object and set this text on
        // the Artist TextView.
        artistTextView.setText(currentMusic.getArtistName());

        // Find the TextView in the music_item.xml layout with the ID album_text_view.
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_text_view);
        // Get the album's name from the currentMusic object and set this text on
        // the Album TextView.
        albumTextView.setText(currentMusic.getAlbumTitle());

        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}

