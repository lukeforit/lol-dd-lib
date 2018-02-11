package com.rabbit.orange.loldd.data.converter;

import com.rabbit.orange.loldd.data.model.Champion;
import com.squareup.moshi.FromJson;

import java.util.List;
import java.util.Map;

/**
 * Created by Łukasz on 11.02.2018.
 */

public class ChampionsAdapter {
    @FromJson
    List<Champion> fromJson(Map<String,Object> json) {
        //TODO better way to handle deserialization since JSONObject is not testable
//        List<Champion> result = new ArrayList<>();
//        try {
//            JSONObject data = json.getJSONObject("data");
//            Iterator<String> iterator = data.keys();
//            Moshi moshi = new Moshi.Builder().build();
//            JsonAdapter<Champion> jsonAdapter = moshi.adapter(Champion.class);
//            while (iterator.hasNext()) {
//                Champion champion = jsonAdapter.fromJson(data.getString(iterator.next()));
//                result.add(champion);
//            }
//        } catch (JSONException | IOException e) {
//            return null;
//        }
//        return result;
        return null;
    }
}
