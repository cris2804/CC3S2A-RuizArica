//package microwave.LCOM4;
//
//import java.util.Arrays;
//import java.util.HashSet;
//
//public class Main {
//       public static void main(String[] args) {
//           LCOM4Calculator.ClassInfo classInfo = new LCOM4Calculator.ClassInfo();
//
//           // Agregar métodos y atributos de CineManager
//           classInfo.addMethod("agregarPelicula", new HashSet<>(Arrays.asList("peliculaManager")));
//           classInfo.addMethod("eliminarPelicula", new HashSet<>(Arrays.asList("peliculaManager")));
//           classInfo.addMethod("sesionesPorPelicula", new HashSet<>(Arrays.asList("peliculaManager")));
//           classInfo.addMethod("programarSesion", new HashSet<>(Arrays.asList("peliculaManager")));
//           classInfo.addMethod("contarPeliculas", new HashSet<>(Arrays.asList("peliculaManager")));
//
//           classInfo.addMethod("agregarSala", new HashSet<>(Arrays.asList("salaManager")));
//           classInfo.addMethod("eliminarSala", new HashSet<>(Arrays.asList("salaManager")));
//           classInfo.addMethod("contarSalas", new HashSet<>(Arrays.asList("salaManager")));
//
//           int lcom4 = classInfo.calculateLCOM4();
//           System.out.println("LCOM4 = " + lcom4);}
//
//}
