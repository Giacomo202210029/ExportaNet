// src/main/java/com/exportanet/model/Documento.java
package com.exportanet.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Date;

@Node
public class Documento {
    @Id @GeneratedValue private Long id;
    private String tipoDocumento;
    private String urlDocumento;
    private Date fechaSubida;

    @Relationship(type = "BELONGS_TO", direction = Relationship.Direction.OUTGOING)
    private Empresa empresa;

    // Getters and Setters
}
