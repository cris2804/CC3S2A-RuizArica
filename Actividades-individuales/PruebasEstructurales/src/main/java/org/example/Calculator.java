package org.example;

public class Calculator {

        public int add(int numeroA, int numeroB) {
            return numeroA + numeroB;
        }

        public int substrac(int numeroA, int numeroB) {
            return numeroA - numeroB;
        }

        public int multpily(int numeroA, int numeroB) {
            return numeroA * numeroB;
        }

        public double division(int numeroA, int numeroB) {
            if (numeroB == 0) {
                throw new ArithmeticException("Division por cero");
            }
            return (double) numeroA / numeroB;
        }

}
