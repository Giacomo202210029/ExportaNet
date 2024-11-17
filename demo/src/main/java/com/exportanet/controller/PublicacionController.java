package com.exportanet.controller;

import com.exportanet.model.Publicacion;
import com.exportanet.services.PublicacionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Publicacions")
public class PublicacionController {

    private final PublicacionService PublicacionService;

    public PublicacionController(PublicacionService PublicacionService) {
        this.PublicacionService = PublicacionService;
    }

    @GetMapping("/all")
    public List<Publicacion> getAllPublicacions() {
        List<Publicacion> Publicacions = PublicacionService.findAll();
        Publicacions.forEach(System.out::println);  // Esto imprimirá cada Publicacion en la consola
        return Publicacions;
    }


    @PostMapping("/add")
    public Publicacion createPublicacion(@RequestBody Publicacion Publicacion) {
        return PublicacionService.addPublicacion(Publicacion);
    }
}

