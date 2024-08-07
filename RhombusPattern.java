public class RhombusPattern {
    public static void main(String[] args) {
        rombuspat();
    }
    static void rombuspat(){
        int i,j,n=7;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
