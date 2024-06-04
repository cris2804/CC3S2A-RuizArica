package microwave.ComplejidadCiclomatica;

public class FlowControl {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a > 0) {
            if (b > 0) {
                System.out.println("Path 1: a > 0, b > 0");
            } else {
                System.out.println("Path 2: a > 0, b <= 0");
            }
        } else {
            if (b > 0) {
                System.out.println("Path 3: a <= 0, b > 0");
            } else {
                System.out.println("Path 4: a <= 0, b <= 0");
            }
        }
    }
}
