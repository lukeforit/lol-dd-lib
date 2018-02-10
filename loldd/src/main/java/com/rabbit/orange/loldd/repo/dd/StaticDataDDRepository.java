package com.rabbit.orange.loldd.repo.dd;

import com.rabbit.orange.loldd.data.Realm;
import com.rabbit.orange.loldd.repo.IStaticDataRepository;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;

/**
 * Created by Łukasz on 10.02.2018.
 */

public class StaticDataDDRepository implements IStaticDataRepository {

    private StaticDataDDRestService ddRestService;

    public StaticDataDDRepository(StaticDataDDRestService staticDataDDRestService) {
        ddRestService = staticDataDDRestService;
    }

    @Override
    public Realm realms(String realmId) {
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
}
