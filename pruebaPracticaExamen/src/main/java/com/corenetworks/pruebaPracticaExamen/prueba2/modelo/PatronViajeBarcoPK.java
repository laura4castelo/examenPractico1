package com.corenetworks.pruebaPracticaExamen.prueba2.modelo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class PatronViajeBarcoPK {
    @ManyToOne
    @JoinColumn(name="id_patrones", nullable = false,
            foreignKey = @ForeignKey(name="FK_ap_patrones"))
    private Patron patron;

    @ManyToOne
    @JoinColumn(name="id_barcos", nullable = false,
            foreignKey = @ForeignKey(name="FK_ap_barcos"))
    private Barco barco;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PatronViajeBarcoPK that)) return false;
        return Objects.equals(patron, that.patron) && Objects.equals(barco, that.barco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patron, barco);
    }
}
