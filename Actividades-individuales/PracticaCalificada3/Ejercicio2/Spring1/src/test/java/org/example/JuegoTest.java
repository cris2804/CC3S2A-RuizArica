package org.example;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JuegoTest {
    //prueba para verificar la corrcta inicializacion del juego
    @Test
    public void testJuego() {
        Juego juego = new Juego();
        assert (juego != null);
    }
    //inicializar el juego con un conjunto de habitaciones
    @Test
    public void testJuego2() {
        Juego juego = new Juego();
        assert (juego.crearHabitacion() != null);
    }

    @Test
    public void definirHabitacionTest() {
        // Arrange
        Juego juego = new Juego();
        Jugador jugador = new Jugador();
        Habitacion habitacion = juego.crearHabitacion();
        // Act
        String namehabitacion = juego.definirHabitacion(jugador,habitacion );
        // Assert
        assertThat(namehabitacion).isEqualTo("Habitacion inicial");
    }

}
