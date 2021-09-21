package com.egmox.parkingfinder.service_tester;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.egmox.parkingfinder.service.TestService;

@SpringBootTest
public class ServiceTester {

    @Autowired
    private TestService testService;
    
    String str;

    @Test
    public void autowiredClassTest() throws Exception {
    	System.out.println("autowiredClassTest()");
        assertEquals("string: 123", testService.testStr("123"));
    }
    
//    public ServiceTester(String str) {
//    	this.str = str;
//    }
    
//    @Parameterized.Parameters
    public static Collection strings() {
    	return Arrays.asList(new Object[] {"123","456","789"});
    }

//    @Test
    public void spring_injection() throws Exception {
        assertEquals(null, testService);
    }

}
