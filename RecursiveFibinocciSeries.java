public class RecursiveFibinocciSeries {
    static int fib(int n){
           if(n==0)
           {
             return 0;
           }
           if(n==1){
            return 1;
           }
        return fib(n-1)+fib(n-2);
       
           
    }
    public static void main(String[] args) {
        int n=5,sum =0;
        for(int i=0;i<n;i++){
            sum +=fib(i);
            System.out.print(fib(i)+" ");
        }
          System.out.print("\nSum="+sum); 
      System.out.println("\n"+fib(6));
}
}