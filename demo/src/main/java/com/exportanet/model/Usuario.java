// src/main/java/com/exportanet/model/Usuario.java
package com.exportanet.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class Usuario {
    @Id @GeneratedValue private Long id;
    private String nombre;
    private String rol;
    private String email;
    private String contrasena;

    @Relationship(type = "WORKS_FOR", direction = Relationship.Direction.OUTGOING)
    private Empresa empresa;

    // Getters and Setters
}
