package com.corenetworks.pruebaPracticaExamen;

import com.corenetworks.pruebaPracticaExamen.prueba1.modelo.Factura;
import com.corenetworks.pruebaPracticaExamen.prueba1.modelo.Impuesto;
import com.corenetworks.pruebaPracticaExamen.prueba1.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.List;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication()
public class PruebaPracticaExamenApplication implements CommandLineRunner {

	@Autowired
	private Factura factura;

	@Autowired
	@Qualifier("ivaGeneral")
	Impuesto impuestoIvaGeneral;

	@Autowired
	@Qualifier("ivaSuperReducido")
	Impuesto impuestoSuperReducido;

	@Autowired
	private Factura facturaIvaSuperReducido;

	public static void main(String[] args) {
		SpringApplication.run(PruebaPracticaExamenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Producto> productos = List.of(
									new Producto("patatas", 5.7),
									new Producto("manzanas", 3.7)
		)							;


		factura.setProductos(productos);

		factura.setImpuesto(impuestoIvaGeneral);
		System.out.println("La factura con iva general es de: " + factura.calcularTotalFactura());

		factura.setImpuesto(impuestoSuperReducido);
		System.out.println("La factura con iva reducido es de: " + factura.calcularTotalFactura());


		//////////////////// prueba Persona Barcos Viajar ///////////////////////
	}
}
