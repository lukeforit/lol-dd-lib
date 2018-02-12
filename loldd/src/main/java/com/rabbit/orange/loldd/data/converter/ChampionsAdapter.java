package com.rabbit.orange.loldd.data.converter;

import com.rabbit.orange.loldd.data.model.Champion;
import com.rabbit.orange.loldd.data.model.ChampionsWrapper;
import com.squareup.moshi.FromJson;

import java.util.ArrayList;
import java.util.List;

/**
 * Converter for ChampionWrapper. Returns champions as a list.
 */

public class ChampionsAdapter {
    @FromJson
    List<Champion> fromJson(ChampionsWrapper json) {
        return new ArrayList<>(json.getChampions().values());
    }
}
