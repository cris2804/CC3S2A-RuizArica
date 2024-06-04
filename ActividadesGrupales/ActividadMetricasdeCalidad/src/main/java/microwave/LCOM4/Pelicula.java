package metricas.LCOM4;

import java.util.*;

public class Pelicula {
    private String titulo;
    private List<Sesion> sesiones;
    public Pelicula(String titulo) {
        this.titulo = titulo;
        sesiones = new ArrayList<>();
    }
    public void agregarSesion(Sesion sesion) {
        sesiones.add(sesion);
    }
    public String getTitulo() {
        return titulo;
    }
    public List<Sesion> getSesiones() {
        return new ArrayList<>(sesiones);
    }
    }

    class Sala {
        private int id;
        private int capacidad;
        public Sala(int id, int capacidad) {
            this.id = id;
            this.capacidad = capacidad;
        }
        public int getId() {
            return id;
        }
    }
    class Sesion {
        private String horaInicio;
        private int duracion; // Duración en minutos
        public Sesion(String horaInicio, int duracion) {
            this.horaInicio = horaInicio;
            this.duracion = duracion;
        }

}
