package com.exportanet.controller;

import com.exportanet.model.Producto;
import com.exportanet.services.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Productos")
public class ProductoController {

    private final ProductoService ProductoService;

    public ProductoController(ProductoService ProductoService) {
        this.ProductoService = ProductoService;
    }

    @GetMapping("/all")
    public List<Producto> getAllProductos() {
        List<Producto> Productos = ProductoService.findAll();
        Productos.forEach(System.out::println);  // Esto imprimirá cada Producto en la consola
        return Productos;
    }


    @PostMapping("/add")
    public Producto createProducto(@RequestBody Producto Producto) {
        return ProductoService.addProducto(Producto);
    }
}

