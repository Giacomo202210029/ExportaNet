// src/main/java/com/exportanet/model/Usuario.java
package com.exportanet.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

import java.util.UUID;

@Node("Usuario")
public class Usuario {
    @Id
    @GeneratedValue(UUIDStringGenerator.class)
    @JsonProperty("id")
    private String id;

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("apellido")
    private String rol;

    @JsonProperty("email")
    private String email;

    @JsonProperty("contrasena")
    private String contrasena;

    @Relationship(type = "WORKS_FOR", direction = Relationship.Direction.OUTGOING)
    private Empresa empresa;

    public Usuario(String nombre, String rol, String email, String contrasena) {
        this.nombre = nombre;
        this.rol = rol;
        this.email = email;
        this.contrasena = contrasena;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
    // Getters and Setters
}
