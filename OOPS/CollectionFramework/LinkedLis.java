package OOPS.CollectionFramework;

class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
        this.next =null;
    }
    
}
public class LinkedLis {
    Node head;
    public void AddElement(int val){
        Node n = new Node(val);
        Node current = head;
        if(head == null){
            head = n;
            return;
        }
        while(current.next !=null){
             current = current.next;
        }
        current.next =n;
    }
    void search(int key){
        Node current = head;
        while(current!=null){
            if(current.val == key){
                System.out.println("\nElement found");
                return;
            }
            current = current.next;
        }
        System.out.println("\nElement not found");
        
    }
    void delete(int key){
        Node current = head;
        while (current != null) {
            if(current.val == key){
                head = current.next;
                return;
            }
            current = current.next;
        }
    }
    public void display(){
        Node current = head;
        while(current !=null){
            System.out.print(current.val+"=>"+" ");
            current = current.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        LinkedLis ll = new LinkedLis();
        ll.AddElement(10);
        ll.AddElement(20);
        ll.AddElement(30);
        ll.AddElement(40);
        ll.AddElement(50);
        ll.delete(20);
        ll.display();
        ll.search(30);
        ll.search(300);
        // Node n1 = new Node(10);
        // Node n2 = new Node(12);
        // Node n3 = new Node(13);
        // System.out.println(n1);
        // System.out.println(n2);
        // System.out.println(n3);
    }
}
