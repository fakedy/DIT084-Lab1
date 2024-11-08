import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SetToArrayTest {

    @Test
    void toArrayEmptySetShouldGiveEmptyArray(){
        Set set;
        int[] arr;
        set = new Set();
        arr = set.toArray();
        assertEquals(0, arr.length);

    }

    @Test
    void toArrayShouldNotBeNull(){
        Set set;
        int[] arr;
        set = new Set();
        arr = set.toArray();
        assertNotEquals(null, arr);
    }

    @Test
    void toArrayArrayWithOneElementShouldGiveArrayOfLengthOne(){
        Set set;
        int[] arr;
        set = new Set();
        set.insert(1);
        arr = set.toArray();
        assertEquals(1, arr.length);
        assertEquals(1, arr[0]);
        assertArrayEquals(new int[]{1}, arr);
    }
}



