package fr.hetic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SubtractionTest {
    
    @Test
    public void testExecute() {
        Subtraction subtraction = new Subtraction();
        assertEquals(2, subtraction.execute(5, 3), "5 - 3 should equal 2");
    }
}
