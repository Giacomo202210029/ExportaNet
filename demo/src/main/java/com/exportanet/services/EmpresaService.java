// src/main/java/com/exportanet/service/EmpresaService.java
package com.exportanet.services;

import com.exportanet.model.Empresa;
import com.exportanet.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    // Métodos adicionales según tus necesidades
}
