package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {
    private Money money = new Money(100, "USD");//es el SUT
    private Money otherMoney = new Money(200, "USD");
    @BeforeEach
    void setUp() {

    }
    @Test
    void shouldReturnFalseIfNotEqual() {
        assertThat(money.equals(new Money(200, "EUR"))).isFalse();
    }
    @Test
    void constructorShouldSetAmountAndCurrency() {
        //es el SUT
        //poner a prueba el constructor
        assertThat(money.getAmount()).isEqualTo(100);
        assertThat(money.getCurrency()).isEqualTo("USD");

    }
    @Test
    void shouldReturnTrueIfEqual() { //comprueba si dos objetos son iguales
        assertThat(money.equals(otherMoney)).isTrue();
    }


}