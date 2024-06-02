package org.example;

import java.util.random.RandomGenerator;

public class LanzamientoDados {
    private final int NUMERO_LADOS = 6;
    private  final RandomGenerator random ;
    public LanzamientoDados(NumerosAleatorios aleatorios){
        this.random = (RandomGenerator) aleatorios;
    }
    public String asText(){
        int lanzado = random.nextInt(NUMERO_LADOS) + 1;
        return String.format("Lanzamiento: %d",lanzado);

    }



    }
