package org.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;
public class MoneyManyParamsAnnotationTest {
    @ParameterizedTest //sirve para probar multiples casos
    @CsvSource({ //sirve para probar multiples casos a la vez
        "10,USD",
        "20,EUR",
        "30,CHF",
    })
    void constructoShouldAmountAndCurrency(int amount ,String currency){
        Money money = new Money(amount,currency);//crea un objeto de la clase Money con el constructor con dos parametros de la clase Money
        assertThat(money.getAmount()).isEqualTo(amount); //comprueba el valor de amount y el de currency de la clase Money
        assertThat(money.getCurrency()).isEqualTo(currency);
    }
}
