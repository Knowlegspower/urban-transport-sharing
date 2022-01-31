package kz.nu.cs.urbantransportsharing.repository;

import kz.nu.cs.urbantransportsharing.domain.RefreshToken;
import kz.nu.cs.urbantransportsharing.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);

    @Modifying
    int deleteByUser(User user);
}
