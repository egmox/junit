package com.egmox.parkingfinder.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceChild {
	
	public String testStr(String s) {
		return "string: "+ s;
	}
}
