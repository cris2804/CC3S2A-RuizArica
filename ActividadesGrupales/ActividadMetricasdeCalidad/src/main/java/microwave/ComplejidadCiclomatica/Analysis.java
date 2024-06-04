package metricas.ComplejidadCiclomatica;

public class Analysis {
    public static void process(int number) {
        if (number > 0) { //nodo inicial
            if (number % 2 == 0) { //nodo intermedio
                System.out.println("Positive even number");
            } else {
                System.out.println("Positive odd number");
            }
        } else if (number < 0) {
            if (number % 2 == 0) {
                System.out.println("Negative even number");
            } else {
                System.out.println("Negative odd number");
            }
        } else {
            System.out.println("Number is zero");
        }//nodo final
    }
}