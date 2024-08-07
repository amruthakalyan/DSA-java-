public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target=4;
        System.out.println(rsv(arr, target, 0,arr.length-1));
    }
    static int rsv(int[] arr,int target,int s,int e){
       if(s>e){
        return -1;
       }
       int mid = s+(e-s)/2;
       if(target==arr[mid]){
        return mid;
       }
       if(target < arr[mid]){
        return rsv(arr, target, s,mid-1);
       }
       return rsv(arr, target, mid+1, e);
    }
}
