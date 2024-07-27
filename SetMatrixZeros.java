import java.util.Scanner;
public class SetMatrixZeros {
    public static void main(String[] args) {
        int n=2,m=3;
        int[][] a = new int[n][m];
        int i, j;
        int row=0,col=0;
        Scanner sc = new Scanner(System.in);
        //enter array values
        System.out.println("Enter array values:");
        for (i = 0; i < n; i++) {
            for (j = 0; j <m; j++) {
                 a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if(a[i][j]==1){
                     a[i][j--] = 1;
                     
                }
            }
        }
            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
