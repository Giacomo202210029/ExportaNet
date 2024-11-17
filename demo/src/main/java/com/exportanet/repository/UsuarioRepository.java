// src/main/java/com/exportanet/repository/EmpresaRepository.java
package com.exportanet.repository;

import com.exportanet.model.Empresa;
import com.exportanet.model.Usuario;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UsuarioRepository extends Neo4jRepository<Usuario, String> {
}
