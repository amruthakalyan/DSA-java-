import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a[][] = new int[2][2];
         int b[][] = new int[2][2];
         int c[][] = new int[2][2];
         int i,j;
         for(i=0;i<a.length;i++){
             for(j=0;j<a.length;j++){
                a[i][j] = sc.nextInt();
             }
         }
         System.out.println("matrix  a:");
         for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
             System.out.print( a[i][j] +" ");
            }
        }

        for(i=0;i<b.length;i++){
            for(j=0;j<b.length;j++){
               b[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix  b:");
        for(i=0;i<b.length;i++){
           for(j=0;j<b.length;j++){
            System.out.print( b[i][j] +" ");
           }
       }
       for(i=0;i<c.length;i++){
        for(j=0;j<c.length;j++){
           c[i][j] =  a[i][j] + b[i][j] ;
        }
    }
    System.out.println("\nmatrix  c:");
    for(i=0;i<c.length;i++){
        for(j=0;j<c.length;j++){
         System.out.print( c[i][j] +" ");
        }
    }
    }
}
