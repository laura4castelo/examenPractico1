package com.corenetworks.pruebaPracticaExamen.prueba1.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
@Component(value = "ivaGeneral")
public class IvaGeneral implements Impuesto{
    private static final Double IVA = 0.4;

    @Override
    public Double calcularImpuesto(Producto p) {
        return p.getPrecio() * IVA;
    }
}
