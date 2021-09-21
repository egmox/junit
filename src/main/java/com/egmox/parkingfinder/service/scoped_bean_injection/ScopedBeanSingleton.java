package com.egmox.parkingfinder.service.scoped_bean_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ScopedBeanSingleton {

	@Autowired
	ScopedBeanPrototype ScopedBeanPrototype;

	public String getTime() {
		return ScopedBeanPrototype.getTime();
	}
}
