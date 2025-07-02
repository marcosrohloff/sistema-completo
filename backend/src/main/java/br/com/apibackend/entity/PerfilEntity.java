package br.com.apibackend.entity;

import br.com.apibackend.dto.PerfilDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author marcosrohloff
 */
@Entity
@Table(name = "NPL_PERFIL")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class PerfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = true)
    private String descricao;

    public PerfilEntity(PerfilDTO perfilDTO) {
        BeanUtils.copyProperties(perfilDTO, this);
    }

}
