package com.example.springhello;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/test")
	Map<String,String> test(){
		logger.info("--------------Appel Rest [/test] -------------------");
		Map<String, String> map = Map.of("test","OK");
		return map;
	}

    @GetMapping("/home")
	Map<String,String> home(){
		logger.info("--------------Appel Rest [/home] -------------------");
		Map<String, String> map = Map.of("home","OK");
		return map;
	}

}
