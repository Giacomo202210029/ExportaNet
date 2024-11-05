// src/main/java/com/exportanet/controller/ProductoController.java
package com.exportanet.controller;

import com.exportanet.model.Producto;
import com.exportanet.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Productos")
public class ProductoController {
    @Autowired
    private ProductoService ProductoService;

    @GetMapping
    public List<Producto> getAllProductos() {
        return ProductoService.findAll();
    }

    @GetMapping
    public List <Producto> getProductobyId(@PathVariable Long id){
        return (List<Producto>) ProductoService.findById(id);
    }

    @PostMapping
    public Producto createProducto(@RequestBody Producto Producto) {
        return ProductoService.save(Producto);
    }
}
