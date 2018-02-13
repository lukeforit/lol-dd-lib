package com.rabbit.orange.loldd.repo.img;

/**
 * URL provider to images.
 */

public class ImageUrlProvider {
    private static final String BASE_URL = "http://ddragon.leagueoflegends.com/";
    private String version;

    public ImageUrlProvider(String version) {
        this.version = version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String championSplashArtUrl(String championKey) {
        return BASE_URL + "cdn/img/champion/splash/" + championKey + "_0.jpg";
    }

    public String championSquareUrl(String championKey, String version) {
        return BASE_URL + "cdn/" + version + "/img/champion/" + championKey + ".png";
    }

    public String championSquareUrl(String championKey) {
        return BASE_URL + "cdn/" + version + "/img/champion/" + championKey + ".png";
    }

    public String championLoadingUrl(String championKey) {
        return BASE_URL + "cdn/img/champion/loading/" + championKey + "_0.jpg";
    }
}
