// src/main/java/com/exportanet/model/Mensaje.java
package com.exportanet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;


import java.util.Date;
import java.util.UUID;

@Node("Mensaje")
public class Mensaje {
    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    @JsonProperty("id")
    private String id;

    @JsonProperty("contenido")
    private String contenido;

    @JsonProperty("adjuntos")
    private String adjuntos;

    @JsonProperty("fechaEnvio")
    private String fechaEnvio;

    @Relationship(type = "SENT_FROM", direction = Relationship.Direction.OUTGOING)
    private Empresa empresaRemitente;

    @Relationship(type = "SENT_TO", direction = Relationship.Direction.OUTGOING)
    private Empresa empresaDestinatario;


    public Mensaje(String contenido, String adjuntos, String fechaEnvio) {
        this.contenido = contenido;
        this.adjuntos = adjuntos;
        this.fechaEnvio = fechaEnvio;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }

    public String getAdjuntos() { return adjuntos; }
    public void setAdjuntos(String adjuntos) { this.adjuntos = adjuntos; }

    public String getFechaEnvio() { return fechaEnvio; }
    public void setFechaEnvio(String fechaEnvio) { this.fechaEnvio = fechaEnvio; }

    // Getters and Setters
}
