package com.rabbit.orange.loldd.data.model;

import com.squareup.moshi.Json;

/**
 * Created by Łukasz on 11.02.2018.
 */

public class ChampionsWrapper {
    public String type;
    public String format;
    public String version;
    @Json(name = "data")
    public String championsJson;
}
