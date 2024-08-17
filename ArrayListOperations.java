
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListOperations {
    public static void main(String[] args) {
      List<Integer> lis = new ArrayList<>();

       lis.add(10);
       lis.add(20);
       lis.add(30);
       lis.add(40);
       lis.add(50);
       System.out.println(lis.contains(50));
       lis.set(0,11);
       lis.remove(1);
      System.out.println(lis);
      Iterator<Integer> it = lis.iterator();
      while(it.hasNext()){
        System.out.println(it.next());
      }
      List<Integer> lis2 = new ArrayList<>();
      lis2.add(100);
      lis2.add(200);
      lis.addAll(lis2);
      System.out.println(lis);
      System.out.println(lis.get(3));
    }
}
