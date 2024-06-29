//Cells with Odd Values in a Matrix
import java.util.Scanner;
public class Odd_values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int i,j,len=a.length;
        System.out.println("Enter matrix elements:");
        for(i=0;i<len;i++){
            for(j=0;j<len;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Cells with Odd Values in a Matrix:");
        for(i=0;i<len;i++){
            for(j=0;j<len;j++){
                if(a[i][j]%2 !=0){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}
