import java.util.Arrays;

public class SecondLargestElement {
   static void secondLargest(int[]a){
    Arrays.sort(a);
    System.out.println("Second largest element in the array is: "+a[a.length-2]);
    }
    public static void main(String[] args) {
        int[]a ={5,6,1,2,9,10,1,23};
        secondLargest(a);
    }
}
