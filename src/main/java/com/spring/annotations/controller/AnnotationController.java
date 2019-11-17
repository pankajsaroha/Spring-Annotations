package com.spring.annotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@RequestMapping(value="/annotations/")
public class AnnotationController {

	@Autowired
	AnnotationService service;
	
	@GetMapping(value="just")
	public @ResponseBody String justCheck() {
		return service.getData();
	}
}
