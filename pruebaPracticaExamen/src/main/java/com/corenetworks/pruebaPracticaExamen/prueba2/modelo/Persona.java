package com.corenetworks.pruebaPracticaExamen.prueba2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {
    @Id
    private String dni;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(length = 60,nullable = false)
    private String direccion;
    private Boolean asociado;
}
