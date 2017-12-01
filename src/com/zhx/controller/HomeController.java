package com.zhx.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhx.pojo.News;
import com.zhx.service.DataService;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	DataService dataService;
	
	@RequestMapping("/toHome")
	public String toHome(Model model){
		List<News> article = dataService.getArticlesForHome();
		List<News> feature = dataService.getTitlesByFeatured();
		List<News> related = dataService.getTitlesByRelated();
		model.addAttribute("article", article);
		model.addAttribute("feature", feature);
		model.addAttribute("related", related);
		return "home";
	}
	
	
}
