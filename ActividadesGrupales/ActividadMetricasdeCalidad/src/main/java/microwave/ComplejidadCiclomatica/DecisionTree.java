//package microwave.ComplejidadCiclomatica;
//
//public class DecisionTree {
//    public static void main(String[] args) {
//        int a = Integer.parseInt(args[0]); // Nodo de entrada (rojo)
//        if (a > 10) { // Primer nodo blanco
//            if (a > 20) { // Segundo nodo blanco, parte superior
//                System.out.println("A is greater than 20");
//            } else {
//                System.out.println("A is greater than 10 but less than or equal to 20");
//            }
//            // Punto donde convergen las rutas después de la primera decisión
//            System.out.println("A is greater than 10");
//        } else {
//            System.out.println("A is 10 or less"); // Segundo nodo blanco, parte inferior
//        }
//        // Nodo de salida (azul)
//        System.out.println("Fin del programa ");
//    }
//}