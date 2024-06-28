import java.util.Scanner;

public class Fibinocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int i=0;
        int a=0,b=1,c=0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(i=0;i<n;i++){
              c=a+b;
              System.out.print(c+" ");
              a=b;
              b=c;
        }
        // System.out.println(b);
    }
}
