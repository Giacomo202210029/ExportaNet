// src/main/java/com/exportanet/service/EmpresaService.java
package com.exportanet.services;

import com.exportanet.model.Empresa;
import com.exportanet.repository.EmpresaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    private final EmpresaRepository EmpresaRepository;

    public EmpresaService(EmpresaRepository EmpresaRepository) {
        this.EmpresaRepository = EmpresaRepository;
    }

    public List<Empresa> findAll() {
        return EmpresaRepository.findAll();
    }

    @Transactional
    public Empresa addEmpresa (Empresa Empresa) {
        return EmpresaRepository.save(Empresa);
    }


}

