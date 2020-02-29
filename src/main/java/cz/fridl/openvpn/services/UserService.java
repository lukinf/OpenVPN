package cz.fridl.openvpn.services;

import cz.fridl.openvpn.dao.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}