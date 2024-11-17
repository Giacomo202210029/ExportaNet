package com.exportanet.controller;

import com.exportanet.model.Mensaje;
import com.exportanet.services.MensajeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Mensajes")
public class MensajeController {

    private final MensajeService MensajeService;

    public MensajeController(MensajeService MensajeService) {
        this.MensajeService = MensajeService;
    }

    @GetMapping("/all")
    public List<Mensaje> getAllMensajes() {
        List<Mensaje> Mensajes = MensajeService.findAll();
        Mensajes.forEach(System.out::println);  // Esto imprimirá cada Mensaje en la consola
        return Mensajes;
    }


    @PostMapping("/add")
    public Mensaje createMensaje(@RequestBody Mensaje Mensaje) {
        return MensajeService.addMensaje(Mensaje);
    }
}

