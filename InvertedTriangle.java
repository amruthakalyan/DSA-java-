public class InvertedTriangle {
    public static void main(String[] args) {
        InvertedPattern();
        InvertedPatternNo();
    }
    static void InvertedPatternNo(){
        int i,j,n=5;
        int count=1;
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    static void InvertedPattern(){
        int i,j,n=5;
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
