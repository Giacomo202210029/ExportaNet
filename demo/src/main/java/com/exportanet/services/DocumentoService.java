// src/main/java/com/exportanet/service/DocumentoService.java
package com.exportanet.services;

import com.exportanet.model.Documento;
import com.exportanet.repository.DocumentoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoService {
    private final DocumentoRepository documentoRepository;

    public DocumentoService(DocumentoRepository documentoRepository) {
        this.documentoRepository = documentoRepository;
    }

    public List<Documento> findAll() {
        return documentoRepository.findAll();
    }

    @Transactional
    public Documento addDocumento (Documento documento) {
        return documentoRepository.save(documento);
    }


}

