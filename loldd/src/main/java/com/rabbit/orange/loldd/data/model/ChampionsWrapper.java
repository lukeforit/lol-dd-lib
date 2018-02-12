package com.rabbit.orange.loldd.data.model;

import com.squareup.moshi.Json;

import java.util.Map;

/**
 * Wrapper for champions JSON response
 */

public class ChampionsWrapper {
    private String type;
    private String format;
    private String version;
    @Json(name = "data")
    private Map<String, Champion> champions;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, Champion> getChampions() {
        return champions;
    }

    public void setChampions(Map<String, Champion> champions) {
        this.champions = champions;
    }
}
