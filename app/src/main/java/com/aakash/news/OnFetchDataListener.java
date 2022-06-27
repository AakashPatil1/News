package com.aakash.news;

import com.aakash.news.Models.NewsApiResponse;
import com.aakash.news.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
