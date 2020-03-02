package cz.fridl.openvpn;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

import cz.fridl.openvpn.services.SecurityService;
import cz.fridl.openvpn.services.SecurityServiceImpl;

@SpringBootApplication
public class OpenvpnApplication implements ServletContextInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OpenvpnApplication.class, args);
	}
	
	@Bean
	public CookieSerializer cookieSerializer() {
		DefaultCookieSerializer serializer = new DefaultCookieSerializer();
		return serializer;
	}
	
	@Bean
	public SecurityService securityService() {
		SecurityService securityService = new SecurityServiceImpl();
		return securityService;
	}
	
	@Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.getSessionCookieConfig().setName("CZ.FRIDL.OPENVPN.SESSIONID");
        //test
	}
	
}
