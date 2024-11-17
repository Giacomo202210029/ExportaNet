// src/main/java/com/exportanet/service/UsuarioService.java
package com.exportanet.services;

import com.exportanet.model.Usuario;
import com.exportanet.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository UsuarioRepository;

    public UsuarioService(UsuarioRepository UsuarioRepository) {
        this.UsuarioRepository = UsuarioRepository;
    }

    public List<Usuario> findAll() {
        return UsuarioRepository.findAll();
    }

    @Transactional
    public Usuario addUsuario (Usuario Usuario) {
        return UsuarioRepository.save(Usuario);
    }


}

