package com.rabbit.orange.loldd;

import com.rabbit.orange.loldd.data.Realm;
import com.rabbit.orange.loldd.repo.dd.StaticDataDDRepository;
import com.rabbit.orange.loldd.repo.dd.StaticDataDDRestService;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class StaticDataDDUnitTest {

    private StaticDataDDRepository ddRepository;
    private MockWebServer mockWebServer;

    private String getJsonAsString(String path) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(path).getFile());
        byte[] json;
        try {
            json = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            Assert.fail(e.toString());
            return null;
        }
        return new String(json);
    }

    @Before
    public void setup() {
        mockWebServer = new MockWebServer();
        String baseUrl = mockWebServer.url("/").toString();
        //TODO make use of ApiClient with different URL
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(MoshiConverterFactory.create())
                .build();
        ddRepository = new StaticDataDDRepository(retrofit.create(StaticDataDDRestService.class));
    }

    @After
    public void tearDown() {
        try {
            mockWebServer.shutdown();
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void realm() throws Exception {
        String body = getJsonAsString("realm_na.json");
        MockResponse mockResponse = new MockResponse()
                .setResponseCode(200)
                .setBody(body);
        mockWebServer.enqueue(mockResponse);

        Realm realm = ddRepository.realms(Realm.NA);

        Assert.assertNotNull(realm);
    }

    @Test
    public void versions() throws Exception {
        String body = getJsonAsString("versions.json");
        MockResponse mockResponse = new MockResponse()
                .setResponseCode(200)
                .setBody(body);
        mockWebServer.enqueue(mockResponse);

        List<String> versions = ddRepository.versions();

        Assert.assertNotNull(versions);
        Assert.assertFalse(versions.isEmpty());
    }
}