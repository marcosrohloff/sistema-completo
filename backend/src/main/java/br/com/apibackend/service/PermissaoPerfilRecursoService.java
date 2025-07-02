package br.com.apibackend.service;

import br.com.apibackend.dto.PermissaoPerfilRecursoDTO;
import br.com.apibackend.entity.PermissaoPerfilRecursoEntity;
import br.com.apibackend.repository.PermissaoPerfilRecursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marcosrohloff
 */
@Service
public class PermissaoPerfilRecursoService {

    @Autowired
    private PermissaoPerfilRecursoRepository permissaoPerfilRecursoRepository;

    public List<PermissaoPerfilRecursoDTO> listarTodos() {
        List<PermissaoPerfilRecursoEntity> permissaoPerfilRecusos = permissaoPerfilRecursoRepository.findAll();
        return permissaoPerfilRecusos.stream().map(PermissaoPerfilRecursoDTO::new).toList();
    }

    public void inserir(PermissaoPerfilRecursoDTO permissaoPerfilRecurso) {
        PermissaoPerfilRecursoEntity permissaoPerfilRecursoEntity = new PermissaoPerfilRecursoEntity(permissaoPerfilRecurso);
        permissaoPerfilRecursoRepository.save(permissaoPerfilRecursoEntity);
    }

    public PermissaoPerfilRecursoDTO alterar(PermissaoPerfilRecursoDTO permissaoPerfilRecurso) {
        PermissaoPerfilRecursoEntity permissaoPerfilRecursoEntity = new PermissaoPerfilRecursoEntity(permissaoPerfilRecurso);
        return new PermissaoPerfilRecursoDTO(permissaoPerfilRecursoRepository.save(permissaoPerfilRecursoEntity));
    }

    public void excluir(Long id) {
        PermissaoPerfilRecursoEntity permissaoPerfilRecurso = permissaoPerfilRecursoRepository.findById(id).get();
        permissaoPerfilRecursoRepository.delete(permissaoPerfilRecurso);
    }
    
    public PermissaoPerfilRecursoDTO buscarPorId(Long id) {
        return new PermissaoPerfilRecursoDTO(permissaoPerfilRecursoRepository.findById(id).get());
    }

}
