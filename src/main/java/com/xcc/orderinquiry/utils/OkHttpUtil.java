package com.xcc.orderinquiry.utils;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author： XCC
 * @date： 2020/9/10 19:20 下午
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 */
public class OkHttpUtil {

    private static OkHttpClient client = new OkHttpClient();

    public static String postResponseWithParamsInMap(String url, Map<String, Object> params) {
        FormBody.Builder builder = new FormBody.Builder();
        if (params != null) {
            for (String key : params.keySet()) {
                builder.add(key, String.valueOf(params.get(key)));
            }
        }
        RequestBody body = builder.build();
        Request request = new Request.Builder().url(url).post(body).build();
        try {
            String res = client.newCall(request).execute().body().string();
            return res;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
