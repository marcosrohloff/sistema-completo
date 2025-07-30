package br.com.apibackend.repository;

import br.com.apibackend.entity.UsuarioVerificadorEntity;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author marcosrohloff
 */
public interface UsuarioVerificadorRepository extends JpaRepository<UsuarioVerificadorEntity, Long> {
    
    public Optional<UsuarioVerificadorEntity> findByUuid(UUID uuid);

}
