package com.corenetworks.pruebaPracticaExamen.prueba2.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "personas")
public class Barco {
    @Id
    private String matricula;
    @Column(length = 60,nullable = false)
    private String amarre;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(length = 60,nullable = false)
    private Double cuota;

    @ManyToOne
    @JoinColumn(name="dni_persona", nullable = false,
            foreignKey = @ForeignKey(name = "FK_barcos_personas"))
    private Persona persona;


}
