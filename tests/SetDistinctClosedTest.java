import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SetDistinctClosedTest {

    @Test
    void distinctClosedAdditionWith0ShouldReturnTrue() {

        Set set1 = new Set();

        set1.insert(0);
        set1.insert(5);
        assertTrue(set1.distinctClosed((a,b) -> a+b));

    }
    @Test
    void distinctClosedSubtractionWithNon0ShouldReturnFalse() {

        Set set1 = new Set();

        set1.insert(2);
        set1.insert(5);
        assertFalse(set1.distinctClosed((a,b) -> a-b));

    }
}
