public class Maximum_Number {
    
        static int maximum(int[] a){
             int max = a[0];
             int i, len = a.length;
             for(i=0;i<len;i++){
                 if(a[i]>max){
                     max = a[i];
                 }
             }
             return max;
         }
         public static void main(String[] args) {
             int[] a = {15,12,5,0,-1,4};
             System.out.println(maximum(a));
         }
     }
     

