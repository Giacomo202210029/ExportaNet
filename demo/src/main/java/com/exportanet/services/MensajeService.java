// src/main/java/com/exportanet/service/MensajeService.java
package com.exportanet.services;

import com.exportanet.model.Mensaje;
import com.exportanet.repository.MensajeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensajeService {
    private final MensajeRepository MensajeRepository;

    public MensajeService(MensajeRepository MensajeRepository) {
        this.MensajeRepository = MensajeRepository;
    }

    public List<Mensaje> findAll() {
        return MensajeRepository.findAll();
    }

    @Transactional
    public Mensaje addMensaje (Mensaje Mensaje) {
        return MensajeRepository.save(Mensaje);
    }


}

