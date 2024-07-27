import java.util.Scanner;

public class Transpose {
    void transposeOfMatrix(int[][]a){
        int i ,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                a[i][j] = a[j][i];
            }
        }
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
             System.out.println(a[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int i,j;
        int[][] a = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
               a[i][j] = sc.nextInt();
            }
        }
        Transpose t = new Transpose();
        t.transposeOfMatrix(a);
    }
}
