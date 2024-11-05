// src/main/java/com/exportanet/controller/EmpresaController.java
package com.exportanet.controller;

import com.exportanet.model.Empresa;
import com.exportanet.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public List<Empresa> getAllEmpresas() {
        return empresaService.findAll();
    }

    @GetMapping("/{id}")
    public Empresa getEmpresabyId(@PathVariable Long id){
        return empresaService.findById(id);
    }

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return empresaService.save(empresa);
    }
}
