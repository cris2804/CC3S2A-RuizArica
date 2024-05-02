package org.example;

import com.sun.jdi.event.MonitorContendedEnteredEvent;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyManyValueTest {
    //evaluar la cantidad de monedas sin cambiar la moneda y sin usar @ValueSource
    @Test //sirve para probar multiples test
    void constructorShouldSetAmountAndCurrency() {
        Money money = new Money(10, "USD");
        assertThat(money.getAmount()).isEqualTo(10);
        assertThat(money.getCurrency()).isEqualTo("USD");
        money = new Money(20, "EUR");
        assertThat(money.getAmount()).isEqualTo(20);
        assertThat(money.getCurrency()).isEqualTo("EUR");
    }
}
