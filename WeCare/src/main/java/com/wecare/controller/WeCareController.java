package com.wecare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wecare")
public class WeCareController {

	@GetMapping("/")
	public String hello() {
		return "welcome to wecare";
	}
}
