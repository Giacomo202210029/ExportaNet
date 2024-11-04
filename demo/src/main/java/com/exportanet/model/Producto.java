package com.exportanet.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class Producto {
    @Id private Long id;
    private String nombre;
    private String descripcion;
    private String categoria;
    private byte[] imagenes;

    @Relationship(type = "BELONGS_TO")
    private Empresa empresa;
}
