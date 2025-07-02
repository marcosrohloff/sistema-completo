package br.com.apibackend.service;

import br.com.apibackend.dto.PerfilUsuarioDTO;
import br.com.apibackend.entity.PerfilUsuarioEntity;
import br.com.apibackend.repository.PerfilUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marcosrohloff
 */
@Service
public class PerfilUsuarioService {

    @Autowired
    private PerfilUsuarioRepository perfilUsuarioRepository;

    public List<PerfilUsuarioDTO> listarTodos() {
        List<PerfilUsuarioEntity> perfilUsuarios = perfilUsuarioRepository.findAll();
        return perfilUsuarios.stream().map(PerfilUsuarioDTO::new).toList();
    }

    public void inserir(PerfilUsuarioDTO perfilUsuario) {
        PerfilUsuarioEntity perfilUsuarioEntity = new PerfilUsuarioEntity(perfilUsuario);
        perfilUsuarioRepository.save(perfilUsuarioEntity);
    }

    public PerfilUsuarioDTO alterar(PerfilUsuarioDTO perfilUsuario) {
        PerfilUsuarioEntity perfilUsuarioEntity = new PerfilUsuarioEntity(perfilUsuario);
        return new PerfilUsuarioDTO(perfilUsuarioRepository.save(perfilUsuarioEntity));
    }

    public void excluir(Long id) {
        PerfilUsuarioEntity recurso = perfilUsuarioRepository.findById(id).get();
        perfilUsuarioRepository.delete(recurso);
    }

    public PerfilUsuarioDTO buscarPorId(Long id) {
        return new PerfilUsuarioDTO(perfilUsuarioRepository.findById(id).get());
    }

}
