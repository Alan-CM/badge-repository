package com.project.badge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.badge.dao.Badge;
import com.project.badge.service.BadgeService;

@Controller
@RequestMapping(path = "/badge")
public class BadgeController {

	@Autowired
	private BadgeService badgeService;
	
	@GetMapping(path = "/all")
	public @ResponseBody List<Badge> getAll(){
		return badgeService.getAllBadges();
	}
	
	@GetMapping(path = "/{name}")
	public @ResponseBody List<Badge> getAllHistory(@PathVariable(name = "name")String name){
		return badgeService.getAllHistory(name);
	}
	
}
