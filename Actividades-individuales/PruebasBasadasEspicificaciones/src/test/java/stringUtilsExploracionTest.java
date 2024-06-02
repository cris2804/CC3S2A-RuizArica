import org.example.stringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class stringUtilsExploracionTest {
    @Test
    void testSubstringsBetween() {
        String[] substringsBetween = stringUtils.substringsBetween("axcaycazc", "a", "c");
        assert substringsBetween != null;
        }

//        @Test
//        void manyStrings(){
//            Assertions.
//        }
}
