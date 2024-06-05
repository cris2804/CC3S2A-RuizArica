package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Juego {
    private Habitacion habitacionActual;
    private Map<String, String> movimientos;
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciarJuego();
    }
    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estas en una habitacion oscura");
        while (true){
            String movimiento = scanner.nextLine();
            if (movimiento.equalsIgnoreCase("salir")){
                System.out.println("Hasta la proxima!");
                break;
            }
            else if (movimiento.equalsIgnoreCase("mover norte")){
                System.out.println("Estas en una biblioteca");
            }
            else if (movimiento.equalsIgnoreCase("mover sur")){
                System.out.println("Estas en una casa");
            }
            else if (movimiento.equalsIgnoreCase("mover este")){
                System.out.println("Estas en una escuela");
            }
            else if (movimiento.equalsIgnoreCase("mover oeste")){
                System.out.println("Estas en una hostpital");
            }
        }
    }


    public Habitacion crearHabitacion() {
        return new Habitacion();
    }

    public String namemoveJugador(String movimiento) {
        movimientos = new HashMap<>();
        movimientos.put("mover norte", habitacionActual.getHabitacion());
        movimientos.put("mover sur", habitacionActual.getHabitacion());
        movimientos.put("mover este", habitacionActual.getHabitacion());
        movimientos.put("mover oeste", habitacionActual.getHabitacion());
        return movimientos.get(movimiento);
    }
    public boolean moveJugador(Jugador jugador, String movimiento) {
        if (movimiento.equalsIgnoreCase("mover norte")) {
            return true;
        } else if (movimiento.equalsIgnoreCase("mover sur")) {
            return true;
        } else if (movimiento.equalsIgnoreCase("mover este")) {
            return true;
        } else if (movimiento.equalsIgnoreCase("mover oeste")) {
            return true;
        }

        return false;
    }

    public String definirHabitacion(Jugador jugador, Habitacion habitacion) {
        return "Habitacion inicial";
    }
}
/*
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Juego {
    private Habitacion habitacionActual;
    private Map<String, String> movimientos;

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciarJuego();
    }

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego. Ingrese un movimiento:");

        while (true) {
            String movimiento = scanner.nextLine();

            if (movimiento.equalsIgnoreCase("salir")) {
                System.out.println("Hasta la proxima!");
                break;
            }

            String resultado = this.moveJugador(movimiento);
            System.out.println(resultado);
        }
    }

    public String moveJugador(String movimiento) {
        movimientos = new HashMap<>();
        movimientos.put("mover norte", habitacionActual.getHabitacionNorte());
* */