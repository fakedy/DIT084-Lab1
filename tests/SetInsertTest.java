import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetInsertTest {



    @Test
    void insertShouldNotGiveDuplicateEntries(){
        Set set;
        set = new Set();
        set.insert(1);
        set.insert(1);
        set.insert(2);
        set.insert(3);
        set.insert(5);
        set.insert(3);

        assertArrayEquals(new int[]{1, 2, 3, 5}, set.toArray());
    }
    @Test
    void insertShouldBeSorted(){
        Set set;
        set = new Set();
        int[] arr = set.toArray();
        int prev = 0;
        set.insert(3);
        set.insert(5);
        set.insert(1);
        set.insert(32);
        for( Integer x : arr){
            assertTrue(prev <= x);
        }
    }

    @Test
    void insertShouldInsertAllElements(){
        Set set;
        set = new Set();
        set.insert(0);
        set.insert(2);
        set.insert(1);
        assertArrayEquals(new int[]{0, 1, 2}, set.toArray());
    }
    @Test
    void insertXIsLessOrEqualToLastElement(){
        Set set;
        set = new Set();
        set.insert(1);
        set.insert(3);
        set.insert(5);
        set.insert(4);
    }
}
