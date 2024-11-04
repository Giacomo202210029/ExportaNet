package com.exportanet.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import java.util.Date;

@Node
public class Empresa {
    @Id @GeneratedValue private Long id;
    private String nombre;
    private String tipo;
    private String descripcion;
    private String email;
    private Date fechaCreacion;
}
