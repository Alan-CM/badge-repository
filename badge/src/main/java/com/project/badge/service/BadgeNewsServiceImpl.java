package com.project.badge.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.badge.dao.BadgeNews;
import com.project.badge.repository.BadgeNewsRepository;

@Service
public class BadgeNewsServiceImpl implements BadgeNewsService{

	@Autowired
	private BadgeNewsRepository badgeNewsRepository;
	
	@Override
	public List<BadgeNews> getNewsByDate(Date date) {
		
		List<BadgeNews> badgeNewsList = new ArrayList<>();
		System.out.println(("Fecha: " + date));
		badgeNewsList = (List<BadgeNews>) badgeNewsRepository.findAllByDateBadgeNews(date);
		return badgeNewsList;
	}
	

}
