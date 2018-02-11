package com.rabbit.orange.loldd.repo.dd;

import com.rabbit.orange.loldd.data.model.Champion;
import com.rabbit.orange.loldd.data.model.Realm;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Data Dragon REST service
 */

public interface StaticDataDDRestService {
    @GET("realms/{realmId}.json")
    Call<Realm> realms(@Path("realmId") String realmId);

    @GET("api/versions.json")
    Call<List<String>> versions();

    @GET("/cdn/{version}/data/{language}/champion.json ")
    Call<List<Champion>> champions(@Path("version") String version,
                                   @Path("language") String language);
}
