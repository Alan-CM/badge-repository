package com.project.badge.dao;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "badgeNews")
public class BadgeNews {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idBadgeNews;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateBadgeNews;
	
	private String title;
	
	private String body;

	public Integer getIdBadgeNews() {
		return idBadgeNews;
	}

	public void setIdBadgeNews(Integer idBadgeNews) {
		this.idBadgeNews = idBadgeNews;
	}

	public Date getDateBadgeNews() {
		return dateBadgeNews;
	}

	public void setDateBadgeNews(Date dateBadgeNews) {
		this.dateBadgeNews = dateBadgeNews;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
}
