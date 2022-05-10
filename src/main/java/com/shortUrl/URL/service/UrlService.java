package com.shortUrl.URL.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.shortUrl.URL.model.Url;
import com.shortUrl.URL.repo.UrlRepository;
import static com.shortUrl.URL.logic.GenerateShortUrl.isUrlValid;
import static com.shortUrl.URL.logic.GenerateShortUrl.getShortUrl;

@Service
public class UrlService {
	
	@Autowired
	private UrlRepository urlRepo;
	
	public String getOriginalUrl( @PathVariable String id) {
		return urlRepo.findByShortUrl(id);
	}


	public Url generateShortUrl(String url) {
        if(! isUrlValid(url)) {
            System.out.println("URL is not valid");
            return null;
        }

        Url urlObject = new Url();
        urlObject.setOriginalurl(url);
        urlObject.setShorturl(getShortUrl(url));

        return urlRepo.save(urlObject);
    }


}
