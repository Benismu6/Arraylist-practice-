import java.util.ArrayList;
import java.util.Collections;
public class Main {
 public static void main(String[] args) {
 OrderedArrayList list = new OrderedArrayList();
 list.insert(8);
 list.insert(2);
 list.insert(2);
 list.insert(9);
 list.insert(5);
 list.insert(9);
 list.insert(2);
 list.insert(9);
 list.insert(2);
 list.insert(5);
 System.out.println("The original list is: ");
 list.print();
 System.out.println("The list after method call is: ");
 list.removeDuplicates();
 list.print();
 }

  public static void removeDuplicates(ArrayList<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      int num = list.get(i);
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i).equals(list.get(j))) { 
          list.remove(j);
          j--;
        }
      }
    }
  }
}