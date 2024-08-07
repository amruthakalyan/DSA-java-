import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {5, 3, 4, 1, 2};
        int i, j;
        
        for (i = 1; i < a.length; i++) {
            int key = a[i];
            j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
        
        System.out.println(Arrays.toString(a));
    }
}
