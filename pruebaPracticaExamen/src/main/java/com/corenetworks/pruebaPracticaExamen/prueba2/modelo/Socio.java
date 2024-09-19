package com.corenetworks.pruebaPracticaExamen.prueba2.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Socio extends Persona {
    private Integer idSocio;
}
