package kz.nu.cs.urbantransportsharing.repository;

import kz.nu.cs.urbantransportsharing.domain.Scooter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScooterRepository extends JpaRepository<Scooter, Long> {
}
