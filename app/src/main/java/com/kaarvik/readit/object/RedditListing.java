package com.kaarvik.readit.object;

/**
 * Created by Zach on 9/19/2014
 */

public class RedditListing<T> {

    private String before;
    private String after;
    private String modhash;
    private T[] children;

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public String getModhash() {
        return modhash;
    }

    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    public T[] getChildren() {
        return children;
    }

    public void setChildren(T[] children) {
        this.children = children;
    }
}
