package com.egmox.parkingfinder;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.egmox.parkingfinder.service.TestService;


@SpringBootTest
class BeanTestingApplicationTests {

    @Autowired
    public TestService testService;
	
//	@Test
	public void main() {
		System.out.println("test1");
//		Result result = JUnitCore.runClasses(ServiceTester.class);
		assertEquals("string: 123", testService.testStr("123"));
//		for (Failure failure : result.getFailures()) {
//			System.out.println(failure.toString());
//		}
//		System.out.println(result.wasSuccessful() ? "All tests successful" : "Few tests failed");
	}
}
