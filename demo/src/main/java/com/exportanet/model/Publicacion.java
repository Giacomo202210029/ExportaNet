// src/main/java/com/exportanet/model/Publicacion.java
package com.exportanet.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import java.util.List;
import java.util.UUID;

@Node("Publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    @JsonProperty("id")
    private String id;

    @JsonProperty("titulo")
    private String titulo;

    @JsonProperty("contenido")
    private String contenido;

    @JsonProperty("fechaCreacion")
    private String fechaCreacion;

    @JsonProperty("likes")
    private int likes;

    @JsonProperty("comentarios")
    private List<String> comentarios;

    @Relationship(type = "POSTED_BY", direction = Relationship.Direction.OUTGOING)
    private Empresa empresa;

    public Publicacion(String titulo, String contenido, String fechaCreacion, int likes, List<String> comentarios) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
        this.likes = likes;
        this.comentarios = comentarios;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }

    public String getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(String fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public int getLikes() { return likes; }
    public void setLikes(int likes) { this.likes = likes; }

    public List<String> getComentarios() { return comentarios; }
    public void setComentarios(List<String> comentarios) { this.comentarios = comentarios; }
    // Getters and Setters
}
