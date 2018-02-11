package com.rabbit.orange.loldd.repo;

import com.rabbit.orange.loldd.data.model.Champion;
import com.rabbit.orange.loldd.data.model.Realm;

import java.util.List;

/**
 * Static data repository
 */

public interface IStaticDataRepository {
    Realm realms(String realmId);
    List<String> versions();
    List<Champion> champions(String version, String language);
}
