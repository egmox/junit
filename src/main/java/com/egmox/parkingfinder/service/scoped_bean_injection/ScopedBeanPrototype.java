package com.egmox.parkingfinder.service.scoped_bean_injection;

import java.util.Date;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ScopedBeanPrototype {
	
//	public ScopedBeanPrototype(String s) {}
	
	public String getTime() {
		return new Date().getTime() + "";
	}
}
