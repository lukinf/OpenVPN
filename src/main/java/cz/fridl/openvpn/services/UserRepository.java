package cz.fridl.openvpn.services;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.fridl.openvpn.dao.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}