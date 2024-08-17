package OOPS.CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(11);
        ll.add(13);
        ll.add(14);
        ll.add(15);
        Collections.reverse(ll);
        System.out.println(ll);
    }
}
