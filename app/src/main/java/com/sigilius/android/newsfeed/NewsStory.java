package com.sigilius.android.newsfeed;


public class NewsStory {

    private String mTitle;
    private String mUrl;
    private String mByLine;
    private String mFromDate;

    public NewsStory(String title, String url, String byLine, String fromDate) {
        mTitle = title;
        mUrl = url;
        mByLine = byLine;
        mFromDate = fromDate;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getByLine() {
        return mByLine;
    }

    public String getFromDate() {
        return mFromDate;
    }

}
