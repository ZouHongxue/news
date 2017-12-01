package com.zhx.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhx.dao.DataDao;
import com.zhx.pojo.News;
import com.zhx.service.DataService;

@Service
public class DataServiceImpl implements DataService{

	@Autowired
	DataDao dataDao;
	
	@Override
	public String getNews() {
		
		return null;
	}

	@Override
	public List<News> getArticlesForHome() {
		List<News> news = dataDao.getArticlesForHome();
		return news;
	}

	@Override
	public List<News> getTitlesByFeatured() {
		List<News> list = dataDao.getNewsList();
		return list;
	}

	@Override
	public List<News> getTitlesByRelated() {
		List<String> words = getHotWords();
		List<News> news = dataDao.getRelated(words);
		return news;
	}

	@Override
	public List<String> getHotWords() {
		List<String> titles = dataDao.getHotTitle();
		List<String> words = new ArrayList<String>();
		for (String title : titles) {
			String[] word = title.split(" ");
			words.add("%"+word[0]+"%");
		}
		return words;
	}
}
