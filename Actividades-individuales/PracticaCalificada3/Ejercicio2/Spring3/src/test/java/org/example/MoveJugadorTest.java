//package org.example;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class MoveJugadorTest {
//    @Test
//    public void testMoveJugador() {
//        // Arrange
//        Juego juego = new Juego();
//        Jugador jugador = new Jugador();
//        // Act
//        boolean result = juego.moveJugador(jugador, "mover norte");
//        // Assert
//        assertTrue(result);
//    }
//    //prueba para verificar el movimiento del jugador entre habitaciones usando comandos
//    @Test
//    public void testnameMoveJugador2(){
//        Juego juego = new Juego();
//        Jugador jugador = new Jugador();
//        Habitacion habitacion = new Habitacion();
//        juego.definirHabitacion(jugador, habitacion);
//        // Act
//        String resultado = juego.namemoveJugador("mover norte");
//        // Assert
//        assertEquals("mover norte", resultado);
//    }
//}
