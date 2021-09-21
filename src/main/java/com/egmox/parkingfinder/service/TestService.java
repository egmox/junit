package com.egmox.parkingfinder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

	public String getSearchResult(String str) {

		if (!str.equals("football messi"))
			return "Invalid search. Validation failed";
		
//		restTemplate.exchange(requestEntity, responseType);

		return "search result is footballs";
	}
}
