public class Swapping {
    public static void main(String[] args) {
        swap(20,10);
    }
    static void swap(int a ,int b){
         int temp;
         System.out.println("Before swapping:" );
         System.out.println("a:"+a + " b:"+b);

         temp = a;
         a = b;
         b = temp;
         System.out.println("After swapping:" );
         System.out.println("a:"+a + " b:"+b);

    }
}
