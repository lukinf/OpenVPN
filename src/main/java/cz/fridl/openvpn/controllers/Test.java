package cz.fridl.openvpn.controllers;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@EnableWebSecurity
@RestController
public class Test {
	
	@RequestMapping("/test")
	public String index() {
		return "Without auth";
	}
}
