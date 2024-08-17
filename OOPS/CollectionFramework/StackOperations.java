package OOPS.CollectionFramework;

import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        Stack<String> st = new Stack<>();
        st.push("Amrutha");
        st.push("Kalyan");
        st.push("John");
        st.push("Don");
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(s.remove(2));
        System.out.println(s);
        System.out.println(s.contains(2));
    }
}
