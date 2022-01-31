package kz.nu.cs.urbantransportsharing.repository;

import kz.nu.cs.urbantransportsharing.domain.Role;
import kz.nu.cs.urbantransportsharing.domain.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
