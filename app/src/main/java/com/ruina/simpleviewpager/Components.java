package com.ruina.simpleviewpager;

import android.net.Uri;

public class Components {

    private String movieName;
    private Uri    movieUri;

    public Components(String movieName, Uri movieUri) {
        this.movieName = movieName;
        this.movieUri = movieUri;
    }

    public String getMovieName() {
        return movieName;
    }

    public Uri getMovieUri() {
        return movieUri;
    }

}
