package mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
class HelloMockitoTest {

    private HelloMockito helloMockito = new HelloMockito();

    @Test
    void greetPerson() {
        String greeting = helloMockito.greet(1, "World", "es");
        assertEquals("Hello, World, from Mockito!", greeting);
    }
}