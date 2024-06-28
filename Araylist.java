import java.util.ArrayList;

public class Araylist {
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        System.out.println(list.contains(12));

       System.out.println( list.equals(11));
       System.out.println(list.isEmpty());
       System.out.println(list.indexOf(15));
       System.out.println(list.remove(3));
       System.out.println(list.set(0, 9));
        System.out.println(list);
    }
}
