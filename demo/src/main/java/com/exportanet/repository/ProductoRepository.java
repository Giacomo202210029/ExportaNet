package com.exportanet.repository;

import com.exportanet.model.Producto;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ProductoRepository extends Neo4jRepository<Producto, Long> {
}
