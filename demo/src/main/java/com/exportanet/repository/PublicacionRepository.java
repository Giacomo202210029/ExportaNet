// src/main/java/com/exportanet/repository/EmpresaRepository.java
package com.exportanet.repository;

import com.exportanet.model.Empresa;
import com.exportanet.model.Publicacion;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PublicacionRepository extends Neo4jRepository<Publicacion, String> {
}
