package com.rabbit.orange.loldd.repo.dd;

import com.rabbit.orange.loldd.data.Realm;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Łukasz on 10.02.2018.
 */

public interface StaticDataDDRestService {
    @GET("realms/{realmId}.json")
    Call<Realm> realms(@Path("realmId") String realmId);

    @GET("api/versions.json")
    Call<List<String>> versions();
}
