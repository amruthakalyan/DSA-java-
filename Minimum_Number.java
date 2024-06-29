public class Minimum_Number {
   static int minimum(int[] a){
        int min = a[0];
        int i, len = a.length;
        for(i=0;i<len;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] a = {15,12,5,0,-1,4};
        System.out.println(minimum(a));
    }
}
