package org.example;

public class Money {
    private final int amount; // amount = la cantidad de dinero
    private final String currency;//currency = el tipo de la moneda
    public Money(int amount, String currency) { //constructor
        if(amount<0){
            throw new IllegalArgumentException("ilegal amount: ["+amount+"]");
            //comprueba que la cantidad sea positiva y no negativa
        }
        this.amount = amount;
        this.currency = currency;
    }
    public int getAmount() {
        return amount;
    } //getters para obtener los atributos
    public String getCurrency() {
        return currency;
    }//getters para obtener los atributos
    public boolean equals(Object anObject) {//metodo equals para saber si dos objetos son iguales
        if (anObject instanceof Money) {//si el objeto es de la clase money
            Money money = (Money) anObject; //convierte el objeto en money
            return getCurrency().equals(money.getCurrency())//compara las monedas
                    && getAmount() == money.getAmount();//compara las cantidades
        }
        return false;//devuelve falso
    }

}
