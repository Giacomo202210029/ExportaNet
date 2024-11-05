// src/main/java/com/exportanet/controller/PublicacionController.java
package com.exportanet.controller;

import com.exportanet.model.Publicacion;
import com.exportanet.services.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Publicacions")
public class PublicacionController {
    @Autowired
    private PublicacionService PublicacionService;

    @GetMapping("/{id}")
    public List<Publicacion> getAllPublicacions() {
        return PublicacionService.findAll();
    }

    @GetMapping
    public Publicacion getPublicacionbyId(@PathVariable Long id){
        return  PublicacionService.findById(id);
    }

    @PostMapping
    public Publicacion createPublicacion(@RequestBody Publicacion Publicacion) {
        return PublicacionService.save(Publicacion);
    }
}
