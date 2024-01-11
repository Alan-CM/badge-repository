package com.project.badge.service;

import java.util.List;

import com.project.badge.dao.Badge;

public interface BadgeService {

	public List<Badge> getAllBadges();
	
	public List<Badge> getAllHistory(String badgeName);
}
