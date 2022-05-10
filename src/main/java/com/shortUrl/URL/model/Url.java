package com.shortUrl.URL.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Url {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private String shorturl;
	
	private String originalurl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShorturl() {
		return shorturl;
	}

	public void setShorturl(String shorturl) {
		this.shorturl = shorturl;
	}

	public String getOriginalurl() {
		return originalurl;
	}

	public void setOriginalurl(String originalurl) {
		this.originalurl = originalurl;
	}

	@Override
	public String toString() {
		return "Url [id=" + id + ", shorturl=" + shorturl + ", originalurl=" + originalurl + "]";
	}

	public Url(int id, String shorturl, String originalurl) {
		super();
		this.id = id;
		this.shorturl = shorturl;
		this.originalurl = originalurl;
	}

	public Url() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	

}
