//Ceiling = smallest element in the array greater or equal to target

public class CeilingofNumber {
    static int  ceilingnumber(int[]a,int target){
        int left=0,right=a.length-1,mid;
        while(left<right){
            mid = left +(right-left)/2;
            if(a[mid]==target){
                return a[mid];
            }
            if(target >a[mid]){
                left=mid+1;
                
            }
            else{
                left = mid-1;
               
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //a=[1,2,3,4,6,7,8] target=5
        int[] a ={2,3,5,9,14,16,18};
        int target=16;
        System.out.println(ceilingnumber(a, target));
       
    }
}
