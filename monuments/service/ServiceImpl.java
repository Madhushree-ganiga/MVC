package com.wolken.monuments.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;



@Component
public class ServiceImpl implements Service {
	public void printHello() {
		 Logger logger=Logger.getLogger(ServiceImpl.class);
		logger.info("Hello Service");
	}
}