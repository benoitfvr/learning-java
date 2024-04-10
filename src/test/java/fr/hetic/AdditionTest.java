package fr.hetic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    public void testExecute() {
        Addition addition = new Addition();
        assertEquals(5, addition.execute(2, 3), "2 + 3 should equal 5");
    }
}
