package com.rabbit.orange.loldd.repo;

import android.support.annotation.NonNull;

import com.rabbit.orange.loldd.data.model.Champion;
import com.rabbit.orange.loldd.data.model.Realm;

import java.util.List;

/**
 * Static data repository
 */

public interface IStaticDataRepository {
    Realm realms(@NonNull String realmId);
    List<String> versions();
    List<Champion> champions(@NonNull String version, @NonNull String language);
}
