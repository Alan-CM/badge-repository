package com.project.badge.service;

import java.util.Date;
import java.util.List;

import com.project.badge.dao.BadgeNews;

public interface BadgeNewsService {
   
	public List<BadgeNews> getNewsByDate(Date date);
}
