package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {
    private Money money = new Money(100, "USD");
    private Money otherMoney = new Money(200, "USD");
    @BeforeEach
    void setUp() {

    }
    @Test
    void constructorShouldSetAmountAndCurrency() {
        // Completa

    }

}