package cz.fridl.openvpn.services;

import cz.fridl.openvpn.dao.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}