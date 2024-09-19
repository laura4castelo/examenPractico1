package com.corenetworks.pruebaPracticaExamen.prueba1.modelo;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Producto {
    private String nombre;
    private Double precio;
}
