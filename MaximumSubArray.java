public class MaximumSubArray {
   static void maxsubarray(int[]a){
        int i=0;
        int[]res = new int[a.length];
        int max=a[0],sum=1;
       for(i=0;i<a.length;i++){
        if(a[i]>max){
            res[i] = a[i];
            if(a[i]+a[i+1]>max){
                res[i+1]=a[i+1];
            }
        }
       }
       for(i=0;i<res.length;i++){
        sum+=res[i];
    }
    System.out.print("sum:"+sum);
    }
    public static void main(String[] args) { 
        // int[]a ={-2,-3,4,-1,-2,1,5,-3};
        int[]a={5,4,1,7,8};
        maxsubarray(a);
    }
}
