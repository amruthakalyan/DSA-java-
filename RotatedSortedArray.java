import java.util.Scanner;

public class RotatedSortedArray {
    int sortedarray(int[]a,int target){
      int i,len=a.length;
      for(i=0;i<len;i++){
        if(a[i]==target){
            return i;
        }
      }
      return -1;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] a = new int[7];
         System.out.println("Enter array elements:");
         for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
         }
         System.out.print("Enter target:");
         int target = sc.nextInt();
       RotatedSortedArray rs = new RotatedSortedArray();
      int res= rs.sortedarray(a, target);
      if(res==-1){
        System.out.println("Element not found");
      }
      else{
      System.out.println("Element found at index:"+res);
      }
    }
}
