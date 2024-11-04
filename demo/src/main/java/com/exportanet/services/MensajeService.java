// src/main/java/com/exportanet/service/MensajeService.java
package com.exportanet.services;

import com.exportanet.model.Mensaje;
import com.exportanet.repository.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensajeService {
    @Autowired
    private MensajeRepository MensajeRepository;

    public List<Mensaje> findAll() {
        return MensajeRepository.findAll();
    }

    public Mensaje save(Mensaje Mensaje) {
        return MensajeRepository.save(Mensaje);
    }

    // Métodos adicionales según tus necesidades
}
