package cz.fridl.openvpn.controllers;

import org.springframework.web.bind.annotation.RestController;

import cz.fridl.openvpn.dao.User;
import cz.fridl.openvpn.services.SecurityService;
import cz.fridl.openvpn.services.SecurityServiceImpl;
import cz.fridl.openvpn.services.UserRepository;
import cz.fridl.openvpn.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableWebSecurity
@RestController
public class Account {
	
	@Autowired
	private ApplicationContext appContext;
	
	@Autowired
	private final UserService userService;
	
	Account(UserService userRepository) {
		this.userService = userRepository;
	}
	
	@RequestMapping("/account")
	public @ResponseBody User getInfo() {
		SecurityServiceImpl securityService = (SecurityServiceImpl)appContext.getBean("securityService");
		User user = userService.findByUsername(securityService.findLoggedInUsername());
		return user;
	}
}
