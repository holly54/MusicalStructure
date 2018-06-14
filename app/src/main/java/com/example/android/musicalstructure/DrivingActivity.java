package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DrivingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // Create a list of songs, artists, and albums
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("1. Runnin 100", "By: Jimmy", "Album: 1975"));
        music.add(new Music("2. Move Outta My Way", "By: Sensey", "Album: We Gonna Go"));
        music.add(new Music("3. Earth Shake", "By: Dropping Duels", "Album: Since This is All I Know"));

        // Create an {@link MusicAdapter}, whose data source is a list of {@link Music}s. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter = new MusicAdapter(this, music);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_driving.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link MusicAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Music} in the list.
        listView.setAdapter(adapter);

            // Find the View that shows the Home Button
        TextView homeButton = findViewById(R.id.homeButton);

        // Set a click listener on that View
        homeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeButtonIntent = new Intent(DrivingActivity.this, MainActivity.class);
                startActivity(homeButtonIntent);
            }
        });
    }
}

