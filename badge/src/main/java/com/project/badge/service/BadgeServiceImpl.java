package com.project.badge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.badge.dao.Badge;
import com.project.badge.repository.BadgeRepository;

@Service
public class BadgeServiceImpl implements BadgeService{
    
	@Autowired
	private BadgeRepository badgeRepository;

	@Override
	public List<Badge> getAllBadges() {
		
		List<Badge> badgeList = new ArrayList<>();
		badgeList = (List<Badge>) badgeRepository.findAll();
		return badgeList;
	}

	@Override
	public List<Badge> getAllHistory(String badgeName) {
		
		List<Badge> badgeList = new ArrayList<>();
		badgeList = badgeRepository.findByNameBadge(badgeName);
		return badgeList;
	}
	
	
}
