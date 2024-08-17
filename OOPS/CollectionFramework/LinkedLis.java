package OOPS.CollectionFramework;

class Node{
    int val;
    Node next;
    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
    public void AddElement(int val,Node next){
        Node n = new Node(val, next);
        n.next =null;
    }
}
public class LinkedLis {
    public static void main(String[] args) {
        Node n1 = new Node(10, null);
        Node n2 = new Node(12, null);
        Node n3 = new Node(13, null);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
