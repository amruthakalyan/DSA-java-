public class Recursion {
    static void recursionn(int n){
        //Base Condition
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        recursionn(n+1);
    }
    public static void main(String[] args) {
    recursionn(1);
    }
}
