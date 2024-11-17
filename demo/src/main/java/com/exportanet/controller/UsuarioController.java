package com.exportanet.controller;

import com.exportanet.model.Usuario;
import com.exportanet.services.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuarios")
public class UsuarioController {

    private final UsuarioService UsuarioService;

    public UsuarioController(UsuarioService UsuarioService) {
        this.UsuarioService = UsuarioService;
    }

    @GetMapping("/all")
    public List<Usuario> getAllUsuarios() {
        List<Usuario> Usuarios = UsuarioService.findAll();
        Usuarios.forEach(System.out::println);  // Esto imprimirá cada Usuario en la consola
        return Usuarios;
    }


    @PostMapping("/add")
    public Usuario createUsuario(@RequestBody Usuario Usuario) {
        return UsuarioService.addUsuario(Usuario);
    }
}

