package com.corenetworks.pruebaPracticaExamen.prueba1.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Factura {
    private Impuesto impuesto;
    private List<Producto> productos;

    public Double calcularTotalFactura() {
        double resultado = 0.0;

        for(Producto producto : productos) {
            resultado += producto.getPrecio() + impuesto.calcularImpuesto(producto);
        }
        return resultado;

        // también se puede hacer así:
//        productos.stream()
//                .mapToDouble(p ->p.getPrecio() + impuesto.calcularImpuesto(p))
//                .sum();
    }
}
