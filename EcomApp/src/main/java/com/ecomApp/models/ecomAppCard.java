package com.ecomApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@EnableTransactionManagement
public class ecomAppCard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String imageUrl;
	private String title;
	private String genre;
	private String language;
	private int price;
	private String date;
	private String place;
	private String description;
	
	public ecomAppCard() {
		super();
	}
	
	public ecomAppCard(int id, String imageUrl, String title, String genre, String language, int price, String date,
			String place,String description) {
		super();
		this.id = id;
		this.imageUrl = imageUrl;
		this.title = title;
		this.genre = genre;
		this.language = language;
		this.price = price;
		this.date = date;
		this.place = place;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}
