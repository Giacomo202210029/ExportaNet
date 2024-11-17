package com.exportanet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;


@Node("Empresa")
public class Empresa {
    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    @JsonProperty("id")
    private String id;

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("descripcion")
    private String descripcion;

    @JsonProperty("email")
    private String email;

    @JsonProperty("fechaCreacion")
    private String fechaCreacion;

    public Empresa(String nombre, String tipo, String descripcion, String email, String fechaCreacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.email = email;
        this.fechaCreacion = fechaCreacion;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(String fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    // Getters and Setters



}
