import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr){
      int i,j,len=arr.length;
      int temp;
      for(i=0;i<len;i++){
        for(j=0;j<len-i-1;j++){
             if(arr[j]>arr[j+1]){
               temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
             }
        }
      }
      System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int a[] = {51,12,45,12,78};
        bubbleSort(a);
    }
}
