import java.util.Arrays;

public class SelectionSort {
    static void selectionsort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] a = {3,1,5,7,2,9};
        selectionsort(a);
    }
}
