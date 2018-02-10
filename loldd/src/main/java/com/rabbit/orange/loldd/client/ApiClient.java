package com.rabbit.orange.loldd.client;

import com.rabbit.orange.loldd.repo.IStaticDataRepository;
import com.rabbit.orange.loldd.repo.dd.StaticDataDDRepository;
import com.rabbit.orange.loldd.repo.dd.StaticDataDDRestService;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/**
 * Created by Łukasz on 10.02.2018.
 */

public class ApiClient {

    private static String baseUrl = "https://ddragon.leagueoflegends.com/";

    public static IStaticDataRepository getStaticDataRepository() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(MoshiConverterFactory.create())
                .build();
        return new StaticDataDDRepository(retrofit.create(StaticDataDDRestService.class));
    }
}
