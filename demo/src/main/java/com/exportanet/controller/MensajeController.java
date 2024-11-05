// src/main/java/com/exportanet/controller/MensajeController.java
package com.exportanet.controller;

import com.exportanet.model.Mensaje;
import com.exportanet.services.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Mensajes")
public class MensajeController {
    @Autowired
    private MensajeService MensajeService;

    @GetMapping
    public List<Mensaje> getAllMensajes() {
        return MensajeService.findAll();
    }

    @GetMapping("/{id}")
    public Mensaje getMensajebyId(@PathVariable Long id){
        return MensajeService.findById(id);
    }

    @PostMapping
    public Mensaje createMensaje(@RequestBody Mensaje Mensaje) {
        return MensajeService.save(Mensaje);
    }
}
