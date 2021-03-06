package com.kaarvik.readit.net;

import android.util.Log;

import com.android.volley.Response;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kaarvik.readit.app.AppController;
import com.kaarvik.readit.fragment.SubredditFragment;
import com.kaarvik.readit.object.RedditLink;
import com.kaarvik.readit.object.RedditListing;
import com.kaarvik.readit.object.RedditThing;

import java.lang.reflect.Type;

/**
 * Created by Zach on 9/19/2014
 */

public class RedditRequest {

    private static final String protocol = "https://";
    private static final String redditUrl = "www.reddit.com/";
    private static final String subreddit = "r/";
    private static final String json = ".json";

    public static void requestSubredditLinkArray(final SubredditFragment fragment, String name) {

        Response.Listener<String> callback = new Response.Listener<String>() {
            @ Override
            public void onResponse(String response) {
                //TODO: pass back the object to the calling function
                Gson gson = AppController.getInstance().getGson();
                Type dataType = new TypeToken<RedditThing<RedditListing<RedditThing<RedditLink>>>>() {}.getType();

                RedditThing<RedditListing<RedditThing<RedditLink>>> subredditThing = gson.fromJson(response, dataType);
                Log.d("debug", "Subreddit links parsed");

                RedditLink[] redditLinks = new RedditLink[subredditThing.getData().getChildren().length];
                for(int i=0; i<subredditThing.getData().getChildren().length; i++) {
                    redditLinks[i] = subredditThing.getData().getChildren()[i].getData();
                }

                fragment.onSubredditLoaded(redditLinks);
            }
        };

        String completeUrl;
        if(name.equals("")) {
            completeUrl = protocol + redditUrl + json;
        } else {
            completeUrl = protocol + redditUrl + subreddit + name + json;
        }
        NetRequest.StringRequest(completeUrl, callback);
    }
}
