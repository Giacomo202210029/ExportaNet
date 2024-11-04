// src/main/java/com/exportanet/service/PublicacionService.java
package com.exportanet.services;

import com.exportanet.model.Publicacion;
import com.exportanet.repository.PublicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionService {
    @Autowired
    private PublicacionRepository PublicacionRepository;

    public List<Publicacion> findAll() {
        return PublicacionRepository.findAll();
    }

    public Publicacion save(Publicacion Publicacion) {
        return PublicacionRepository.save(Publicacion);
    }

    // Métodos adicionales según tus necesidades
}
