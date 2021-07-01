package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {
	@GetMapping("/init")
	public String init() {
		return "아 스프링짜증나네";
	}
}
