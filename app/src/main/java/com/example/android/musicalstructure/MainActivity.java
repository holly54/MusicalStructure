package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Driving Fun Playlist
        TextView driving = findViewById(R.id.drivingPlaylist);

        // Set a click listener on that View
        driving.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Driving Fun Playlist is clicked on.
            @Override
            public void onClick(View view) {
                Intent drivingIntent = new Intent(MainActivity.this, DrivingActivity.class);
                startActivity(drivingIntent);
            }
        });

        // Find the View that shows the Date Night Playlist
        TextView dateNight = findViewById(R.id.dateNightPlaylist);

        // Set a click listener on that View
        dateNight.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Date Night Playlist is clicked on.
            @Override
            public void onClick(View view) {
                Intent dateNightIntent = new Intent(MainActivity.this, DateActivity.class);
                startActivity(dateNightIntent);
            }
        });

        // Find the View that shows the Happy Dancing Playlist
        TextView happy = findViewById(R.id.happyDancingPlaylist);

        // Set a click listener on that View
        happy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Happy Dancing Playlist is clicked on.
            @Override
            public void onClick(View view) {
                Intent happyIntent = new Intent(MainActivity.this, HappyActivity.class);
                startActivity(happyIntent);
            }
        });

    }
}

