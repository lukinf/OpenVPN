package cz.fridl.openvpn.services;

public interface SecurityService {
	
    String findLoggedInUsername();
    
    void autoLogin(String username, String password);
}