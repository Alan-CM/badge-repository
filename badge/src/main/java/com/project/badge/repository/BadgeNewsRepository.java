package com.project.badge.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.badge.dao.BadgeNews;

public interface BadgeNewsRepository extends CrudRepository<BadgeNews, Integer>{

	public List<BadgeNews> findAllByDateBadgeNews(Date date);
}
