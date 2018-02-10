package com.rabbit.orange.loldd.client;

import com.rabbit.orange.loldd.repo.IStaticDataRepository;
import com.rabbit.orange.loldd.repo.dd.StaticDataDDRepository;
import com.rabbit.orange.loldd.repo.dd.StaticDataDDRestService;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/**
 * API Client
 */

public class ApiClient {

    private static final String baseUrl = "https://ddragon.leagueoflegends.com/";

    public static IStaticDataRepository getStaticDataRepository() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(MoshiConverterFactory.create())
                .build();
        return new StaticDataDDRepository(retrofit.create(StaticDataDDRestService.class));
    }
}
