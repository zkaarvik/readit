package com.kaarvik.readit.object;

/**
 * Created by Zach on 9/15/2014.
 */
public class RedditLink {

    private String title;
    private String name;
    private String author;
    private String domain;
    private String url;
    private String banned_by;
    private String selftext;
    private String selftext_html;
    private String subreddit;
    private String link_flair_text;
    private String id;
    private String thumbnail;
    private String subreddit_id;
    private String permalink;
    private String author_flair_text;
    private int gilded;
    private int score;
    private int created;            //Should this be a date type?
    private int created_utc;        //Should this be a date type?
    private int ups;
    private int num_comments;
    private int downs;          //Reddit is not showing the number of downvotes anymore, probably won't use
    private Boolean clicked;
    private Boolean over_18;
    private Boolean hidden;
    private Boolean edited;
    private Boolean saved;
    private Boolean is_self;
    private Boolean stickied;
    private Boolean visited;
    //media_embed: {}           //For Youtube, others?
    //likes: null               //Unknown
    //secure_media: null        //For Youtube, others?
    //secure_media_embed: {}    //For Youtube, others?
    //report_reasons: null      //Unknown
    //media: null               //For Youtube, others?
    //approved_by: null         //Unknown
    //link_flair_css_class: null    //No plans to use CSS at the moment
    //author_flair_css_class: null  //No plans to use CSS at the moment
    //num_reports: null             //Probably a string
    //distinguished: null           //Unknown

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getBanned_by() {
        return banned_by;
    }

    public void setBanned_by(String banned_by) {
        this.banned_by = banned_by;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public String getSelftext_html() {
        return selftext_html;
    }

    public void setSelftext_html(String selftext_html) {
        this.selftext_html = selftext_html;
    }

    public String getSelftext() {
        return selftext;
    }

    public void setSelftext(String selftext) {
        this.selftext = selftext;
    }

    public String getLink_flair_text() {
        return link_flair_text;
    }

    public void setLink_flair_text(String link_flair_text) {
        this.link_flair_text = link_flair_text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGilded() {
        return gilded;
    }

    public void setGilded(int gilded) {
        this.gilded = gilded;
    }

    public Boolean getClicked() {
        return clicked;
    }

    public void setClicked(Boolean clicked) {
        this.clicked = clicked;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Boolean getOver_18() {
        return over_18;
    }

    public void setOver_18(Boolean over_18) {
        this.over_18 = over_18;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSubreddit_id() {
        return subreddit_id;
    }

    public void setSubreddit_id(String subreddit_id) {
        this.subreddit_id = subreddit_id;
    }

    public Boolean getEdited() {
        return edited;
    }

    public void setEdited(Boolean edited) {
        this.edited = edited;
    }

    public int getDowns() {
        return downs;
    }

    public void setDowns(int downs) {
        this.downs = downs;
    }

    public Boolean getSaved() {
        return saved;
    }

    public void setSaved(Boolean saved) {
        this.saved = saved;
    }

    public Boolean getIs_self() {
        return is_self;
    }

    public void setIs_self(Boolean is_self) {
        this.is_self = is_self;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Boolean getStickied() {
        return stickied;
    }

    public void setStickied(Boolean stickied) {
        this.stickied = stickied;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor_flair_text() {
        return author_flair_text;
    }

    public void setAuthor_flair_text(String author_flair_text) {
        this.author_flair_text = author_flair_text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreated_utc() {
        return created_utc;
    }

    public void setCreated_utc(int created_utc) {
        this.created_utc = created_utc;
    }

    public int getUps() {
        return ups;
    }

    public void setUps(int ups) {
        this.ups = ups;
    }

    public int getNum_comments() {
        return num_comments;
    }

    public void setNum_comments(int num_comments) {
        this.num_comments = num_comments;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

}
