package com.exportanet.controller;

import com.exportanet.model.Empresa;
import com.exportanet.services.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Empresas")
public class EmpresaController {

    private final EmpresaService EmpresaService;

    public EmpresaController(EmpresaService EmpresaService) {
        this.EmpresaService = EmpresaService;
    }

    @GetMapping("/all")
    public List<Empresa> getAllEmpresas() {
        List<Empresa> Empresas = EmpresaService.findAll();
        Empresas.forEach(System.out::println);  // Esto imprimirá cada Empresa en la consola
        return Empresas;
    }


    @PostMapping("/add")
    public Empresa createEmpresa(@RequestBody Empresa Empresa) {
        return EmpresaService.addEmpresa(Empresa);
    }
}

