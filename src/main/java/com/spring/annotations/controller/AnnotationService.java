package com.spring.annotations.controller;

import org.springframework.stereotype.Controller;

@Controller
public class AnnotationService {
	
	public String getData() {
		return "working...";
	}
}
