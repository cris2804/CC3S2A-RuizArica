package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
public class ClientTest {
    private Address address = new Address("street A");
    private Address otherAddress = new Address("street B");
    private  Client client ;
    @BeforeEach //metodo que se ejecuta antes de cada prueba
    void setUp() {//setup sirve para inicializar los atributos de la clase
        client =new Client();
    }
    @Test

    void afterCreationShouldHaveNoAddress() {
        //Completa
    }

    @Test
    void shouldAllowToAddAddress() {
        //Completa
        client.addAddress(address);
    }
    @Test
    void shouldAllowToAddSameAddresses() {
        client.addAddress(address);
        client.addAddress(otherAddress);
    }


}
