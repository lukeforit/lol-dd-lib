package com.rabbit.orange.loldd.client;

import android.support.annotation.RestrictTo;

import com.rabbit.orange.loldd.data.converter.ChampionsAdapter;
import com.rabbit.orange.loldd.repo.IStaticDataRepository;
import com.rabbit.orange.loldd.repo.dd.StaticDataDDRepository;
import com.rabbit.orange.loldd.repo.dd.StaticDataDDRestService;
import com.squareup.moshi.Moshi;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/**
 * API Client
 */

public class ApiClient {

    private String baseUrl;
    private final IStaticDataRepository staticDataRepository;

    private ApiClient(String baseUrl) {
        this.baseUrl = baseUrl;
        staticDataRepository = buildStaticDataRepository();
    }

    private IStaticDataRepository buildStaticDataRepository() {
        Moshi moshi = new Moshi.Builder().add(new ChampionsAdapter()).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build();
        return new StaticDataDDRepository(retrofit.create(StaticDataDDRestService.class));
    }

    public IStaticDataRepository getStaticDataRepository() {
        return staticDataRepository;
    }

    public static final class Builder {

        private static final String BASE_URL = "https://ddragon.leagueoflegends.com/";

        private String baseUrl;

        public Builder() {
            this.baseUrl = BASE_URL;
        }

        @RestrictTo(RestrictTo.Scope.TESTS)
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public ApiClient build() {
            return new ApiClient(baseUrl);
        }
    }

}
