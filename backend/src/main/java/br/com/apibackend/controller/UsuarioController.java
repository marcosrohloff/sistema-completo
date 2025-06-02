package br.com.apibackend.controller;

import br.com.apibackend.dto.UsuarioDTO;
import br.com.apibackend.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marcosrohloff
 */
@RestController
@RequestMapping
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    public List<UsuarioDTO> listarTodos() {
        return usuarioService.listarTodos();
    }
    
    @PostMapping
    public void inserir(@RequestBody UsuarioDTO usuario) {
        usuarioService.inserir(usuario);
    }

}
