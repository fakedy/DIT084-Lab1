import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetIntersectTest {


    Set set;
    Set set2;
    @BeforeEach
    void setUp(){
        set = new Set();
        set2 = new Set();
    }


    @Test
    void intersectSameElementsShouldGiveNoChange() {

        set.insert(2);
        set2.insert(2);

        set.intersect(set2);

        assertTrue(set.member(2));
    }

    @Test
    void intersectNonSameElementsShouldRemoveNonIntersect(){ // we should break this into 2 tests

        // set2 is bigger than set1
        set.insert(2);
        set.insert(3);
        set.insert(5);
        set.insert(6);
        set.insert(9);

        set2.insert(2);
        set2.insert(4);
        set2.insert(6);
        set2.insert(8);
        set.intersect(set2);
        assertEquals(2 ,set.toArray().length);

        set = new Set();
        set2 = new Set();

        // same size
        set.insert(5);
        set.insert(8);
        set.insert(7);

        set2.insert(10);
        set2.insert(5);
        set2.insert(2);

        set.intersect(set2);
        assertEquals(1, set.toArray().length);

    }

    @Test
    void intersectSet1FirstBiggerThanSet2Last(){
        set.insert(10);
        set.insert(4);

        set2.insert(3);
        set.intersect(set2);
        assertEquals(0 ,set.toArray().length);
    }
}
