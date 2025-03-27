package tests.java.tittebygda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import main.java.tittebygda.*;

public class TittebygdaTest {
    @Test
    public void testTellTittere() {
        int expectedTittere = 69; 
        int actualTittere = Tittebygda.tellTittere();
        
        assertEquals(expectedTittere, actualTittere, "Mengden er feil.");
    }
}
