package org.jhipster.blog.repository;

import java.time.LocalDate;
import java.util.List;
import org.jhipster.blog.domain.PersistentToken;
import org.jhipster.blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link PersistentToken} entity.
 */
public interface PersistentTokenRepository extends JpaRepository<PersistentToken, String> {
    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);
}
