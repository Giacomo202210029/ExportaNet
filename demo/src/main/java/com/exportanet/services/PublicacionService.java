// src/main/java/com/exportanet/service/PublicacionService.java
package com.exportanet.services;

import com.exportanet.model.Publicacion;
import com.exportanet.repository.PublicacionRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionService {
    private final PublicacionRepository PublicacionRepository;

    public PublicacionService(PublicacionRepository PublicacionRepository) {
        this.PublicacionRepository = PublicacionRepository;
    }

    public List<Publicacion> findAll() {
        return PublicacionRepository.findAll();
    }

    @Transactional
    public Publicacion addPublicacion (Publicacion Publicacion) {
        return PublicacionRepository.save(Publicacion);
    }


}

