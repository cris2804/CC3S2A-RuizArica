//package microwave.ComplejidadCiclomatica;
//
//public class ComplexDecisionFlow {
//    public static void main(String[] args) {
//        int x = Integer.parseInt(args[0]); // Nodo de entrada
//        if (x > 10) { // Primer nodo blanco desde la entrada
//            System.out.println("X is greater than 10");
//            if (x > 20) { // Segundo nodo blanco a la derecha
//                System.out.println("X is also greater than 20");
//            } else {
//                System.out.println("X is not greater than 20");
//            }
//            System.out.println("After checking x > 20"); // Nodo blanco que une las rutas
//        } else {
//            System.out.println("X is not greater than 10"); // Segundo nodo blanco a la izquierda
//        }
//        System.out.println("End of the flow"); // Nodo de salida
//    }
//}
