package com.rabbit.orange.loldd.repo.dd;

import android.support.annotation.NonNull;

import com.rabbit.orange.loldd.data.model.Champion;
import com.rabbit.orange.loldd.data.model.Realm;
import com.rabbit.orange.loldd.repo.IStaticDataRepository;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;

/**
 * Static data repository that retrieves data from the Data Dragon REST service
 */

public class StaticDataDDRepository implements IStaticDataRepository {

    private final StaticDataDDRestService ddRestService;

    public StaticDataDDRepository(StaticDataDDRestService staticDataDDRestService) {
        ddRestService = staticDataDDRestService;
    }

    @Override
    public Realm realms(@NonNull String realmId) {
        Response<Realm> response;
        try {
            response = ddRestService.realms(realmId).execute();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return response.isSuccessful() ? response.body() : null;
    }

    @Override
    public List<String> versions() {
        Response<List<String>> response;
        try {
            response = ddRestService.versions().execute();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return response.isSuccessful() ? response.body() : null;
    }

    @Override
    public List<Champion> champions(@NonNull String version, @NonNull String language) {
        Response<List<Champion>> response;
        try {
            response = ddRestService.champions(version, language).execute();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return response.isSuccessful() ? response.body() : null;
    }
}
