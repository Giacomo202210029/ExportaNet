// src/main/java/com/exportanet/service/ProductoService.java
package com.exportanet.services;

import com.exportanet.model.Producto;
import com.exportanet.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository ProductoRepository;

    public ProductoService(ProductoRepository ProductoRepository) {
        this.ProductoRepository = ProductoRepository;
    }

    public List<Producto> findAll() {
        return ProductoRepository.findAll();
    }

    @Transactional
    public Producto addProducto (Producto Producto) {
        return ProductoRepository.save(Producto);
    }


}

