package com.project.badge.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.badge.dao.Badge;

public interface BadgeRepository extends CrudRepository<Badge, Integer>{
	
	public List<Badge> findByNameBadge(String nameBadge);
}
