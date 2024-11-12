import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SetDistinctClosedTest {

    Set set1;
    @BeforeEach
    void setUp(){
        set1 = new Set();
    }

    @Test
    void distinctClosedAdditionWith0ShouldReturnTrue() {


        set1.insert(0);
        set1.insert(5);
        assertTrue(set1.distinctClosed((a,b) -> a+b));

    }
    @Test
    void distinctClosedSubtractionWithNon0ShouldReturnFalse() {


        set1.insert(2);
        set1.insert(5);
        assertFalse(set1.distinctClosed((a,b) -> a-b));

    }
}
