// src/main/java/com/exportanet/model/Mensaje.java
package com.exportanet.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.Date;

@Node
public class Mensaje {
    @Id @GeneratedValue private Long id;
    private String contenido;
    private byte[] adjuntos;
    private Date fechaEnvio;

    @Relationship(type = "SENT_FROM", direction = Relationship.Direction.OUTGOING)
    private Empresa empresaRemitente;

    @Relationship(type = "SENT_TO", direction = Relationship.Direction.OUTGOING)
    private Empresa empresaDestinatario;

    // Getters and Setters
}
