// src/main/java/com/exportanet/service/ProductoService.java
package com.exportanet.services;

import com.exportanet.model.Producto;
import com.exportanet.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository ProductoRepository;

    public List<Producto> findAll() {
        return ProductoRepository.findAll();
    }

    public Producto save(Producto Producto) {
        return ProductoRepository.save(Producto);
    }

    // Métodos adicionales según tus necesidades
}
