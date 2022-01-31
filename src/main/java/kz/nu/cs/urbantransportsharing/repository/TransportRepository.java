package kz.nu.cs.urbantransportsharing.repository;

import kz.nu.cs.urbantransportsharing.domain.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends JpaRepository<Transport, Long> {
}
