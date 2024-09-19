package com.corenetworks.pruebaPracticaExamen.prueba2.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="patrones_barcos")
@IdClass(PatronViajeBarcoPK.class)
public class PatronViajeBarco {
    @Id
    private Patron patron;

    @Id
    private Barco barco;

    // resto de atributos:
    private String destino;
    private Date fSalida;
    private Time hSalida;

}
