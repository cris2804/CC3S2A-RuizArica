package metricas.ComplejidadCiclomatica;

public class Refactor {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println(determineMessage(a));
    }

    private static String determineMessage(int a) {
        if (a > 100) {
            return "A is greater than 100";
        } else if (a > 50) {
            return "A is greater than 50 but not more than 100";
        } else if (a < 20) {
            return "A is less than 20";
        } else {
            return "A is between 20 and 50";
        }
    }
}
