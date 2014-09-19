package com.kaarvik.readit.net;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import com.kaarvik.readit.app.AppController;

/**
 * Created by Zach on 9/19/2014
 *
 * Example callback:
 * new Response.Listener<String>() {
 *      @ Override
 *      public void onResponse(String response) {
 *          Log.d("debug", response);
 *      }
 * }
 */
public class NetRequest {

    public static void StringRequest(String url, Response.Listener<String> callback) {
        StringRequest strReq = new StringRequest(Request.Method.GET,
                url,
                callback,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("ERR", "Error: " + error.getMessage());
                    }
                });

        AppController.getInstance().addToRequestQueue(strReq, "StringRequest");
    }
}
