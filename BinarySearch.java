import java.util.Arrays;

public class BinarySearch {
    static int binary_search(int[]a,int target){
        Arrays.sort(a);
            int mid,left=0,right=a.length-1;
            while (left <=right) {
                // mid =  (right + left) / 2;
                mid = left +(right-left)/2;
                if(a[mid]==target){
                    return mid;
                }
                if(a[mid] < target){
                    left = mid+1;
                    
                }
                else{
                    right = mid-1;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        int[] a ={1,2,13,4,5,6};
       int res = binary_search(a, 6);
       System.out.println(res);
    }
}
