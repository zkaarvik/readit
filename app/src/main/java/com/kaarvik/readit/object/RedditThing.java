package com.kaarvik.readit.object;

/**
 * Created by Zach on 9/19/2014
 */

public class RedditThing<T> {
    private String kind;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
