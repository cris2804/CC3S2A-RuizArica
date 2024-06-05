package org.example;

import org.junit.jupiter.api.Test;

public class CrearHabitacionTest {
    @Test
    public void testCrearHabitacion() {
        // Arrange
        Juego juego = new Juego();
        // Act
        Habitacion habitacion = juego.crearHabitacion();
        // Assert
        assert (habitacion != null);
    }
}
