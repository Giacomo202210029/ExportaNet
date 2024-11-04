// src/main/java/com/exportanet/model/Publicacion.java
package com.exportanet.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Date;
import java.util.List;

@Node
public class Publicacion {
    @Id @GeneratedValue private Long id;
    private String titulo;
    private byte[] contenido;
    private Date fechaCreacion;
    private int likes;
    private List<String> comentarios;

    @Relationship(type = "POSTED_BY", direction = Relationship.Direction.OUTGOING)
    private Empresa empresa;

    // Getters and Setters
}
