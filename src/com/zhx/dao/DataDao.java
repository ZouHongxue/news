package com.zhx.dao;

import java.util.List;

import com.zhx.pojo.News;

public interface DataDao {
	
	public List<News> getArticlesForHome();
	public List<News> getNewsList();
	public List<News> getNewsListByRelated(String title);
	public List<String> getHotTitle();
	public List<News> getRelated(List<String> words);
	
}
