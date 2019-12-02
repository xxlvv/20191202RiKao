package com.baw.zhaozhipeng;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.baw.zhaozhipeng.app.MyApp;

/**
 * Copyright (C)
 * <p>
 * FileName: NetUtil
 * <p>
 * Author: zhaozhipeng
 * <p>
 * Date: 2019/12/2 8:43
 */
public class NetUtil {
    private RequestQueue mQueue;

    private NetUtil() {
        mQueue = Volley.newRequestQueue(MyApp.context);
    }

    private static class NetUtils {
        private static NetUtil netUtil = new NetUtil();
    }

    public static NetUtil getInstance() {
        return NetUtils.netUtil;
    }

    public interface Shared {
        void Success(String josn);

        void Filed(String error);
    }

    public void doGET(String url, final Shared shared) {
        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                shared.Success(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                shared.Filed(error.getMessage());
            }
        });
        mQueue.add(stringRequest);
    }

}
