package com.shortUrl.URL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shortUrl.URL.model.Url;
import com.shortUrl.URL.service.UrlService;

@RestController
@RequestMapping("url/shortner")
@CrossOrigin(origins = "http://localhost:4200")
public class UrlController {
	
	@Autowired
	private UrlService urlService;
	
	@GetMapping("/{id}")
	public String getOriginalUrl( @PathVariable String id) {
		return urlService.getOriginalUrl(id);
	}
	
	@PostMapping()
	public Url generateShortUrl(@RequestBody String url) {
		return urlService.generateShortUrl(url);
	}

}
