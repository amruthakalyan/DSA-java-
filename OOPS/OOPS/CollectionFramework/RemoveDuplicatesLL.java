package OOPS.CollectionFramework;

import java.util.HashSet;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinekedList{
    Node head;
    public void insert(int data){
        Node current = head;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    
public void removeDuplicates() {
    HashSet<Integer> seen = new HashSet<>();
    Node current = head;

    while (current != null  && current.next != null) {
        seen.add(current.data);

        if (seen.contains(current.next.data)) {
            // Skip the duplicate node
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
}

public void display(){
    Node current = head;
    while(current !=null){
        System.out.print(current.data+"=>"+" ");
        current = current.next;
    }
    System.out.print("END");
}
}
public class RemoveDuplicatesLL{
    public static void main(String[] args) {
        LinekedList ll = new LinekedList();
        ll.insert(1);
        ll.insert(1);
        ll.insert(2);
        ll.insert(10);
        ll.insert(3);
        ll.insert(10);
        ll.removeDuplicates();
        ll.display();
    }
}