package com.project.badge.dao;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "badge")
public class Badge {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "name_badge")
	private String nameBadge;
	
	private BigDecimal price;
	
	@Column(name = "date_badge")
	private Date dateBadge;
	
	private String country;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameBadge() {
		return nameBadge;
	}

	public void setNameBadge(String nameBadge) {
		this.nameBadge = nameBadge;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getDateBadge() {
		return dateBadge;
	}

	public void setDateBadge(Date dateBadge) {
		this.dateBadge = dateBadge;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
