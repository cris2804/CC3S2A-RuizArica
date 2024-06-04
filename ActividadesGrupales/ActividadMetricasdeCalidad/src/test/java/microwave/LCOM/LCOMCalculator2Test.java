package metricas.LCOM;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class LCOMCalculator2Test {


    @Test
    public void testHighCohesion(){
        ClassInfo classInfo = new ClassInfo();
        classInfo.addMethod("method1",new HashSet<>(Arrays.asList("attr1","attr2")));
        classInfo.addMethod("method2",new HashSet<>(Arrays.asList("attr2")));
        int lcom = LCOMCalculator2.calculateLCOM(classInfo);
        assertEquals(-1,lcom);
    }

    @Test
    public void testLowCohesion(){
        ClassInfo classInfo = new ClassInfo();
        classInfo.addMethod("method1",new HashSet<>(Arrays.asList("attr1","attr2")));
        classInfo.addMethod("method2",new HashSet<>(Arrays.asList("attr3")));
        int lcom = LCOMCalculator2.calculateLCOM(classInfo);
        assertEquals(1,lcom);
    }

    @Test
    public void testNoMethods(){
        ClassInfo classInfo = new ClassInfo();
        int lcom = LCOMCalculator2.calculateLCOM(classInfo);
        assertEquals(0,lcom);
    }
}