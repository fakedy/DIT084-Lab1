import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SetTest {


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
    }


    @Test
    void insertOneElementShouldGiveLengthOne(){
        Set set;
        set = new Set();
        set.insert(0);
        assertEquals(1, set.toArray().length);
    }

    @Test
    void insertSetAfterInsertShouldContainInsertedElement(){
        Set set;
        set = new Set();

        set.insert(1);
        assertTrue(set.member(1));
    }

    @Test
    void insertShouldNotGiveDuplicateEntries(){
        Set set;
        set = new Set();
        set.insert(1);

        set.insert(1);
        set.insert(3);
        set.insert(3);
        assertEquals(2, set.toArray().length);
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
        assertTrue(set.member(0));
        assertTrue(set.member(2));
        assertTrue(set.member(1));
    }


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



    @Test
    void intersectSameElementsShouldGiveNoChange() {
        Set set = new Set();
        Set set2 = new Set();

        set.insert(2);
        set2.insert(2);

        set.intersect(set2);

        assertTrue(set.member(2));
    }



    @Test
    void intersectNonSameElementsShouldRemoveNonIntersect(){
        Set set = new Set();
        Set set2 = new Set();

        set.insert(1);
        set.insert(2);

        set2.insert(0);
        set.intersect(set2);
        assertEquals(0 ,set.toArray().length);

        set = new Set();
        set2 = new Set();

        set.insert(0);
        set.insert(2);

        set2.insert(10);
        set2.insert(2);

        set.intersect(set2);
        assertEquals(1, set.toArray().length);

        set = new Set();
        set2 = new Set();
        set.insert(3);
        set.insert(5);
        set.insert(7);

        set2.insert(2);
        set2.insert(4);
        set2.insert(7);

        set.intersect(set2);
        assertEquals(1, set.toArray().length);
    }


    @Test
    void distinctClosed() {

        Set set1 = new Set();




    }
}