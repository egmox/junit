package com.egmox.parkingfinder.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egmox.parkingfinder.service.TestService;

@RestController
@RequestMapping(value = "search")
public class TestingController {

	@Autowired
	TestService testService;

//	@Autowired
//	ScopedBeanSingleton scopedBeanSingleton;
//
//	@GetMapping(value = "")
//	public String testStr() {
//		String str = "search";
//		return testService.testStr(str);
//	}

	@PostMapping(value = "string")
	public String testStr(@RequestBody HashMap<String, String> map) {
		if (map.get("search") == null || map.get("search").equals(""))
			return "Invalid search. Validation failed";

		String str = map.get("search");
		str.replaceAll(" ", "");

		return testService.getSearchResult(str);
	}

//	@GetMapping(value = { "html", "htm" }, produces = "text/html")
//	public Object testHtml() {
//		return "<button onclick='alert(\"1234\")'>alert now</button>";
//	}
//
//	@GetMapping("scoped-injection")
//	public ArrayList<String> getTime() throws Exception {
//		ArrayList<String> result = new ArrayList<>();
//		result.add(scopedBeanSingleton.getTime());
//		Thread.sleep(1000);
//		result.add(scopedBeanSingleton.getTime());
//		return result;
//	}

}
