// src/main/java/com/exportanet/service/UsuarioService.java
package com.exportanet.services;

import com.exportanet.model.Usuario;
import com.exportanet.model.Usuario;
import com.exportanet.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository UsuarioRepository;

    public List<Usuario> findAll() {
        return UsuarioRepository.findAll();
    }

    public Usuario save(Usuario Usuario) {
        return UsuarioRepository.save(Usuario);
    }
    public Usuario findById(Long id) {
        return UsuarioRepository.findById(id).orElse(null);
    }

    // Métodos adicionales según tus necesidades
}
