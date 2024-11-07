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



    @Test
    void member() {
        Set set;
        set = new Set();

        assert !set.member(1);
        set.insert(1);
        assert set.member(1);
    }

    @Test
    void intersect() {

        Set set1;
        set1 = new Set();
        Set set2;
        set2 = new Set();

        set1.intersect(set2);
        int[] arr1 = set1.toArray();
        int[] arr2 = set2.toArray();
        assert arr1.length == 0;
        assert arr2.length == 0;

        set1.insert(1);
        set1.intersect(set2);
        arr1 = set1.toArray();
        assert arr1.length == 0; // fails?

        set1.insert(2);
        set2.insert(2);
        set1.intersect(set2);
        assert set1.toArray().length == 1; // fails currently



    }

    @Test
    void distinctClosed() {

        Set set1 = new Set();




    }
}