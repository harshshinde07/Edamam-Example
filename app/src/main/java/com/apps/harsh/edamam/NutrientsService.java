package com.apps.harsh.edamam;

import android.util.Log;

import com.apps.harsh.edamam.Constants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NutrientsService {
    public static final String TAG = NutrientsService.class.getSimpleName();

    public static void findDetails(String name, okhttp3.Callback callback) {
        //String APP_KEY = Constants.APP_KEY;
        //String APP_ID = Constants.APP_ID;
        OkHttpClient client = new OkHttpClient.Builder()
                .build();
        //String ingredients = (ingredient1 + "," + ingredient2).replaceAll("\\s","");
        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.BASE_URL).newBuilder();
        //urlBuilder.addQueryParameter(Constants.QUERY_PARAMETER, ingredients);
        //urlBuilder.addQueryParameter(Constants.APP_QUERY_PARAMETER, APP_ID);
        //urlBuilder.addQueryParameter(Constants.KEY_QUERY_PARAMETER, APP_KEY);
        String url = urlBuilder.build().toString();
        Log.v(TAG, url);

        Request request = new Request.Builder()
                .url(url)
                .build();

        Call call = client.newCall(request);
        call.enqueue(callback);
    }
}
