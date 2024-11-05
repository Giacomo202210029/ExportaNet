// src/main/java/com/exportanet/controller/UsuarioController.java
package com.exportanet.controller;

import com.exportanet.model.Usuario;
import com.exportanet.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService UsuarioService;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return UsuarioService.findAll();
    }

    @GetMapping
    public List <Usuario> getUsuariobyId(@PathVariable Long id){
        return (List<Usuario>) UsuarioService.findById(id);
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario Usuario) {
        return UsuarioService.save(Usuario);
    }
}
