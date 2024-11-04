// src/main/java/com/exportanet/service/DocumentoService.java
package com.exportanet.services;

import com.exportanet.model.Documento;
import com.exportanet.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoService {
    @Autowired
    private DocumentoRepository DocumentoRepository;

    public List<Documento> findAll() {
        return DocumentoRepository.findAll();
    }

    public Documento save(Documento Documento) {
        return DocumentoRepository.save(Documento);
    }

    // Métodos adicionales según tus necesidades
}
