package com.example.android.musicalstructure;

public class Music {

    /**
     * Song Title
     */
    private String mSongTitle;

    /**
     * Artist Name
     */
    private String mArtistName;

    /**
     * Album Name
     */
    private String mAlbumTitle;

    /**
     * Create a new Music Object.
     *
     * @param songTitle  is the name of the song
     * @param artistName is the name of the artist that corresponds to the song
     * @param albumTitle is the name of the album that the song is from
     */
    public Music(String songTitle, String artistName, String albumTitle) {
        mSongTitle = songTitle;
        mArtistName = artistName;
        mAlbumTitle = albumTitle;
    }

    /**
     * Get the song title.
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the artist name.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the album title.
     */
    public String getAlbumTitle() {
        return mAlbumTitle;
    }

}

