package com.rabbit.orange.loldd;

import com.rabbit.orange.loldd.repo.img.ImageUrlProvider;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImageUrlProviderUnitTest {
    private ImageUrlProvider imageUrlProvider;

    @Before
    public void setup() {
        imageUrlProvider = new ImageUrlProvider("1.1.1");
    }

    @Test
    public void urlTest() {
        assertEquals(imageUrlProvider.championSplashArtUrl("Aatrox"),
                "http://ddragon.leagueoflegends.com/cdn/img/champion/splash/Aatrox_0.jpg");
        assertEquals(imageUrlProvider.championSquareUrl("Aatrox"),
                "http://ddragon.leagueoflegends.com/cdn/1.1.1/img/champion/Aatrox.png");
        assertEquals(imageUrlProvider.championSquareUrl("Aatrox", "1.1.2"),
                "http://ddragon.leagueoflegends.com/cdn/1.1.2/img/champion/Aatrox.png");
        assertEquals(imageUrlProvider.championLoadingUrl("Aatrox"),
                "http://ddragon.leagueoflegends.com/cdn/img/champion/loading/Aatrox_0.jpg");
    }
}
