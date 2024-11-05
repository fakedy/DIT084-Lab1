import org.junit.jupiter.api.Test;


class SetTest {



    @Test
    void toArray() {
        Set set;
        int[] arr;
        set = new Set();
        arr = set.toArray();
        assert arr != null;
        assert arr.length == 0;

        set.insert(1);
        arr = set.toArray();
        assert arr.length == 1;
        assert arr[0] == 1;




    }

    @Test
    void insert() {
        Set set;
        set = new Set();

        set.insert(1);
        assert set.member(1);

        int[] arr = set.toArray();
        assert arr.length == 1;
        assert arr[0] == 1;

    }

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
        assert arr1.length == 0;

        set1.insert(2);
        set2.insert(2);
        set1.intersect(set2);
        assert set1.toArray().length == 1; // fails currently


    }

    @Test
    void distinctClosed() {
        


    }
}