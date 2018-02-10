package com.rabbit.orange.loldd.data;

import com.squareup.moshi.Json;

/**
 * Realms details
 */

public class Realm {

    public static final String NA = "na";

    @Json(name = "n")
    public GameModulesVersions gameModulesVersions;
    @Json(name = "v")
    public String version;
    @Json(name = "l")
    public String language;
    @Json(name = "cdn")
    public String cdnUrl;
    @Json(name = "dd")
    public String ddVersion;
    @Json(name = "lg")
    public String lg;
    @Json(name = "css")
    public String css;
    @Json(name = "profileiconmax")
    public Integer profileiconmax;
    @Json(name = "store")
    public Object store;
}
