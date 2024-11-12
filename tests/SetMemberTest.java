import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetMemberTest {



    Set set;
    @BeforeEach
    void setUp(){
        set = new Set();
    }

    @Test
    void memberExistingElementShouldMakeReturnTrue(){
        set.insert(1);
        assertTrue(set.member(1));
    }
    @Test
    void memberNonExistingElementShouldMakeReturnFalse(){
        set.insert(5);
        assertFalse(set.member(2));

        set = new Set();
        set.insert(1);
        assertFalse(set.member(2));
    }

    @Test
    void memberOnEmptySetShouldGiveFalse(){
        assertFalse(set.member(-10));
    }
}
