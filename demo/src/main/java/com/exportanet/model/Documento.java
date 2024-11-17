// src/main/java/com/exportanet/model/Documento.java
package com.exportanet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import java.util.Date;
import java.util.UUID;

@Node("Documento")
public class Documento {
    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    @JsonProperty("id")
    private String id;

    @JsonProperty("tipoDocumento")
    private String tipoDocumento;

    @JsonProperty("fechaSubida")
    private String fechaSubida;

    @JsonProperty("urlDocumento")
    private String urlDocumento;


    public Documento(String tipoDocumento, String urlDocumento, String fechaSubida) {
        this.tipoDocumento = tipoDocumento;
        this.urlDocumento = urlDocumento;
        this.fechaSubida = fechaSubida;
    }

    @Relationship(type = "BELONGS_TO", direction = Relationship.Direction.OUTGOING)
    private Empresa empresa;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }

    public String getFechaSubida() { return fechaSubida; }
    public void setFechaSubida(String fechaSubida) { this.fechaSubida = fechaSubida; }

    public String getUrlDocumento() { return urlDocumento; }
    public void setUrlDocumento(String urlDocumento) { this.urlDocumento = urlDocumento; }
    // Getters and Setters
}
