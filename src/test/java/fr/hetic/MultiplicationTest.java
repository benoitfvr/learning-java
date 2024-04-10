package fr.hetic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {
    
    @Test
    public void testExecute() {
        Multiplication multiplication = new Multiplication();
        assertEquals(6, multiplication.execute(2, 3), "2 * 3 should equal 6");
    }
}