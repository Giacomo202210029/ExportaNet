// src/main/java/com/exportanet/repository/EmpresaRepository.java
package com.exportanet.repository;

import com.exportanet.model.Documento;
import com.exportanet.model.Empresa;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface DocumentoRepository extends Neo4jRepository<Documento, Long> {
}
