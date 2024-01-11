package com.project.badge.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.badge.dao.BadgeNews;
import com.project.badge.service.BadgeNewsService;

@Controller
@RequestMapping(path = "/badgenews")
public class BadgeNewsController {

	@Autowired
	private BadgeNewsService badgeNewsService;
	
	@GetMapping(path = "/date")
	public @ResponseBody List<BadgeNews> getNewsByDate(@RequestParam("date")
													   @DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
		return badgeNewsService.getNewsByDate(date);
	}
}
