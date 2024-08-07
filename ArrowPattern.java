public class ArrowPattern {
    public static void main(String[] args) {
        stararrow();
    }
   static void stararrow(){
      int i,j,n=5;
      for(i=1;i<2*n;i++){
        int totalcols = i>n?2*n-i:i;
        for(j=1;j<=totalcols;j++){
           System.out.print("*" +" ");
        }
        System.out.println();
        
      }
   }
}
