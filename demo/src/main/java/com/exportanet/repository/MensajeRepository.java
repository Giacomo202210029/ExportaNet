// src/main/java/com/exportanet/repository/EmpresaRepository.java
package com.exportanet.repository;

import com.exportanet.model.Empresa;
import com.exportanet.model.Mensaje;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MensajeRepository extends Neo4jRepository<Mensaje, String> {
}
