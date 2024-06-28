import java.util.Scanner;

public class Factorial {
    int factorial(int n){
        int i=1,fact=1;
        if (n==0) {
            return 1;
        }
        for(i=1;i<=n;i++){
           fact *=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial f = new Factorial();
      System.out.println(f.factorial(5));//5*4*3*2*1
    }
}
