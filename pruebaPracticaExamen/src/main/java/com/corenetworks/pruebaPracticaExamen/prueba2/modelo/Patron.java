package com.corenetworks.pruebaPracticaExamen.prueba2.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Patron  extends Persona {
    private Integer horasNavegadas;
    private String titulo;
    private String carnet;
}
