package br.com.apibackend.dto;

import br.com.apibackend.entity.PerfilEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author marcosrohloff
 */
@Getter
@Setter
@NoArgsConstructor
public class PerfilDTO {

    private String descricao;

    public PerfilDTO(PerfilEntity perfilEntity) {
        BeanUtils.copyProperties(perfilEntity, this);
    }

}
