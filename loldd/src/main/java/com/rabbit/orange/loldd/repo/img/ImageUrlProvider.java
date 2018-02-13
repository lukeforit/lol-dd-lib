package com.rabbit.orange.loldd.repo.img;

import android.support.annotation.NonNull;

/**
 * URL provider to images.
 */

public class ImageUrlProvider {
    private static final String BASE_URL = "http://ddragon.leagueoflegends.com/";
    private String version;

    public ImageUrlProvider(@NonNull String version) {
        this.version = version;
    }

    public void setVersion(@NonNull String version) {
        this.version = version;
    }

    public String championSplashArtUrl(@NonNull String championKey) {
        return BASE_URL + "cdn/img/champion/splash/" + championKey + "_0.jpg";
    }

    public String championSquareUrl(@NonNull String championKey, @NonNull String version) {
        return BASE_URL + "cdn/" + version + "/img/champion/" + championKey + ".png";
    }

    public String championSquareUrl(@NonNull String championKey) {
        return BASE_URL + "cdn/" + version + "/img/champion/" + championKey + ".png";
    }

    public String championLoadingUrl(@NonNull String championKey) {
        return BASE_URL + "cdn/img/champion/loading/" + championKey + "_0.jpg";
    }
}
