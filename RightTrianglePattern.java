//Right Trianlge pattern
public class RightTrianglePattern {
    public static void main(String[] args) {
       StarPattern();
       numberPattern();
       numberPatternIncreasing();
    }
    // * 
    // * *
    // * * *
    // * * * *
    // * * * * *
    static void StarPattern(){
        int i,j,n=5;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
    static void numberPattern(){
        int i,j,n=5;
        int count=1;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
//1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5 
    static void numberPatternIncreasing(){
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
