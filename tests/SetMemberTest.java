import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetMemberTest {

    @Test
    void memberExistingElementShouldMakeReturnTrue(){
        Set set = new Set();
        set.insert(1);
        assertTrue(set.member(1));
    }
    @Test
    void memberNonExistingElementShouldMakeReturnFalse(){
        Set set = new Set();
        set.insert(5);
        assertFalse(set.member(2));

        set = new Set();
        set.insert(1);
        assertFalse(set.member(2));
    }

    @Test
    void memberOnEmptySetShouldGiveFalse(){
        Set set = new Set();
        assertFalse(set.member(-10));
    }
}
