public class FindSmallestLargest {
   static void smallestLargest(int[]a){
         int i;
         int min=a[0],max=a[0];
         for(i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
         }
         for(i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
         }
         System.out.println("Minimum element in the array is: "+min);
         System.out.println("Maximum element in the array is: "+max);
    }
    public static void main(String[] args) {
        int[]a={11,1,3,-1,4,5,-5};
        smallestLargest(a);
    }
}
