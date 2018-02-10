package com.rabbit.orange.loldd.repo;

import com.rabbit.orange.loldd.data.Realm;

import java.util.List;

/**
 * Created by Łukasz on 10.02.2018.
 */

public interface IStaticDataRepository {
    public Realm realms(String realmId);
    public List<String> versions();
}
