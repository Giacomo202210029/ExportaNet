// src/main/java/com/exportanet/repository/EmpresaRepository.java
package com.exportanet.repository;

import com.exportanet.model.Empresa;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface EmpresaRepository extends Neo4jRepository<Empresa, String> {
}
