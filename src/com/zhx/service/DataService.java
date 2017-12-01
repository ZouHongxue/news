package com.zhx.service;

import java.util.List;
import java.util.Map;

import com.zhx.pojo.News;

public interface DataService {
	
	public String getNews();
	public List<News> getArticlesForHome();
	public List<News> getTitlesByFeatured();
	public List<News> getTitlesByRelated();
	public List<String> getHotWords();
}
