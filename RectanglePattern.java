public class RectanglePattern {
    public static void main(String[] args) {
        rectPattern();
    }
    static void rectPattern(){
        int i,j,n=5;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("*"+"");
            }
            System.out.println();
        }
    }
}
