import java.util.*;
import java.util.function.IntBinaryOperator;

public class Set {
  private ArrayList<Integer> a;

  public Set() {
    a = new ArrayList<Integer>();
  }

  public int[] toArray() {
    int[] ia = new int[a.size()];
    for (int i = 0; i < ia.length; i++) {
      ia[i] = a.get(i);
    }
    return ia;
  }

  public void insert(int x) {

    if(a.isEmpty()){
      a.add(x);
      return;
    }
    for (int i = 0; i < a.size(); i++) {
      if(a.get(i) == x){ // if element is already in the list we return
        break;
      }
      if (a.get(i) > x) { // if element is not in list and its bigger than element at index we insert it there
        a.add(i, x);
        break;
      }
    }
    if(a.getLast() < x) { // if the element is bigger than any but not in list
      a.add(x);
    }
  }

  public boolean member(int x) {
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > x) {
        return false;
      } else {
        if (a.get(i) == x) {
          return true;
        }
      }
    }
    return false;
  }


  public void intersect(Set s) {

    if(a.getFirst() > s.a.getLast()){ // if first element of a is bigger than s then there will be no intersection
      a.clear();
      return;
    }

    int i = 0;
    int j = 0;
    while(i < a.size() && j < s.a.size()) {
      if (a.get(i).equals(s.a.get(j))) {
        i++;
        j++;
      } else {
        if (a.get(i) < s.a.get(j)) {
          a.remove(i);
        } else {
          j++;
        }
      }
    }
    while( i != a.size()){
      a.remove(i);
    }



  }


  // Try with:
  //   (a, b) -> a + b;
  //   (a, b) -> a - b;
  public boolean distinctClosed(IntBinaryOperator f) {
    int vi,vj;
    for (int i = 0; i < a.size(); i++) {
      for (int j = i; j < a.size(); j++) {
        vi = a.get(i);
        vj = a.get(j);
        if (!(member(f.applyAsInt(vi, vj)) || vi == vj)) return false;
      }
    }
    return true;
  }
}
