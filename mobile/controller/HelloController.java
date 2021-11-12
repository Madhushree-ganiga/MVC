package com.wolken.monuments.controller;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.monuments.service.Service;
@Controller
public class HelloController {
   Logger logger=Logger.getLogger(HelloController.class);
	@RequestMapping("/hello")
	String PrintHello() {
	   logger.info("Constructor Calling");
	   
	   logger.trace("Iam Trace");
	   logger.warn("Iam Warn");
	   logger.debug("Iam Debug");
	   logger.fatal("Iam Fatal");
	   logger.error("Iam Error");
	   
	   
		return "welcome.jsp";
		
	}
	
}