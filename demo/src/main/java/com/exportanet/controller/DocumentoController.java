package com.exportanet.controller;

import com.exportanet.model.Documento;
import com.exportanet.services.DocumentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Documentos")
public class DocumentoController {

    private final DocumentoService documentoService;

    public DocumentoController(DocumentoService documentoService) {
        this.documentoService = documentoService;
    }

    @GetMapping("/all")
    public List<Documento> getAllDocumentos() {
        List<Documento> documentos = documentoService.findAll();
        documentos.forEach(System.out::println);  // Esto imprimirá cada documento en la consola
        return documentos;
    }


    @PostMapping("/add")
    public Documento createDocumento(@RequestBody Documento documento) {
        return documentoService.addDocumento(documento);
    }
}

