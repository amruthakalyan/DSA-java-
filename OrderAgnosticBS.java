import java.util.Arrays;

public class OrderAgnosticBS {
    static int binary_search(int[]a,int target){
        // Arrays.sort(a);
        int left=0,right=a.length-1,mid;
        boolean isAac;
        if(a[left]<a[right]){
            isAac =true;
        }
        else{
            isAac =false;
        }
        while (left <=right) {
            // mid =  (right + left) / 2;
            mid = left +(right-left)/2;
            if(a[mid]==target){
                return mid;
            }
            if(isAac){
                if(a[mid] < target){
                    left = mid+1;
                    
                }
                else{
                    right = mid-1;
                }
            }
            else{
                if(a[mid] > target){
                  right = mid -1;
                    
                }
                else{
                left = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a ={12,9,6,3,1};
        int res = binary_search(a, 12);
        System.out.println(res);
    }
}
