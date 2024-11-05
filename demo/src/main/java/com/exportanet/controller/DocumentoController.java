// src/main/java/com/exportanet/controller/DocumentoController.java
package com.exportanet.controller;

import com.exportanet.model.Documento;
import com.exportanet.services.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Documentos")
public class DocumentoController {
    @Autowired
    private DocumentoService DocumentoService;

    @GetMapping
    public List<Documento> getAllDocumentos() {
        return DocumentoService.findAll();
    }

    @GetMapping("/{id}")
    public Documento getDocumentobyId(@PathVariable Long id) {
        return DocumentoService.findById(id);
    }


    @PostMapping
    public Documento createDocumento(@RequestBody Documento Documento) {
        return DocumentoService.save(Documento);
    }
}
